lexer grammar InternalDatamodel;
@header {
package org.edna.datamodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'targetNamespace' ;
T12 : 'import' ;
T13 : 'package' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'complex' ;
T17 : 'type' ;
T18 : 'extends' ;
T19 : ':' ;
T20 : '[]' ;
T21 : 'optional' ;
T22 : '.' ;
T23 : '.*' ;
T24 : 'undefined' ;
T25 : 'string' ;
T26 : 'integer' ;
T27 : 'boolean' ;
T28 : 'float' ;
T29 : 'double' ;

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 773
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 775
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 777
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 779
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 781
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 783
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.edna.datamodel.language/src-gen/org/edna/datamodel/parser/antlr/internal/InternalDatamodel.g" 785
RULE_ANY_OTHER : .;


