package org.edna.datamodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.edna.datamodel.services.DatamodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatamodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'targetNamespace'", "'import'", "'package'", "'{'", "'}'", "'complex'", "'type'", "'extends'", "':'", "'[]'", "'optional'", "'.'", "'.*'", "'undefined'", "'string'", "'integer'", "'boolean'", "'float'", "'double'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDatamodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatamodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatamodelParser.tokenNames; }
    public String getGrammarFileName() { return "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g"; }



     	private DatamodelGrammarAccess grammarAccess;
     	
        public InternalDatamodelParser(TokenStream input, DatamodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DatamodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:77:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetNamespace_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_packages_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:80:28: ( ( (otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:81:1: ( (otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:81:1: ( (otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:81:2: (otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )*
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:81:2: (otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:81:4: otherlv_0= 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel123); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getTargetNamespaceKeyword_0_0());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:85:1: ( (lv_targetNamespace_1_0= RULE_STRING ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:86:1: (lv_targetNamespace_1_0= RULE_STRING )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:86:1: (lv_targetNamespace_1_0= RULE_STRING )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:87:3: lv_targetNamespace_1_0= RULE_STRING
            {
            lv_targetNamespace_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel140); 

            			newLeafNode(lv_targetNamespace_1_0, grammarAccess.getModelAccess().getTargetNamespaceSTRINGTerminalRuleCall_0_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetNamespace",
                    		lv_targetNamespace_1_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:103:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel167);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:121:3: ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }
                else if ( (LA2_0==13) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:121:4: ( (lv_types_3_0= ruleComplexType ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:121:4: ( (lv_types_3_0= ruleComplexType ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:122:1: (lv_types_3_0= ruleComplexType )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:122:1: (lv_types_3_0= ruleComplexType )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:123:3: lv_types_3_0= ruleComplexType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexType_in_ruleModel190);
            	    lv_types_3_0=ruleComplexType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"ComplexType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:140:6: ( (lv_packages_4_0= rulePackage ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:140:6: ( (lv_packages_4_0= rulePackage ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:141:1: (lv_packages_4_0= rulePackage )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:141:1: (lv_packages_4_0= rulePackage )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:142:3: lv_packages_4_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel217);
            	    lv_packages_4_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_4_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:166:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:167:2: (iv_ruleImport= ruleImport EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:168:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport255);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport265); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:175:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:178:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:179:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:179:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:179:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport302); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:183:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:184:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:184:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:185:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport323);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCard");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePackage"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:209:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:210:2: (iv_rulePackage= rulePackage EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:211:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage359);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage369); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:218:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_types_3_0 = null;

        EObject lv_packages_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:221:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* otherlv_5= '}' ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:222:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* otherlv_5= '}' )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:222:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* otherlv_5= '}' )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:222:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackage406); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:226:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:227:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:227:1: (lv_name_1_0= RULE_ID )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:228:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage423); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackage440); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:248:1: ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }
                else if ( (LA3_0==13) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:248:2: ( (lv_types_3_0= ruleComplexType ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:248:2: ( (lv_types_3_0= ruleComplexType ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:249:1: (lv_types_3_0= ruleComplexType )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:249:1: (lv_types_3_0= ruleComplexType )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:250:3: lv_types_3_0= ruleComplexType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getTypesComplexTypeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexType_in_rulePackage462);
            	    lv_types_3_0=ruleComplexType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_3_0, 
            	            		"ComplexType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:267:6: ( (lv_packages_4_0= rulePackage ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:267:6: ( (lv_packages_4_0= rulePackage ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:268:1: (lv_packages_4_0= rulePackage )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:268:1: (lv_packages_4_0= rulePackage )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:269:3: lv_packages_4_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage489);
            	    lv_packages_4_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_4_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePackage503); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleComplexType"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:297:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:298:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:299:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType539);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType549); 

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:306:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'complex' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* otherlv_8= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_doc_6_0=null;
        Token otherlv_8=null;
        EObject lv_elements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:309:28: ( (otherlv_0= 'complex' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* otherlv_8= '}' ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:310:1: (otherlv_0= 'complex' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* otherlv_8= '}' )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:310:1: (otherlv_0= 'complex' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* otherlv_8= '}' )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:310:3: otherlv_0= 'complex' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleComplexType586); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleComplexType598); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getTypeKeyword_1());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:318:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:319:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:319:1: (lv_name_2_0= RULE_ID )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:320:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexType615); 

            			newLeafNode(lv_name_2_0, grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:336:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:336:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleComplexType633); 

                        	newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getExtendsKeyword_3_0());
                        
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:340:1: ( ( ruleQualifiedName ) )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:341:1: ( ruleQualifiedName )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:341:1: ( ruleQualifiedName )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:342:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexType656);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleComplexType670); 

                	newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:359:1: ( (lv_doc_6_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:360:1: (lv_doc_6_0= RULE_STRING )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:360:1: (lv_doc_6_0= RULE_STRING )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:361:3: lv_doc_6_0= RULE_STRING
                    {
                    lv_doc_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComplexType687); 

                    			newLeafNode(lv_doc_6_0, grammarAccess.getComplexTypeAccess().getDocSTRINGTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_6_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:377:3: ( (lv_elements_7_0= ruleElementDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:378:1: (lv_elements_7_0= ruleElementDeclaration )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:378:1: (lv_elements_7_0= ruleElementDeclaration )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:379:3: lv_elements_7_0= ruleElementDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeAccess().getElementsElementDeclarationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementDeclaration_in_ruleComplexType714);
            	    lv_elements_7_0=ruleElementDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_7_0, 
            	            		"ElementDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleComplexType727); 

                	newLeafNode(otherlv_8, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleElementDeclaration"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:407:1: entryRuleElementDeclaration returns [EObject current=null] : iv_ruleElementDeclaration= ruleElementDeclaration EOF ;
    public final EObject entryRuleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclaration = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:408:2: (iv_ruleElementDeclaration= ruleElementDeclaration EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:409:2: iv_ruleElementDeclaration= ruleElementDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration763);
            iv_ruleElementDeclaration=ruleElementDeclaration();

            state._fsp--;

             current =iv_ruleElementDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclaration773); 

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
    // $ANTLR end "entryRuleElementDeclaration"


    // $ANTLR start "ruleElementDeclaration"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:416:1: ruleElementDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? ) ;
    public final EObject ruleElementDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_multiple_4_0=null;
        Token lv_optional_5_0=null;
        Token lv_doc_6_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:419:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:420:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:420:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:420:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )?
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:420:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:421:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:421:1: (lv_name_0_0= RULE_ID )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:422:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementDeclaration815); 

            			newLeafNode(lv_name_0_0, grammarAccess.getElementDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleElementDeclaration832); 

                	newLeafNode(otherlv_1, grammarAccess.getElementDeclarationAccess().getColonKeyword_1());
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:442:1: ( ( ( ruleQualifiedName ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=24 && LA7_0<=29)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:442:2: ( ( ruleQualifiedName ) )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:442:2: ( ( ruleQualifiedName ) )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:443:1: ( ruleQualifiedName )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:443:1: ( ruleQualifiedName )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:444:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementDeclarationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElementDeclarationAccess().getRefComplexTypeCrossReference_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDeclaration856);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:458:6: ( (lv_type_3_0= rulePrimitiveType ) )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:458:6: ( (lv_type_3_0= rulePrimitiveType ) )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:459:1: (lv_type_3_0= rulePrimitiveType )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:459:1: (lv_type_3_0= rulePrimitiveType )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:460:3: lv_type_3_0= rulePrimitiveType
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementDeclarationAccess().getTypePrimitiveTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleElementDeclaration883);
                    lv_type_3_0=rulePrimitiveType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"PrimitiveType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:476:3: ( (lv_multiple_4_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:477:1: (lv_multiple_4_0= '[]' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:477:1: (lv_multiple_4_0= '[]' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:478:3: lv_multiple_4_0= '[]'
                    {
                    lv_multiple_4_0=(Token)match(input,20,FOLLOW_20_in_ruleElementDeclaration902); 

                            newLeafNode(lv_multiple_4_0, grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "multiple", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:491:3: ( (lv_optional_5_0= 'optional' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:492:1: (lv_optional_5_0= 'optional' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:492:1: (lv_optional_5_0= 'optional' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:493:3: lv_optional_5_0= 'optional'
                    {
                    lv_optional_5_0=(Token)match(input,21,FOLLOW_21_in_ruleElementDeclaration934); 

                            newLeafNode(lv_optional_5_0, grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:506:3: ( (lv_doc_6_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:507:1: (lv_doc_6_0= RULE_STRING )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:507:1: (lv_doc_6_0= RULE_STRING )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:508:3: lv_doc_6_0= RULE_STRING
                    {
                    lv_doc_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementDeclaration965); 

                    			newLeafNode(lv_doc_6_0, grammarAccess.getElementDeclarationAccess().getDocSTRINGTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_6_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleElementDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:532:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:533:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:534:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1008);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1019); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:541:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:544:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:545:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:545:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:545:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1059); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:552:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:553:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1078); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1093); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:573:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:574:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:575:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1141);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1152); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:582:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:585:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:586:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:586:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:587:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1199);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:597:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:598:2: kw= '.*'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedNameWithWildCard1218); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "rulePrimitiveType"
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:611:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:613:28: ( ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:614:1: ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:614:1: ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 29:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:614:2: (enumLiteral_0= 'undefined' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:614:2: (enumLiteral_0= 'undefined' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:614:4: enumLiteral_0= 'undefined'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveType1274); 

                            current = grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:620:6: (enumLiteral_1= 'string' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:620:6: (enumLiteral_1= 'string' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:620:8: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_rulePrimitiveType1291); 

                            current = grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:626:6: (enumLiteral_2= 'integer' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:626:6: (enumLiteral_2= 'integer' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:626:8: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_rulePrimitiveType1308); 

                            current = grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:632:6: (enumLiteral_3= 'boolean' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:632:6: (enumLiteral_3= 'boolean' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:632:8: enumLiteral_3= 'boolean'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_rulePrimitiveType1325); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:638:6: (enumLiteral_4= 'float' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:638:6: (enumLiteral_4= 'float' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:638:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_rulePrimitiveType1342); 

                            current = grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:644:6: (enumLiteral_5= 'double' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:644:6: (enumLiteral_5= 'double' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:644:8: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_rulePrimitiveType1359); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "rulePrimitiveType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel140 = new BitSet(new long[]{0x0000000000013002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel167 = new BitSet(new long[]{0x0000000000013002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleModel190 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel217 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage440 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_ruleComplexType_in_rulePackage462 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage489 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_15_in_rulePackage503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleComplexType586 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexType598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexType615 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleComplexType633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexType656 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleComplexType670 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComplexType687 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_ruleComplexType714 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleComplexType727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclaration773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementDeclaration815 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleElementDeclaration832 = new BitSet(new long[]{0x000000003F000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDeclaration856 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleElementDeclaration883 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_20_in_ruleElementDeclaration902 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_21_in_ruleElementDeclaration934 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementDeclaration965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1059 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1093 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1199 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedNameWithWildCard1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveType1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveType1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveType1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveType1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveType1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveType1359 = new BitSet(new long[]{0x0000000000000002L});

}