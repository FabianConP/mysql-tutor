// Generated from MySQLParser.g4 by ANTLR 4.5.1
package model.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, IF=3, INT_DT=4, DOUBLE_DT=5, DATE_DT=6, VARCHAR_DT=7, 
		BLOB_DT=8, PRIMARY=9, AUTO=10, INCREMENT=11, DROP=12, INSERT=13, INTO=14, 
		VALUES=15, UPDATE=16, SET=17, DELETE=18, SELECT=19, FROM=20, WHERE=21, 
		AND=22, OR=23, XOR=24, IS=25, NULL=26, LIKE=27, IN=28, EXISTS=29, ALL=30, 
		ANY=31, TRUE=32, FALSE=33, SUM=34, RES=35, MUL=36, DIV=37, MOD=38, BETWEEN=39, 
		REGEXP=40, PLUS=41, MINUS=42, NEGATION=43, VERTBAR=44, BITAND=45, POWER_OP=46, 
		BINARY=47, SHIFT_LEFT=48, SHIFT_RIGHT=49, ESCAPE=50, ASTERISK=51, RPAREN=52, 
		LPAREN=53, RBRACK=54, LBRACK=55, COLON=56, ALL_FIELDS=57, EQ=58, LTH=59, 
		GTH=60, NOT_EQ=61, NOT=62, LET=63, GET=64, SEMI=65, COMMA=66, DOT=67, 
		COLLATE=68, INNER=69, OUTER=70, JOIN=71, CROSS=72, USING=73, INDEX=74, 
		KEY=75, ORDER=76, GROUP=77, BY=78, FOR=79, USE=80, STRAIGHT_JOIN=81, NATURAL=82, 
		LEFT=83, RIGHT=84, ON=85, ID=86, INT=87, DOUBLE=88, STRING=89, NEWLINE=90, 
		WS=91;
	public static final int
		RULE_commands = 0, RULE_stat = 1, RULE_create_clause = 2, RULE_data_type = 3, 
		RULE_column_list_definition = 4, RULE_column_definition = 5, RULE_column_list_attributes = 6, 
		RULE_column_attribute = 7, RULE_table_list_constraints = 8, RULE_table_constraint = 9, 
		RULE_drop_table_clause = 10, RULE_insert_clause = 11, RULE_list_values = 12, 
		RULE_update_clause = 13, RULE_column_list_assignment = 14, RULE_column_assignment = 15, 
		RULE_delete_clause = 16, RULE_schema_name = 17, RULE_select_clause = 18, 
		RULE_table_name = 19, RULE_table_alias = 20, RULE_column_name = 21, RULE_column_name_alias = 22, 
		RULE_index_name = 23, RULE_column_list = 24, RULE_column_list_clause = 25, 
		RULE_from_clause = 26, RULE_select_key = 27, RULE_where_clause = 28, RULE_expression = 29, 
		RULE_expr = 30, RULE_element = 31, RULE_relational_op = 32, RULE_expr_op = 33, 
		RULE_mul_op = 34, RULE_between_op = 35, RULE_is_or_is_not = 36, RULE_table_references = 37;
	public static final String[] ruleNames = {
		"commands", "stat", "create_clause", "data_type", "column_list_definition", 
		"column_definition", "column_list_attributes", "column_attribute", "table_list_constraints", 
		"table_constraint", "drop_table_clause", "insert_clause", "list_values", 
		"update_clause", "column_list_assignment", "column_assignment", "delete_clause", 
		"schema_name", "select_clause", "table_name", "table_alias", "column_name", 
		"column_name_alias", "index_name", "column_list", "column_list_clause", 
		"from_clause", "select_key", "where_clause", "expression", "expr", "element", 
		"relational_op", "expr_op", "mul_op", "between_op", "is_or_is_not", "table_references"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'create'", "'table'", "'if'", "'int'", "'double'", "'date'", "'varchar'", 
		"'blob'", "'primary'", "'auto'", "'increment'", "'drop'", "'insert'", 
		"'into'", "'values'", "'update'", "'set'", "'delete'", "'select'", "'from'", 
		"'where'", null, null, "'xor'", "'is'", "'null'", "'like'", "'in'", "'exists'", 
		"'all'", "'any'", "'true'", "'false'", null, null, null, null, null, "'between'", 
		"'regexp'", null, null, "'~'", "'|'", "'&'", "'^'", "'binary'", "'<<'", 
		"'>>'", "'escape'", null, "')'", "'('", "']'", "'['", "':'", "'.*'", "'='", 
		"'<'", "'>'", "'!='", "'not'", "'<='", "'>='", "';'", "','", "'.'", "'collate'", 
		"'inner'", "'outer'", "'join'", "'cross'", "'using'", "'index'", "'key'", 
		"'order'", "'group'", "'by'", "'for'", "'use'", "'straight_join'", "'natural'", 
		"'left'", "'right'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "IF", "INT_DT", "DOUBLE_DT", "DATE_DT", "VARCHAR_DT", 
		"BLOB_DT", "PRIMARY", "AUTO", "INCREMENT", "DROP", "INSERT", "INTO", "VALUES", 
		"UPDATE", "SET", "DELETE", "SELECT", "FROM", "WHERE", "AND", "OR", "XOR", 
		"IS", "NULL", "LIKE", "IN", "EXISTS", "ALL", "ANY", "TRUE", "FALSE", "SUM", 
		"RES", "MUL", "DIV", "MOD", "BETWEEN", "REGEXP", "PLUS", "MINUS", "NEGATION", 
		"VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", 
		"ESCAPE", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", 
		"ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", "GET", "SEMI", 
		"COMMA", "DOT", "COLLATE", "INNER", "OUTER", "JOIN", "CROSS", "USING", 
		"INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", "USE", "STRAIGHT_JOIN", 
		"NATURAL", "LEFT", "RIGHT", "ON", "ID", "INT", "DOUBLE", "STRING", "NEWLINE", 
		"WS"
	};
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
	public String getGrammarFileName() { return "MySQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandsContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				stat();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DROP) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << SELECT))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public Create_clauseContext create_clause() {
			return getRuleContext(Create_clauseContext.class,0);
		}
		public Drop_table_clauseContext drop_table_clause() {
			return getRuleContext(Drop_table_clauseContext.class,0);
		}
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public Insert_clauseContext insert_clause() {
			return getRuleContext(Insert_clauseContext.class,0);
		}
		public Update_clauseContext update_clause() {
			return getRuleContext(Update_clauseContext.class,0);
		}
		public Delete_clauseContext delete_clause() {
			return getRuleContext(Delete_clauseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				create_clause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				drop_table_clause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				select_clause();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				insert_clause();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				update_clause();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				delete_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_clauseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_list_definitionContext column_list_definition() {
			return getRuleContext(Column_list_definitionContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public Create_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterCreate_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitCreate_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitCreate_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_clauseContext create_clause() throws RecognitionException {
		Create_clauseContext _localctx = new Create_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CREATE);
			setState(90);
			match(TABLE);
			setState(94);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(91);
				match(IF);
				setState(92);
				match(NOT);
				setState(93);
				match(EXISTS);
				}
			}

			setState(96);
			table_name();
			setState(97);
			column_list_definition();
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT_DT() { return getToken(MySQLParser.INT_DT, 0); }
		public TerminalNode DOUBLE_DT() { return getToken(MySQLParser.DOUBLE_DT, 0); }
		public TerminalNode DATE_DT() { return getToken(MySQLParser.DATE_DT, 0); }
		public TerminalNode VARCHAR_DT() { return getToken(MySQLParser.VARCHAR_DT, 0); }
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode BLOB_DT() { return getToken(MySQLParser.BLOB_DT, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_type);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case INT_DT:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(INT_DT);
				}
				break;
			case DOUBLE_DT:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(DOUBLE_DT);
				}
				break;
			case DATE_DT:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(DATE_DT);
				}
				break;
			case VARCHAR_DT:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(VARCHAR_DT);
				setState(103);
				match(LPAREN);
				setState(104);
				match(INT);
				setState(105);
				match(RPAREN);
				}
				break;
			case BLOB_DT:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(BLOB_DT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Column_list_definitionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public Table_list_constraintsContext table_list_constraints() {
			return getRuleContext(Table_list_constraintsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_list_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_definitionContext column_list_definition() throws RecognitionException {
		Column_list_definitionContext _localctx = new Column_list_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column_list_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LPAREN);
			setState(110);
			column_definition();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				column_definition();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			table_list_constraints();
			setState(119);
			match(RPAREN);
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

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Column_list_attributesContext column_list_attributes() {
			return getRuleContext(Column_list_attributesContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			column_name();
			setState(122);
			data_type();
			setState(123);
			column_list_attributes();
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

	public static class Column_list_attributesContext extends ParserRuleContext {
		public List<Column_attributeContext> column_attribute() {
			return getRuleContexts(Column_attributeContext.class);
		}
		public Column_attributeContext column_attribute(int i) {
			return getRuleContext(Column_attributeContext.class,i);
		}
		public Column_list_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_attributesContext column_list_attributes() throws RecognitionException {
		Column_list_attributesContext _localctx = new Column_list_attributesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_list_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AUTO || _la==NOT) {
				{
				{
				setState(125);
				column_attribute();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Column_attributeContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public TerminalNode AUTO() { return getToken(MySQLParser.AUTO, 0); }
		public TerminalNode INCREMENT() { return getToken(MySQLParser.INCREMENT, 0); }
		public Column_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_attributeContext column_attribute() throws RecognitionException {
		Column_attributeContext _localctx = new Column_attributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_attribute);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(NOT);
				setState(132);
				match(NULL);
				}
				break;
			case AUTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(AUTO);
				setState(134);
				match(INCREMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_list_constraintsContext extends ParserRuleContext {
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Table_list_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_list_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_list_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_list_constraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_list_constraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_list_constraintsContext table_list_constraints() throws RecognitionException {
		Table_list_constraintsContext _localctx = new Table_list_constraintsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table_list_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMARY) {
				{
				{
				setState(137);
				table_constraint();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(MySQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(MySQLParser.KEY, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(PRIMARY);
			setState(144);
			match(KEY);
			setState(145);
			column_list();
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

	public static class Drop_table_clauseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MySQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public Drop_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterDrop_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitDrop_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitDrop_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_clauseContext drop_table_clause() throws RecognitionException {
		Drop_table_clauseContext _localctx = new Drop_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_drop_table_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(DROP);
			setState(148);
			match(TABLE);
			setState(151);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(149);
				match(IF);
				setState(150);
				match(EXISTS);
				}
			}

			setState(153);
			table_name();
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

	public static class Insert_clauseContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(MySQLParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLParser.VALUES, 0); }
		public List_valuesContext list_values() {
			return getRuleContext(List_valuesContext.class,0);
		}
		public Insert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterInsert_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitInsert_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitInsert_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_clauseContext insert_clause() throws RecognitionException {
		Insert_clauseContext _localctx = new Insert_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(INSERT);
			setState(156);
			match(INTO);
			setState(157);
			table_name();
			setState(158);
			column_list();
			setState(159);
			match(VALUES);
			setState(160);
			list_values();
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

	public static class List_valuesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public List_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterList_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitList_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitList_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valuesContext list_values() throws RecognitionException {
		List_valuesContext _localctx = new List_valuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LPAREN);
			setState(163);
			expression();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				expression();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RPAREN);
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

	public static class Update_clauseContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySQLParser.SET, 0); }
		public Column_list_assignmentContext column_list_assignment() {
			return getRuleContext(Column_list_assignmentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterUpdate_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitUpdate_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitUpdate_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_clauseContext update_clause() throws RecognitionException {
		Update_clauseContext _localctx = new Update_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_update_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(UPDATE);
			setState(174);
			table_name();
			setState(175);
			match(SET);
			setState(176);
			column_list_assignment();
			setState(178);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(177);
				where_clause();
				}
			}

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

	public static class Column_list_assignmentContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<Column_assignmentContext> column_assignment() {
			return getRuleContexts(Column_assignmentContext.class);
		}
		public Column_assignmentContext column_assignment(int i) {
			return getRuleContext(Column_assignmentContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_list_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_assignmentContext column_list_assignment() throws RecognitionException {
		Column_list_assignmentContext _localctx = new Column_list_assignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_list_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LPAREN);
			setState(181);
			column_assignment();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				column_assignment();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(RPAREN);
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

	public static class Column_assignmentContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_assignmentContext column_assignment() throws RecognitionException {
		Column_assignmentContext _localctx = new Column_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			column_name();
			setState(192);
			match(EQ);
			setState(193);
			expression();
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

	public static class Delete_clauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterDelete_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitDelete_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitDelete_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_clauseContext delete_clause() throws RecognitionException {
		Delete_clauseContext _localctx = new Delete_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(DELETE);
			setState(196);
			match(FROM);
			setState(197);
			table_name();
			setState(198);
			where_clause();
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

	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
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

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public Column_list_clauseContext column_list_clause() {
			return getRuleContext(Column_list_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSelect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(SELECT);
			setState(203);
			column_list_clause();
			setState(206);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(204);
				match(FROM);
				setState(205);
				table_references();
				}
			}

			setState(209);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(208);
				where_clause();
				}
			}

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

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
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

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
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

	public static class Column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MySQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MySQLParser.DOT, i);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_column_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					match(ID);
					setState(216);
					match(DOT);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(222);
			match(ID);
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

	public static class Column_name_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Column_name_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_name_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_name_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_name_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_aliasContext column_name_alias() throws RecognitionException {
		Column_name_aliasContext _localctx = new Column_name_aliasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_column_name_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
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

	public static class Index_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
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

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LPAREN);
			setState(229);
			column_name();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				column_name();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(RPAREN);
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

	public static class Column_list_clauseContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitColumn_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_clauseContext column_list_clause() throws RecognitionException {
		Column_list_clauseContext _localctx = new Column_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			column_name();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				column_name();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(FROM);
			setState(248);
			table_name();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				table_name();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Select_keyContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public Select_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelect_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelect_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSelect_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_keyContext select_key() throws RecognitionException {
		Select_keyContext _localctx = new Select_keyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_select_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(SELECT);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(WHERE);
			setState(259);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			expr(0);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
				{
				{
				setState(262);
				expr_op();
				setState(263);
				expr(0);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode RES() { return getToken(MySQLParser.RES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public TerminalNode SUM() { return getToken(MySQLParser.SUM, 0); }
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(271);
				match(RES);
				setState(272);
				expr(4);
				}
				break;
			case 2:
				{
				setState(273);
				element();
				}
				break;
			case 3:
				{
				setState(274);
				match(LPAREN);
				setState(275);
				expr(0);
				setState(276);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(278);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(282);
						mul_op();
						setState(283);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(286);
						match(SUM);
						setState(287);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(289);
						match(RES);
						setState(290);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						relational_op();
						setState(293);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MySQLParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_element);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				column_name();
				}
				break;
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

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(MySQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(MySQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MySQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRelational_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (EQ - 58)) | (1L << (LTH - 58)) | (1L << (GTH - 58)) | (1L << (NOT_EQ - 58)) | (1L << (LET - 58)) | (1L << (GET - 58)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Expr_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitExpr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Mul_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MySQLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MySQLParser.DIV, 0); }
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitMul_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitMul_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterBetween_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitBetween_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitBetween_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(BETWEEN);
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

	public static class Is_or_is_notContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIs_or_is_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIs_or_is_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIs_or_is_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_is_or_is_not);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(IS);
				setState(317);
				match(NOT);
				}
				break;
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

	public static class Table_referencesContext extends ParserRuleContext {
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_references(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_table_references);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3\6\7\6t\n\6\f\6"+
		"\16\6w\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\7\b\u0081\n\b\f\b\16\b\u0084"+
		"\13\b\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a9\n\16\f\16\16\16\u00ac"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\20\3\20\3"+
		"\20\3\20\7\20\u00bb\n\20\f\20\16\20\u00be\13\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00d1"+
		"\n\24\3\24\5\24\u00d4\n\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00dc\n"+
		"\27\f\27\16\27\u00df\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\7\32\u00eb\n\32\f\32\16\32\u00ee\13\32\3\32\3\32\3\33\3\33\3\33"+
		"\7\33\u00f5\n\33\f\33\16\33\u00f8\13\33\3\34\3\34\3\34\3\34\7\34\u00fe"+
		"\n\34\f\34\16\34\u0101\13\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\7\37\u010c\n\37\f\37\16\37\u010f\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\5 \u011a\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u012a\n \f "+
		"\16 \u012d\13 \3!\3!\3!\3!\3!\5!\u0134\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\5&\u0141\n&\3\'\3\'\3\'\2\3>(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\4\2<?AB\4\2\30\32@@\3\2&\'"+
		"\u0144\2O\3\2\2\2\4Y\3\2\2\2\6[\3\2\2\2\bm\3\2\2\2\no\3\2\2\2\f{\3\2\2"+
		"\2\16\u0082\3\2\2\2\20\u0089\3\2\2\2\22\u008e\3\2\2\2\24\u0091\3\2\2\2"+
		"\26\u0095\3\2\2\2\30\u009d\3\2\2\2\32\u00a4\3\2\2\2\34\u00af\3\2\2\2\36"+
		"\u00b6\3\2\2\2 \u00c1\3\2\2\2\"\u00c5\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3"+
		"\2\2\2(\u00d5\3\2\2\2*\u00d7\3\2\2\2,\u00dd\3\2\2\2.\u00e2\3\2\2\2\60"+
		"\u00e4\3\2\2\2\62\u00e6\3\2\2\2\64\u00f1\3\2\2\2\66\u00f9\3\2\2\28\u0102"+
		"\3\2\2\2:\u0104\3\2\2\2<\u0107\3\2\2\2>\u0119\3\2\2\2@\u0133\3\2\2\2B"+
		"\u0135\3\2\2\2D\u0137\3\2\2\2F\u0139\3\2\2\2H\u013b\3\2\2\2J\u0140\3\2"+
		"\2\2L\u0142\3\2\2\2NP\5\4\3\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"R\3\3\2\2\2SZ\5\6\4\2TZ\5\26\f\2UZ\5&\24\2VZ\5\30\r\2WZ\5\34\17\2XZ\5"+
		"\"\22\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\5"+
		"\3\2\2\2[\\\7\3\2\2\\`\7\4\2\2]^\7\5\2\2^_\7@\2\2_a\7\37\2\2`]\3\2\2\2"+
		"`a\3\2\2\2ab\3\2\2\2bc\5(\25\2cd\5\n\6\2d\7\3\2\2\2en\7\6\2\2fn\7\7\2"+
		"\2gn\7\b\2\2hi\7\t\2\2ij\7\67\2\2jk\7Y\2\2kn\7\66\2\2ln\7\n\2\2me\3\2"+
		"\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2ml\3\2\2\2n\t\3\2\2\2op\7\67\2\2pu\5"+
		"\f\7\2qr\7D\2\2rt\5\f\7\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3"+
		"\2\2\2wu\3\2\2\2xy\5\22\n\2yz\7\66\2\2z\13\3\2\2\2{|\5,\27\2|}\5\b\5\2"+
		"}~\5\16\b\2~\r\3\2\2\2\177\u0081\5\20\t\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7@\2\2\u0086\u008a\7\34\2\2\u0087\u0088\7\f"+
		"\2\2\u0088\u008a\7\r\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\21\3\2\2\2\u008b\u008d\5\24\13\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u0093\7M\2\2\u0093\u0094\5\62\32\2"+
		"\u0094\25\3\2\2\2\u0095\u0096\7\16\2\2\u0096\u0099\7\4\2\2\u0097\u0098"+
		"\7\5\2\2\u0098\u009a\7\37\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\5(\25\2\u009c\27\3\2\2\2\u009d\u009e"+
		"\7\17\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\5(\25\2\u00a0\u00a1\5\62\32"+
		"\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5\32\16\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7\67\2\2\u00a5\u00aa\5<\37\2\u00a6\u00a7\7D\2\2\u00a7\u00a9\5<\37\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\66\2\2\u00ae"+
		"\33\3\2\2\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\7\23"+
		"\2\2\u00b2\u00b4\5\36\20\2\u00b3\u00b5\5:\36\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\7\67\2\2\u00b7\u00bc\5 \21"+
		"\2\u00b8\u00b9\7D\2\2\u00b9\u00bb\5 \21\2\u00ba\u00b8\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7\66\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\5,\27"+
		"\2\u00c2\u00c3\7<\2\2\u00c3\u00c4\5<\37\2\u00c4!\3\2\2\2\u00c5\u00c6\7"+
		"\24\2\2\u00c6\u00c7\7\26\2\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\5:\36\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cb\7X\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7\25\2\2\u00cd"+
		"\u00d0\5\64\33\2\u00ce\u00cf\7\26\2\2\u00cf\u00d1\5L\'\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\5:\36\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7X\2\2"+
		"\u00d6)\3\2\2\2\u00d7\u00d8\7X\2\2\u00d8+\3\2\2\2\u00d9\u00da\7X\2\2\u00da"+
		"\u00dc\7E\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7X\2\2\u00e1-\3\2\2\2\u00e2\u00e3\7X\2\2\u00e3/\3\2\2\2\u00e4\u00e5"+
		"\7X\2\2\u00e5\61\3\2\2\2\u00e6\u00e7\7\67\2\2\u00e7\u00ec\5,\27\2\u00e8"+
		"\u00e9\7D\2\2\u00e9\u00eb\5,\27\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f0\7\66\2\2\u00f0\63\3\2\2\2\u00f1\u00f6\5,\27"+
		"\2\u00f2\u00f3\7D\2\2\u00f3\u00f5\5,\27\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\65\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7\26\2\2\u00fa\u00ff\5(\25\2\u00fb\u00fc\7"+
		"D\2\2\u00fc\u00fe\5(\25\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\67\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0103\7\25\2\2\u01039\3\2\2\2\u0104\u0105\7\27\2\2\u0105\u0106"+
		"\5<\37\2\u0106;\3\2\2\2\u0107\u010d\5> \2\u0108\u0109\5D#\2\u0109\u010a"+
		"\5> \2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e=\3\2\2\2\u010f\u010d\3\2\2\2"+
		"\u0110\u0111\b \1\2\u0111\u0112\7%\2\2\u0112\u011a\5> \6\u0113\u011a\5"+
		"@!\2\u0114\u0115\7\67\2\2\u0115\u0116\5> \2\u0116\u0117\7\66\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u011a\7X\2\2\u0119\u0110\3\2\2\2\u0119\u0113\3\2"+
		"\2\2\u0119\u0114\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u012b\3\2\2\2\u011b"+
		"\u011c\f\t\2\2\u011c\u011d\5F$\2\u011d\u011e\5> \n\u011e\u012a\3\2\2\2"+
		"\u011f\u0120\f\b\2\2\u0120\u0121\7$\2\2\u0121\u012a\5> \t\u0122\u0123"+
		"\f\7\2\2\u0123\u0124\7%\2\2\u0124\u012a\5> \b\u0125\u0126\f\5\2\2\u0126"+
		"\u0127\5B\"\2\u0127\u0128\5> \6\u0128\u012a\3\2\2\2\u0129\u011b\3\2\2"+
		"\2\u0129\u011f\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0125\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c?\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0134\7X\2\2\u012f\u0134\7Y\2\2\u0130\u0134\7Z\2"+
		"\2\u0131\u0134\7[\2\2\u0132\u0134\5,\27\2\u0133\u012e\3\2\2\2\u0133\u012f"+
		"\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"A\3\2\2\2\u0135\u0136\t\2\2\2\u0136C\3\2\2\2\u0137\u0138\t\3\2\2\u0138"+
		"E\3\2\2\2\u0139\u013a\t\4\2\2\u013aG\3\2\2\2\u013b\u013c\7)\2\2\u013c"+
		"I\3\2\2\2\u013d\u0141\7\33\2\2\u013e\u013f\7\33\2\2\u013f\u0141\7@\2\2"+
		"\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0141K\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143M\3\2\2\2\32QY`mu\u0082\u0089\u008e\u0099\u00aa\u00b4\u00bc"+
		"\u00d0\u00d3\u00dd\u00ec\u00f6\u00ff\u010d\u0119\u0129\u012b\u0133\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}