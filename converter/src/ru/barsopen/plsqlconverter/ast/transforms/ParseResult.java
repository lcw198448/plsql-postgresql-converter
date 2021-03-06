package ru.barsopen.plsqlconverter.ast.transforms;

import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class ParseResult {
	public List<RecognitionException> lexerErrors;
	public List<RecognitionException> parserErrors;
	public List<Token> tokens;
	public Tree tree;
}
