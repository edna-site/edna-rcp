/*
* generated by Xtext
*/
package org.edna.datamodel.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import org.edna.datamodel.services.DatamodelGrammarAccess;

public class DatamodelParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DatamodelGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, CharStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		org.edna.datamodel.parser.antlr.internal.InternalDatamodelParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		parser.setSyntaxErrorProvider(getSyntaxErrorProvider());
		parser.setUnorderedGroupHelper(getUnorderedGroupHelper().get());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	protected org.edna.datamodel.parser.antlr.internal.InternalDatamodelParser createParser(XtextTokenStream stream) {
		return new org.edna.datamodel.parser.antlr.internal.InternalDatamodelParser(stream, getElementFactory(), getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public DatamodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DatamodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}