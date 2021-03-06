/*
* generated by Xtext
*/
grammar InternalDatamodel;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.edna.datamodel.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImport
entryRuleImport 
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportAccess().getGroup()); }
(rule__Import__Group__0)
{ after(grammarAccess.getImportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePackage
entryRulePackage 
:
{ before(grammarAccess.getPackageRule()); }
	 rulePackage
{ after(grammarAccess.getPackageRule()); } 
	 EOF 
;

// Rule Package
rulePackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPackageAccess().getGroup()); }
(rule__Package__Group__0)
{ after(grammarAccess.getPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComplexType
entryRuleComplexType 
:
{ before(grammarAccess.getComplexTypeRule()); }
	 ruleComplexType
{ after(grammarAccess.getComplexTypeRule()); } 
	 EOF 
;

// Rule ComplexType
ruleComplexType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComplexTypeAccess().getGroup()); }
(rule__ComplexType__Group__0)
{ after(grammarAccess.getComplexTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleElementDeclaration
entryRuleElementDeclaration 
:
{ before(grammarAccess.getElementDeclarationRule()); }
	 ruleElementDeclaration
{ after(grammarAccess.getElementDeclarationRule()); } 
	 EOF 
;

// Rule ElementDeclaration
ruleElementDeclaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getElementDeclarationAccess().getGroup()); }
(rule__ElementDeclaration__Group__0)
{ after(grammarAccess.getElementDeclarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedNameWithWildCard
entryRuleQualifiedNameWithWildCard 
:
{ before(grammarAccess.getQualifiedNameWithWildCardRule()); }
	 ruleQualifiedNameWithWildCard
{ after(grammarAccess.getQualifiedNameWithWildCardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildCard
ruleQualifiedNameWithWildCard
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); }
(rule__QualifiedNameWithWildCard__Group__0)
{ after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule PrimitiveType
rulePrimitiveType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); }
(rule__PrimitiveType__Alternatives)
{ after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTypesAssignment_2_0()); }
(rule__Model__TypesAssignment_2_0)
{ after(grammarAccess.getModelAccess().getTypesAssignment_2_0()); }
)

    |(
{ before(grammarAccess.getModelAccess().getPackagesAssignment_2_1()); }
(rule__Model__PackagesAssignment_2_1)
{ after(grammarAccess.getModelAccess().getPackagesAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Alternatives_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getTypesAssignment_3_0()); }
(rule__Package__TypesAssignment_3_0)
{ after(grammarAccess.getPackageAccess().getTypesAssignment_3_0()); }
)

    |(
{ before(grammarAccess.getPackageAccess().getPackagesAssignment_3_1()); }
(rule__Package__PackagesAssignment_3_1)
{ after(grammarAccess.getPackageAccess().getPackagesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getRefAssignment_2_0()); }
(rule__ElementDeclaration__RefAssignment_2_0)
{ after(grammarAccess.getElementDeclarationAccess().getRefAssignment_2_0()); }
)

    |(
{ before(grammarAccess.getElementDeclarationAccess().getTypeAssignment_2_1()); }
(rule__ElementDeclaration__TypeAssignment_2_1)
{ after(grammarAccess.getElementDeclarationAccess().getTypeAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0()); }
(	'undefined' 
)
{ after(grammarAccess.getPrimitiveTypeAccess().getUndefinedEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1()); }
(	'string' 
)
{ after(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); }
(	'integer' 
)
{ after(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); }
(	'boolean' 
)
{ after(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); }
(	'float' 
)
{ after(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); }
(	'double' 
)
{ after(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGroup_0()); }
(rule__Model__Group_0__0)
{ after(grammarAccess.getModelAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getImportsAssignment_1()); }
(rule__Model__ImportsAssignment_1)*
{ after(grammarAccess.getModelAccess().getImportsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getAlternatives_2()); }
(rule__Model__Alternatives_2)*
{ after(grammarAccess.getModelAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Model__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_0__0__Impl
	rule__Model__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTargetNamespaceKeyword_0_0()); }

	'targetNamespace' 

{ after(grammarAccess.getModelAccess().getTargetNamespaceKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTargetNamespaceAssignment_0_1()); }
(rule__Model__TargetNamespaceAssignment_0_1)
{ after(grammarAccess.getModelAccess().getTargetNamespaceAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Import__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
(rule__Import__ImportedNamespaceAssignment_1)
{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Package__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__0__Impl
	rule__Package__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getPackageAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__1__Impl
	rule__Package__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameAssignment_1()); }
(rule__Package__NameAssignment_1)
{ after(grammarAccess.getPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__2__Impl
	rule__Package__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__3__Impl
	rule__Package__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getAlternatives_3()); }
(rule__Package__Alternatives_3)*
{ after(grammarAccess.getPackageAccess().getAlternatives_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComplexType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__0__Impl
	rule__ComplexType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getComplexKeyword_0()); }

	'complex' 

{ after(grammarAccess.getComplexTypeAccess().getComplexKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__1__Impl
	rule__ComplexType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getTypeKeyword_1()); }

	'type' 

{ after(grammarAccess.getComplexTypeAccess().getTypeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__2__Impl
	rule__ComplexType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getNameAssignment_2()); }
(rule__ComplexType__NameAssignment_2)
{ after(grammarAccess.getComplexTypeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__3__Impl
	rule__ComplexType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getGroup_3()); }
(rule__ComplexType__Group_3__0)?
{ after(grammarAccess.getComplexTypeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__4__Impl
	rule__ComplexType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__5__Impl
	rule__ComplexType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getDocAssignment_5()); }
(rule__ComplexType__DocAssignment_5)?
{ after(grammarAccess.getComplexTypeAccess().getDocAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__6__Impl
	rule__ComplexType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getElementsAssignment_6()); }
(rule__ComplexType__ElementsAssignment_6)*
{ after(grammarAccess.getComplexTypeAccess().getElementsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__ComplexType__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group_3__0__Impl
	rule__ComplexType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getExtendsKeyword_3_0()); }

	'extends' 

{ after(grammarAccess.getComplexTypeAccess().getExtendsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexType__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexType__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getBaseTypeAssignment_3_1()); }
(rule__ComplexType__BaseTypeAssignment_3_1)
{ after(grammarAccess.getComplexTypeAccess().getBaseTypeAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ElementDeclaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ElementDeclaration__Group__0__Impl
	rule__ElementDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getNameAssignment_0()); }
(rule__ElementDeclaration__NameAssignment_0)
{ after(grammarAccess.getElementDeclarationAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ElementDeclaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ElementDeclaration__Group__1__Impl
	rule__ElementDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getElementDeclarationAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ElementDeclaration__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ElementDeclaration__Group__2__Impl
	rule__ElementDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getAlternatives_2()); }
(rule__ElementDeclaration__Alternatives_2)
{ after(grammarAccess.getElementDeclarationAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ElementDeclaration__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ElementDeclaration__Group__3__Impl
	rule__ElementDeclaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getMultipleAssignment_3()); }
(rule__ElementDeclaration__MultipleAssignment_3)?
{ after(grammarAccess.getElementDeclarationAccess().getMultipleAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ElementDeclaration__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ElementDeclaration__Group__4__Impl
	rule__ElementDeclaration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getOptionalAssignment_4()); }
(rule__ElementDeclaration__OptionalAssignment_4)?
{ after(grammarAccess.getElementDeclarationAccess().getOptionalAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ElementDeclaration__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ElementDeclaration__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getDocAssignment_5()); }
(rule__ElementDeclaration__DocAssignment_5)?
{ after(grammarAccess.getElementDeclarationAccess().getDocAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedNameWithWildCard__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedNameWithWildCard__Group__0__Impl
	rule__QualifiedNameWithWildCard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildCard__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
{ after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildCard__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedNameWithWildCard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildCard__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); }
(
	'.*' 
)?
{ after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__TargetNamespaceAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTargetNamespaceSTRINGTerminalRuleCall_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getModelAccess().getTargetNamespaceSTRINGTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ImportsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); }
	ruleImport{ after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__TypesAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_2_0_0()); }
	ruleComplexType{ after(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__PackagesAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_1_0()); }
	rulePackage{ after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); }
	ruleQualifiedNameWithWildCard{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__TypesAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getTypesComplexTypeParserRuleCall_3_0_0()); }
	ruleComplexType{ after(grammarAccess.getPackageAccess().getTypesComplexTypeParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__PackagesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_3_1_0()); }
	rulePackage{ after(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__BaseTypeAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeCrossReference_3_1_0()); }
(
{ before(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getComplexTypeAccess().getBaseTypeComplexTypeCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__DocAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getDocSTRINGTerminalRuleCall_5_0()); }
	RULE_STRING{ after(grammarAccess.getComplexTypeAccess().getDocSTRINGTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexType__ElementsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexTypeAccess().getElementsElementDeclarationParserRuleCall_6_0()); }
	ruleElementDeclaration{ after(grammarAccess.getComplexTypeAccess().getElementsElementDeclarationParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getElementDeclarationAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__RefAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getRefComplexTypeCrossReference_2_0_0()); }
(
{ before(grammarAccess.getElementDeclarationAccess().getRefComplexTypeQualifiedNameParserRuleCall_2_0_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getElementDeclarationAccess().getRefComplexTypeQualifiedNameParserRuleCall_2_0_0_1()); }
)
{ after(grammarAccess.getElementDeclarationAccess().getRefComplexTypeCrossReference_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__TypeAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getTypePrimitiveTypeEnumRuleCall_2_1_0()); }
	rulePrimitiveType{ after(grammarAccess.getElementDeclarationAccess().getTypePrimitiveTypeEnumRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__MultipleAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); }
(
{ before(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); }

	'[]' 

{ after(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); }
)

{ after(grammarAccess.getElementDeclarationAccess().getMultipleLeftSquareBracketRightSquareBracketKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__OptionalAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); }
(
{ before(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); }

	'optional' 

{ after(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); }
)

{ after(grammarAccess.getElementDeclarationAccess().getOptionalOptionalKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ElementDeclaration__DocAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementDeclarationAccess().getDocSTRINGTerminalRuleCall_5_0()); }
	RULE_STRING{ after(grammarAccess.getElementDeclarationAccess().getDocSTRINGTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


