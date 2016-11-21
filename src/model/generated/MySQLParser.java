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
		ANY=31, TRUE=32, FALSE=33, DIVIDE=34, MOD=35, BETWEEN=36, REGEXP=37, PLUS=38, 
		MINUS=39, NEGATION=40, VERTBAR=41, BITAND=42, POWER_OP=43, BINARY=44, 
		SHIFT_LEFT=45, SHIFT_RIGHT=46, ESCAPE=47, ASTERISK=48, RPAREN=49, LPAREN=50, 
		RBRACK=51, LBRACK=52, COLON=53, ALL_FIELDS=54, EQ=55, LTH=56, GTH=57, 
		NOT_EQ=58, NOT=59, LET=60, GET=61, SEMI=62, COMMA=63, DOT=64, COLLATE=65, 
		INNER=66, OUTER=67, JOIN=68, CROSS=69, USING=70, INDEX=71, KEY=72, ORDER=73, 
		GROUP=74, BY=75, FOR=76, USE=77, IGNORE=78, PARTITION=79, STRAIGHT_JOIN=80, 
		NATURAL=81, LEFT=82, RIGHT=83, OJ=84, ON=85, ID=86, INT=87, NEWLINE=88, 
		WS=89, USER_VAR=90;
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
		RULE_element = 30, RULE_right_element = 31, RULE_left_element = 32, RULE_target_element = 33, 
		RULE_relational_op = 34, RULE_expr_op = 35, RULE_between_op = 36, RULE_is_or_is_not = 37, 
		RULE_simple_expression = 38, RULE_table_references = 39, RULE_table_reference = 40, 
		RULE_table_factor1 = 41, RULE_table_factor2 = 42, RULE_table_factor3 = 43, 
		RULE_table_factor4 = 44, RULE_table_atom = 45, RULE_join_clause = 46, 
		RULE_join_condition = 47, RULE_index_hint_list = 48, RULE_index_options = 49, 
		RULE_index_hint = 50, RULE_index_list = 51, RULE_partition_clause = 52, 
		RULE_partition_names = 53, RULE_partition_name = 54, RULE_subquery_alias = 55, 
		RULE_subquery = 56;
	public static final String[] ruleNames = {
		"commands", "stat", "create_clause", "data_type", "column_list_definition", 
		"column_definition", "column_list_attributes", "column_attribute", "table_list_constraints", 
		"table_constraint", "drop_table_clause", "insert_clause", "list_values", 
		"update_clause", "column_list_assignment", "column_assignment", "delete_clause", 
		"schema_name", "select_clause", "table_name", "table_alias", "column_name", 
		"column_name_alias", "index_name", "column_list", "column_list_clause", 
		"from_clause", "select_key", "where_clause", "expression", "element", 
		"right_element", "left_element", "target_element", "relational_op", "expr_op", 
		"between_op", "is_or_is_not", "simple_expression", "table_references", 
		"table_reference", "table_factor1", "table_factor2", "table_factor3", 
		"table_factor4", "table_atom", "join_clause", "join_condition", "index_hint_list", 
		"index_options", "index_hint", "index_list", "partition_clause", "partition_names", 
		"partition_name", "subquery_alias", "subquery"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'create'", "'table'", "'if'", "'int'", "'double'", "'date'", "'varchar'", 
		"'blob'", "'primary'", "'auto'", "'increment'", "'drop'", "'insert'", 
		"'into'", "'values'", "'update'", "'set'", "'delete'", "'select'", "'from'", 
		"'where'", null, null, "'xor'", "'is'", "'null'", "'like'", "'in'", "'exists'", 
		"'all'", "'any'", "'true'", "'false'", null, null, "'between'", "'regexp'", 
		"'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'binary'", "'<<'", "'>>'", 
		"'escape'", "'*'", "')'", "'('", "']'", "'['", "':'", "'.*'", "'='", "'<'", 
		"'>'", "'!='", "'not'", "'<='", "'>='", "';'", "','", "'.'", "'collate'", 
		"'inner'", "'outer'", "'join'", "'cross'", "'using'", "'index'", "'key'", 
		"'order'", "'group'", "'by'", "'for'", "'use'", "'ignore'", "'partition'", 
		"'straight_join'", "'natural'", "'left'", "'right'", "'oj'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "IF", "INT_DT", "DOUBLE_DT", "DATE_DT", "VARCHAR_DT", 
		"BLOB_DT", "PRIMARY", "AUTO", "INCREMENT", "DROP", "INSERT", "INTO", "VALUES", 
		"UPDATE", "SET", "DELETE", "SELECT", "FROM", "WHERE", "AND", "OR", "XOR", 
		"IS", "NULL", "LIKE", "IN", "EXISTS", "ALL", "ANY", "TRUE", "FALSE", "DIVIDE", 
		"MOD", "BETWEEN", "REGEXP", "PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", 
		"POWER_OP", "BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", "ESCAPE", "ASTERISK", 
		"RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", 
		"GTH", "NOT_EQ", "NOT", "LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", 
		"INNER", "OUTER", "JOIN", "CROSS", "USING", "INDEX", "KEY", "ORDER", "GROUP", 
		"BY", "FOR", "USE", "IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", 
		"LEFT", "RIGHT", "OJ", "ON", "ID", "INT", "NEWLINE", "WS", "USER_VAR"
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
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				stat();
				}
				}
				setState(117); 
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
			setState(125);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				create_clause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				drop_table_clause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				select_clause();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				insert_clause();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				update_clause();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
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
			setState(127);
			match(CREATE);
			setState(128);
			match(TABLE);
			setState(132);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(129);
				match(IF);
				setState(130);
				match(NOT);
				setState(131);
				match(EXISTS);
				}
			}

			setState(134);
			table_name();
			setState(135);
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
			setState(145);
			switch (_input.LA(1)) {
			case INT_DT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(INT_DT);
				}
				break;
			case DOUBLE_DT:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(DOUBLE_DT);
				}
				break;
			case DATE_DT:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(DATE_DT);
				}
				break;
			case VARCHAR_DT:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(VARCHAR_DT);
				setState(141);
				match(LPAREN);
				setState(142);
				match(INT);
				setState(143);
				match(RPAREN);
				}
				break;
			case BLOB_DT:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
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
			setState(147);
			match(LPAREN);
			setState(148);
			column_definition();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				column_definition();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			table_list_constraints();
			setState(157);
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
			setState(159);
			column_name();
			setState(160);
			data_type();
			setState(161);
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
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AUTO || _la==NOT) {
				{
				{
				setState(163);
				column_attribute();
				}
				}
				setState(168);
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
			setState(173);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(NOT);
				setState(170);
				match(NULL);
				}
				break;
			case AUTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(AUTO);
				setState(172);
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMARY) {
				{
				{
				setState(175);
				table_constraint();
				}
				}
				setState(180);
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
			setState(181);
			match(PRIMARY);
			setState(182);
			match(KEY);
			setState(183);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DROP);
			setState(186);
			match(TABLE);
			setState(187);
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
			setState(189);
			match(INSERT);
			setState(190);
			match(INTO);
			setState(191);
			table_name();
			setState(192);
			column_list();
			setState(193);
			match(VALUES);
			setState(194);
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
			setState(196);
			match(LPAREN);
			setState(197);
			expression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				expression();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
			setState(207);
			match(UPDATE);
			setState(208);
			table_name();
			setState(209);
			match(SET);
			setState(210);
			column_list_assignment();
			setState(212);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(211);
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
			setState(214);
			match(LPAREN);
			setState(215);
			column_assignment();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				column_assignment();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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
			setState(225);
			column_name();
			setState(226);
			match(EQ);
			setState(227);
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
			setState(229);
			match(DELETE);
			setState(230);
			match(FROM);
			setState(231);
			table_name();
			setState(232);
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
			setState(234);
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
			setState(236);
			match(SELECT);
			setState(237);
			column_list_clause();
			setState(240);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(238);
				match(FROM);
				setState(239);
				table_references();
				}
			}

			setState(243);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(242);
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
			setState(245);
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
			setState(247);
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
		public Column_name_aliasContext column_name_alias() {
			return getRuleContext(Column_name_aliasContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode USER_VAR() { return getToken(MySQLParser.USER_VAR, 0); }
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
		int _la;
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(252);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(249);
						schema_name();
						setState(250);
						match(DOT);
						}
						break;
					}
					setState(254);
					match(ID);
					setState(255);
					match(DOT);
					}
					break;
				}
				setState(258);
				match(ID);
				setState(260);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(259);
					column_name_alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(262);
					table_alias();
					setState(263);
					match(DOT);
					}
					break;
				}
				setState(267);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(USER_VAR);
				setState(270);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(269);
					column_name_alias();
					}
				}

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
			setState(274);
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
			setState(276);
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
			setState(278);
			match(LPAREN);
			setState(279);
			column_name();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				column_name();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
			setState(289);
			column_name();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				setState(291);
				column_name();
				}
				}
				setState(296);
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
			setState(297);
			match(FROM);
			setState(298);
			table_name();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				table_name();
				}
				}
				setState(305);
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
			setState(306);
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
			setState(308);
			match(WHERE);
			setState(309);
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
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			simple_expression();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					expr_op();
					setState(313);
					simple_expression();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode USER_VAR() { return getToken(MySQLParser.USER_VAR, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
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
		enterRule(_localctx, 60, RULE_element);
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(USER_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(322);
				match(VERTBAR);
				setState(323);
				match(ID);
				setState(324);
				match(VERTBAR);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
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

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRight_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRight_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			element();
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

	public static class Left_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterLeft_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitLeft_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			element();
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

	public static class Target_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Target_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTarget_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTarget_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTarget_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_elementContext target_element() throws RecognitionException {
		Target_elementContext _localctx = new Target_elementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_target_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			element();
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
		enterRule(_localctx, 68, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		enterRule(_localctx, 72, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 74, RULE_is_or_is_not);
		try {
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(IS);
				setState(343);
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simple_expression);
		try {
			setState(360);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				left_element();
				setState(347);
				relational_op();
				setState(348);
				right_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				target_element();
				setState(351);
				between_op();
				setState(352);
				left_element();
				setState(353);
				match(AND);
				setState(354);
				right_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				target_element();
				setState(357);
				is_or_is_not();
				setState(358);
				match(NULL);
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
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
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
		enterRule(_localctx, 78, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			table_reference();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (COMMA - 63)) | (1L << (INNER - 63)) | (1L << (JOIN - 63)) | (1L << (CROSS - 63)) | (1L << (STRAIGHT_JOIN - 63)) | (1L << (NATURAL - 63)) | (1L << (LEFT - 63)) | (1L << (RIGHT - 63)))) != 0)) {
				{
				setState(366);
				switch (_input.LA(1)) {
				case COMMA:
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					table_reference();
					}
					}
					break;
				case INNER:
				case JOIN:
				case CROSS:
				case STRAIGHT_JOIN:
				case NATURAL:
				case LEFT:
				case RIGHT:
					{
					setState(365);
					join_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(370);
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

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factor1Context table_factor1() {
			return getRuleContext(Table_factor1Context.class,0);
		}
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_table_reference);
		try {
			setState(373);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				table_atom();
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

	public static class Table_factor1Context extends ParserRuleContext {
		public Table_factor2Context table_factor2() {
			return getRuleContext(Table_factor2Context.class,0);
		}
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public Table_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_factor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor1Context table_factor1() throws RecognitionException {
		Table_factor1Context _localctx = new Table_factor1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			table_factor2();
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(377);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(376);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(379);
				match(JOIN);
				setState(380);
				table_atom();
				setState(382);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(381);
					join_condition();
					}
					break;
				}
				}
				break;
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

	public static class Table_factor2Context extends ParserRuleContext {
		public Table_factor3Context table_factor3() {
			return getRuleContext(Table_factor3Context.class,0);
		}
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLParser.STRAIGHT_JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_factor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor2Context table_factor2() throws RecognitionException {
		Table_factor2Context _localctx = new Table_factor2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_table_factor2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			table_factor3();
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(387);
				match(STRAIGHT_JOIN);
				setState(388);
				table_atom();
				setState(391);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(389);
					match(ON);
					setState(390);
					expression();
					}
					break;
				}
				}
				break;
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

	public static class Table_factor3Context extends ParserRuleContext {
		public List<Table_factor4Context> table_factor4() {
			return getRuleContexts(Table_factor4Context.class);
		}
		public Table_factor4Context table_factor4(int i) {
			return getRuleContext(Table_factor4Context.class,i);
		}
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public Table_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_factor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor3Context table_factor3() throws RecognitionException {
		Table_factor3Context _localctx = new Table_factor3Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			table_factor4();
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(398);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(397);
					match(OUTER);
					}
				}

				setState(400);
				match(JOIN);
				setState(401);
				table_factor4();
				setState(402);
				join_condition();
				}
				break;
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

	public static class Table_factor4Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public Table_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_factor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor4Context table_factor4() throws RecognitionException {
		Table_factor4Context _localctx = new Table_factor4Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_table_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			table_atom();
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(407);
				match(NATURAL);
				setState(412);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(408);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(410);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(409);
						match(OUTER);
						}
					}

					}
				}

				setState(414);
				match(JOIN);
				setState(415);
				table_atom();
				}
				break;
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

	public static class Table_atomContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Index_hint_listContext index_hint_list() {
			return getRuleContext(Index_hint_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_aliasContext subquery_alias() {
			return getRuleContext(Subquery_aliasContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode OJ() { return getToken(MySQLParser.OJ, 0); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitTable_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_table_atom);
		int _la;
		try {
			setState(444);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(418);
				table_name();
				setState(420);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(419);
					partition_clause();
					}
				}

				setState(423);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(422);
					table_alias();
					}
				}

				setState(426);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(425);
					index_hint_list();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(428);
				subquery();
				setState(429);
				subquery_alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(431);
				match(LPAREN);
				setState(432);
				table_references();
				setState(433);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(435);
				match(OJ);
				setState(436);
				table_reference();
				setState(437);
				match(LEFT);
				setState(438);
				match(OUTER);
				setState(439);
				match(JOIN);
				setState(440);
				table_reference();
				setState(441);
				match(ON);
				setState(442);
				expression();
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLParser.STRAIGHT_JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_factor4Context table_factor4() {
			return getRuleContext(Table_factor4Context.class,0);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_join_clause);
		int _la;
		try {
			setState(477);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(447);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(446);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(449);
				match(JOIN);
				setState(450);
				table_atom();
				setState(452);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(451);
					join_condition();
					}
				}

				}
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(454);
				match(STRAIGHT_JOIN);
				setState(455);
				table_atom();
				setState(458);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(456);
					match(ON);
					setState(457);
					expression();
					}
				}

				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(460);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(462);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(461);
					match(OUTER);
					}
				}

				setState(464);
				match(JOIN);
				setState(465);
				table_factor4();
				setState(466);
				join_condition();
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(468);
				match(NATURAL);
				setState(473);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(469);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(471);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(470);
						match(OUTER);
						}
					}

					}
				}

				setState(475);
				match(JOIN);
				setState(476);
				table_atom();
				}
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

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public TerminalNode USING() { return getToken(MySQLParser.USING, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoin_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_join_condition);
		int _la;
		try {
			setState(491);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(479);
				match(ON);
				setState(480);
				expression();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
					{
					{
					setState(481);
					expr_op();
					setState(482);
					expression();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(489);
				match(USING);
				setState(490);
				column_list();
				}
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

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_hint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_hint_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_hint_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			index_hint();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					match(COMMA);
					setState(495);
					index_hint();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MySQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(510);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(502);
				match(FOR);
				setState(508);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(503);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(504);
					match(ORDER);
					setState(505);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(506);
					match(GROUP);
					setState(507);
					match(BY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLParser.USE, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(MySQLParser.IGNORE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_index_hint);
		int _la;
		try {
			setState(526);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(USE);
				setState(513);
				index_options();
				setState(514);
				match(LPAREN);
				setState(516);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(515);
					index_list();
					}
				}

				setState(518);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(IGNORE);
				setState(521);
				index_options();
				setState(522);
				match(LPAREN);
				setState(523);
				index_list();
				setState(524);
				match(RPAREN);
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

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitIndex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			index_name();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				index_name();
				}
				}
				setState(535);
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

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(PARTITION);
			setState(537);
			match(LPAREN);
			setState(538);
			partition_names();
			setState(539);
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

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartition_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			partition_name();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(542);
				match(COMMA);
				setState(543);
				partition_name();
				}
				}
				setState(548);
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

	public static class Partition_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitPartition_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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

	public static class Subquery_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Subquery_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubquery_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubquery_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubquery_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_aliasContext subquery_alias() throws RecognitionException {
		Subquery_aliasContext _localctx = new Subquery_aliasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_subquery_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(LPAREN);
			setState(554);
			select_clause();
			setState(555);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\\\u0230\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\6\2v\n\2\r\2\16"+
		"\2w\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0080\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u0087"+
		"\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0094\n\5\3\6\3\6"+
		"\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3"+
		"\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00cb\n\16\f\16"+
		"\16\16\u00ce\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d7\n\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00f3\n\24\3\24\5\24\u00f6\n\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\5\27\u00ff\n\27\3\27\3\27\5\27\u0103\n\27\3\27\3\27\5\27\u0107"+
		"\n\27\3\27\3\27\3\27\5\27\u010c\n\27\3\27\3\27\3\27\5\27\u0111\n\27\5"+
		"\27\u0113\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u011d\n\32"+
		"\f\32\16\32\u0120\13\32\3\32\3\32\3\33\3\33\3\33\7\33\u0127\n\33\f\33"+
		"\16\33\u012a\13\33\3\34\3\34\3\34\3\34\7\34\u0130\n\34\f\34\16\34\u0133"+
		"\13\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u013e\n\37\f"+
		"\37\16\37\u0141\13\37\3 \3 \3 \3 \3 \3 \3 \5 \u014a\n \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u015b\n\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\5(\u016b\n(\3)\3)\3)\3)\7)\u0171\n)\f)\16)\u0174"+
		"\13)\3*\3*\5*\u0178\n*\3+\3+\5+\u017c\n+\3+\3+\3+\5+\u0181\n+\5+\u0183"+
		"\n+\3,\3,\3,\3,\3,\5,\u018a\n,\5,\u018c\n,\3-\3-\3-\5-\u0191\n-\3-\3-"+
		"\3-\3-\5-\u0197\n-\3.\3.\3.\3.\5.\u019d\n.\5.\u019f\n.\3.\3.\5.\u01a3"+
		"\n.\3/\3/\5/\u01a7\n/\3/\5/\u01aa\n/\3/\5/\u01ad\n/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01bf\n/\3\60\5\60\u01c2\n\60\3\60\3"+
		"\60\3\60\5\60\u01c7\n\60\3\60\3\60\3\60\3\60\5\60\u01cd\n\60\3\60\3\60"+
		"\5\60\u01d1\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01da\n\60\5"+
		"\60\u01dc\n\60\3\60\3\60\5\60\u01e0\n\60\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u01e7\n\61\f\61\16\61\u01ea\13\61\3\61\3\61\5\61\u01ee\n\61\3\62\3\62"+
		"\3\62\7\62\u01f3\n\62\f\62\16\62\u01f6\13\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u01ff\n\63\5\63\u0201\n\63\3\64\3\64\3\64\3\64\5\64\u0207"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0211\n\64\3\65\3\65"+
		"\3\65\7\65\u0216\n\65\f\65\16\65\u0219\13\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\7\67\u0223\n\67\f\67\16\67\u0226\13\67\38\38\39\39\3:"+
		"\3:\3:\3:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\7\4\29<>?\4\2\30\32==\4\2DDGG"+
		"\3\2TU\3\2IJ\u0242\2u\3\2\2\2\4\177\3\2\2\2\6\u0081\3\2\2\2\b\u0093\3"+
		"\2\2\2\n\u0095\3\2\2\2\f\u00a1\3\2\2\2\16\u00a8\3\2\2\2\20\u00af\3\2\2"+
		"\2\22\u00b4\3\2\2\2\24\u00b7\3\2\2\2\26\u00bb\3\2\2\2\30\u00bf\3\2\2\2"+
		"\32\u00c6\3\2\2\2\34\u00d1\3\2\2\2\36\u00d8\3\2\2\2 \u00e3\3\2\2\2\"\u00e7"+
		"\3\2\2\2$\u00ec\3\2\2\2&\u00ee\3\2\2\2(\u00f7\3\2\2\2*\u00f9\3\2\2\2,"+
		"\u0112\3\2\2\2.\u0114\3\2\2\2\60\u0116\3\2\2\2\62\u0118\3\2\2\2\64\u0123"+
		"\3\2\2\2\66\u012b\3\2\2\28\u0134\3\2\2\2:\u0136\3\2\2\2<\u0139\3\2\2\2"+
		">\u0149\3\2\2\2@\u014b\3\2\2\2B\u014d\3\2\2\2D\u014f\3\2\2\2F\u0151\3"+
		"\2\2\2H\u0153\3\2\2\2J\u0155\3\2\2\2L\u015a\3\2\2\2N\u016a\3\2\2\2P\u016c"+
		"\3\2\2\2R\u0177\3\2\2\2T\u0179\3\2\2\2V\u0184\3\2\2\2X\u018d\3\2\2\2Z"+
		"\u0198\3\2\2\2\\\u01be\3\2\2\2^\u01df\3\2\2\2`\u01ed\3\2\2\2b\u01ef\3"+
		"\2\2\2d\u01f7\3\2\2\2f\u0210\3\2\2\2h\u0212\3\2\2\2j\u021a\3\2\2\2l\u021f"+
		"\3\2\2\2n\u0227\3\2\2\2p\u0229\3\2\2\2r\u022b\3\2\2\2tv\5\4\3\2ut\3\2"+
		"\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\3\3\2\2\2y\u0080\5\6\4\2z\u0080\5"+
		"\26\f\2{\u0080\5&\24\2|\u0080\5\30\r\2}\u0080\5\34\17\2~\u0080\5\"\22"+
		"\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\5\3\2\2\2\u0081\u0082\7\3\2\2\u0082\u0086\7\4\2\2\u0083"+
		"\u0084\7\5\2\2\u0084\u0085\7=\2\2\u0085\u0087\7\37\2\2\u0086\u0083\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5(\25\2\u0089"+
		"\u008a\5\n\6\2\u008a\7\3\2\2\2\u008b\u0094\7\6\2\2\u008c\u0094\7\7\2\2"+
		"\u008d\u0094\7\b\2\2\u008e\u008f\7\t\2\2\u008f\u0090\7\64\2\2\u0090\u0091"+
		"\7Y\2\2\u0091\u0094\7\63\2\2\u0092\u0094\7\n\2\2\u0093\u008b\3\2\2\2\u0093"+
		"\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\t\3\2\2\2\u0095\u0096\7\64\2\2\u0096\u009b\5\f\7\2\u0097\u0098"+
		"\7A\2\2\u0098\u009a\5\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7\63\2\2\u00a0\13\3\2\2\2\u00a1"+
		"\u00a2\5,\27\2\u00a2\u00a3\5\b\5\2\u00a3\u00a4\5\16\b\2\u00a4\r\3\2\2"+
		"\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ac\7=\2\2\u00ac\u00b0\7\34\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00b0"+
		"\7\r\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\21\3\2\2\2\u00b1"+
		"\u00b3\5\24\13\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\23\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b8\7\13\2\2\u00b8\u00b9\7J\2\2\u00b9\u00ba\5\62\32\2\u00ba\25\3\2"+
		"\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\5(\25\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\7\20\2\2\u00c1\u00c2\5(\25"+
		"\2\u00c2\u00c3\5\62\32\2\u00c3\u00c4\7\21\2\2\u00c4\u00c5\5\32\16\2\u00c5"+
		"\31\3\2\2\2\u00c6\u00c7\7\64\2\2\u00c7\u00cc\5<\37\2\u00c8\u00c9\7A\2"+
		"\2\u00c9\u00cb\5<\37\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\63\2\2\u00d0\33\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5(\25"+
		"\2\u00d3\u00d4\7\23\2\2\u00d4\u00d6\5\36\20\2\u00d5\u00d7\5:\36\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00d9\7\64\2"+
		"\2\u00d9\u00de\5 \21\2\u00da\u00db\7A\2\2\u00db\u00dd\5 \21\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\63\2\2\u00e2\37\3\2\2"+
		"\2\u00e3\u00e4\5,\27\2\u00e4\u00e5\79\2\2\u00e5\u00e6\5<\37\2\u00e6!\3"+
		"\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9\7\26\2\2\u00e9\u00ea\5(\25\2\u00ea"+
		"\u00eb\5:\36\2\u00eb#\3\2\2\2\u00ec\u00ed\7X\2\2\u00ed%\3\2\2\2\u00ee"+
		"\u00ef\7\25\2\2\u00ef\u00f2\5\64\33\2\u00f0\u00f1\7\26\2\2\u00f1\u00f3"+
		"\5P)\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f6\5:\36\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\'\3\2\2\2"+
		"\u00f7\u00f8\7X\2\2\u00f8)\3\2\2\2\u00f9\u00fa\7X\2\2\u00fa+\3\2\2\2\u00fb"+
		"\u00fc\5$\23\2\u00fc\u00fd\7B\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7X\2\2\u0101"+
		"\u0103\7B\2\2\u0102\u00fe\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\7X\2\2\u0105\u0107\5.\30\2\u0106\u0105\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0113\3\2\2\2\u0108\u0109\5*\26\2\u0109\u010a\7B"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0113\7X\2\2\u010e\u0110\7\\\2\2\u010f\u0111\5.\30"+
		"\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0102"+
		"\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010e\3\2\2\2\u0113-\3\2\2\2\u0114"+
		"\u0115\7X\2\2\u0115/\3\2\2\2\u0116\u0117\7X\2\2\u0117\61\3\2\2\2\u0118"+
		"\u0119\7\64\2\2\u0119\u011e\5,\27\2\u011a\u011b\7A\2\2\u011b\u011d\5,"+
		"\27\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\63"+
		"\2\2\u0122\63\3\2\2\2\u0123\u0128\5,\27\2\u0124\u0125\7A\2\2\u0125\u0127"+
		"\5,\27\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\65\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\26\2"+
		"\2\u012c\u0131\5(\25\2\u012d\u012e\7A\2\2\u012e\u0130\5(\25\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\67\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\25\2\2\u01359\3\2\2\2\u0136"+
		"\u0137\7\27\2\2\u0137\u0138\5<\37\2\u0138;\3\2\2\2\u0139\u013f\5N(\2\u013a"+
		"\u013b\5H%\2\u013b\u013c\5N(\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140=\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0142\u014a\7\\\2\2\u0143\u014a\7X\2\2\u0144"+
		"\u0145\7+\2\2\u0145\u0146\7X\2\2\u0146\u014a\7+\2\2\u0147\u014a\7Y\2\2"+
		"\u0148\u014a\5,\27\2\u0149\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a?\3\2\2\2\u014b"+
		"\u014c\5> \2\u014cA\3\2\2\2\u014d\u014e\5> \2\u014eC\3\2\2\2\u014f\u0150"+
		"\5> \2\u0150E\3\2\2\2\u0151\u0152\t\2\2\2\u0152G\3\2\2\2\u0153\u0154\t"+
		"\3\2\2\u0154I\3\2\2\2\u0155\u0156\7&\2\2\u0156K\3\2\2\2\u0157\u015b\7"+
		"\33\2\2\u0158\u0159\7\33\2\2\u0159\u015b\7=\2\2\u015a\u0157\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015bM\3\2\2\2\u015c\u015d\5B\"\2\u015d\u015e\5F$\2\u015e"+
		"\u015f\5@!\2\u015f\u016b\3\2\2\2\u0160\u0161\5D#\2\u0161\u0162\5J&\2\u0162"+
		"\u0163\5B\"\2\u0163\u0164\7\30\2\2\u0164\u0165\5@!\2\u0165\u016b\3\2\2"+
		"\2\u0166\u0167\5D#\2\u0167\u0168\5L\'\2\u0168\u0169\7\34\2\2\u0169\u016b"+
		"\3\2\2\2\u016a\u015c\3\2\2\2\u016a\u0160\3\2\2\2\u016a\u0166\3\2\2\2\u016b"+
		"O\3\2\2\2\u016c\u0172\5R*\2\u016d\u016e\7A\2\2\u016e\u0171\5R*\2\u016f"+
		"\u0171\5^\60\2\u0170\u016d\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173Q\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0178\5T+\2\u0176\u0178\5\\/\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0176\3\2\2\2\u0178S\3\2\2\2\u0179\u0182\5V,\2\u017a\u017c\t\4\2\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7F"+
		"\2\2\u017e\u0180\5\\/\2\u017f\u0181\5`\61\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u017b\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183U\3\2\2\2\u0184\u018b\5X-\2\u0185\u0186\7R\2\2\u0186\u0189\5"+
		"\\/\2\u0187\u0188\7W\2\2\u0188\u018a\5<\37\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018cW\3\2\2\2\u018d\u0196\5Z.\2\u018e\u0190\t\5\2\2\u018f\u0191"+
		"\7E\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\7F\2\2\u0193\u0194\5Z.\2\u0194\u0195\5`\61\2\u0195\u0197\3\2\2"+
		"\2\u0196\u018e\3\2\2\2\u0196\u0197\3\2\2\2\u0197Y\3\2\2\2\u0198\u01a2"+
		"\5\\/\2\u0199\u019e\7S\2\2\u019a\u019c\t\5\2\2\u019b\u019d\7E\2\2\u019c"+
		"\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7F\2\2\u01a1"+
		"\u01a3\5\\/\2\u01a2\u0199\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3[\3\2\2\2\u01a4"+
		"\u01a6\5(\25\2\u01a5\u01a7\5j\66\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5*\26\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5b\62\2\u01ac\u01ab\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01bf\3\2\2\2\u01ae\u01af\5r:\2\u01af\u01b0"+
		"\5p9\2\u01b0\u01bf\3\2\2\2\u01b1\u01b2\7\64\2\2\u01b2\u01b3\5P)\2\u01b3"+
		"\u01b4\7\63\2\2\u01b4\u01bf\3\2\2\2\u01b5\u01b6\7V\2\2\u01b6\u01b7\5R"+
		"*\2\u01b7\u01b8\7T\2\2\u01b8\u01b9\7E\2\2\u01b9\u01ba\7F\2\2\u01ba\u01bb"+
		"\5R*\2\u01bb\u01bc\7W\2\2\u01bc\u01bd\5<\37\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01a4\3\2\2\2\u01be\u01ae\3\2\2\2\u01be\u01b1\3\2\2\2\u01be\u01b5\3\2"+
		"\2\2\u01bf]\3\2\2\2\u01c0\u01c2\t\4\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7F\2\2\u01c4\u01c6\5\\/\2\u01c5"+
		"\u01c7\5`\61\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01e0\3\2"+
		"\2\2\u01c8\u01c9\7R\2\2\u01c9\u01cc\5\\/\2\u01ca\u01cb\7W\2\2\u01cb\u01cd"+
		"\5<\37\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01e0\3\2\2\2\u01ce"+
		"\u01d0\t\5\2\2\u01cf\u01d1\7E\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7F\2\2\u01d3\u01d4\5Z.\2\u01d4\u01d5"+
		"\5`\61\2\u01d5\u01e0\3\2\2\2\u01d6\u01db\7S\2\2\u01d7\u01d9\t\5\2\2\u01d8"+
		"\u01da\7E\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2"+
		"\2\2\u01db\u01d7\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\7F\2\2\u01de\u01e0\5\\/\2\u01df\u01c1\3\2\2\2\u01df\u01c8\3\2\2"+
		"\2\u01df\u01ce\3\2\2\2\u01df\u01d6\3\2\2\2\u01e0_\3\2\2\2\u01e1\u01e2"+
		"\7W\2\2\u01e2\u01e8\5<\37\2\u01e3\u01e4\5H%\2\u01e4\u01e5\5<\37\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ee\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ec\7H\2\2\u01ec\u01ee\5\62\32\2\u01ed\u01e1\3\2\2\2\u01ed\u01eb\3"+
		"\2\2\2\u01eea\3\2\2\2\u01ef\u01f4\5f\64\2\u01f0\u01f1\7A\2\2\u01f1\u01f3"+
		"\5f\64\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5c\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u0200\t\6\2\2"+
		"\u01f8\u01fe\7N\2\2\u01f9\u01ff\7F\2\2\u01fa\u01fb\7K\2\2\u01fb\u01ff"+
		"\7M\2\2\u01fc\u01fd\7L\2\2\u01fd\u01ff\7M\2\2\u01fe\u01f9\3\2\2\2\u01fe"+
		"\u01fa\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01f8\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201e\3\2\2\2\u0202\u0203\7O\2\2\u0203\u0204"+
		"\5d\63\2\u0204\u0206\7\64\2\2\u0205\u0207\5h\65\2\u0206\u0205\3\2\2\2"+
		"\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7\63\2\2\u0209\u0211"+
		"\3\2\2\2\u020a\u020b\7P\2\2\u020b\u020c\5d\63\2\u020c\u020d\7\64\2\2\u020d"+
		"\u020e\5h\65\2\u020e\u020f\7\63\2\2\u020f\u0211\3\2\2\2\u0210\u0202\3"+
		"\2\2\2\u0210\u020a\3\2\2\2\u0211g\3\2\2\2\u0212\u0217\5\60\31\2\u0213"+
		"\u0214\7A\2\2\u0214\u0216\5\60\31\2\u0215\u0213\3\2\2\2\u0216\u0219\3"+
		"\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218i\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u021a\u021b\7Q\2\2\u021b\u021c\7\64\2\2\u021c\u021d\5l\67\2\u021d"+
		"\u021e\7\63\2\2\u021ek\3\2\2\2\u021f\u0224\5n8\2\u0220\u0221\7A\2\2\u0221"+
		"\u0223\5n8\2\u0222\u0220\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2"+
		"\2\u0224\u0225\3\2\2\2\u0225m\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228"+
		"\7X\2\2\u0228o\3\2\2\2\u0229\u022a\7X\2\2\u022aq\3\2\2\2\u022b\u022c\7"+
		"\64\2\2\u022c\u022d\5&\24\2\u022d\u022e\7\63\2\2\u022es\3\2\2\2=w\177"+
		"\u0086\u0093\u009b\u00a8\u00af\u00b4\u00cc\u00d6\u00de\u00f2\u00f5\u00fe"+
		"\u0102\u0106\u010b\u0110\u0112\u011e\u0128\u0131\u013f\u0149\u015a\u016a"+
		"\u0170\u0172\u0177\u017b\u0180\u0182\u0189\u018b\u0190\u0196\u019c\u019e"+
		"\u01a2\u01a6\u01a9\u01ac\u01be\u01c1\u01c6\u01cc\u01d0\u01d9\u01db\u01df"+
		"\u01e8\u01ed\u01f4\u01fe\u0200\u0206\u0210\u0217\u0224";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}