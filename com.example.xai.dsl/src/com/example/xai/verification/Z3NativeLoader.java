package com.example.xai.verification;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;

/**
 * Loads the Z3 native libraries.
 *
 * On Windows, libz3java.dll depends on libz3.dll — both must be in the
 * same directory AND libz3.dll must be loaded first.
 * This loader extracts all required native files into one shared temp
 * directory before loading anything.
 */
public class Z3NativeLoader {

    private static volatile boolean loaded = false;
    private static volatile boolean failed = false;
    private static final Object     LOCK   = new Object();

    public static boolean ensureLoaded() {
        if (loaded) return true;
        if (failed) return false;
        synchronized (LOCK) {
            if (loaded || failed) return loaded;
            try {
                loadNative();
                loaded = true;
            } catch (Exception e) {
                failed = true;
                System.err.println("[Z3NativeLoader] Could not load Z3: "
                    + e.getMessage());
            }
            return loaded;
        }
    }

    private static void loadNative() throws Exception {
        // Resolve the directory that contains our native files
        File libDir = resolveLibDir();
        if (libDir == null || !libDir.isDirectory()) {
            throw new FileNotFoundException(
                "Could not locate the lib/ directory. " +
                "Code source: " + getCodeSourcePath());
        }

        System.out.println("[Z3NativeLoader] lib/ resolved to: "
            + libDir.getAbsolutePath());

        // On Windows: libz3java.dll depends on libz3.dll.
        // Both must be in the same directory. We copy every DLL/SO from
        // lib/ into one shared temp folder, then load in dependency order.
        File workDir = copyNativesToTempDir(libDir);

        // Load in dependency order:
        //   libz3.dll (or libz3.so / libz3.dylib) MUST come before libz3java
        loadIfPresent(workDir, mainLibName());    // libz3.dll / libz3.so
        loadIfPresent(workDir, bridgeLibName());  // libz3java.dll / libz3java.so

        System.out.println("[Z3NativeLoader] Z3 loaded successfully from: "
            + workDir.getAbsolutePath());
    }

    /**
     * Finds the lib/ folder in the project by walking up from the code source.
     * In Eclipse Application dev mode the code source is the bin/ folder;
     * lib/ is a sibling of bin/ inside the project root.
     */
    private static File resolveLibDir() {
        try {
            URL src = Z3NativeLoader.class
                .getProtectionDomain().getCodeSource().getLocation();
            if (src == null) return null;

            File codeFile = new File(src.toURI());

            // Try the candidates in order, from most specific to least:
            // 1. lib/ directly inside codeFile  (Eclipse App dev mode — code
            //    source == project root, e.g. .../com.example.xai.dsl/)
            // 2. lib/ as sibling of codeFile    (code source == bin/ subfolder)
            // 3. lib/ two levels up             (nested output paths)
            File[] candidates = {
                new File(codeFile,                     "lib"),  // project root
                new File(codeFile.getParentFile(),     "lib"),  // bin/ → root
                new File(codeFile.getParentFile()
                             .getParentFile(),         "lib"),  // nested
            };

            for (File candidate : candidates) {
                System.out.println("[Z3NativeLoader] Checking: "
                    + candidate.getAbsolutePath());
                if (candidate.isDirectory()) return candidate;
            }

        } catch (URISyntaxException | NullPointerException ignored) {}
        return null;
    }

    /**
     * Copies ALL .dll / .so / .dylib files from libDir into a single
     * shared temp directory so dependency resolution works correctly.
     */
    private static File copyNativesToTempDir(File libDir) throws IOException {
        Path tempDir = Files.createTempDirectory("z3native_shared_");
        tempDir.toFile().deleteOnExit();

        for (File f : libDir.listFiles()) {
            String name = f.getName().toLowerCase();
            if (name.endsWith(".dll") || name.endsWith(".so")
                    || name.endsWith(".dylib")) {
                Path dest = tempDir.resolve(f.getName());
                Files.copy(f.toPath(), dest,
                    StandardCopyOption.REPLACE_EXISTING);
                dest.toFile().deleteOnExit();
                System.out.println("[Z3NativeLoader] Staged: " + f.getName());
            }
        }
        return tempDir.toFile();
    }

    /** Loads a specific file by absolute path — silently skips if absent. */
    private static void loadIfPresent(File dir, String name) {
        File f = new File(dir, name);
        if (f.exists()) {
            System.load(f.getAbsolutePath());
            System.out.println("[Z3NativeLoader] Loaded: " + name);
        }
    }

    // ── OS-specific filenames ────────────────────────────────────────────────

    /** The core Z3 library (dependency of the Java bridge). */
    private static String mainLibName() {
        String os = System.getProperty("os.name", "").toLowerCase();
        if (os.contains("win"))  return "libz3.dll";
        if (os.contains("mac"))  return "libz3.dylib";
        return "libz3.so";
    }

    /** The Java-bridge library (depends on the core library). */
    private static String bridgeLibName() {
        String os = System.getProperty("os.name", "").toLowerCase();
        if (os.contains("win"))  return "libz3java.dll";
        if (os.contains("mac"))  return "libz3java.dylib";
        return "libz3java.so";
    }

    private static String getCodeSourcePath() {
        try {
            URL u = Z3NativeLoader.class.getProtectionDomain()
                .getCodeSource().getLocation();
            return u == null ? "null" : u.toString();
        } catch (Exception e) { return "unknown"; }
    }
}
