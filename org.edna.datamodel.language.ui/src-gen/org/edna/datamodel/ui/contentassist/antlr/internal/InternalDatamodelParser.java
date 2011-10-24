package org.edna.datamodel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.edna.datamodel.services.DatamodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatamodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'undefined'", "'string'", "'integer'", "'boolean'", "'float'", "'double'", "'targetNamespace'", "'import'", "'package'", "'{'", "'}'", "'complex'", "'type'", "'extends'", "':'", "'.'", "'.*'", "'[]'", "'optional'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g"; }


     
     	private DatamodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DatamodelGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:61:1: ( ruleModel EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:76:1: ( rule__Model__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:89:1: ( ruleImport EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:104:1: ( rule__Import__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePackage"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:116:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:117:1: ( rulePackage EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:118:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage181);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage188); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:125:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:129:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:130:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:130:1: ( ( rule__Package__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:131:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:132:1: ( rule__Package__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:132:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage214);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleComplexType"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:144:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:145:1: ( ruleComplexType EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:146:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType241);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType248); 

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:153:1: ruleComplexType : ( ( rule__ComplexType__Group__0 ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:157:2: ( ( ( rule__ComplexType__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:158:1: ( ( rule__ComplexType__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:158:1: ( ( rule__ComplexType__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:159:1: ( rule__ComplexType__Group__0 )
            {
             before(grammarAccess.getComplexTypeAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:160:1: ( rule__ComplexType__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:160:2: rule__ComplexType__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__0_in_ruleComplexType274);
            rule__ComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleElementDeclaration"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:172:1: entryRuleElementDeclaration : ruleElementDeclaration EOF ;
    public final void entryRuleElementDeclaration() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:173:1: ( ruleElementDeclaration EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:174:1: ruleElementDeclaration EOF
            {
             before(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration301);
            ruleElementDeclaration();

            state._fsp--;

             after(grammarAccess.getElementDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclaration308); 

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
    // $ANTLR end "entryRuleElementDeclaration"


    // $ANTLR start "ruleElementDeclaration"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:181:1: ruleElementDeclaration : ( ( rule__ElementDeclaration__Group__0 ) ) ;
    public final void ruleElementDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:185:2: ( ( ( rule__ElementDeclaration__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:186:1: ( ( rule__ElementDeclaration__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:186:1: ( ( rule__ElementDeclaration__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:187:1: ( rule__ElementDeclaration__Group__0 )
            {
             before(grammarAccess.getElementDeclarationAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:188:1: ( rule__ElementDeclaration__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:188:2: rule__ElementDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__0_in_ruleElementDeclaration334);
            rule__ElementDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleElementDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:200:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:201:1: ( ruleQualifiedName EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:202:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName368); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:209:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:213:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:215:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:216:1: ( rule__QualifiedName__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:216:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:228:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:229:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:230:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard421);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard428); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:237:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:241:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:242:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:242:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:243:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:244:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:244:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard454);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "rulePrimitiveType"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:257:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:261:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:262:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:262:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:263:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:264:1: ( rule__PrimitiveType__Alternatives )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:264:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType491);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "rule__Model__Alternatives_2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:275:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__TypesAssignment_2_0 ) ) | ( ( rule__Model__PackagesAssignment_2_1 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:279:1: ( ( ( rule__Model__TypesAssignment_2_0 ) ) | ( ( rule__Model__PackagesAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:280:1: ( ( rule__Model__TypesAssignment_2_0 ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:280:1: ( ( rule__Model__TypesAssignment_2_0 ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:281:1: ( rule__Model__TypesAssignment_2_0 )
                    {
                     before(grammarAccess.getModelAccess().getTypesAssignment_2_0()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:282:1: ( rule__Model__TypesAssignment_2_0 )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:282:2: rule__Model__TypesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Model__TypesAssignment_2_0_in_rule__Model__Alternatives_2526);
                    rule__Model__TypesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getTypesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:286:6: ( ( rule__Model__PackagesAssignment_2_1 ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:286:6: ( ( rule__Model__PackagesAssignment_2_1 ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:287:1: ( rule__Model__PackagesAssignment_2_1 )
                    {
                     before(grammarAccess.getModelAccess().getPackagesAssignment_2_1()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:288:1: ( rule__Model__PackagesAssignment_2_1 )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:288:2: rule__Model__PackagesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_1_in_rule__Model__Alternatives_2544);
                    rule__Model__PackagesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPackagesAssignment_2_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Model__Alternatives_2"


    // $ANTLR start "rule__Package__Alternatives_3"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:297:1: rule__Package__Alternatives_3 : ( ( ( rule__Package__TypesAssignment_3_0 ) ) | ( ( rule__Package__PackagesAssignment_3_1 ) ) );
    public final void rule__Package__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:301:1: ( ( ( rule__Package__TypesAssignment_3_0 ) ) | ( ( rule__Package__PackagesAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:302:1: ( ( rule__Package__TypesAssignment_3_0 ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:302:1: ( ( rule__Package__TypesAssignment_3_0 ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:303:1: ( rule__Package__TypesAssignment_3_0 )
                    {
                     before(grammarAccess.getPackageAccess().getTypesAssignment_3_0()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:304:1: ( rule__Package__TypesAssignment_3_0 )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:304:2: rule__Package__TypesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Package__TypesAssignment_3_0_in_rule__Package__Alternatives_3577);
                    rule__Package__TypesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getTypesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:308:6: ( ( rule__Package__PackagesAssignment_3_1 ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:308:6: ( ( rule__Package__PackagesAssignment_3_1 ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:309:1: ( rule__Package__PackagesAssignment_3_1 )
                    {
                     before(grammarAccess.getPackageAccess().getPackagesAssignment_3_1()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:310:1: ( rule__Package__PackagesAssignment_3_1 )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:310:2: rule__Package__PackagesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Package__PackagesAssignment_3_1_in_rule__Package__Alternatives_3595);
                    rule__Package__PackagesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getPackagesAssignment_3_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Package__Alternatives_3"


    // $ANTLR start "rule__ElementDeclaration__Alternatives_2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:319:1: rule__ElementDeclaration__Alternatives_2 : ( ( ( rule__ElementDeclaration__RefAssignment_2_0 ) ) | ( ( rule__ElementDeclaration__TypeAssignment_2_1 ) ) );
    public final void rule__ElementDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:323:1: ( ( ( rule__ElementDeclaration__RefAssignment_2_0 ) ) | ( ( rule__ElementDeclaration__TypeAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=11 && LA3_0<=16)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:324:1: ( ( rule__ElementDeclaration__RefAssignment_2_0 ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:324:1: ( ( rule__ElementDeclaration__RefAssignment_2_0 ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:325:1: ( rule__ElementDeclaration__RefAssignment_2_0 )
                    {
                     before(grammarAccess.getElementDeclarationAccess().getRefAssignment_2_0()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:326:1: ( rule__ElementDeclaration__RefAssignment_2_0 )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:326:2: rule__ElementDeclaration__RefAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ElementDeclaration__RefAssignment_2_0_in_rule__ElementDeclaration__Alternatives_2628);
                    rule__ElementDeclaration__RefAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementDeclarationAccess().getRefAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:330:6: ( ( rule__ElementDeclaration__TypeAssignment_2_1 ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:330:6: ( ( rule__ElementDeclaration__TypeAssignment_2_1 ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:331:1: ( rule__ElementDeclaration__TypeAssignment_2_1 )
                    {
                     before(grammarAccess.getElementDeclarationAccess().getTypeAssignment_2_1()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:332:1: ( rule__ElementDeclaration__TypeAssignment_2_1 )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:332:2: rule__ElementDeclaration__TypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ElementDeclaration__TypeAssignment_2_1_in_rule__ElementDeclaration__Alternatives_2646);
                    rule__ElementDeclaration__TypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementDeclarationAccess().getTypeAssignment_2_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ElementDeclaration__Alternatives_2"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:341:1: rule__PrimitiveType__Alternatives : ( ( ( 'undefined' ) ) | ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:345:1: ( ( ( 'undefined' ) ) | ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:346:1: ( ( 'undefined' ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:346:1: ( ( 'undefined' ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:347:1: ( 'undefined' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:348:1: ( 'undefined' )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:348:3: 'undefined'
                    {
                    match(input,11,FOLLOW_11_in_rule__PrimitiveType__Alternatives680); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:353:6: ( ( 'string' ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:353:6: ( ( 'string' ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:354:1: ( 'string' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:355:1: ( 'string' )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:355:3: 'string'
                    {
                    match(input,12,FOLLOW_12_in_rule__PrimitiveType__Alternatives701); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:360:6: ( ( 'integer' ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:360:6: ( ( 'integer' ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:361:1: ( 'integer' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:362:1: ( 'integer' )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:362:3: 'integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrimitiveType__Alternatives722); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:367:6: ( ( 'boolean' ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:367:6: ( ( 'boolean' ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:368:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:369:1: ( 'boolean' )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:369:3: 'boolean'
                    {
                    match(input,14,FOLLOW_14_in_rule__PrimitiveType__Alternatives743); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:374:6: ( ( 'float' ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:374:6: ( ( 'float' ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:375:1: ( 'float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:376:1: ( 'float' )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:376:3: 'float'
                    {
                    match(input,15,FOLLOW_15_in_rule__PrimitiveType__Alternatives764); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:381:6: ( ( 'double' ) )
                    {
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:381:6: ( ( 'double' ) )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:382:1: ( 'double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:383:1: ( 'double' )
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:383:3: 'double'
                    {
                    match(input,16,FOLLOW_16_in_rule__PrimitiveType__Alternatives785); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:395:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:399:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:400:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0818);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0821);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:407:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:411:1: ( ( ( rule__Model__Group_0__0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:412:1: ( ( rule__Model__Group_0__0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:412:1: ( ( rule__Model__Group_0__0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:413:1: ( rule__Model__Group_0__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:414:1: ( rule__Model__Group_0__0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:414:2: rule__Model__Group_0__0
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl848);
            rule__Model__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:424:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:428:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:429:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1878);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1881);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:436:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:440:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:441:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:441:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:442:1: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:443:1: ( rule__Model__ImportsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:443:2: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl908);
            	    rule__Model__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:453:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:457:1: ( rule__Model__Group__2__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:458:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2939);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:464:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:468:1: ( ( ( rule__Model__Alternatives_2 )* ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:469:1: ( ( rule__Model__Alternatives_2 )* )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:469:1: ( ( rule__Model__Alternatives_2 )* )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:470:1: ( rule__Model__Alternatives_2 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:471:1: ( rule__Model__Alternatives_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:471:2: rule__Model__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_2_in_rule__Model__Group__2__Impl966);
            	    rule__Model__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:487:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:491:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:492:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01003);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01006);
            rule__Model__Group_0__1();

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
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:499:1: rule__Model__Group_0__0__Impl : ( 'targetNamespace' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:503:1: ( ( 'targetNamespace' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:504:1: ( 'targetNamespace' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:504:1: ( 'targetNamespace' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:505:1: 'targetNamespace'
            {
             before(grammarAccess.getModelAccess().getTargetNamespaceKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group_0__0__Impl1034); 
             after(grammarAccess.getModelAccess().getTargetNamespaceKeyword_0_0()); 

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
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:518:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:522:1: ( rule__Model__Group_0__1__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:523:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11065);
            rule__Model__Group_0__1__Impl();

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
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:529:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__TargetNamespaceAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:533:1: ( ( ( rule__Model__TargetNamespaceAssignment_0_1 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:534:1: ( ( rule__Model__TargetNamespaceAssignment_0_1 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:534:1: ( ( rule__Model__TargetNamespaceAssignment_0_1 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:535:1: ( rule__Model__TargetNamespaceAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getTargetNamespaceAssignment_0_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:536:1: ( rule__Model__TargetNamespaceAssignment_0_1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:536:2: rule__Model__TargetNamespaceAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__TargetNamespaceAssignment_0_1_in_rule__Model__Group_0__1__Impl1092);
            rule__Model__TargetNamespaceAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTargetNamespaceAssignment_0_1()); 

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
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:550:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:554:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:555:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01126);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01129);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:562:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:566:1: ( ( 'import' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:567:1: ( 'import' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:567:1: ( 'import' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:568:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl1157); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:581:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:585:1: ( rule__Import__Group__1__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:586:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11188);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:592:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:596:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:597:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:597:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:598:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:599:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:599:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1215);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:613:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:617:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:618:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01249);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01252);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:625:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:629:1: ( ( 'package' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:630:1: ( 'package' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:630:1: ( 'package' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:631:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Package__Group__0__Impl1280); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:644:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:648:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:649:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11311);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11314);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:656:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:660:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:661:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:661:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:662:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:663:1: ( rule__Package__NameAssignment_1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:663:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1341);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:673:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:677:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:678:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21371);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21374);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:685:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:689:1: ( ( '{' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:690:1: ( '{' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:690:1: ( '{' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:691:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Package__Group__2__Impl1402); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:704:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:708:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:709:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31433);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31436);
            rule__Package__Group__4();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:716:1: rule__Package__Group__3__Impl : ( ( rule__Package__Alternatives_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:720:1: ( ( ( rule__Package__Alternatives_3 )* ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:721:1: ( ( rule__Package__Alternatives_3 )* )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:721:1: ( ( rule__Package__Alternatives_3 )* )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:722:1: ( rule__Package__Alternatives_3 )*
            {
             before(grammarAccess.getPackageAccess().getAlternatives_3()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:723:1: ( rule__Package__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:723:2: rule__Package__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__Alternatives_3_in_rule__Package__Group__3__Impl1463);
            	    rule__Package__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:733:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:737:1: ( rule__Package__Group__4__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:738:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41494);
            rule__Package__Group__4__Impl();

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
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:744:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:748:1: ( ( '}' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:749:1: ( '}' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:749:1: ( '}' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:750:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Package__Group__4__Impl1522); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__ComplexType__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:773:1: rule__ComplexType__Group__0 : rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 ;
    public final void rule__ComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:777:1: ( rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:778:2: rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__0__Impl_in_rule__ComplexType__Group__01563);
            rule__ComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__1_in_rule__ComplexType__Group__01566);
            rule__ComplexType__Group__1();

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
    // $ANTLR end "rule__ComplexType__Group__0"


    // $ANTLR start "rule__ComplexType__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:785:1: rule__ComplexType__Group__0__Impl : ( 'complex' ) ;
    public final void rule__ComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:789:1: ( ( 'complex' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:790:1: ( 'complex' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:790:1: ( 'complex' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:791:1: 'complex'
            {
             before(grammarAccess.getComplexTypeAccess().getComplexKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ComplexType__Group__0__Impl1594); 
             after(grammarAccess.getComplexTypeAccess().getComplexKeyword_0()); 

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
    // $ANTLR end "rule__ComplexType__Group__0__Impl"


    // $ANTLR start "rule__ComplexType__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:804:1: rule__ComplexType__Group__1 : rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 ;
    public final void rule__ComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:808:1: ( rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:809:2: rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__1__Impl_in_rule__ComplexType__Group__11625);
            rule__ComplexType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__2_in_rule__ComplexType__Group__11628);
            rule__ComplexType__Group__2();

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
    // $ANTLR end "rule__ComplexType__Group__1"


    // $ANTLR start "rule__ComplexType__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:816:1: rule__ComplexType__Group__1__Impl : ( 'type' ) ;
    public final void rule__ComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:820:1: ( ( 'type' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:821:1: ( 'type' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:821:1: ( 'type' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:822:1: 'type'
            {
             before(grammarAccess.getComplexTypeAccess().getTypeKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ComplexType__Group__1__Impl1656); 
             after(grammarAccess.getComplexTypeAccess().getTypeKeyword_1()); 

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
    // $ANTLR end "rule__ComplexType__Group__1__Impl"


    // $ANTLR start "rule__ComplexType__Group__2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:835:1: rule__ComplexType__Group__2 : rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 ;
    public final void rule__ComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:839:1: ( rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:840:2: rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__2__Impl_in_rule__ComplexType__Group__21687);
            rule__ComplexType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__3_in_rule__ComplexType__Group__21690);
            rule__ComplexType__Group__3();

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
    // $ANTLR end "rule__ComplexType__Group__2"


    // $ANTLR start "rule__ComplexType__Group__2__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:847:1: rule__ComplexType__Group__2__Impl : ( ( rule__ComplexType__NameAssignment_2 ) ) ;
    public final void rule__ComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:851:1: ( ( ( rule__ComplexType__NameAssignment_2 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:852:1: ( ( rule__ComplexType__NameAssignment_2 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:852:1: ( ( rule__ComplexType__NameAssignment_2 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:853:1: ( rule__ComplexType__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeAccess().getNameAssignment_2()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:854:1: ( rule__ComplexType__NameAssignment_2 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:854:2: rule__ComplexType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexType__NameAssignment_2_in_rule__ComplexType__Group__2__Impl1717);
            rule__ComplexType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComplexType__Group__2__Impl"


    // $ANTLR start "rule__ComplexType__Group__3"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:864:1: rule__ComplexType__Group__3 : rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 ;
    public final void rule__ComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:868:1: ( rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:869:2: rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__3__Impl_in_rule__ComplexType__Group__31747);
            rule__ComplexType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__4_in_rule__ComplexType__Group__31750);
            rule__ComplexType__Group__4();

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
    // $ANTLR end "rule__ComplexType__Group__3"


    // $ANTLR start "rule__ComplexType__Group__3__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:876:1: rule__ComplexType__Group__3__Impl : ( ( rule__ComplexType__Group_3__0 )? ) ;
    public final void rule__ComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:880:1: ( ( ( rule__ComplexType__Group_3__0 )? ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:881:1: ( ( rule__ComplexType__Group_3__0 )? )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:881:1: ( ( rule__ComplexType__Group_3__0 )? )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:882:1: ( rule__ComplexType__Group_3__0 )?
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_3()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:883:1: ( rule__ComplexType__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:883:2: rule__ComplexType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ComplexType__Group_3__0_in_rule__ComplexType__Group__3__Impl1777);
                    rule__ComplexType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ComplexType__Group__3__Impl"


    // $ANTLR start "rule__ComplexType__Group__4"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:893:1: rule__ComplexType__Group__4 : rule__ComplexType__Group__4__Impl rule__ComplexType__Group__5 ;
    public final void rule__ComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:897:1: ( rule__ComplexType__Group__4__Impl rule__ComplexType__Group__5 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:898:2: rule__ComplexType__Group__4__Impl rule__ComplexType__Group__5
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__4__Impl_in_rule__ComplexType__Group__41808);
            rule__ComplexType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__5_in_rule__ComplexType__Group__41811);
            rule__ComplexType__Group__5();

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
    // $ANTLR end "rule__ComplexType__Group__4"


    // $ANTLR start "rule__ComplexType__Group__4__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:905:1: rule__ComplexType__Group__4__Impl : ( '{' ) ;
    public final void rule__ComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:909:1: ( ( '{' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:910:1: ( '{' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:910:1: ( '{' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:911:1: '{'
            {
             before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__ComplexType__Group__4__Impl1839); 
             after(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ComplexType__Group__4__Impl"


    // $ANTLR start "rule__ComplexType__Group__5"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:924:1: rule__ComplexType__Group__5 : rule__ComplexType__Group__5__Impl rule__ComplexType__Group__6 ;
    public final void rule__ComplexType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:928:1: ( rule__ComplexType__Group__5__Impl rule__ComplexType__Group__6 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:929:2: rule__ComplexType__Group__5__Impl rule__ComplexType__Group__6
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__5__Impl_in_rule__ComplexType__Group__51870);
            rule__ComplexType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__6_in_rule__ComplexType__Group__51873);
            rule__ComplexType__Group__6();

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
    // $ANTLR end "rule__ComplexType__Group__5"


    // $ANTLR start "rule__ComplexType__Group__5__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:936:1: rule__ComplexType__Group__5__Impl : ( ( rule__ComplexType__DocAssignment_5 )? ) ;
    public final void rule__ComplexType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:940:1: ( ( ( rule__ComplexType__DocAssignment_5 )? ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:941:1: ( ( rule__ComplexType__DocAssignment_5 )? )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:941:1: ( ( rule__ComplexType__DocAssignment_5 )? )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:942:1: ( rule__ComplexType__DocAssignment_5 )?
            {
             before(grammarAccess.getComplexTypeAccess().getDocAssignment_5()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:943:1: ( rule__ComplexType__DocAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:943:2: rule__ComplexType__DocAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ComplexType__DocAssignment_5_in_rule__ComplexType__Group__5__Impl1900);
                    rule__ComplexType__DocAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeAccess().getDocAssignment_5()); 

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
    // $ANTLR end "rule__ComplexType__Group__5__Impl"


    // $ANTLR start "rule__ComplexType__Group__6"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:953:1: rule__ComplexType__Group__6 : rule__ComplexType__Group__6__Impl rule__ComplexType__Group__7 ;
    public final void rule__ComplexType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:957:1: ( rule__ComplexType__Group__6__Impl rule__ComplexType__Group__7 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:958:2: rule__ComplexType__Group__6__Impl rule__ComplexType__Group__7
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__6__Impl_in_rule__ComplexType__Group__61931);
            rule__ComplexType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__7_in_rule__ComplexType__Group__61934);
            rule__ComplexType__Group__7();

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
    // $ANTLR end "rule__ComplexType__Group__6"


    // $ANTLR start "rule__ComplexType__Group__6__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:965:1: rule__ComplexType__Group__6__Impl : ( ( rule__ComplexType__ElementsAssignment_6 )* ) ;
    public final void rule__ComplexType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:969:1: ( ( ( rule__ComplexType__ElementsAssignment_6 )* ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:970:1: ( ( rule__ComplexType__ElementsAssignment_6 )* )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:970:1: ( ( rule__ComplexType__ElementsAssignment_6 )* )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:971:1: ( rule__ComplexType__ElementsAssignment_6 )*
            {
             before(grammarAccess.getComplexTypeAccess().getElementsAssignment_6()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:972:1: ( rule__ComplexType__ElementsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:972:2: rule__ComplexType__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ComplexType__ElementsAssignment_6_in_rule__ComplexType__Group__6__Impl1961);
            	    rule__ComplexType__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComplexTypeAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__ComplexType__Group__6__Impl"


    // $ANTLR start "rule__ComplexType__Group__7"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:982:1: rule__ComplexType__Group__7 : rule__ComplexType__Group__7__Impl ;
    public final void rule__ComplexType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:986:1: ( rule__ComplexType__Group__7__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:987:2: rule__ComplexType__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__7__Impl_in_rule__ComplexType__Group__71992);
            rule__ComplexType__Group__7__Impl();

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
    // $ANTLR end "rule__ComplexType__Group__7"


    // $ANTLR start "rule__ComplexType__Group__7__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:993:1: rule__ComplexType__Group__7__Impl : ( '}' ) ;
    public final void rule__ComplexType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:997:1: ( ( '}' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:998:1: ( '}' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:998:1: ( '}' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:999:1: '}'
            {
             before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__ComplexType__Group__7__Impl2020); 
             after(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ComplexType__Group__7__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1028:1: rule__ComplexType__Group_3__0 : rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1 ;
    public final void rule__ComplexType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1032:1: ( rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1033:2: rule__ComplexType__Group_3__0__Impl rule__ComplexType__Group_3__1
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_3__0__Impl_in_rule__ComplexType__Group_3__02067);
            rule__ComplexType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_3__1_in_rule__ComplexType__Group_3__02070);
            rule__ComplexType__Group_3__1();

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
    // $ANTLR end "rule__ComplexType__Group_3__0"


    // $ANTLR start "rule__ComplexType__Group_3__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1040:1: rule__ComplexType__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ComplexType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1044:1: ( ( 'extends' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1045:1: ( 'extends' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1045:1: ( 'extends' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1046:1: 'extends'
            {
             before(grammarAccess.getComplexTypeAccess().getExtendsKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__ComplexType__Group_3__0__Impl2098); 
             after(grammarAccess.getComplexTypeAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_3__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1059:1: rule__ComplexType__Group_3__1 : rule__ComplexType__Group_3__1__Impl ;
    public final void rule__ComplexType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1063:1: ( rule__ComplexType__Group_3__1__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1064:2: rule__ComplexType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_3__1__Impl_in_rule__ComplexType__Group_3__12129);
            rule__ComplexType__Group_3__1__Impl();

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
    // $ANTLR end "rule__ComplexType__Group_3__1"


    // $ANTLR start "rule__ComplexType__Group_3__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1070:1: rule__ComplexType__Group_3__1__Impl : ( ( rule__ComplexType__BaseTypeAssignment_3_1 ) ) ;
    public final void rule__ComplexType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1074:1: ( ( ( rule__ComplexType__BaseTypeAssignment_3_1 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1075:1: ( ( rule__ComplexType__BaseTypeAssignment_3_1 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1075:1: ( ( rule__ComplexType__BaseTypeAssignment_3_1 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1076:1: ( rule__ComplexType__BaseTypeAssignment_3_1 )
            {
             before(grammarAccess.getComplexTypeAccess().getBaseTypeAssignment_3_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1077:1: ( rule__ComplexType__BaseTypeAssignment_3_1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1077:2: rule__ComplexType__BaseTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ComplexType__BaseTypeAssignment_3_1_in_rule__ComplexType__Group_3__1__Impl2156);
            rule__ComplexType__BaseTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getBaseTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__ComplexType__Group_3__1__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1091:1: rule__ElementDeclaration__Group__0 : rule__ElementDeclaration__Group__0__Impl rule__ElementDeclaration__Group__1 ;
    public final void rule__ElementDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1095:1: ( rule__ElementDeclaration__Group__0__Impl rule__ElementDeclaration__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1096:2: rule__ElementDeclaration__Group__0__Impl rule__ElementDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__0__Impl_in_rule__ElementDeclaration__Group__02190);
            rule__ElementDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementDeclaration__Group__1_in_rule__ElementDeclaration__Group__02193);
            rule__ElementDeclaration__Group__1();

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
    // $ANTLR end "rule__ElementDeclaration__Group__0"


    // $ANTLR start "rule__ElementDeclaration__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1103:1: rule__ElementDeclaration__Group__0__Impl : ( ( rule__ElementDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ElementDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1107:1: ( ( ( rule__ElementDeclaration__NameAssignment_0 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1108:1: ( ( rule__ElementDeclaration__NameAssignment_0 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1108:1: ( ( rule__ElementDeclaration__NameAssignment_0 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1109:1: ( rule__ElementDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getElementDeclarationAccess().getNameAssignment_0()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1110:1: ( rule__ElementDeclaration__NameAssignment_0 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1110:2: rule__ElementDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__NameAssignment_0_in_rule__ElementDeclaration__Group__0__Impl2220);
            rule__ElementDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementDeclarationAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1120:1: rule__ElementDeclaration__Group__1 : rule__ElementDeclaration__Group__1__Impl rule__ElementDeclaration__Group__2 ;
    public final void rule__ElementDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1124:1: ( rule__ElementDeclaration__Group__1__Impl rule__ElementDeclaration__Group__2 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1125:2: rule__ElementDeclaration__Group__1__Impl rule__ElementDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__1__Impl_in_rule__ElementDeclaration__Group__12250);
            rule__ElementDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementDeclaration__Group__2_in_rule__ElementDeclaration__Group__12253);
            rule__ElementDeclaration__Group__2();

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
    // $ANTLR end "rule__ElementDeclaration__Group__1"


    // $ANTLR start "rule__ElementDeclaration__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1132:1: rule__ElementDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__ElementDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1136:1: ( ( ':' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1137:1: ( ':' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1137:1: ( ':' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1138:1: ':'
            {
             before(grammarAccess.getElementDeclarationAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ElementDeclaration__Group__1__Impl2281); 
             after(grammarAccess.getElementDeclarationAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ElementDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1151:1: rule__ElementDeclaration__Group__2 : rule__ElementDeclaration__Group__2__Impl rule__ElementDeclaration__Group__3 ;
    public final void rule__ElementDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1155:1: ( rule__ElementDeclaration__Group__2__Impl rule__ElementDeclaration__Group__3 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1156:2: rule__ElementDeclaration__Group__2__Impl rule__ElementDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__2__Impl_in_rule__ElementDeclaration__Group__22312);
            rule__ElementDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementDeclaration__Group__3_in_rule__ElementDeclaration__Group__22315);
            rule__ElementDeclaration__Group__3();

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
    // $ANTLR end "rule__ElementDeclaration__Group__2"


    // $ANTLR start "rule__ElementDeclaration__Group__2__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1163:1: rule__ElementDeclaration__Group__2__Impl : ( ( rule__ElementDeclaration__Alternatives_2 ) ) ;
    public final void rule__ElementDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1167:1: ( ( ( rule__ElementDeclaration__Alternatives_2 ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1168:1: ( ( rule__ElementDeclaration__Alternatives_2 ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1168:1: ( ( rule__ElementDeclaration__Alternatives_2 ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1169:1: ( rule__ElementDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getElementDeclarationAccess().getAlternatives_2()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1170:1: ( rule__ElementDeclaration__Alternatives_2 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1170:2: rule__ElementDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Alternatives_2_in_rule__ElementDeclaration__Group__2__Impl2342);
            rule__ElementDeclaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getElementDeclarationAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ElementDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__3"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1180:1: rule__ElementDeclaration__Group__3 : rule__ElementDeclaration__Group__3__Impl rule__ElementDeclaration__Group__4 ;
    public final void rule__ElementDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1184:1: ( rule__ElementDeclaration__Group__3__Impl rule__ElementDeclaration__Group__4 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1185:2: rule__ElementDeclaration__Group__3__Impl rule__ElementDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__3__Impl_in_rule__ElementDeclaration__Group__32372);
            rule__ElementDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementDeclaration__Group__4_in_rule__ElementDeclaration__Group__32375);
            rule__ElementDeclaration__Group__4();

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
    // $ANTLR end "rule__ElementDeclaration__Group__3"


    // $ANTLR start "rule__ElementDeclaration__Group__3__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1192:1: rule__ElementDeclaration__Group__3__Impl : ( ( rule__ElementDeclaration__MultipleAssignment_3 )? ) ;
    public final void rule__ElementDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1196:1: ( ( ( rule__ElementDeclaration__MultipleAssignment_3 )? ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1197:1: ( ( rule__ElementDeclaration__MultipleAssignment_3 )? )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1197:1: ( ( rule__ElementDeclaration__MultipleAssignment_3 )? )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1198:1: ( rule__ElementDeclaration__MultipleAssignment_3 )?
            {
             before(grammarAccess.getElementDeclarationAccess().getMultipleAssignment_3()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1199:1: ( rule__ElementDeclaration__MultipleAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1199:2: rule__ElementDeclaration__MultipleAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ElementDeclaration__MultipleAssignment_3_in_rule__ElementDeclaration__Group__3__Impl2402);
                    rule__ElementDeclaration__MultipleAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementDeclarationAccess().getMultipleAssignment_3()); 

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
    // $ANTLR end "rule__ElementDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__4"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1209:1: rule__ElementDeclaration__Group__4 : rule__ElementDeclaration__Group__4__Impl rule__ElementDeclaration__Group__5 ;
    public final void rule__ElementDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1213:1: ( rule__ElementDeclaration__Group__4__Impl rule__ElementDeclaration__Group__5 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1214:2: rule__ElementDeclaration__Group__4__Impl rule__ElementDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__4__Impl_in_rule__ElementDeclaration__Group__42433);
            rule__ElementDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementDeclaration__Group__5_in_rule__ElementDeclaration__Group__42436);
            rule__ElementDeclaration__Group__5();

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
    // $ANTLR end "rule__ElementDeclaration__Group__4"


    // $ANTLR start "rule__ElementDeclaration__Group__4__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1221:1: rule__ElementDeclaration__Group__4__Impl : ( ( rule__ElementDeclaration__OptionalAssignment_4 )? ) ;
    public final void rule__ElementDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1225:1: ( ( ( rule__ElementDeclaration__OptionalAssignment_4 )? ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1226:1: ( ( rule__ElementDeclaration__OptionalAssignment_4 )? )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1226:1: ( ( rule__ElementDeclaration__OptionalAssignment_4 )? )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1227:1: ( rule__ElementDeclaration__OptionalAssignment_4 )?
            {
             before(grammarAccess.getElementDeclarationAccess().getOptionalAssignment_4()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1228:1: ( rule__ElementDeclaration__OptionalAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1228:2: rule__ElementDeclaration__OptionalAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ElementDeclaration__OptionalAssignment_4_in_rule__ElementDeclaration__Group__4__Impl2463);
                    rule__ElementDeclaration__OptionalAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementDeclarationAccess().getOptionalAssignment_4()); 

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
    // $ANTLR end "rule__ElementDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__5"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1238:1: rule__ElementDeclaration__Group__5 : rule__ElementDeclaration__Group__5__Impl ;
    public final void rule__ElementDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1242:1: ( rule__ElementDeclaration__Group__5__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1243:2: rule__ElementDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ElementDeclaration__Group__5__Impl_in_rule__ElementDeclaration__Group__52494);
            rule__ElementDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__ElementDeclaration__Group__5"


    // $ANTLR start "rule__ElementDeclaration__Group__5__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1249:1: rule__ElementDeclaration__Group__5__Impl : ( ( rule__ElementDeclaration__DocAssignment_5 )? ) ;
    public final void rule__ElementDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1253:1: ( ( ( rule__ElementDeclaration__DocAssignment_5 )? ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1254:1: ( ( rule__ElementDeclaration__DocAssignment_5 )? )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1254:1: ( ( rule__ElementDeclaration__DocAssignment_5 )? )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1255:1: ( rule__ElementDeclaration__DocAssignment_5 )?
            {
             before(grammarAccess.getElementDeclarationAccess().getDocAssignment_5()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1256:1: ( rule__ElementDeclaration__DocAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1256:2: rule__ElementDeclaration__DocAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ElementDeclaration__DocAssignment_5_in_rule__ElementDeclaration__Group__5__Impl2521);
                    rule__ElementDeclaration__DocAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementDeclarationAccess().getDocAssignment_5()); 

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
    // $ANTLR end "rule__ElementDeclaration__Group__5__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1278:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1282:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1283:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02564);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02567);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1290:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1294:1: ( ( RULE_ID ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1295:1: ( RULE_ID )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1295:1: ( RULE_ID )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1296:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2594); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1307:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1311:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1312:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12623);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1318:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1322:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1323:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1323:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1324:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1325:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1325:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2650);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1339:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1343:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1344:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02685);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02688);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1351:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1355:1: ( ( '.' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1356:1: ( '.' )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1356:1: ( '.' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1357:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__QualifiedName__Group_1__0__Impl2716); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1370:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1374:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1375:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12747);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1381:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1385:1: ( ( RULE_ID ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1386:1: ( RULE_ID )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1386:1: ( RULE_ID )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1387:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2774); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1402:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1406:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1407:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02807);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02810);
            rule__QualifiedNameWithWildCard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1414:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1418:1: ( ( ruleQualifiedName ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1419:1: ( ruleQualifiedName )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1419:1: ( ruleQualifiedName )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1420:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2837);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1431:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1435:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1436:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12866);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1442:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1446:1: ( ( ( '.*' )? ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1447:1: ( ( '.*' )? )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1447:1: ( ( '.*' )? )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1448:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1449:1: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1450:2: '.*'
                    {
                    match(input,27,FOLLOW_27_in_rule__QualifiedNameWithWildCard__Group__1__Impl2895); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Model__TargetNamespaceAssignment_0_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1466:1: rule__Model__TargetNamespaceAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Model__TargetNamespaceAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1470:1: ( ( RULE_STRING ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1471:1: ( RULE_STRING )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1471:1: ( RULE_STRING )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1472:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getTargetNamespaceSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__TargetNamespaceAssignment_0_12937); 
             after(grammarAccess.getModelAccess().getTargetNamespaceSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Model__TargetNamespaceAssignment_0_1"


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1481:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1485:1: ( ( ruleImport ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1486:1: ( ruleImport )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1486:1: ( ruleImport )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1487:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_12968);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__TypesAssignment_2_0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1496:1: rule__Model__TypesAssignment_2_0 : ( ruleComplexType ) ;
    public final void rule__Model__TypesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1500:1: ( ( ruleComplexType ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1501:1: ( ruleComplexType )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1501:1: ( ruleComplexType )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1502:1: ruleComplexType
            {
             before(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleComplexType_in_rule__Model__TypesAssignment_2_02999);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Model__TypesAssignment_2_0"


    // $ANTLR start "rule__Model__PackagesAssignment_2_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1511:1: rule__Model__PackagesAssignment_2_1 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1515:1: ( ( rulePackage ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1516:1: ( rulePackage )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1516:1: ( rulePackage )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1517:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_2_13030);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Model__PackagesAssignment_2_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1526:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1530:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1531:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1531:1: ( ruleQualifiedNameWithWildCard )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1532:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13061);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1541:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1545:1: ( ( RULE_ID ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1546:1: ( RULE_ID )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1546:1: ( RULE_ID )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1547:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_13092); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__TypesAssignment_3_0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1556:1: rule__Package__TypesAssignment_3_0 : ( ruleComplexType ) ;
    public final void rule__Package__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1560:1: ( ( ruleComplexType ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1561:1: ( ruleComplexType )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1561:1: ( ruleComplexType )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1562:1: ruleComplexType
            {
             before(grammarAccess.getPackageAccess().getTypesComplexTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleComplexType_in_rule__Package__TypesAssignment_3_03123);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTypesComplexTypeParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Package__TypesAssignment_3_0"


    // $ANTLR start "rule__Package__PackagesAssignment_3_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1571:1: rule__Package__PackagesAssignment_3_1 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1575:1: ( ( rulePackage ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1576:1: ( rulePackage )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1576:1: ( rulePackage )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1577:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Package__PackagesAssignment_3_13154);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Package__PackagesAssignment_3_1"


    // $ANTLR start "rule__ComplexType__NameAssignment_2"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1586:1: rule__ComplexType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1590:1: ( ( RULE_ID ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1591:1: ( RULE_ID )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1591:1: ( RULE_ID )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1592:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexType__NameAssignment_23185); 
             after(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComplexType__NameAssignment_2"


    // $ANTLR start "rule__ComplexType__BaseTypeAssignment_3_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1601:1: rule__ComplexType__BaseTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComplexType__BaseTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1605:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1606:1: ( ( ruleQualifiedName ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1606:1: ( ( ruleQualifiedName ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1607:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeCrossReference_3_1_0()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1608:1: ( ruleQualifiedName )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1609:1: ruleQualifiedName
            {
             before(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ComplexType__BaseTypeAssignment_3_13220);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__ComplexType__BaseTypeAssignment_3_1"


    // $ANTLR start "rule__ComplexType__DocAssignment_5"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1620:1: rule__ComplexType__DocAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ComplexType__DocAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1624:1: ( ( RULE_STRING ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1625:1: ( RULE_STRING )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1625:1: ( RULE_STRING )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1626:1: RULE_STRING
            {
             before(grammarAccess.getComplexTypeAccess().getDocSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ComplexType__DocAssignment_53255); 
             after(grammarAccess.getComplexTypeAccess().getDocSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ComplexType__DocAssignment_5"


    // $ANTLR start "rule__ComplexType__ElementsAssignment_6"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1635:1: rule__ComplexType__ElementsAssignment_6 : ( ruleElementDeclaration ) ;
    public final void rule__ComplexType__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1639:1: ( ( ruleElementDeclaration ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1640:1: ( ruleElementDeclaration )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1640:1: ( ruleElementDeclaration )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1641:1: ruleElementDeclaration
            {
             before(grammarAccess.getComplexTypeAccess().getElementsElementDeclarationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_rule__ComplexType__ElementsAssignment_63286);
            ruleElementDeclaration();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getElementsElementDeclarationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ComplexType__ElementsAssignment_6"


    // $ANTLR start "rule__ElementDeclaration__NameAssignment_0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1650:1: rule__ElementDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ElementDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1654:1: ( ( RULE_ID ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1655:1: ( RULE_ID )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1655:1: ( RULE_ID )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1656:1: RULE_ID
            {
             before(grammarAccess.getElementDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ElementDeclaration__NameAssignment_03317); 
             after(grammarAccess.getElementDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ElementDeclaration__RefAssignment_2_0"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1665:1: rule__ElementDeclaration__RefAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDeclaration__RefAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1669:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1670:1: ( ( ruleQualifiedName ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1670:1: ( ( ruleQualifiedName ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1671:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementDeclarationAccess().getRefComplexTypeCrossReference_2_0_0()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1672:1: ( ruleQualifiedName )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1673:1: ruleQualifiedName
            {
             before(grammarAccess.getElementDeclarationAccess().getRefComplexTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ElementDeclaration__RefAssignment_2_03352);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getElementDeclarationAccess().getRefComplexTypeQualifiedNameParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getElementDeclarationAccess().getRefComplexTypeCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__RefAssignment_2_0"


    // $ANTLR start "rule__ElementDeclaration__TypeAssignment_2_1"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1684:1: rule__ElementDeclaration__TypeAssignment_2_1 : ( rulePrimitiveType ) ;
    public final void rule__ElementDeclaration__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1688:1: ( ( rulePrimitiveType ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1689:1: ( rulePrimitiveType )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1689:1: ( rulePrimitiveType )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1690:1: rulePrimitiveType
            {
             before(grammarAccess.getElementDeclarationAccess().getTypePrimitiveTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__ElementDeclaration__TypeAssignment_2_13387);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getElementDeclarationAccess().getTypePrimitiveTypeEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__TypeAssignment_2_1"


    // $ANTLR start "rule__ElementDeclaration__MultipleAssignment_3"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1699:1: rule__ElementDeclaration__MultipleAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__ElementDeclaration__MultipleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1703:1: ( ( ( '[]' ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1704:1: ( ( '[]' ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1704:1: ( ( '[]' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1705:1: ( '[]' )
            {
             before(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1706:1: ( '[]' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1707:1: '[]'
            {
             before(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__ElementDeclaration__MultipleAssignment_33423); 
             after(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }

             after(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__MultipleAssignment_3"


    // $ANTLR start "rule__ElementDeclaration__OptionalAssignment_4"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1722:1: rule__ElementDeclaration__OptionalAssignment_4 : ( ( 'optional' ) ) ;
    public final void rule__ElementDeclaration__OptionalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1726:1: ( ( ( 'optional' ) ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1727:1: ( ( 'optional' ) )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1727:1: ( ( 'optional' ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1728:1: ( 'optional' )
            {
             before(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); 
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1729:1: ( 'optional' )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1730:1: 'optional'
            {
             before(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__ElementDeclaration__OptionalAssignment_43467); 
             after(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); 

            }

             after(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__OptionalAssignment_4"


    // $ANTLR start "rule__ElementDeclaration__DocAssignment_5"
    // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1745:1: rule__ElementDeclaration__DocAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ElementDeclaration__DocAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1749:1: ( ( RULE_STRING ) )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1750:1: ( RULE_STRING )
            {
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1750:1: ( RULE_STRING )
            // ../org.edna.datamodel.language.ui/src-gen/org/edna/datamodel/ui/contentassist/antlr/internal/InternalDatamodel.g:1751:1: RULE_STRING
            {
             before(grammarAccess.getElementDeclarationAccess().getDocSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ElementDeclaration__DocAssignment_53506); 
             after(grammarAccess.getElementDeclarationAccess().getDocSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ElementDeclaration__DocAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__0_in_ruleComplexType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__0_in_ruleElementDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_2_0_in_rule__Model__Alternatives_2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_1_in_rule__Model__Alternatives_2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__TypesAssignment_3_0_in_rule__Package__Alternatives_3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackagesAssignment_3_1_in_rule__Package__Alternatives_3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__RefAssignment_2_0_in_rule__ElementDeclaration__Alternatives_2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__TypeAssignment_2_1_in_rule__ElementDeclaration__Alternatives_2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PrimitiveType__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PrimitiveType__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimitiveType__Alternatives722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimitiveType__Alternatives743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimitiveType__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveType__Alternatives785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0818 = new BitSet(new long[]{0x00000000004C0000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1878 = new BitSet(new long[]{0x00000000004C0000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl908 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_2_in_rule__Model__Group__2__Impl966 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_0__0__Impl1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TargetNamespaceAssignment_0_1_in_rule__Model__Group_0__1__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Package__Group__0__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11311 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21371 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Package__Group__2__Impl1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31433 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Alternatives_3_in_rule__Package__Group__3__Impl1463 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Package__Group__4__Impl1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__0__Impl_in_rule__ComplexType__Group__01563 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__1_in_rule__ComplexType__Group__01566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComplexType__Group__0__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__1__Impl_in_rule__ComplexType__Group__11625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__2_in_rule__ComplexType__Group__11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ComplexType__Group__1__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__2__Impl_in_rule__ComplexType__Group__21687 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__3_in_rule__ComplexType__Group__21690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__NameAssignment_2_in_rule__ComplexType__Group__2__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__3__Impl_in_rule__ComplexType__Group__31747 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__4_in_rule__ComplexType__Group__31750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_3__0_in_rule__ComplexType__Group__3__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__4__Impl_in_rule__ComplexType__Group__41808 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__5_in_rule__ComplexType__Group__41811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexType__Group__4__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__5__Impl_in_rule__ComplexType__Group__51870 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__6_in_rule__ComplexType__Group__51873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__DocAssignment_5_in_rule__ComplexType__Group__5__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__6__Impl_in_rule__ComplexType__Group__61931 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__7_in_rule__ComplexType__Group__61934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__ElementsAssignment_6_in_rule__ComplexType__Group__6__Impl1961 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__7__Impl_in_rule__ComplexType__Group__71992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComplexType__Group__7__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_3__0__Impl_in_rule__ComplexType__Group_3__02067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_3__1_in_rule__ComplexType__Group_3__02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComplexType__Group_3__0__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_3__1__Impl_in_rule__ComplexType__Group_3__12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__BaseTypeAssignment_3_1_in_rule__ComplexType__Group_3__1__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__0__Impl_in_rule__ElementDeclaration__Group__02190 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__1_in_rule__ElementDeclaration__Group__02193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__NameAssignment_0_in_rule__ElementDeclaration__Group__0__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__1__Impl_in_rule__ElementDeclaration__Group__12250 = new BitSet(new long[]{0x000000000001F810L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__2_in_rule__ElementDeclaration__Group__12253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ElementDeclaration__Group__1__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__2__Impl_in_rule__ElementDeclaration__Group__22312 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__3_in_rule__ElementDeclaration__Group__22315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Alternatives_2_in_rule__ElementDeclaration__Group__2__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__3__Impl_in_rule__ElementDeclaration__Group__32372 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__4_in_rule__ElementDeclaration__Group__32375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__MultipleAssignment_3_in_rule__ElementDeclaration__Group__3__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__4__Impl_in_rule__ElementDeclaration__Group__42433 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__5_in_rule__ElementDeclaration__Group__42436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__OptionalAssignment_4_in_rule__ElementDeclaration__Group__4__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__Group__5__Impl_in_rule__ElementDeclaration__Group__52494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDeclaration__DocAssignment_5_in_rule__ElementDeclaration__Group__5__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02564 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2650 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QualifiedName__Group_1__0__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02807 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualifiedNameWithWildCard__Group__1__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__TargetNamespaceAssignment_0_12937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Model__TypesAssignment_2_02999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_2_13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_13092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__Package__TypesAssignment_3_03123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__PackagesAssignment_3_13154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexType__NameAssignment_23185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ComplexType__BaseTypeAssignment_3_13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ComplexType__DocAssignment_53255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_rule__ComplexType__ElementsAssignment_63286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ElementDeclaration__NameAssignment_03317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ElementDeclaration__RefAssignment_2_03352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__ElementDeclaration__TypeAssignment_2_13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ElementDeclaration__MultipleAssignment_33423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ElementDeclaration__OptionalAssignment_43467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ElementDeclaration__DocAssignment_53506 = new BitSet(new long[]{0x0000000000000002L});

}