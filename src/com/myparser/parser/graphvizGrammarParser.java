// Generated from C:/Users/benja/IdeaProjects/antlr_graph/src\graphvizGrammar.g4 by ANTLR 4.12.0
package com.myparser.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class graphvizGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LETTER=5, INT=6, LSQBRACKET=7, RSQBRACKET=8, 
		LBRACKET=9, RBRACKET=10, WS=11;
	public static final int
		RULE_graph = 0, RULE_node = 1, RULE_vertex = 2, RULE_weight = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"graph", "node", "vertex", "weight"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'digraph'", "'->'", "';'", "'weight='", null, null, "'['", "']'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "LETTER", "INT", "LSQBRACKET", "RSQBRACKET", 
			"LBRACKET", "RBRACKET", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "graphvizGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public graphvizGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraphContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(graphvizGrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(graphvizGrammarParser.RBRACKET, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).exitGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof graphvizGrammarVisitor ) return ((graphvizGrammarVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			match(LBRACKET);
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				node();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
			setState(15);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public List<WeightContext> weight() {
			return getRuleContexts(WeightContext.class);
		}
		public WeightContext weight(int i) {
			return getRuleContext(WeightContext.class,i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof graphvizGrammarVisitor ) return ((graphvizGrammarVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			vertex();
			setState(18);
			match(T__1);
			setState(19);
			vertex();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQBRACKET) {
				{
				{
				setState(20);
				weight();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VertexContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(graphvizGrammarParser.LETTER, 0); }
		public VertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).enterVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).exitVertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof graphvizGrammarVisitor ) return ((graphvizGrammarVisitor<? extends T>)visitor).visitVertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VertexContext vertex() throws RecognitionException {
		VertexContext _localctx = new VertexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(LETTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WeightContext extends ParserRuleContext {
		public TerminalNode LSQBRACKET() { return getToken(graphvizGrammarParser.LSQBRACKET, 0); }
		public TerminalNode INT() { return getToken(graphvizGrammarParser.INT, 0); }
		public TerminalNode RSQBRACKET() { return getToken(graphvizGrammarParser.RSQBRACKET, 0); }
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof graphvizGrammarListener ) ((graphvizGrammarListener)listener).exitWeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof graphvizGrammarVisitor ) return ((graphvizGrammarVisitor<? extends T>)visitor).visitWeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_weight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(LSQBRACKET);
			setState(31);
			match(T__3);
			setState(32);
			match(INT);
			setState(33);
			match(RSQBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016\b\u0001"+
		"\n\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000!\u0000\b"+
		"\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u001c"+
		"\u0001\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b\t\u0005"+
		"\u0001\u0000\u0000\t\u000b\u0005\t\u0000\u0000\n\f\u0003\u0002\u0001\u0000"+
		"\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0005\n\u0000\u0000\u0010\u0001\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0002\u0000"+
		"\u0000\u0013\u0017\u0003\u0004\u0002\u0000\u0014\u0016\u0003\u0006\u0003"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u0003\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d\u0005\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f \u0005\u0004\u0000\u0000"+
		" !\u0005\u0006\u0000\u0000!\"\u0005\b\u0000\u0000\"\u0007\u0001\u0000"+
		"\u0000\u0000\u0002\r\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}