package com.example.xai.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.example.xai.services.XAIModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXAIModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'type'", "'for'", "'data'", "'explain'", "'user'", "'expertise'", "'='", "'format'", "'['", "','", "']'", "'details'", "'purpose'", "'dataset'", "'path'", "'target'"
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

        public InternalXAIModelParser(TokenStream input, XAIModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected XAIModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalXAIModel.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalXAIModel.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalXAIModel.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalXAIModel.g:71:1: ruleRoot returns [EObject current=null] : ( (lv_model_0_0= ruleModelSpec ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;



        	enterRule();

        try {
            // InternalXAIModel.g:77:2: ( ( (lv_model_0_0= ruleModelSpec ) ) )
            // InternalXAIModel.g:78:2: ( (lv_model_0_0= ruleModelSpec ) )
            {
            // InternalXAIModel.g:78:2: ( (lv_model_0_0= ruleModelSpec ) )
            // InternalXAIModel.g:79:3: (lv_model_0_0= ruleModelSpec )
            {
            // InternalXAIModel.g:79:3: (lv_model_0_0= ruleModelSpec )
            // InternalXAIModel.g:80:4: lv_model_0_0= ruleModelSpec
            {

            				newCompositeNode(grammarAccess.getRootAccess().getModelModelSpecParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_model_0_0=ruleModelSpec();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRootRule());
            				}
            				set(
            					current,
            					"model",
            					lv_model_0_0,
            					"com.example.xai.XAIModel.ModelSpec");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleModelSpec"
    // InternalXAIModel.g:100:1: entryRuleModelSpec returns [EObject current=null] : iv_ruleModelSpec= ruleModelSpec EOF ;
    public final EObject entryRuleModelSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSpec = null;


        try {
            // InternalXAIModel.g:100:50: (iv_ruleModelSpec= ruleModelSpec EOF )
            // InternalXAIModel.g:101:2: iv_ruleModelSpec= ruleModelSpec EOF
            {
             newCompositeNode(grammarAccess.getModelSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelSpec=ruleModelSpec();

            state._fsp--;

             current =iv_ruleModelSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelSpec"


    // $ANTLR start "ruleModelSpec"
    // InternalXAIModel.g:107:1: ruleModelSpec returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_modelType_3_0= RULE_ID ) ) otherlv_4= 'for' ( (lv_user_5_0= ruleUserSpec ) ) otherlv_6= 'data' ( (lv_dataset_7_0= ruleDatasetSpec ) ) (otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) ) )? ) ;
    public final EObject ruleModelSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_modelType_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_method_9_0=null;
        EObject lv_user_5_0 = null;

        EObject lv_dataset_7_0 = null;



        	enterRule();

        try {
            // InternalXAIModel.g:113:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_modelType_3_0= RULE_ID ) ) otherlv_4= 'for' ( (lv_user_5_0= ruleUserSpec ) ) otherlv_6= 'data' ( (lv_dataset_7_0= ruleDatasetSpec ) ) (otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) ) )? ) )
            // InternalXAIModel.g:114:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_modelType_3_0= RULE_ID ) ) otherlv_4= 'for' ( (lv_user_5_0= ruleUserSpec ) ) otherlv_6= 'data' ( (lv_dataset_7_0= ruleDatasetSpec ) ) (otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) ) )? )
            {
            // InternalXAIModel.g:114:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_modelType_3_0= RULE_ID ) ) otherlv_4= 'for' ( (lv_user_5_0= ruleUserSpec ) ) otherlv_6= 'data' ( (lv_dataset_7_0= ruleDatasetSpec ) ) (otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) ) )? )
            // InternalXAIModel.g:115:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_modelType_3_0= RULE_ID ) ) otherlv_4= 'for' ( (lv_user_5_0= ruleUserSpec ) ) otherlv_6= 'data' ( (lv_dataset_7_0= ruleDatasetSpec ) ) (otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelSpecAccess().getModelKeyword_0());
            		
            // InternalXAIModel.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXAIModel.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXAIModel.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalXAIModel.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModelSpecAccess().getTypeKeyword_2());
            		
            // InternalXAIModel.g:141:3: ( (lv_modelType_3_0= RULE_ID ) )
            // InternalXAIModel.g:142:4: (lv_modelType_3_0= RULE_ID )
            {
            // InternalXAIModel.g:142:4: (lv_modelType_3_0= RULE_ID )
            // InternalXAIModel.g:143:5: lv_modelType_3_0= RULE_ID
            {
            lv_modelType_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_modelType_3_0, grammarAccess.getModelSpecAccess().getModelTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelType",
            						lv_modelType_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelSpecAccess().getForKeyword_4());
            		
            // InternalXAIModel.g:163:3: ( (lv_user_5_0= ruleUserSpec ) )
            // InternalXAIModel.g:164:4: (lv_user_5_0= ruleUserSpec )
            {
            // InternalXAIModel.g:164:4: (lv_user_5_0= ruleUserSpec )
            // InternalXAIModel.g:165:5: lv_user_5_0= ruleUserSpec
            {

            					newCompositeNode(grammarAccess.getModelSpecAccess().getUserUserSpecParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_user_5_0=ruleUserSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelSpecRule());
            					}
            					set(
            						current,
            						"user",
            						lv_user_5_0,
            						"com.example.xai.XAIModel.UserSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getModelSpecAccess().getDataKeyword_6());
            		
            // InternalXAIModel.g:186:3: ( (lv_dataset_7_0= ruleDatasetSpec ) )
            // InternalXAIModel.g:187:4: (lv_dataset_7_0= ruleDatasetSpec )
            {
            // InternalXAIModel.g:187:4: (lv_dataset_7_0= ruleDatasetSpec )
            // InternalXAIModel.g:188:5: lv_dataset_7_0= ruleDatasetSpec
            {

            					newCompositeNode(grammarAccess.getModelSpecAccess().getDatasetDatasetSpecParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_dataset_7_0=ruleDatasetSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelSpecRule());
            					}
            					set(
            						current,
            						"dataset",
            						lv_dataset_7_0,
            						"com.example.xai.XAIModel.DatasetSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXAIModel.g:205:3: (otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXAIModel.g:206:4: otherlv_8= 'explain' ( (lv_method_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelSpecAccess().getExplainKeyword_8_0());
                    			
                    // InternalXAIModel.g:210:4: ( (lv_method_9_0= RULE_ID ) )
                    // InternalXAIModel.g:211:5: (lv_method_9_0= RULE_ID )
                    {
                    // InternalXAIModel.g:211:5: (lv_method_9_0= RULE_ID )
                    // InternalXAIModel.g:212:6: lv_method_9_0= RULE_ID
                    {
                    lv_method_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_method_9_0, grammarAccess.getModelSpecAccess().getMethodIDTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelSpecRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelSpec"


    // $ANTLR start "entryRuleUserSpec"
    // InternalXAIModel.g:233:1: entryRuleUserSpec returns [EObject current=null] : iv_ruleUserSpec= ruleUserSpec EOF ;
    public final EObject entryRuleUserSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserSpec = null;


        try {
            // InternalXAIModel.g:233:49: (iv_ruleUserSpec= ruleUserSpec EOF )
            // InternalXAIModel.g:234:2: iv_ruleUserSpec= ruleUserSpec EOF
            {
             newCompositeNode(grammarAccess.getUserSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserSpec=ruleUserSpec();

            state._fsp--;

             current =iv_ruleUserSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserSpec"


    // $ANTLR start "ruleUserSpec"
    // InternalXAIModel.g:240:1: ruleUserSpec returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'expertise' otherlv_3= '=' ( (lv_expertise_4_0= RULE_ID ) ) (otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']' )? (otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) ) )? (otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) ) )? ) ;
    public final EObject ruleUserSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_expertise_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_format_8_0=null;
        Token otherlv_9=null;
        Token lv_format_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_details_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_purpose_17_0=null;


        	enterRule();

        try {
            // InternalXAIModel.g:246:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'expertise' otherlv_3= '=' ( (lv_expertise_4_0= RULE_ID ) ) (otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']' )? (otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) ) )? (otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) ) )? ) )
            // InternalXAIModel.g:247:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'expertise' otherlv_3= '=' ( (lv_expertise_4_0= RULE_ID ) ) (otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']' )? (otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) ) )? (otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) ) )? )
            {
            // InternalXAIModel.g:247:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'expertise' otherlv_3= '=' ( (lv_expertise_4_0= RULE_ID ) ) (otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']' )? (otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) ) )? (otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) ) )? )
            // InternalXAIModel.g:248:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'expertise' otherlv_3= '=' ( (lv_expertise_4_0= RULE_ID ) ) (otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']' )? (otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) ) )? (otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserSpecAccess().getUserKeyword_0());
            		
            // InternalXAIModel.g:252:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXAIModel.g:253:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXAIModel.g:253:4: (lv_name_1_0= RULE_ID )
            // InternalXAIModel.g:254:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserSpecAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getUserSpecAccess().getExpertiseKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUserSpecAccess().getEqualsSignKeyword_3());
            		
            // InternalXAIModel.g:278:3: ( (lv_expertise_4_0= RULE_ID ) )
            // InternalXAIModel.g:279:4: (lv_expertise_4_0= RULE_ID )
            {
            // InternalXAIModel.g:279:4: (lv_expertise_4_0= RULE_ID )
            // InternalXAIModel.g:280:5: lv_expertise_4_0= RULE_ID
            {
            lv_expertise_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_expertise_4_0, grammarAccess.getUserSpecAccess().getExpertiseIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expertise",
            						lv_expertise_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXAIModel.g:296:3: (otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXAIModel.g:297:4: otherlv_5= 'format' otherlv_6= '=' otherlv_7= '[' ( (lv_format_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )* otherlv_11= ']'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserSpecAccess().getFormatKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getUserSpecAccess().getEqualsSignKeyword_5_1());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getUserSpecAccess().getLeftSquareBracketKeyword_5_2());
                    			
                    // InternalXAIModel.g:309:4: ( (lv_format_8_0= RULE_ID ) )
                    // InternalXAIModel.g:310:5: (lv_format_8_0= RULE_ID )
                    {
                    // InternalXAIModel.g:310:5: (lv_format_8_0= RULE_ID )
                    // InternalXAIModel.g:311:6: lv_format_8_0= RULE_ID
                    {
                    lv_format_8_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_format_8_0, grammarAccess.getUserSpecAccess().getFormatIDTerminalRuleCall_5_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserSpecRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"format",
                    							lv_format_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXAIModel.g:327:4: (otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXAIModel.g:328:5: otherlv_9= ',' ( (lv_format_10_0= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getUserSpecAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalXAIModel.g:332:5: ( (lv_format_10_0= RULE_ID ) )
                    	    // InternalXAIModel.g:333:6: (lv_format_10_0= RULE_ID )
                    	    {
                    	    // InternalXAIModel.g:333:6: (lv_format_10_0= RULE_ID )
                    	    // InternalXAIModel.g:334:7: lv_format_10_0= RULE_ID
                    	    {
                    	    lv_format_10_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    							newLeafNode(lv_format_10_0, grammarAccess.getUserSpecAccess().getFormatIDTerminalRuleCall_5_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUserSpecRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"format",
                    	    								lv_format_10_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getUserSpecAccess().getRightSquareBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalXAIModel.g:356:3: (otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXAIModel.g:357:4: otherlv_12= 'details' otherlv_13= '=' ( (lv_details_14_0= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getUserSpecAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getUserSpecAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalXAIModel.g:365:4: ( (lv_details_14_0= RULE_ID ) )
                    // InternalXAIModel.g:366:5: (lv_details_14_0= RULE_ID )
                    {
                    // InternalXAIModel.g:366:5: (lv_details_14_0= RULE_ID )
                    // InternalXAIModel.g:367:6: lv_details_14_0= RULE_ID
                    {
                    lv_details_14_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_details_14_0, grammarAccess.getUserSpecAccess().getDetailsIDTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserSpecRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"details",
                    							lv_details_14_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXAIModel.g:384:3: (otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXAIModel.g:385:4: otherlv_15= 'purpose' otherlv_16= '=' ( (lv_purpose_17_0= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getUserSpecAccess().getPurposeKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getUserSpecAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalXAIModel.g:393:4: ( (lv_purpose_17_0= RULE_ID ) )
                    // InternalXAIModel.g:394:5: (lv_purpose_17_0= RULE_ID )
                    {
                    // InternalXAIModel.g:394:5: (lv_purpose_17_0= RULE_ID )
                    // InternalXAIModel.g:395:6: lv_purpose_17_0= RULE_ID
                    {
                    lv_purpose_17_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_purpose_17_0, grammarAccess.getUserSpecAccess().getPurposeIDTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserSpecRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"purpose",
                    							lv_purpose_17_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserSpec"


    // $ANTLR start "entryRuleDatasetSpec"
    // InternalXAIModel.g:416:1: entryRuleDatasetSpec returns [EObject current=null] : iv_ruleDatasetSpec= ruleDatasetSpec EOF ;
    public final EObject entryRuleDatasetSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasetSpec = null;


        try {
            // InternalXAIModel.g:416:52: (iv_ruleDatasetSpec= ruleDatasetSpec EOF )
            // InternalXAIModel.g:417:2: iv_ruleDatasetSpec= ruleDatasetSpec EOF
            {
             newCompositeNode(grammarAccess.getDatasetSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasetSpec=ruleDatasetSpec();

            state._fsp--;

             current =iv_ruleDatasetSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatasetSpec"


    // $ANTLR start "ruleDatasetSpec"
    // InternalXAIModel.g:423:1: ruleDatasetSpec returns [EObject current=null] : (otherlv_0= 'dataset' otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'format' otherlv_5= '=' ( (lv_format_6_0= RULE_ID ) ) (otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDatasetSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_format_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_targetColumn_9_0=null;


        	enterRule();

        try {
            // InternalXAIModel.g:429:2: ( (otherlv_0= 'dataset' otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'format' otherlv_5= '=' ( (lv_format_6_0= RULE_ID ) ) (otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) ) )? ) )
            // InternalXAIModel.g:430:2: (otherlv_0= 'dataset' otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'format' otherlv_5= '=' ( (lv_format_6_0= RULE_ID ) ) (otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) ) )? )
            {
            // InternalXAIModel.g:430:2: (otherlv_0= 'dataset' otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'format' otherlv_5= '=' ( (lv_format_6_0= RULE_ID ) ) (otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) ) )? )
            // InternalXAIModel.g:431:3: otherlv_0= 'dataset' otherlv_1= 'path' otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'format' otherlv_5= '=' ( (lv_format_6_0= RULE_ID ) ) (otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasetSpecAccess().getDatasetKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDatasetSpecAccess().getPathKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_2());
            		
            // InternalXAIModel.g:443:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalXAIModel.g:444:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalXAIModel.g:444:4: (lv_path_3_0= RULE_STRING )
            // InternalXAIModel.g:445:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_path_3_0, grammarAccess.getDatasetSpecAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasetSpecAccess().getFormatKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_5());
            		
            // InternalXAIModel.g:469:3: ( (lv_format_6_0= RULE_ID ) )
            // InternalXAIModel.g:470:4: (lv_format_6_0= RULE_ID )
            {
            // InternalXAIModel.g:470:4: (lv_format_6_0= RULE_ID )
            // InternalXAIModel.g:471:5: lv_format_6_0= RULE_ID
            {
            lv_format_6_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_format_6_0, grammarAccess.getDatasetSpecAccess().getFormatIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasetSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXAIModel.g:487:3: (otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXAIModel.g:488:4: otherlv_7= 'target' otherlv_8= '=' ( (lv_targetColumn_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getDatasetSpecAccess().getTargetKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getDatasetSpecAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalXAIModel.g:496:4: ( (lv_targetColumn_9_0= RULE_STRING ) )
                    // InternalXAIModel.g:497:5: (lv_targetColumn_9_0= RULE_STRING )
                    {
                    // InternalXAIModel.g:497:5: (lv_targetColumn_9_0= RULE_STRING )
                    // InternalXAIModel.g:498:6: lv_targetColumn_9_0= RULE_STRING
                    {
                    lv_targetColumn_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_targetColumn_9_0, grammarAccess.getDatasetSpecAccess().getTargetColumnSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDatasetSpecRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"targetColumn",
                    							lv_targetColumn_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatasetSpec"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001880002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});

}