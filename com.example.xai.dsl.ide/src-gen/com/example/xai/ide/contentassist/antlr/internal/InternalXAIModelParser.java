package com.example.xai.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.example.xai.services.XAIModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXAIModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'type'", "'for'", "'data'", "'explain'", "'user'", "'expertise'", "'='", "'format'", "'['", "']'", "','", "'details'", "'purpose'", "'dataset'", "'path'", "'target'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXAIModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXAIModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXAIModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXAIModel.g"; }


    	private XAIModelGrammarAccess grammarAccess;

    	public void setGrammarAccess(XAIModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRoot"
    // InternalXAIModel.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalXAIModel.g:54:1: ( ruleRoot EOF )
            // InternalXAIModel.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalXAIModel.g:62:1: ruleRoot : ( ( rule__Root__ModelAssignment ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:66:2: ( ( ( rule__Root__ModelAssignment ) ) )
            // InternalXAIModel.g:67:2: ( ( rule__Root__ModelAssignment ) )
            {
            // InternalXAIModel.g:67:2: ( ( rule__Root__ModelAssignment ) )
            // InternalXAIModel.g:68:3: ( rule__Root__ModelAssignment )
            {
             before(grammarAccess.getRootAccess().getModelAssignment()); 
            // InternalXAIModel.g:69:3: ( rule__Root__ModelAssignment )
            // InternalXAIModel.g:69:4: rule__Root__ModelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Root__ModelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getModelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleModelSpec"
    // InternalXAIModel.g:78:1: entryRuleModelSpec : ruleModelSpec EOF ;
    public final void entryRuleModelSpec() throws RecognitionException {
        try {
            // InternalXAIModel.g:79:1: ( ruleModelSpec EOF )
            // InternalXAIModel.g:80:1: ruleModelSpec EOF
            {
             before(grammarAccess.getModelSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleModelSpec();

            state._fsp--;

             after(grammarAccess.getModelSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelSpec"


    // $ANTLR start "ruleModelSpec"
    // InternalXAIModel.g:87:1: ruleModelSpec : ( ( rule__ModelSpec__Group__0 ) ) ;
    public final void ruleModelSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:91:2: ( ( ( rule__ModelSpec__Group__0 ) ) )
            // InternalXAIModel.g:92:2: ( ( rule__ModelSpec__Group__0 ) )
            {
            // InternalXAIModel.g:92:2: ( ( rule__ModelSpec__Group__0 ) )
            // InternalXAIModel.g:93:3: ( rule__ModelSpec__Group__0 )
            {
             before(grammarAccess.getModelSpecAccess().getGroup()); 
            // InternalXAIModel.g:94:3: ( rule__ModelSpec__Group__0 )
            // InternalXAIModel.g:94:4: rule__ModelSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelSpec"


    // $ANTLR start "entryRuleUserSpec"
    // InternalXAIModel.g:103:1: entryRuleUserSpec : ruleUserSpec EOF ;
    public final void entryRuleUserSpec() throws RecognitionException {
        try {
            // InternalXAIModel.g:104:1: ( ruleUserSpec EOF )
            // InternalXAIModel.g:105:1: ruleUserSpec EOF
            {
             before(grammarAccess.getUserSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleUserSpec();

            state._fsp--;

             after(grammarAccess.getUserSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserSpec"


    // $ANTLR start "ruleUserSpec"
    // InternalXAIModel.g:112:1: ruleUserSpec : ( ( rule__UserSpec__Group__0 ) ) ;
    public final void ruleUserSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:116:2: ( ( ( rule__UserSpec__Group__0 ) ) )
            // InternalXAIModel.g:117:2: ( ( rule__UserSpec__Group__0 ) )
            {
            // InternalXAIModel.g:117:2: ( ( rule__UserSpec__Group__0 ) )
            // InternalXAIModel.g:118:3: ( rule__UserSpec__Group__0 )
            {
             before(grammarAccess.getUserSpecAccess().getGroup()); 
            // InternalXAIModel.g:119:3: ( rule__UserSpec__Group__0 )
            // InternalXAIModel.g:119:4: rule__UserSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserSpec"


    // $ANTLR start "entryRuleDatasetSpec"
    // InternalXAIModel.g:128:1: entryRuleDatasetSpec : ruleDatasetSpec EOF ;
    public final void entryRuleDatasetSpec() throws RecognitionException {
        try {
            // InternalXAIModel.g:129:1: ( ruleDatasetSpec EOF )
            // InternalXAIModel.g:130:1: ruleDatasetSpec EOF
            {
             before(grammarAccess.getDatasetSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleDatasetSpec();

            state._fsp--;

             after(grammarAccess.getDatasetSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatasetSpec"


    // $ANTLR start "ruleDatasetSpec"
    // InternalXAIModel.g:137:1: ruleDatasetSpec : ( ( rule__DatasetSpec__Group__0 ) ) ;
    public final void ruleDatasetSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:141:2: ( ( ( rule__DatasetSpec__Group__0 ) ) )
            // InternalXAIModel.g:142:2: ( ( rule__DatasetSpec__Group__0 ) )
            {
            // InternalXAIModel.g:142:2: ( ( rule__DatasetSpec__Group__0 ) )
            // InternalXAIModel.g:143:3: ( rule__DatasetSpec__Group__0 )
            {
             before(grammarAccess.getDatasetSpecAccess().getGroup()); 
            // InternalXAIModel.g:144:3: ( rule__DatasetSpec__Group__0 )
            // InternalXAIModel.g:144:4: rule__DatasetSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatasetSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatasetSpec"


    // $ANTLR start "rule__ModelSpec__Group__0"
    // InternalXAIModel.g:152:1: rule__ModelSpec__Group__0 : rule__ModelSpec__Group__0__Impl rule__ModelSpec__Group__1 ;
    public final void rule__ModelSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:156:1: ( rule__ModelSpec__Group__0__Impl rule__ModelSpec__Group__1 )
            // InternalXAIModel.g:157:2: rule__ModelSpec__Group__0__Impl rule__ModelSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModelSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__0"


    // $ANTLR start "rule__ModelSpec__Group__0__Impl"
    // InternalXAIModel.g:164:1: rule__ModelSpec__Group__0__Impl : ( 'model' ) ;
    public final void rule__ModelSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:168:1: ( ( 'model' ) )
            // InternalXAIModel.g:169:1: ( 'model' )
            {
            // InternalXAIModel.g:169:1: ( 'model' )
            // InternalXAIModel.g:170:2: 'model'
            {
             before(grammarAccess.getModelSpecAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__0__Impl"


    // $ANTLR start "rule__ModelSpec__Group__1"
    // InternalXAIModel.g:179:1: rule__ModelSpec__Group__1 : rule__ModelSpec__Group__1__Impl rule__ModelSpec__Group__2 ;
    public final void rule__ModelSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:183:1: ( rule__ModelSpec__Group__1__Impl rule__ModelSpec__Group__2 )
            // InternalXAIModel.g:184:2: rule__ModelSpec__Group__1__Impl rule__ModelSpec__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ModelSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__1"


    // $ANTLR start "rule__ModelSpec__Group__1__Impl"
    // InternalXAIModel.g:191:1: rule__ModelSpec__Group__1__Impl : ( ( rule__ModelSpec__NameAssignment_1 ) ) ;
    public final void rule__ModelSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:195:1: ( ( ( rule__ModelSpec__NameAssignment_1 ) ) )
            // InternalXAIModel.g:196:1: ( ( rule__ModelSpec__NameAssignment_1 ) )
            {
            // InternalXAIModel.g:196:1: ( ( rule__ModelSpec__NameAssignment_1 ) )
            // InternalXAIModel.g:197:2: ( rule__ModelSpec__NameAssignment_1 )
            {
             before(grammarAccess.getModelSpecAccess().getNameAssignment_1()); 
            // InternalXAIModel.g:198:2: ( rule__ModelSpec__NameAssignment_1 )
            // InternalXAIModel.g:198:3: rule__ModelSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__1__Impl"


    // $ANTLR start "rule__ModelSpec__Group__2"
    // InternalXAIModel.g:206:1: rule__ModelSpec__Group__2 : rule__ModelSpec__Group__2__Impl rule__ModelSpec__Group__3 ;
    public final void rule__ModelSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:210:1: ( rule__ModelSpec__Group__2__Impl rule__ModelSpec__Group__3 )
            // InternalXAIModel.g:211:2: rule__ModelSpec__Group__2__Impl rule__ModelSpec__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ModelSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__2"


    // $ANTLR start "rule__ModelSpec__Group__2__Impl"
    // InternalXAIModel.g:218:1: rule__ModelSpec__Group__2__Impl : ( 'type' ) ;
    public final void rule__ModelSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:222:1: ( ( 'type' ) )
            // InternalXAIModel.g:223:1: ( 'type' )
            {
            // InternalXAIModel.g:223:1: ( 'type' )
            // InternalXAIModel.g:224:2: 'type'
            {
             before(grammarAccess.getModelSpecAccess().getTypeKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__2__Impl"


    // $ANTLR start "rule__ModelSpec__Group__3"
    // InternalXAIModel.g:233:1: rule__ModelSpec__Group__3 : rule__ModelSpec__Group__3__Impl rule__ModelSpec__Group__4 ;
    public final void rule__ModelSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:237:1: ( rule__ModelSpec__Group__3__Impl rule__ModelSpec__Group__4 )
            // InternalXAIModel.g:238:2: rule__ModelSpec__Group__3__Impl rule__ModelSpec__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ModelSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__3"


    // $ANTLR start "rule__ModelSpec__Group__3__Impl"
    // InternalXAIModel.g:245:1: rule__ModelSpec__Group__3__Impl : ( ( rule__ModelSpec__ModelTypeAssignment_3 ) ) ;
    public final void rule__ModelSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:249:1: ( ( ( rule__ModelSpec__ModelTypeAssignment_3 ) ) )
            // InternalXAIModel.g:250:1: ( ( rule__ModelSpec__ModelTypeAssignment_3 ) )
            {
            // InternalXAIModel.g:250:1: ( ( rule__ModelSpec__ModelTypeAssignment_3 ) )
            // InternalXAIModel.g:251:2: ( rule__ModelSpec__ModelTypeAssignment_3 )
            {
             before(grammarAccess.getModelSpecAccess().getModelTypeAssignment_3()); 
            // InternalXAIModel.g:252:2: ( rule__ModelSpec__ModelTypeAssignment_3 )
            // InternalXAIModel.g:252:3: rule__ModelSpec__ModelTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__ModelTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelSpecAccess().getModelTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__3__Impl"


    // $ANTLR start "rule__ModelSpec__Group__4"
    // InternalXAIModel.g:260:1: rule__ModelSpec__Group__4 : rule__ModelSpec__Group__4__Impl rule__ModelSpec__Group__5 ;
    public final void rule__ModelSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:264:1: ( rule__ModelSpec__Group__4__Impl rule__ModelSpec__Group__5 )
            // InternalXAIModel.g:265:2: rule__ModelSpec__Group__4__Impl rule__ModelSpec__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ModelSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__4"


    // $ANTLR start "rule__ModelSpec__Group__4__Impl"
    // InternalXAIModel.g:272:1: rule__ModelSpec__Group__4__Impl : ( 'for' ) ;
    public final void rule__ModelSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:276:1: ( ( 'for' ) )
            // InternalXAIModel.g:277:1: ( 'for' )
            {
            // InternalXAIModel.g:277:1: ( 'for' )
            // InternalXAIModel.g:278:2: 'for'
            {
             before(grammarAccess.getModelSpecAccess().getForKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getForKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__4__Impl"


    // $ANTLR start "rule__ModelSpec__Group__5"
    // InternalXAIModel.g:287:1: rule__ModelSpec__Group__5 : rule__ModelSpec__Group__5__Impl rule__ModelSpec__Group__6 ;
    public final void rule__ModelSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:291:1: ( rule__ModelSpec__Group__5__Impl rule__ModelSpec__Group__6 )
            // InternalXAIModel.g:292:2: rule__ModelSpec__Group__5__Impl rule__ModelSpec__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ModelSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__5"


    // $ANTLR start "rule__ModelSpec__Group__5__Impl"
    // InternalXAIModel.g:299:1: rule__ModelSpec__Group__5__Impl : ( ( rule__ModelSpec__UserAssignment_5 ) ) ;
    public final void rule__ModelSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:303:1: ( ( ( rule__ModelSpec__UserAssignment_5 ) ) )
            // InternalXAIModel.g:304:1: ( ( rule__ModelSpec__UserAssignment_5 ) )
            {
            // InternalXAIModel.g:304:1: ( ( rule__ModelSpec__UserAssignment_5 ) )
            // InternalXAIModel.g:305:2: ( rule__ModelSpec__UserAssignment_5 )
            {
             before(grammarAccess.getModelSpecAccess().getUserAssignment_5()); 
            // InternalXAIModel.g:306:2: ( rule__ModelSpec__UserAssignment_5 )
            // InternalXAIModel.g:306:3: rule__ModelSpec__UserAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__UserAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelSpecAccess().getUserAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__5__Impl"


    // $ANTLR start "rule__ModelSpec__Group__6"
    // InternalXAIModel.g:314:1: rule__ModelSpec__Group__6 : rule__ModelSpec__Group__6__Impl rule__ModelSpec__Group__7 ;
    public final void rule__ModelSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:318:1: ( rule__ModelSpec__Group__6__Impl rule__ModelSpec__Group__7 )
            // InternalXAIModel.g:319:2: rule__ModelSpec__Group__6__Impl rule__ModelSpec__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ModelSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__6"


    // $ANTLR start "rule__ModelSpec__Group__6__Impl"
    // InternalXAIModel.g:326:1: rule__ModelSpec__Group__6__Impl : ( 'data' ) ;
    public final void rule__ModelSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:330:1: ( ( 'data' ) )
            // InternalXAIModel.g:331:1: ( 'data' )
            {
            // InternalXAIModel.g:331:1: ( 'data' )
            // InternalXAIModel.g:332:2: 'data'
            {
             before(grammarAccess.getModelSpecAccess().getDataKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getDataKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__6__Impl"


    // $ANTLR start "rule__ModelSpec__Group__7"
    // InternalXAIModel.g:341:1: rule__ModelSpec__Group__7 : rule__ModelSpec__Group__7__Impl rule__ModelSpec__Group__8 ;
    public final void rule__ModelSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:345:1: ( rule__ModelSpec__Group__7__Impl rule__ModelSpec__Group__8 )
            // InternalXAIModel.g:346:2: rule__ModelSpec__Group__7__Impl rule__ModelSpec__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ModelSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__7"


    // $ANTLR start "rule__ModelSpec__Group__7__Impl"
    // InternalXAIModel.g:353:1: rule__ModelSpec__Group__7__Impl : ( ( rule__ModelSpec__DatasetAssignment_7 ) ) ;
    public final void rule__ModelSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:357:1: ( ( ( rule__ModelSpec__DatasetAssignment_7 ) ) )
            // InternalXAIModel.g:358:1: ( ( rule__ModelSpec__DatasetAssignment_7 ) )
            {
            // InternalXAIModel.g:358:1: ( ( rule__ModelSpec__DatasetAssignment_7 ) )
            // InternalXAIModel.g:359:2: ( rule__ModelSpec__DatasetAssignment_7 )
            {
             before(grammarAccess.getModelSpecAccess().getDatasetAssignment_7()); 
            // InternalXAIModel.g:360:2: ( rule__ModelSpec__DatasetAssignment_7 )
            // InternalXAIModel.g:360:3: rule__ModelSpec__DatasetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__DatasetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelSpecAccess().getDatasetAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__7__Impl"


    // $ANTLR start "rule__ModelSpec__Group__8"
    // InternalXAIModel.g:368:1: rule__ModelSpec__Group__8 : rule__ModelSpec__Group__8__Impl ;
    public final void rule__ModelSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:372:1: ( rule__ModelSpec__Group__8__Impl )
            // InternalXAIModel.g:373:2: rule__ModelSpec__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__8"


    // $ANTLR start "rule__ModelSpec__Group__8__Impl"
    // InternalXAIModel.g:379:1: rule__ModelSpec__Group__8__Impl : ( ( rule__ModelSpec__Group_8__0 )? ) ;
    public final void rule__ModelSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:383:1: ( ( ( rule__ModelSpec__Group_8__0 )? ) )
            // InternalXAIModel.g:384:1: ( ( rule__ModelSpec__Group_8__0 )? )
            {
            // InternalXAIModel.g:384:1: ( ( rule__ModelSpec__Group_8__0 )? )
            // InternalXAIModel.g:385:2: ( rule__ModelSpec__Group_8__0 )?
            {
             before(grammarAccess.getModelSpecAccess().getGroup_8()); 
            // InternalXAIModel.g:386:2: ( rule__ModelSpec__Group_8__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXAIModel.g:386:3: rule__ModelSpec__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelSpec__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelSpecAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group__8__Impl"


    // $ANTLR start "rule__ModelSpec__Group_8__0"
    // InternalXAIModel.g:395:1: rule__ModelSpec__Group_8__0 : rule__ModelSpec__Group_8__0__Impl rule__ModelSpec__Group_8__1 ;
    public final void rule__ModelSpec__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:399:1: ( rule__ModelSpec__Group_8__0__Impl rule__ModelSpec__Group_8__1 )
            // InternalXAIModel.g:400:2: rule__ModelSpec__Group_8__0__Impl rule__ModelSpec__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ModelSpec__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group_8__0"


    // $ANTLR start "rule__ModelSpec__Group_8__0__Impl"
    // InternalXAIModel.g:407:1: rule__ModelSpec__Group_8__0__Impl : ( 'explain' ) ;
    public final void rule__ModelSpec__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:411:1: ( ( 'explain' ) )
            // InternalXAIModel.g:412:1: ( 'explain' )
            {
            // InternalXAIModel.g:412:1: ( 'explain' )
            // InternalXAIModel.g:413:2: 'explain'
            {
             before(grammarAccess.getModelSpecAccess().getExplainKeyword_8_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getExplainKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group_8__0__Impl"


    // $ANTLR start "rule__ModelSpec__Group_8__1"
    // InternalXAIModel.g:422:1: rule__ModelSpec__Group_8__1 : rule__ModelSpec__Group_8__1__Impl ;
    public final void rule__ModelSpec__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:426:1: ( rule__ModelSpec__Group_8__1__Impl )
            // InternalXAIModel.g:427:2: rule__ModelSpec__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group_8__1"


    // $ANTLR start "rule__ModelSpec__Group_8__1__Impl"
    // InternalXAIModel.g:433:1: rule__ModelSpec__Group_8__1__Impl : ( ( rule__ModelSpec__MethodAssignment_8_1 ) ) ;
    public final void rule__ModelSpec__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:437:1: ( ( ( rule__ModelSpec__MethodAssignment_8_1 ) ) )
            // InternalXAIModel.g:438:1: ( ( rule__ModelSpec__MethodAssignment_8_1 ) )
            {
            // InternalXAIModel.g:438:1: ( ( rule__ModelSpec__MethodAssignment_8_1 ) )
            // InternalXAIModel.g:439:2: ( rule__ModelSpec__MethodAssignment_8_1 )
            {
             before(grammarAccess.getModelSpecAccess().getMethodAssignment_8_1()); 
            // InternalXAIModel.g:440:2: ( rule__ModelSpec__MethodAssignment_8_1 )
            // InternalXAIModel.g:440:3: rule__ModelSpec__MethodAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelSpec__MethodAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getModelSpecAccess().getMethodAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__Group_8__1__Impl"


    // $ANTLR start "rule__UserSpec__Group__0"
    // InternalXAIModel.g:449:1: rule__UserSpec__Group__0 : rule__UserSpec__Group__0__Impl rule__UserSpec__Group__1 ;
    public final void rule__UserSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:453:1: ( rule__UserSpec__Group__0__Impl rule__UserSpec__Group__1 )
            // InternalXAIModel.g:454:2: rule__UserSpec__Group__0__Impl rule__UserSpec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UserSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__0"


    // $ANTLR start "rule__UserSpec__Group__0__Impl"
    // InternalXAIModel.g:461:1: rule__UserSpec__Group__0__Impl : ( 'user' ) ;
    public final void rule__UserSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:465:1: ( ( 'user' ) )
            // InternalXAIModel.g:466:1: ( 'user' )
            {
            // InternalXAIModel.g:466:1: ( 'user' )
            // InternalXAIModel.g:467:2: 'user'
            {
             before(grammarAccess.getUserSpecAccess().getUserKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__0__Impl"


    // $ANTLR start "rule__UserSpec__Group__1"
    // InternalXAIModel.g:476:1: rule__UserSpec__Group__1 : rule__UserSpec__Group__1__Impl rule__UserSpec__Group__2 ;
    public final void rule__UserSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:480:1: ( rule__UserSpec__Group__1__Impl rule__UserSpec__Group__2 )
            // InternalXAIModel.g:481:2: rule__UserSpec__Group__1__Impl rule__UserSpec__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UserSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__1"


    // $ANTLR start "rule__UserSpec__Group__1__Impl"
    // InternalXAIModel.g:488:1: rule__UserSpec__Group__1__Impl : ( ( rule__UserSpec__NameAssignment_1 ) ) ;
    public final void rule__UserSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:492:1: ( ( ( rule__UserSpec__NameAssignment_1 ) ) )
            // InternalXAIModel.g:493:1: ( ( rule__UserSpec__NameAssignment_1 ) )
            {
            // InternalXAIModel.g:493:1: ( ( rule__UserSpec__NameAssignment_1 ) )
            // InternalXAIModel.g:494:2: ( rule__UserSpec__NameAssignment_1 )
            {
             before(grammarAccess.getUserSpecAccess().getNameAssignment_1()); 
            // InternalXAIModel.g:495:2: ( rule__UserSpec__NameAssignment_1 )
            // InternalXAIModel.g:495:3: rule__UserSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__1__Impl"


    // $ANTLR start "rule__UserSpec__Group__2"
    // InternalXAIModel.g:503:1: rule__UserSpec__Group__2 : rule__UserSpec__Group__2__Impl rule__UserSpec__Group__3 ;
    public final void rule__UserSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:507:1: ( rule__UserSpec__Group__2__Impl rule__UserSpec__Group__3 )
            // InternalXAIModel.g:508:2: rule__UserSpec__Group__2__Impl rule__UserSpec__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__UserSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__2"


    // $ANTLR start "rule__UserSpec__Group__2__Impl"
    // InternalXAIModel.g:515:1: rule__UserSpec__Group__2__Impl : ( 'expertise' ) ;
    public final void rule__UserSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:519:1: ( ( 'expertise' ) )
            // InternalXAIModel.g:520:1: ( 'expertise' )
            {
            // InternalXAIModel.g:520:1: ( 'expertise' )
            // InternalXAIModel.g:521:2: 'expertise'
            {
             before(grammarAccess.getUserSpecAccess().getExpertiseKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getExpertiseKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__2__Impl"


    // $ANTLR start "rule__UserSpec__Group__3"
    // InternalXAIModel.g:530:1: rule__UserSpec__Group__3 : rule__UserSpec__Group__3__Impl rule__UserSpec__Group__4 ;
    public final void rule__UserSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:534:1: ( rule__UserSpec__Group__3__Impl rule__UserSpec__Group__4 )
            // InternalXAIModel.g:535:2: rule__UserSpec__Group__3__Impl rule__UserSpec__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__UserSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__3"


    // $ANTLR start "rule__UserSpec__Group__3__Impl"
    // InternalXAIModel.g:542:1: rule__UserSpec__Group__3__Impl : ( '=' ) ;
    public final void rule__UserSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:546:1: ( ( '=' ) )
            // InternalXAIModel.g:547:1: ( '=' )
            {
            // InternalXAIModel.g:547:1: ( '=' )
            // InternalXAIModel.g:548:2: '='
            {
             before(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__3__Impl"


    // $ANTLR start "rule__UserSpec__Group__4"
    // InternalXAIModel.g:557:1: rule__UserSpec__Group__4 : rule__UserSpec__Group__4__Impl rule__UserSpec__Group__5 ;
    public final void rule__UserSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:561:1: ( rule__UserSpec__Group__4__Impl rule__UserSpec__Group__5 )
            // InternalXAIModel.g:562:2: rule__UserSpec__Group__4__Impl rule__UserSpec__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__UserSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__4"


    // $ANTLR start "rule__UserSpec__Group__4__Impl"
    // InternalXAIModel.g:569:1: rule__UserSpec__Group__4__Impl : ( ( rule__UserSpec__ExpertiseAssignment_4 ) ) ;
    public final void rule__UserSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:573:1: ( ( ( rule__UserSpec__ExpertiseAssignment_4 ) ) )
            // InternalXAIModel.g:574:1: ( ( rule__UserSpec__ExpertiseAssignment_4 ) )
            {
            // InternalXAIModel.g:574:1: ( ( rule__UserSpec__ExpertiseAssignment_4 ) )
            // InternalXAIModel.g:575:2: ( rule__UserSpec__ExpertiseAssignment_4 )
            {
             before(grammarAccess.getUserSpecAccess().getExpertiseAssignment_4()); 
            // InternalXAIModel.g:576:2: ( rule__UserSpec__ExpertiseAssignment_4 )
            // InternalXAIModel.g:576:3: rule__UserSpec__ExpertiseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__ExpertiseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getExpertiseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__4__Impl"


    // $ANTLR start "rule__UserSpec__Group__5"
    // InternalXAIModel.g:584:1: rule__UserSpec__Group__5 : rule__UserSpec__Group__5__Impl rule__UserSpec__Group__6 ;
    public final void rule__UserSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:588:1: ( rule__UserSpec__Group__5__Impl rule__UserSpec__Group__6 )
            // InternalXAIModel.g:589:2: rule__UserSpec__Group__5__Impl rule__UserSpec__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__UserSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__5"


    // $ANTLR start "rule__UserSpec__Group__5__Impl"
    // InternalXAIModel.g:596:1: rule__UserSpec__Group__5__Impl : ( ( rule__UserSpec__Group_5__0 )? ) ;
    public final void rule__UserSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:600:1: ( ( ( rule__UserSpec__Group_5__0 )? ) )
            // InternalXAIModel.g:601:1: ( ( rule__UserSpec__Group_5__0 )? )
            {
            // InternalXAIModel.g:601:1: ( ( rule__UserSpec__Group_5__0 )? )
            // InternalXAIModel.g:602:2: ( rule__UserSpec__Group_5__0 )?
            {
             before(grammarAccess.getUserSpecAccess().getGroup_5()); 
            // InternalXAIModel.g:603:2: ( rule__UserSpec__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXAIModel.g:603:3: rule__UserSpec__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UserSpec__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserSpecAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__5__Impl"


    // $ANTLR start "rule__UserSpec__Group__6"
    // InternalXAIModel.g:611:1: rule__UserSpec__Group__6 : rule__UserSpec__Group__6__Impl rule__UserSpec__Group__7 ;
    public final void rule__UserSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:615:1: ( rule__UserSpec__Group__6__Impl rule__UserSpec__Group__7 )
            // InternalXAIModel.g:616:2: rule__UserSpec__Group__6__Impl rule__UserSpec__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__UserSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__6"


    // $ANTLR start "rule__UserSpec__Group__6__Impl"
    // InternalXAIModel.g:623:1: rule__UserSpec__Group__6__Impl : ( ( rule__UserSpec__Group_6__0 )? ) ;
    public final void rule__UserSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:627:1: ( ( ( rule__UserSpec__Group_6__0 )? ) )
            // InternalXAIModel.g:628:1: ( ( rule__UserSpec__Group_6__0 )? )
            {
            // InternalXAIModel.g:628:1: ( ( rule__UserSpec__Group_6__0 )? )
            // InternalXAIModel.g:629:2: ( rule__UserSpec__Group_6__0 )?
            {
             before(grammarAccess.getUserSpecAccess().getGroup_6()); 
            // InternalXAIModel.g:630:2: ( rule__UserSpec__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXAIModel.g:630:3: rule__UserSpec__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UserSpec__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserSpecAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__6__Impl"


    // $ANTLR start "rule__UserSpec__Group__7"
    // InternalXAIModel.g:638:1: rule__UserSpec__Group__7 : rule__UserSpec__Group__7__Impl ;
    public final void rule__UserSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:642:1: ( rule__UserSpec__Group__7__Impl )
            // InternalXAIModel.g:643:2: rule__UserSpec__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__7"


    // $ANTLR start "rule__UserSpec__Group__7__Impl"
    // InternalXAIModel.g:649:1: rule__UserSpec__Group__7__Impl : ( ( rule__UserSpec__Group_7__0 )? ) ;
    public final void rule__UserSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:653:1: ( ( ( rule__UserSpec__Group_7__0 )? ) )
            // InternalXAIModel.g:654:1: ( ( rule__UserSpec__Group_7__0 )? )
            {
            // InternalXAIModel.g:654:1: ( ( rule__UserSpec__Group_7__0 )? )
            // InternalXAIModel.g:655:2: ( rule__UserSpec__Group_7__0 )?
            {
             before(grammarAccess.getUserSpecAccess().getGroup_7()); 
            // InternalXAIModel.g:656:2: ( rule__UserSpec__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXAIModel.g:656:3: rule__UserSpec__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UserSpec__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserSpecAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group__7__Impl"


    // $ANTLR start "rule__UserSpec__Group_5__0"
    // InternalXAIModel.g:665:1: rule__UserSpec__Group_5__0 : rule__UserSpec__Group_5__0__Impl rule__UserSpec__Group_5__1 ;
    public final void rule__UserSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:669:1: ( rule__UserSpec__Group_5__0__Impl rule__UserSpec__Group_5__1 )
            // InternalXAIModel.g:670:2: rule__UserSpec__Group_5__0__Impl rule__UserSpec__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__UserSpec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__0"


    // $ANTLR start "rule__UserSpec__Group_5__0__Impl"
    // InternalXAIModel.g:677:1: rule__UserSpec__Group_5__0__Impl : ( 'format' ) ;
    public final void rule__UserSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:681:1: ( ( 'format' ) )
            // InternalXAIModel.g:682:1: ( 'format' )
            {
            // InternalXAIModel.g:682:1: ( 'format' )
            // InternalXAIModel.g:683:2: 'format'
            {
             before(grammarAccess.getUserSpecAccess().getFormatKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getFormatKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__0__Impl"


    // $ANTLR start "rule__UserSpec__Group_5__1"
    // InternalXAIModel.g:692:1: rule__UserSpec__Group_5__1 : rule__UserSpec__Group_5__1__Impl rule__UserSpec__Group_5__2 ;
    public final void rule__UserSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:696:1: ( rule__UserSpec__Group_5__1__Impl rule__UserSpec__Group_5__2 )
            // InternalXAIModel.g:697:2: rule__UserSpec__Group_5__1__Impl rule__UserSpec__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__UserSpec__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__1"


    // $ANTLR start "rule__UserSpec__Group_5__1__Impl"
    // InternalXAIModel.g:704:1: rule__UserSpec__Group_5__1__Impl : ( '=' ) ;
    public final void rule__UserSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:708:1: ( ( '=' ) )
            // InternalXAIModel.g:709:1: ( '=' )
            {
            // InternalXAIModel.g:709:1: ( '=' )
            // InternalXAIModel.g:710:2: '='
            {
             before(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__1__Impl"


    // $ANTLR start "rule__UserSpec__Group_5__2"
    // InternalXAIModel.g:719:1: rule__UserSpec__Group_5__2 : rule__UserSpec__Group_5__2__Impl rule__UserSpec__Group_5__3 ;
    public final void rule__UserSpec__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:723:1: ( rule__UserSpec__Group_5__2__Impl rule__UserSpec__Group_5__3 )
            // InternalXAIModel.g:724:2: rule__UserSpec__Group_5__2__Impl rule__UserSpec__Group_5__3
            {
            pushFollow(FOLLOW_3);
            rule__UserSpec__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__2"


    // $ANTLR start "rule__UserSpec__Group_5__2__Impl"
    // InternalXAIModel.g:731:1: rule__UserSpec__Group_5__2__Impl : ( '[' ) ;
    public final void rule__UserSpec__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:735:1: ( ( '[' ) )
            // InternalXAIModel.g:736:1: ( '[' )
            {
            // InternalXAIModel.g:736:1: ( '[' )
            // InternalXAIModel.g:737:2: '['
            {
             before(grammarAccess.getUserSpecAccess().getLeftSquareBracketKeyword_5_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getLeftSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__2__Impl"


    // $ANTLR start "rule__UserSpec__Group_5__3"
    // InternalXAIModel.g:746:1: rule__UserSpec__Group_5__3 : rule__UserSpec__Group_5__3__Impl rule__UserSpec__Group_5__4 ;
    public final void rule__UserSpec__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:750:1: ( rule__UserSpec__Group_5__3__Impl rule__UserSpec__Group_5__4 )
            // InternalXAIModel.g:751:2: rule__UserSpec__Group_5__3__Impl rule__UserSpec__Group_5__4
            {
            pushFollow(FOLLOW_14);
            rule__UserSpec__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__3"


    // $ANTLR start "rule__UserSpec__Group_5__3__Impl"
    // InternalXAIModel.g:758:1: rule__UserSpec__Group_5__3__Impl : ( ( rule__UserSpec__FormatAssignment_5_3 ) ) ;
    public final void rule__UserSpec__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:762:1: ( ( ( rule__UserSpec__FormatAssignment_5_3 ) ) )
            // InternalXAIModel.g:763:1: ( ( rule__UserSpec__FormatAssignment_5_3 ) )
            {
            // InternalXAIModel.g:763:1: ( ( rule__UserSpec__FormatAssignment_5_3 ) )
            // InternalXAIModel.g:764:2: ( rule__UserSpec__FormatAssignment_5_3 )
            {
             before(grammarAccess.getUserSpecAccess().getFormatAssignment_5_3()); 
            // InternalXAIModel.g:765:2: ( rule__UserSpec__FormatAssignment_5_3 )
            // InternalXAIModel.g:765:3: rule__UserSpec__FormatAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__FormatAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getFormatAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__3__Impl"


    // $ANTLR start "rule__UserSpec__Group_5__4"
    // InternalXAIModel.g:773:1: rule__UserSpec__Group_5__4 : rule__UserSpec__Group_5__4__Impl rule__UserSpec__Group_5__5 ;
    public final void rule__UserSpec__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:777:1: ( rule__UserSpec__Group_5__4__Impl rule__UserSpec__Group_5__5 )
            // InternalXAIModel.g:778:2: rule__UserSpec__Group_5__4__Impl rule__UserSpec__Group_5__5
            {
            pushFollow(FOLLOW_14);
            rule__UserSpec__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__4"


    // $ANTLR start "rule__UserSpec__Group_5__4__Impl"
    // InternalXAIModel.g:785:1: rule__UserSpec__Group_5__4__Impl : ( ( rule__UserSpec__Group_5_4__0 )* ) ;
    public final void rule__UserSpec__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:789:1: ( ( ( rule__UserSpec__Group_5_4__0 )* ) )
            // InternalXAIModel.g:790:1: ( ( rule__UserSpec__Group_5_4__0 )* )
            {
            // InternalXAIModel.g:790:1: ( ( rule__UserSpec__Group_5_4__0 )* )
            // InternalXAIModel.g:791:2: ( rule__UserSpec__Group_5_4__0 )*
            {
             before(grammarAccess.getUserSpecAccess().getGroup_5_4()); 
            // InternalXAIModel.g:792:2: ( rule__UserSpec__Group_5_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXAIModel.g:792:3: rule__UserSpec__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UserSpec__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getUserSpecAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__4__Impl"


    // $ANTLR start "rule__UserSpec__Group_5__5"
    // InternalXAIModel.g:800:1: rule__UserSpec__Group_5__5 : rule__UserSpec__Group_5__5__Impl ;
    public final void rule__UserSpec__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:804:1: ( rule__UserSpec__Group_5__5__Impl )
            // InternalXAIModel.g:805:2: rule__UserSpec__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__5"


    // $ANTLR start "rule__UserSpec__Group_5__5__Impl"
    // InternalXAIModel.g:811:1: rule__UserSpec__Group_5__5__Impl : ( ']' ) ;
    public final void rule__UserSpec__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:815:1: ( ( ']' ) )
            // InternalXAIModel.g:816:1: ( ']' )
            {
            // InternalXAIModel.g:816:1: ( ']' )
            // InternalXAIModel.g:817:2: ']'
            {
             before(grammarAccess.getUserSpecAccess().getRightSquareBracketKeyword_5_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getRightSquareBracketKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5__5__Impl"


    // $ANTLR start "rule__UserSpec__Group_5_4__0"
    // InternalXAIModel.g:827:1: rule__UserSpec__Group_5_4__0 : rule__UserSpec__Group_5_4__0__Impl rule__UserSpec__Group_5_4__1 ;
    public final void rule__UserSpec__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:831:1: ( rule__UserSpec__Group_5_4__0__Impl rule__UserSpec__Group_5_4__1 )
            // InternalXAIModel.g:832:2: rule__UserSpec__Group_5_4__0__Impl rule__UserSpec__Group_5_4__1
            {
            pushFollow(FOLLOW_3);
            rule__UserSpec__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5_4__0"


    // $ANTLR start "rule__UserSpec__Group_5_4__0__Impl"
    // InternalXAIModel.g:839:1: rule__UserSpec__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__UserSpec__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:843:1: ( ( ',' ) )
            // InternalXAIModel.g:844:1: ( ',' )
            {
            // InternalXAIModel.g:844:1: ( ',' )
            // InternalXAIModel.g:845:2: ','
            {
             before(grammarAccess.getUserSpecAccess().getCommaKeyword_5_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5_4__0__Impl"


    // $ANTLR start "rule__UserSpec__Group_5_4__1"
    // InternalXAIModel.g:854:1: rule__UserSpec__Group_5_4__1 : rule__UserSpec__Group_5_4__1__Impl ;
    public final void rule__UserSpec__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:858:1: ( rule__UserSpec__Group_5_4__1__Impl )
            // InternalXAIModel.g:859:2: rule__UserSpec__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5_4__1"


    // $ANTLR start "rule__UserSpec__Group_5_4__1__Impl"
    // InternalXAIModel.g:865:1: rule__UserSpec__Group_5_4__1__Impl : ( ( rule__UserSpec__FormatAssignment_5_4_1 ) ) ;
    public final void rule__UserSpec__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:869:1: ( ( ( rule__UserSpec__FormatAssignment_5_4_1 ) ) )
            // InternalXAIModel.g:870:1: ( ( rule__UserSpec__FormatAssignment_5_4_1 ) )
            {
            // InternalXAIModel.g:870:1: ( ( rule__UserSpec__FormatAssignment_5_4_1 ) )
            // InternalXAIModel.g:871:2: ( rule__UserSpec__FormatAssignment_5_4_1 )
            {
             before(grammarAccess.getUserSpecAccess().getFormatAssignment_5_4_1()); 
            // InternalXAIModel.g:872:2: ( rule__UserSpec__FormatAssignment_5_4_1 )
            // InternalXAIModel.g:872:3: rule__UserSpec__FormatAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__FormatAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getFormatAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_5_4__1__Impl"


    // $ANTLR start "rule__UserSpec__Group_6__0"
    // InternalXAIModel.g:881:1: rule__UserSpec__Group_6__0 : rule__UserSpec__Group_6__0__Impl rule__UserSpec__Group_6__1 ;
    public final void rule__UserSpec__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:885:1: ( rule__UserSpec__Group_6__0__Impl rule__UserSpec__Group_6__1 )
            // InternalXAIModel.g:886:2: rule__UserSpec__Group_6__0__Impl rule__UserSpec__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__UserSpec__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_6__0"


    // $ANTLR start "rule__UserSpec__Group_6__0__Impl"
    // InternalXAIModel.g:893:1: rule__UserSpec__Group_6__0__Impl : ( 'details' ) ;
    public final void rule__UserSpec__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:897:1: ( ( 'details' ) )
            // InternalXAIModel.g:898:1: ( 'details' )
            {
            // InternalXAIModel.g:898:1: ( 'details' )
            // InternalXAIModel.g:899:2: 'details'
            {
             before(grammarAccess.getUserSpecAccess().getDetailsKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getDetailsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_6__0__Impl"


    // $ANTLR start "rule__UserSpec__Group_6__1"
    // InternalXAIModel.g:908:1: rule__UserSpec__Group_6__1 : rule__UserSpec__Group_6__1__Impl rule__UserSpec__Group_6__2 ;
    public final void rule__UserSpec__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:912:1: ( rule__UserSpec__Group_6__1__Impl rule__UserSpec__Group_6__2 )
            // InternalXAIModel.g:913:2: rule__UserSpec__Group_6__1__Impl rule__UserSpec__Group_6__2
            {
            pushFollow(FOLLOW_3);
            rule__UserSpec__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_6__1"


    // $ANTLR start "rule__UserSpec__Group_6__1__Impl"
    // InternalXAIModel.g:920:1: rule__UserSpec__Group_6__1__Impl : ( '=' ) ;
    public final void rule__UserSpec__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:924:1: ( ( '=' ) )
            // InternalXAIModel.g:925:1: ( '=' )
            {
            // InternalXAIModel.g:925:1: ( '=' )
            // InternalXAIModel.g:926:2: '='
            {
             before(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_6_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_6__1__Impl"


    // $ANTLR start "rule__UserSpec__Group_6__2"
    // InternalXAIModel.g:935:1: rule__UserSpec__Group_6__2 : rule__UserSpec__Group_6__2__Impl ;
    public final void rule__UserSpec__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:939:1: ( rule__UserSpec__Group_6__2__Impl )
            // InternalXAIModel.g:940:2: rule__UserSpec__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_6__2"


    // $ANTLR start "rule__UserSpec__Group_6__2__Impl"
    // InternalXAIModel.g:946:1: rule__UserSpec__Group_6__2__Impl : ( ( rule__UserSpec__DetailsAssignment_6_2 ) ) ;
    public final void rule__UserSpec__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:950:1: ( ( ( rule__UserSpec__DetailsAssignment_6_2 ) ) )
            // InternalXAIModel.g:951:1: ( ( rule__UserSpec__DetailsAssignment_6_2 ) )
            {
            // InternalXAIModel.g:951:1: ( ( rule__UserSpec__DetailsAssignment_6_2 ) )
            // InternalXAIModel.g:952:2: ( rule__UserSpec__DetailsAssignment_6_2 )
            {
             before(grammarAccess.getUserSpecAccess().getDetailsAssignment_6_2()); 
            // InternalXAIModel.g:953:2: ( rule__UserSpec__DetailsAssignment_6_2 )
            // InternalXAIModel.g:953:3: rule__UserSpec__DetailsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__DetailsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getDetailsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_6__2__Impl"


    // $ANTLR start "rule__UserSpec__Group_7__0"
    // InternalXAIModel.g:962:1: rule__UserSpec__Group_7__0 : rule__UserSpec__Group_7__0__Impl rule__UserSpec__Group_7__1 ;
    public final void rule__UserSpec__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:966:1: ( rule__UserSpec__Group_7__0__Impl rule__UserSpec__Group_7__1 )
            // InternalXAIModel.g:967:2: rule__UserSpec__Group_7__0__Impl rule__UserSpec__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__UserSpec__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_7__0"


    // $ANTLR start "rule__UserSpec__Group_7__0__Impl"
    // InternalXAIModel.g:974:1: rule__UserSpec__Group_7__0__Impl : ( 'purpose' ) ;
    public final void rule__UserSpec__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:978:1: ( ( 'purpose' ) )
            // InternalXAIModel.g:979:1: ( 'purpose' )
            {
            // InternalXAIModel.g:979:1: ( 'purpose' )
            // InternalXAIModel.g:980:2: 'purpose'
            {
             before(grammarAccess.getUserSpecAccess().getPurposeKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getPurposeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_7__0__Impl"


    // $ANTLR start "rule__UserSpec__Group_7__1"
    // InternalXAIModel.g:989:1: rule__UserSpec__Group_7__1 : rule__UserSpec__Group_7__1__Impl rule__UserSpec__Group_7__2 ;
    public final void rule__UserSpec__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:993:1: ( rule__UserSpec__Group_7__1__Impl rule__UserSpec__Group_7__2 )
            // InternalXAIModel.g:994:2: rule__UserSpec__Group_7__1__Impl rule__UserSpec__Group_7__2
            {
            pushFollow(FOLLOW_3);
            rule__UserSpec__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_7__1"


    // $ANTLR start "rule__UserSpec__Group_7__1__Impl"
    // InternalXAIModel.g:1001:1: rule__UserSpec__Group_7__1__Impl : ( '=' ) ;
    public final void rule__UserSpec__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1005:1: ( ( '=' ) )
            // InternalXAIModel.g:1006:1: ( '=' )
            {
            // InternalXAIModel.g:1006:1: ( '=' )
            // InternalXAIModel.g:1007:2: '='
            {
             before(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_7_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_7__1__Impl"


    // $ANTLR start "rule__UserSpec__Group_7__2"
    // InternalXAIModel.g:1016:1: rule__UserSpec__Group_7__2 : rule__UserSpec__Group_7__2__Impl ;
    public final void rule__UserSpec__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1020:1: ( rule__UserSpec__Group_7__2__Impl )
            // InternalXAIModel.g:1021:2: rule__UserSpec__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_7__2"


    // $ANTLR start "rule__UserSpec__Group_7__2__Impl"
    // InternalXAIModel.g:1027:1: rule__UserSpec__Group_7__2__Impl : ( ( rule__UserSpec__PurposeAssignment_7_2 ) ) ;
    public final void rule__UserSpec__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1031:1: ( ( ( rule__UserSpec__PurposeAssignment_7_2 ) ) )
            // InternalXAIModel.g:1032:1: ( ( rule__UserSpec__PurposeAssignment_7_2 ) )
            {
            // InternalXAIModel.g:1032:1: ( ( rule__UserSpec__PurposeAssignment_7_2 ) )
            // InternalXAIModel.g:1033:2: ( rule__UserSpec__PurposeAssignment_7_2 )
            {
             before(grammarAccess.getUserSpecAccess().getPurposeAssignment_7_2()); 
            // InternalXAIModel.g:1034:2: ( rule__UserSpec__PurposeAssignment_7_2 )
            // InternalXAIModel.g:1034:3: rule__UserSpec__PurposeAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__UserSpec__PurposeAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getUserSpecAccess().getPurposeAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__Group_7__2__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__0"
    // InternalXAIModel.g:1043:1: rule__DatasetSpec__Group__0 : rule__DatasetSpec__Group__0__Impl rule__DatasetSpec__Group__1 ;
    public final void rule__DatasetSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1047:1: ( rule__DatasetSpec__Group__0__Impl rule__DatasetSpec__Group__1 )
            // InternalXAIModel.g:1048:2: rule__DatasetSpec__Group__0__Impl rule__DatasetSpec__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DatasetSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__0"


    // $ANTLR start "rule__DatasetSpec__Group__0__Impl"
    // InternalXAIModel.g:1055:1: rule__DatasetSpec__Group__0__Impl : ( 'dataset' ) ;
    public final void rule__DatasetSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1059:1: ( ( 'dataset' ) )
            // InternalXAIModel.g:1060:1: ( 'dataset' )
            {
            // InternalXAIModel.g:1060:1: ( 'dataset' )
            // InternalXAIModel.g:1061:2: 'dataset'
            {
             before(grammarAccess.getDatasetSpecAccess().getDatasetKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getDatasetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__0__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__1"
    // InternalXAIModel.g:1070:1: rule__DatasetSpec__Group__1 : rule__DatasetSpec__Group__1__Impl rule__DatasetSpec__Group__2 ;
    public final void rule__DatasetSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1074:1: ( rule__DatasetSpec__Group__1__Impl rule__DatasetSpec__Group__2 )
            // InternalXAIModel.g:1075:2: rule__DatasetSpec__Group__1__Impl rule__DatasetSpec__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DatasetSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__1"


    // $ANTLR start "rule__DatasetSpec__Group__1__Impl"
    // InternalXAIModel.g:1082:1: rule__DatasetSpec__Group__1__Impl : ( 'path' ) ;
    public final void rule__DatasetSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1086:1: ( ( 'path' ) )
            // InternalXAIModel.g:1087:1: ( 'path' )
            {
            // InternalXAIModel.g:1087:1: ( 'path' )
            // InternalXAIModel.g:1088:2: 'path'
            {
             before(grammarAccess.getDatasetSpecAccess().getPathKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getPathKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__1__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__2"
    // InternalXAIModel.g:1097:1: rule__DatasetSpec__Group__2 : rule__DatasetSpec__Group__2__Impl rule__DatasetSpec__Group__3 ;
    public final void rule__DatasetSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1101:1: ( rule__DatasetSpec__Group__2__Impl rule__DatasetSpec__Group__3 )
            // InternalXAIModel.g:1102:2: rule__DatasetSpec__Group__2__Impl rule__DatasetSpec__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__DatasetSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__2"


    // $ANTLR start "rule__DatasetSpec__Group__2__Impl"
    // InternalXAIModel.g:1109:1: rule__DatasetSpec__Group__2__Impl : ( '=' ) ;
    public final void rule__DatasetSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1113:1: ( ( '=' ) )
            // InternalXAIModel.g:1114:1: ( '=' )
            {
            // InternalXAIModel.g:1114:1: ( '=' )
            // InternalXAIModel.g:1115:2: '='
            {
             before(grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__2__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__3"
    // InternalXAIModel.g:1124:1: rule__DatasetSpec__Group__3 : rule__DatasetSpec__Group__3__Impl rule__DatasetSpec__Group__4 ;
    public final void rule__DatasetSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1128:1: ( rule__DatasetSpec__Group__3__Impl rule__DatasetSpec__Group__4 )
            // InternalXAIModel.g:1129:2: rule__DatasetSpec__Group__3__Impl rule__DatasetSpec__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DatasetSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__3"


    // $ANTLR start "rule__DatasetSpec__Group__3__Impl"
    // InternalXAIModel.g:1136:1: rule__DatasetSpec__Group__3__Impl : ( ( rule__DatasetSpec__PathAssignment_3 ) ) ;
    public final void rule__DatasetSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1140:1: ( ( ( rule__DatasetSpec__PathAssignment_3 ) ) )
            // InternalXAIModel.g:1141:1: ( ( rule__DatasetSpec__PathAssignment_3 ) )
            {
            // InternalXAIModel.g:1141:1: ( ( rule__DatasetSpec__PathAssignment_3 ) )
            // InternalXAIModel.g:1142:2: ( rule__DatasetSpec__PathAssignment_3 )
            {
             before(grammarAccess.getDatasetSpecAccess().getPathAssignment_3()); 
            // InternalXAIModel.g:1143:2: ( rule__DatasetSpec__PathAssignment_3 )
            // InternalXAIModel.g:1143:3: rule__DatasetSpec__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DatasetSpec__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatasetSpecAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__3__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__4"
    // InternalXAIModel.g:1151:1: rule__DatasetSpec__Group__4 : rule__DatasetSpec__Group__4__Impl rule__DatasetSpec__Group__5 ;
    public final void rule__DatasetSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1155:1: ( rule__DatasetSpec__Group__4__Impl rule__DatasetSpec__Group__5 )
            // InternalXAIModel.g:1156:2: rule__DatasetSpec__Group__4__Impl rule__DatasetSpec__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__DatasetSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__4"


    // $ANTLR start "rule__DatasetSpec__Group__4__Impl"
    // InternalXAIModel.g:1163:1: rule__DatasetSpec__Group__4__Impl : ( 'format' ) ;
    public final void rule__DatasetSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1167:1: ( ( 'format' ) )
            // InternalXAIModel.g:1168:1: ( 'format' )
            {
            // InternalXAIModel.g:1168:1: ( 'format' )
            // InternalXAIModel.g:1169:2: 'format'
            {
             before(grammarAccess.getDatasetSpecAccess().getFormatKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getFormatKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__4__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__5"
    // InternalXAIModel.g:1178:1: rule__DatasetSpec__Group__5 : rule__DatasetSpec__Group__5__Impl rule__DatasetSpec__Group__6 ;
    public final void rule__DatasetSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1182:1: ( rule__DatasetSpec__Group__5__Impl rule__DatasetSpec__Group__6 )
            // InternalXAIModel.g:1183:2: rule__DatasetSpec__Group__5__Impl rule__DatasetSpec__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__DatasetSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__5"


    // $ANTLR start "rule__DatasetSpec__Group__5__Impl"
    // InternalXAIModel.g:1190:1: rule__DatasetSpec__Group__5__Impl : ( '=' ) ;
    public final void rule__DatasetSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1194:1: ( ( '=' ) )
            // InternalXAIModel.g:1195:1: ( '=' )
            {
            // InternalXAIModel.g:1195:1: ( '=' )
            // InternalXAIModel.g:1196:2: '='
            {
             before(grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__5__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__6"
    // InternalXAIModel.g:1205:1: rule__DatasetSpec__Group__6 : rule__DatasetSpec__Group__6__Impl rule__DatasetSpec__Group__7 ;
    public final void rule__DatasetSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1209:1: ( rule__DatasetSpec__Group__6__Impl rule__DatasetSpec__Group__7 )
            // InternalXAIModel.g:1210:2: rule__DatasetSpec__Group__6__Impl rule__DatasetSpec__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__DatasetSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__6"


    // $ANTLR start "rule__DatasetSpec__Group__6__Impl"
    // InternalXAIModel.g:1217:1: rule__DatasetSpec__Group__6__Impl : ( ( rule__DatasetSpec__FormatAssignment_6 ) ) ;
    public final void rule__DatasetSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1221:1: ( ( ( rule__DatasetSpec__FormatAssignment_6 ) ) )
            // InternalXAIModel.g:1222:1: ( ( rule__DatasetSpec__FormatAssignment_6 ) )
            {
            // InternalXAIModel.g:1222:1: ( ( rule__DatasetSpec__FormatAssignment_6 ) )
            // InternalXAIModel.g:1223:2: ( rule__DatasetSpec__FormatAssignment_6 )
            {
             before(grammarAccess.getDatasetSpecAccess().getFormatAssignment_6()); 
            // InternalXAIModel.g:1224:2: ( rule__DatasetSpec__FormatAssignment_6 )
            // InternalXAIModel.g:1224:3: rule__DatasetSpec__FormatAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DatasetSpec__FormatAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDatasetSpecAccess().getFormatAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__6__Impl"


    // $ANTLR start "rule__DatasetSpec__Group__7"
    // InternalXAIModel.g:1232:1: rule__DatasetSpec__Group__7 : rule__DatasetSpec__Group__7__Impl ;
    public final void rule__DatasetSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1236:1: ( rule__DatasetSpec__Group__7__Impl )
            // InternalXAIModel.g:1237:2: rule__DatasetSpec__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__7"


    // $ANTLR start "rule__DatasetSpec__Group__7__Impl"
    // InternalXAIModel.g:1243:1: rule__DatasetSpec__Group__7__Impl : ( ( rule__DatasetSpec__Group_7__0 )? ) ;
    public final void rule__DatasetSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1247:1: ( ( ( rule__DatasetSpec__Group_7__0 )? ) )
            // InternalXAIModel.g:1248:1: ( ( rule__DatasetSpec__Group_7__0 )? )
            {
            // InternalXAIModel.g:1248:1: ( ( rule__DatasetSpec__Group_7__0 )? )
            // InternalXAIModel.g:1249:2: ( rule__DatasetSpec__Group_7__0 )?
            {
             before(grammarAccess.getDatasetSpecAccess().getGroup_7()); 
            // InternalXAIModel.g:1250:2: ( rule__DatasetSpec__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXAIModel.g:1250:3: rule__DatasetSpec__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatasetSpec__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatasetSpecAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group__7__Impl"


    // $ANTLR start "rule__DatasetSpec__Group_7__0"
    // InternalXAIModel.g:1259:1: rule__DatasetSpec__Group_7__0 : rule__DatasetSpec__Group_7__0__Impl rule__DatasetSpec__Group_7__1 ;
    public final void rule__DatasetSpec__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1263:1: ( rule__DatasetSpec__Group_7__0__Impl rule__DatasetSpec__Group_7__1 )
            // InternalXAIModel.g:1264:2: rule__DatasetSpec__Group_7__0__Impl rule__DatasetSpec__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__DatasetSpec__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group_7__0"


    // $ANTLR start "rule__DatasetSpec__Group_7__0__Impl"
    // InternalXAIModel.g:1271:1: rule__DatasetSpec__Group_7__0__Impl : ( 'target' ) ;
    public final void rule__DatasetSpec__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1275:1: ( ( 'target' ) )
            // InternalXAIModel.g:1276:1: ( 'target' )
            {
            // InternalXAIModel.g:1276:1: ( 'target' )
            // InternalXAIModel.g:1277:2: 'target'
            {
             before(grammarAccess.getDatasetSpecAccess().getTargetKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getTargetKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group_7__0__Impl"


    // $ANTLR start "rule__DatasetSpec__Group_7__1"
    // InternalXAIModel.g:1286:1: rule__DatasetSpec__Group_7__1 : rule__DatasetSpec__Group_7__1__Impl rule__DatasetSpec__Group_7__2 ;
    public final void rule__DatasetSpec__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1290:1: ( rule__DatasetSpec__Group_7__1__Impl rule__DatasetSpec__Group_7__2 )
            // InternalXAIModel.g:1291:2: rule__DatasetSpec__Group_7__1__Impl rule__DatasetSpec__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__DatasetSpec__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group_7__1"


    // $ANTLR start "rule__DatasetSpec__Group_7__1__Impl"
    // InternalXAIModel.g:1298:1: rule__DatasetSpec__Group_7__1__Impl : ( '=' ) ;
    public final void rule__DatasetSpec__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1302:1: ( ( '=' ) )
            // InternalXAIModel.g:1303:1: ( '=' )
            {
            // InternalXAIModel.g:1303:1: ( '=' )
            // InternalXAIModel.g:1304:2: '='
            {
             before(grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_7_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group_7__1__Impl"


    // $ANTLR start "rule__DatasetSpec__Group_7__2"
    // InternalXAIModel.g:1313:1: rule__DatasetSpec__Group_7__2 : rule__DatasetSpec__Group_7__2__Impl ;
    public final void rule__DatasetSpec__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1317:1: ( rule__DatasetSpec__Group_7__2__Impl )
            // InternalXAIModel.g:1318:2: rule__DatasetSpec__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatasetSpec__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group_7__2"


    // $ANTLR start "rule__DatasetSpec__Group_7__2__Impl"
    // InternalXAIModel.g:1324:1: rule__DatasetSpec__Group_7__2__Impl : ( ( rule__DatasetSpec__TargetColumnAssignment_7_2 ) ) ;
    public final void rule__DatasetSpec__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1328:1: ( ( ( rule__DatasetSpec__TargetColumnAssignment_7_2 ) ) )
            // InternalXAIModel.g:1329:1: ( ( rule__DatasetSpec__TargetColumnAssignment_7_2 ) )
            {
            // InternalXAIModel.g:1329:1: ( ( rule__DatasetSpec__TargetColumnAssignment_7_2 ) )
            // InternalXAIModel.g:1330:2: ( rule__DatasetSpec__TargetColumnAssignment_7_2 )
            {
             before(grammarAccess.getDatasetSpecAccess().getTargetColumnAssignment_7_2()); 
            // InternalXAIModel.g:1331:2: ( rule__DatasetSpec__TargetColumnAssignment_7_2 )
            // InternalXAIModel.g:1331:3: rule__DatasetSpec__TargetColumnAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__DatasetSpec__TargetColumnAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getDatasetSpecAccess().getTargetColumnAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__Group_7__2__Impl"


    // $ANTLR start "rule__Root__ModelAssignment"
    // InternalXAIModel.g:1340:1: rule__Root__ModelAssignment : ( ruleModelSpec ) ;
    public final void rule__Root__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1344:1: ( ( ruleModelSpec ) )
            // InternalXAIModel.g:1345:2: ( ruleModelSpec )
            {
            // InternalXAIModel.g:1345:2: ( ruleModelSpec )
            // InternalXAIModel.g:1346:3: ruleModelSpec
            {
             before(grammarAccess.getRootAccess().getModelModelSpecParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModelSpec();

            state._fsp--;

             after(grammarAccess.getRootAccess().getModelModelSpecParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ModelAssignment"


    // $ANTLR start "rule__ModelSpec__NameAssignment_1"
    // InternalXAIModel.g:1355:1: rule__ModelSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ModelSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1359:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1360:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1360:2: ( RULE_ID )
            // InternalXAIModel.g:1361:3: RULE_ID
            {
             before(grammarAccess.getModelSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__NameAssignment_1"


    // $ANTLR start "rule__ModelSpec__ModelTypeAssignment_3"
    // InternalXAIModel.g:1370:1: rule__ModelSpec__ModelTypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__ModelSpec__ModelTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1374:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1375:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1375:2: ( RULE_ID )
            // InternalXAIModel.g:1376:3: RULE_ID
            {
             before(grammarAccess.getModelSpecAccess().getModelTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getModelTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__ModelTypeAssignment_3"


    // $ANTLR start "rule__ModelSpec__UserAssignment_5"
    // InternalXAIModel.g:1385:1: rule__ModelSpec__UserAssignment_5 : ( ruleUserSpec ) ;
    public final void rule__ModelSpec__UserAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1389:1: ( ( ruleUserSpec ) )
            // InternalXAIModel.g:1390:2: ( ruleUserSpec )
            {
            // InternalXAIModel.g:1390:2: ( ruleUserSpec )
            // InternalXAIModel.g:1391:3: ruleUserSpec
            {
             before(grammarAccess.getModelSpecAccess().getUserUserSpecParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUserSpec();

            state._fsp--;

             after(grammarAccess.getModelSpecAccess().getUserUserSpecParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__UserAssignment_5"


    // $ANTLR start "rule__ModelSpec__DatasetAssignment_7"
    // InternalXAIModel.g:1400:1: rule__ModelSpec__DatasetAssignment_7 : ( ruleDatasetSpec ) ;
    public final void rule__ModelSpec__DatasetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1404:1: ( ( ruleDatasetSpec ) )
            // InternalXAIModel.g:1405:2: ( ruleDatasetSpec )
            {
            // InternalXAIModel.g:1405:2: ( ruleDatasetSpec )
            // InternalXAIModel.g:1406:3: ruleDatasetSpec
            {
             before(grammarAccess.getModelSpecAccess().getDatasetDatasetSpecParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDatasetSpec();

            state._fsp--;

             after(grammarAccess.getModelSpecAccess().getDatasetDatasetSpecParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__DatasetAssignment_7"


    // $ANTLR start "rule__ModelSpec__MethodAssignment_8_1"
    // InternalXAIModel.g:1415:1: rule__ModelSpec__MethodAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__ModelSpec__MethodAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1419:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1420:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1420:2: ( RULE_ID )
            // InternalXAIModel.g:1421:3: RULE_ID
            {
             before(grammarAccess.getModelSpecAccess().getMethodIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelSpecAccess().getMethodIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSpec__MethodAssignment_8_1"


    // $ANTLR start "rule__UserSpec__NameAssignment_1"
    // InternalXAIModel.g:1430:1: rule__UserSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1434:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1435:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1435:2: ( RULE_ID )
            // InternalXAIModel.g:1436:3: RULE_ID
            {
             before(grammarAccess.getUserSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__NameAssignment_1"


    // $ANTLR start "rule__UserSpec__ExpertiseAssignment_4"
    // InternalXAIModel.g:1445:1: rule__UserSpec__ExpertiseAssignment_4 : ( RULE_ID ) ;
    public final void rule__UserSpec__ExpertiseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1449:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1450:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1450:2: ( RULE_ID )
            // InternalXAIModel.g:1451:3: RULE_ID
            {
             before(grammarAccess.getUserSpecAccess().getExpertiseIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getExpertiseIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__ExpertiseAssignment_4"


    // $ANTLR start "rule__UserSpec__FormatAssignment_5_3"
    // InternalXAIModel.g:1460:1: rule__UserSpec__FormatAssignment_5_3 : ( RULE_ID ) ;
    public final void rule__UserSpec__FormatAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1464:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1465:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1465:2: ( RULE_ID )
            // InternalXAIModel.g:1466:3: RULE_ID
            {
             before(grammarAccess.getUserSpecAccess().getFormatIDTerminalRuleCall_5_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getFormatIDTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__FormatAssignment_5_3"


    // $ANTLR start "rule__UserSpec__FormatAssignment_5_4_1"
    // InternalXAIModel.g:1475:1: rule__UserSpec__FormatAssignment_5_4_1 : ( RULE_ID ) ;
    public final void rule__UserSpec__FormatAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1479:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1480:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1480:2: ( RULE_ID )
            // InternalXAIModel.g:1481:3: RULE_ID
            {
             before(grammarAccess.getUserSpecAccess().getFormatIDTerminalRuleCall_5_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getFormatIDTerminalRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__FormatAssignment_5_4_1"


    // $ANTLR start "rule__UserSpec__DetailsAssignment_6_2"
    // InternalXAIModel.g:1490:1: rule__UserSpec__DetailsAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__UserSpec__DetailsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1494:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1495:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1495:2: ( RULE_ID )
            // InternalXAIModel.g:1496:3: RULE_ID
            {
             before(grammarAccess.getUserSpecAccess().getDetailsIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getDetailsIDTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__DetailsAssignment_6_2"


    // $ANTLR start "rule__UserSpec__PurposeAssignment_7_2"
    // InternalXAIModel.g:1505:1: rule__UserSpec__PurposeAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__UserSpec__PurposeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1509:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1510:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1510:2: ( RULE_ID )
            // InternalXAIModel.g:1511:3: RULE_ID
            {
             before(grammarAccess.getUserSpecAccess().getPurposeIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserSpecAccess().getPurposeIDTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserSpec__PurposeAssignment_7_2"


    // $ANTLR start "rule__DatasetSpec__PathAssignment_3"
    // InternalXAIModel.g:1520:1: rule__DatasetSpec__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DatasetSpec__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1524:1: ( ( RULE_STRING ) )
            // InternalXAIModel.g:1525:2: ( RULE_STRING )
            {
            // InternalXAIModel.g:1525:2: ( RULE_STRING )
            // InternalXAIModel.g:1526:3: RULE_STRING
            {
             before(grammarAccess.getDatasetSpecAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__PathAssignment_3"


    // $ANTLR start "rule__DatasetSpec__FormatAssignment_6"
    // InternalXAIModel.g:1535:1: rule__DatasetSpec__FormatAssignment_6 : ( RULE_ID ) ;
    public final void rule__DatasetSpec__FormatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1539:1: ( ( RULE_ID ) )
            // InternalXAIModel.g:1540:2: ( RULE_ID )
            {
            // InternalXAIModel.g:1540:2: ( RULE_ID )
            // InternalXAIModel.g:1541:3: RULE_ID
            {
             before(grammarAccess.getDatasetSpecAccess().getFormatIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getFormatIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__FormatAssignment_6"


    // $ANTLR start "rule__DatasetSpec__TargetColumnAssignment_7_2"
    // InternalXAIModel.g:1550:1: rule__DatasetSpec__TargetColumnAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__DatasetSpec__TargetColumnAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXAIModel.g:1554:1: ( ( RULE_STRING ) )
            // InternalXAIModel.g:1555:2: ( RULE_STRING )
            {
            // InternalXAIModel.g:1555:2: ( RULE_STRING )
            // InternalXAIModel.g:1556:3: RULE_STRING
            {
             before(grammarAccess.getDatasetSpecAccess().getTargetColumnSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatasetSpecAccess().getTargetColumnSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatasetSpec__TargetColumnAssignment_7_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001880000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});

}