package org.edna.datamodel.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalDatamodelParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g"; }



     	private DatamodelGrammarAccess grammarAccess;
     	
        public InternalDatamodelParser(TokenStream input, IAstFactory factory, DatamodelGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/edna/datamodel/parser/antlr/internal/InternalDatamodel.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DatamodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:87:1: ruleModel returns [EObject current=null] : ( ( 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_targetNamespace_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_packages_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:92:6: ( ( ( 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:93:1: ( ( 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:93:1: ( ( 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:93:2: ( 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )*
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:93:2: ( 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:93:4: 'targetNamespace' ( (lv_targetNamespace_1_0= RULE_STRING ) )
            {
            match(input,11,FOLLOW_11_in_ruleModel121); 

                    createLeafNode(grammarAccess.getModelAccess().getTargetNamespaceKeyword_0_0(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:97:1: ( (lv_targetNamespace_1_0= RULE_STRING ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:98:1: (lv_targetNamespace_1_0= RULE_STRING )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:98:1: (lv_targetNamespace_1_0= RULE_STRING )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:99:3: lv_targetNamespace_1_0= RULE_STRING
            {
            lv_targetNamespace_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel138); 

            			createLeafNode(grammarAccess.getModelAccess().getTargetNamespaceSTRINGTerminalRuleCall_0_1_0(), "targetNamespace"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"targetNamespace",
            	        		lv_targetNamespace_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:121:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:122:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:122:1: (lv_imports_2_0= ruleImport )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:123:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel165);
            	    lv_imports_2_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_2_0, 
            	    	        		"Import", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:145:3: ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )*
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
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:145:4: ( (lv_types_3_0= ruleComplexType ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:145:4: ( (lv_types_3_0= ruleComplexType ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:146:1: (lv_types_3_0= ruleComplexType )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:146:1: (lv_types_3_0= ruleComplexType )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:147:3: lv_types_3_0= ruleComplexType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexType_in_ruleModel188);
            	    lv_types_3_0=ruleComplexType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"types",
            	    	        		lv_types_3_0, 
            	    	        		"ComplexType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:170:6: ( (lv_packages_4_0= rulePackage ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:170:6: ( (lv_packages_4_0= rulePackage ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:171:1: (lv_packages_4_0= rulePackage )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:171:1: (lv_packages_4_0= rulePackage )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:172:3: lv_packages_4_0= rulePackage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel215);
            	    lv_packages_4_0=rulePackage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"packages",
            	    	        		lv_packages_4_0, 
            	    	        		"Package", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleImport
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:202:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:203:2: (iv_ruleImport= ruleImport EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:204:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport253);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport263); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:211:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:216:6: ( ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:217:1: ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:217:1: ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:217:3: 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            match(input,12,FOLLOW_12_in_ruleImport298); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:221:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:222:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:222:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:223:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport319);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importedNamespace",
            	        		lv_importedNamespace_1_0, 
            	        		"QualifiedNameWithWildCard", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRulePackage
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:253:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:254:2: (iv_rulePackage= rulePackage EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:255:2: iv_rulePackage= rulePackage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageRule(), currentNode); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage355);
            iv_rulePackage=rulePackage();
            _fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage365); 

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
    // $ANTLR end entryRulePackage


    // $ANTLR start rulePackage
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:262:1: rulePackage returns [EObject current=null] : ( 'package' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_types_3_0 = null;

        EObject lv_packages_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:267:6: ( ( 'package' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* '}' ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:268:1: ( 'package' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* '}' )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:268:1: ( 'package' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* '}' )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:268:3: 'package' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )* '}'
            {
            match(input,13,FOLLOW_13_in_rulePackage400); 

                    createLeafNode(grammarAccess.getPackageAccess().getPackageKeyword_0(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:272:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:273:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:273:1: (lv_name_1_0= RULE_ID )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:274:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage417); 

            			createLeafNode(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_rulePackage432); 

                    createLeafNode(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:300:1: ( ( (lv_types_3_0= ruleComplexType ) ) | ( (lv_packages_4_0= rulePackage ) ) )*
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
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:300:2: ( (lv_types_3_0= ruleComplexType ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:300:2: ( (lv_types_3_0= ruleComplexType ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:301:1: (lv_types_3_0= ruleComplexType )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:301:1: (lv_types_3_0= ruleComplexType )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:302:3: lv_types_3_0= ruleComplexType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPackageAccess().getTypesComplexTypeParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexType_in_rulePackage454);
            	    lv_types_3_0=ruleComplexType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"types",
            	    	        		lv_types_3_0, 
            	    	        		"ComplexType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:325:6: ( (lv_packages_4_0= rulePackage ) )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:325:6: ( (lv_packages_4_0= rulePackage ) )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:326:1: (lv_packages_4_0= rulePackage )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:326:1: (lv_packages_4_0= rulePackage )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:327:3: lv_packages_4_0= rulePackage
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage481);
            	    lv_packages_4_0=rulePackage();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackageRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"packages",
            	    	        		lv_packages_4_0, 
            	    	        		"Package", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_rulePackage493); 

                    createLeafNode(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackage


    // $ANTLR start entryRuleComplexType
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:361:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:362:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:363:2: iv_ruleComplexType= ruleComplexType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComplexTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType529);
            iv_ruleComplexType=ruleComplexType();
            _fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType539); 

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
    // $ANTLR end entryRuleComplexType


    // $ANTLR start ruleComplexType
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:370:1: ruleComplexType returns [EObject current=null] : ( 'complex' 'type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_doc_6_0=null;
        EObject lv_elements_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:375:6: ( ( 'complex' 'type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* '}' ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:376:1: ( 'complex' 'type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* '}' )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:376:1: ( 'complex' 'type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* '}' )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:376:3: 'complex' 'type' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( RULE_ID ) ) )? '{' ( (lv_doc_6_0= RULE_STRING ) )? ( (lv_elements_7_0= ruleElementDeclaration ) )* '}'
            {
            match(input,16,FOLLOW_16_in_ruleComplexType574); 

                    createLeafNode(grammarAccess.getComplexTypeAccess().getComplexKeyword_0(), null); 
                
            match(input,17,FOLLOW_17_in_ruleComplexType584); 

                    createLeafNode(grammarAccess.getComplexTypeAccess().getTypeKeyword_1(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:384:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:385:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:385:1: (lv_name_2_0= RULE_ID )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:386:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexType601); 

            			createLeafNode(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getComplexTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:408:2: ( 'extends' ( ( RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:408:4: 'extends' ( ( RULE_ID ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleComplexType617); 

                            createLeafNode(grammarAccess.getComplexTypeAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:412:1: ( ( RULE_ID ) )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:413:1: ( RULE_ID )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:413:1: ( RULE_ID )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:414:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getComplexTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexType635); 

                    		createLeafNode(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeCrossReference_3_1_0(), "baseType"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleComplexType647); 

                    createLeafNode(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:430:1: ( (lv_doc_6_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:431:1: (lv_doc_6_0= RULE_STRING )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:431:1: (lv_doc_6_0= RULE_STRING )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:432:3: lv_doc_6_0= RULE_STRING
                    {
                    lv_doc_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComplexType664); 

                    			createLeafNode(grammarAccess.getComplexTypeAccess().getDocSTRINGTerminalRuleCall_5_0(), "doc"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComplexTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"doc",
                    	        		lv_doc_6_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:454:3: ( (lv_elements_7_0= ruleElementDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:455:1: (lv_elements_7_0= ruleElementDeclaration )
            	    {
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:455:1: (lv_elements_7_0= ruleElementDeclaration )
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:456:3: lv_elements_7_0= ruleElementDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComplexTypeAccess().getElementsElementDeclarationParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementDeclaration_in_ruleComplexType691);
            	    lv_elements_7_0=ruleElementDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getComplexTypeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_7_0, 
            	    	        		"ElementDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleComplexType702); 

                    createLeafNode(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComplexType


    // $ANTLR start entryRuleElementDeclaration
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:490:1: entryRuleElementDeclaration returns [EObject current=null] : iv_ruleElementDeclaration= ruleElementDeclaration EOF ;
    public final EObject entryRuleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclaration = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:491:2: (iv_ruleElementDeclaration= ruleElementDeclaration EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:492:2: iv_ruleElementDeclaration= ruleElementDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration738);
            iv_ruleElementDeclaration=ruleElementDeclaration();
            _fsp--;

             current =iv_ruleElementDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclaration748); 

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
    // $ANTLR end entryRuleElementDeclaration


    // $ANTLR start ruleElementDeclaration
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:499:1: ruleElementDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? ) ;
    public final EObject ruleElementDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multiple_4_0=null;
        Token lv_optional_5_0=null;
        Token lv_doc_6_0=null;
        Enumerator lv_type_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:504:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:505:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:505:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )? )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:505:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) ) ( (lv_multiple_4_0= '[]' ) )? ( (lv_optional_5_0= 'optional' ) )? ( (lv_doc_6_0= RULE_STRING ) )?
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:505:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:506:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:506:1: (lv_name_0_0= RULE_ID )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:507:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementDeclaration790); 

            			createLeafNode(grammarAccess.getElementDeclarationAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElementDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleElementDeclaration805); 

                    createLeafNode(grammarAccess.getElementDeclarationAccess().getColonKeyword_1(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:533:1: ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) )
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
                    new NoViableAltException("533:1: ( ( ( RULE_ID ) ) | ( (lv_type_3_0= rulePrimitiveType ) ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:533:2: ( ( RULE_ID ) )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:533:2: ( ( RULE_ID ) )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:534:1: ( RULE_ID )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:534:1: ( RULE_ID )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:535:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getElementDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementDeclaration824); 

                    		createLeafNode(grammarAccess.getElementDeclarationAccess().getRefComplexTypeCrossReference_2_0_0(), "ref"); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:548:6: ( (lv_type_3_0= rulePrimitiveType ) )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:548:6: ( (lv_type_3_0= rulePrimitiveType ) )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:549:1: (lv_type_3_0= rulePrimitiveType )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:549:1: (lv_type_3_0= rulePrimitiveType )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:550:3: lv_type_3_0= rulePrimitiveType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getElementDeclarationAccess().getTypePrimitiveTypeEnumRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleElementDeclaration851);
                    lv_type_3_0=rulePrimitiveType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_3_0, 
                    	        		"PrimitiveType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:572:3: ( (lv_multiple_4_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:573:1: (lv_multiple_4_0= '[]' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:573:1: (lv_multiple_4_0= '[]' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:574:3: lv_multiple_4_0= '[]'
                    {
                    lv_multiple_4_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleElementDeclaration870); 

                            createLeafNode(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0(), "multiple"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multiple", true, "[]", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:593:3: ( (lv_optional_5_0= 'optional' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:594:1: (lv_optional_5_0= 'optional' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:594:1: (lv_optional_5_0= 'optional' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:595:3: lv_optional_5_0= 'optional'
                    {
                    lv_optional_5_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleElementDeclaration902); 

                            createLeafNode(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0(), "optional"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "optional", true, "optional", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:614:3: ( (lv_doc_6_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:615:1: (lv_doc_6_0= RULE_STRING )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:615:1: (lv_doc_6_0= RULE_STRING )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:616:3: lv_doc_6_0= RULE_STRING
                    {
                    lv_doc_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElementDeclaration933); 

                    			createLeafNode(grammarAccess.getElementDeclarationAccess().getDocSTRINGTerminalRuleCall_5_0(), "doc"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElementDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"doc",
                    	        		lv_doc_6_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElementDeclaration


    // $ANTLR start entryRuleQualifiedName
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:646:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:647:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:648:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName976);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName987); 

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
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:655:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:660:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:661:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:661:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:661:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1027); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:668:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:669:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,22,FOLLOW_22_in_ruleQualifiedName1046); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1061); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleQualifiedNameWithWildCard
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:689:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:690:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:691:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1109);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();
            _fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1120); 

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
    // $ANTLR end entryRuleQualifiedNameWithWildCard


    // $ANTLR start ruleQualifiedNameWithWildCard
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:698:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:703:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:704:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:704:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:705:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1167);
            this_QualifiedName_0=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:715:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:716:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleQualifiedNameWithWildCard1186); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedNameWithWildCard


    // $ANTLR start rulePrimitiveType
    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:729:1: rulePrimitiveType returns [Enumerator current=null] : ( ( 'undefined' ) | ( 'string' ) | ( 'integer' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:733:6: ( ( ( 'undefined' ) | ( 'string' ) | ( 'integer' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) ) )
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:734:1: ( ( 'undefined' ) | ( 'string' ) | ( 'integer' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) )
            {
            // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:734:1: ( ( 'undefined' ) | ( 'string' ) | ( 'integer' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) )
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
                    new NoViableAltException("734:1: ( ( 'undefined' ) | ( 'string' ) | ( 'integer' ) | ( 'boolean' ) | ( 'float' ) | ( 'double' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:734:2: ( 'undefined' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:734:2: ( 'undefined' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:734:4: 'undefined'
                    {
                    match(input,24,FOLLOW_24_in_rulePrimitiveType1240); 

                            current = grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:740:6: ( 'string' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:740:6: ( 'string' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:740:8: 'string'
                    {
                    match(input,25,FOLLOW_25_in_rulePrimitiveType1255); 

                            current = grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:746:6: ( 'integer' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:746:6: ( 'integer' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:746:8: 'integer'
                    {
                    match(input,26,FOLLOW_26_in_rulePrimitiveType1270); 

                            current = grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:752:6: ( 'boolean' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:752:6: ( 'boolean' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:752:8: 'boolean'
                    {
                    match(input,27,FOLLOW_27_in_rulePrimitiveType1285); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:758:6: ( 'float' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:758:6: ( 'float' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:758:8: 'float'
                    {
                    match(input,28,FOLLOW_28_in_rulePrimitiveType1300); 

                            current = grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:764:6: ( 'double' )
                    {
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:764:6: ( 'double' )
                    // ../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g:764:8: 'double'
                    {
                    match(input,29,FOLLOW_29_in_rulePrimitiveType1315); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveType


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel138 = new BitSet(new long[]{0x0000000000013002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel165 = new BitSet(new long[]{0x0000000000013002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleModel188 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel215 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage417 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage432 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_ruleComplexType_in_rulePackage454 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage481 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_15_in_rulePackage493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleComplexType574 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexType584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexType601 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleComplexType617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexType635 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleComplexType647 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComplexType664 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_ruleComplexType691 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleComplexType702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclaration748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementDeclaration790 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleElementDeclaration805 = new BitSet(new long[]{0x000000003F000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementDeclaration824 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleElementDeclaration851 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_20_in_ruleElementDeclaration870 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_21_in_ruleElementDeclaration902 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElementDeclaration933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1027 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1061 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1167 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedNameWithWildCard1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveType1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveType1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveType1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveType1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveType1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimitiveType1315 = new BitSet(new long[]{0x0000000000000002L});

}