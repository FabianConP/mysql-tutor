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
		VALUES=15, UPDATE=16, SET=17, DELETE=18, AS=19, SELECT=20, FROM=21, WHERE=22, 
		AND=23, OR=24, XOR=25, IS=26, NULL=27, LIKE=28, IN=29, EXISTS=30, ALL=31, 
		ANY=32, TRUE=33, FALSE=34, SUM=35, RES=36, MUL=37, DIV=38, MOD=39, BETWEEN=40, 
		REGEXP=41, PLUS=42, MINUS=43, NEGATION=44, VERTBAR=45, BITAND=46, POWER_OP=47, 
		BINARY=48, SHIFT_LEFT=49, SHIFT_RIGHT=50, ESCAPE=51, RPAREN=52, LPAREN=53, 
		RBRACK=54, LBRACK=55, COLON=56, ALL_FIELDS=57, EQ=58, LTH=59, GTH=60, 
		NOT_EQ=61, NOT=62, LET=63, GET=64, SEMI=65, COMMA=66, DOT=67, COLLATE=68, 
		INNER=69, OUTER=70, JOIN=71, CROSS=72, USING=73, INDEX=74, KEY=75, ORDER=76, 
		GROUP=77, BY=78, FOR=79, USE=80, STRAIGHT_JOIN=81, NATURAL=82, LEFT=83, 
		RIGHT=84, SHOW=85, TABLES=86, ON=87, ID=88, LETTER=89, INT=90, DOUBLE=91, 
		STRING=92, NEWLINE=93, WS=94;
	public static final int
		RULE_commands = 0, RULE_stat = 1, RULE_create_clause = 2, RULE_data_type = 3, 
		RULE_column_list_definition = 4, RULE_column_definition = 5, RULE_column_list_attributes = 6, 
		RULE_column_attribute = 7, RULE_table_list_constraints = 8, RULE_table_constraint = 9, 
		RULE_drop_table_clause = 10, RULE_insert_clause = 11, RULE_list_values = 12, 
		RULE_update_clause = 13, RULE_column_list_assignment = 14, RULE_column_assignment = 15, 
		RULE_delete_clause = 16, RULE_schema_name = 17, RULE_select_clause = 18, 
		RULE_table_name = 19, RULE_table_alias = 20, RULE_column_name = 21, RULE_column_name_alias = 22, 
		RULE_column_list = 23, RULE_column_list_clause = 24, RULE_from_clause = 25, 
		RULE_select_key = 26, RULE_where_clause = 27, RULE_show_tables_clause = 28, 
		RULE_expression = 29, RULE_expr = 30, RULE_element = 31, RULE_relational_op = 32, 
		RULE_expr_op = 33, RULE_mul_op = 34, RULE_between_op = 35, RULE_is_or_is_not = 36, 
		RULE_table_references = 37, RULE_join_clause = 38, RULE_join_condition = 39;
	public static final String[] ruleNames = {
		"commands", "stat", "create_clause", "data_type", "column_list_definition", 
		"column_definition", "column_list_attributes", "column_attribute", "table_list_constraints", 
		"table_constraint", "drop_table_clause", "insert_clause", "list_values", 
		"update_clause", "column_list_assignment", "column_assignment", "delete_clause", 
		"schema_name", "select_clause", "table_name", "table_alias", "column_name", 
		"column_name_alias", "column_list", "column_list_clause", "from_clause", 
		"select_key", "where_clause", "show_tables_clause", "expression", "expr", 
		"element", "relational_op", "expr_op", "mul_op", "between_op", "is_or_is_not", 
		"table_references", "join_clause", "join_condition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'create'", "'table'", "'if'", "'int'", "'double'", "'date'", "'varchar'", 
		"'blob'", "'primary'", "'auto'", "'increment'", "'drop'", "'insert'", 
		"'into'", "'values'", "'update'", "'set'", "'delete'", "'as'", "'select'", 
		"'from'", "'where'", null, null, "'xor'", "'is'", "'null'", "'like'", 
		"'in'", "'exists'", "'all'", "'any'", "'true'", "'false'", null, null, 
		"'*'", null, null, "'between'", "'regexp'", null, null, "'~'", "'|'", 
		"'&'", "'^'", "'binary'", "'<<'", "'>>'", "'escape'", "')'", "'('", "']'", 
		"'['", "':'", "'.*'", "'='", "'<'", "'>'", "'!='", "'not'", "'<='", "'>='", 
		"';'", "','", "'.'", "'collate'", "'inner'", "'outer'", "'join'", "'cross'", 
		"'using'", "'index'", "'key'", "'order'", "'group'", "'by'", "'for'", 
		"'use'", "'straight_join'", "'natural'", "'left'", "'right'", "'show'", 
		"'tables'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "TABLE", "IF", "INT_DT", "DOUBLE_DT", "DATE_DT", "VARCHAR_DT", 
		"BLOB_DT", "PRIMARY", "AUTO", "INCREMENT", "DROP", "INSERT", "INTO", "VALUES", 
		"UPDATE", "SET", "DELETE", "AS", "SELECT", "FROM", "WHERE", "AND", "OR", 
		"XOR", "IS", "NULL", "LIKE", "IN", "EXISTS", "ALL", "ANY", "TRUE", "FALSE", 
		"SUM", "RES", "MUL", "DIV", "MOD", "BETWEEN", "REGEXP", "PLUS", "MINUS", 
		"NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", 
		"ESCAPE", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", "GET", "SEMI", "COMMA", "DOT", 
		"COLLATE", "INNER", "OUTER", "JOIN", "CROSS", "USING", "INDEX", "KEY", 
		"ORDER", "GROUP", "BY", "FOR", "USE", "STRAIGHT_JOIN", "NATURAL", "LEFT", 
		"RIGHT", "SHOW", "TABLES", "ON", "ID", "LETTER", "INT", "DOUBLE", "STRING", 
		"NEWLINE", "WS"
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
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				stat();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DROP) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << SELECT))) != 0) || _la==SHOW );
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
		public Show_tables_clauseContext show_tables_clause() {
			return getRuleContext(Show_tables_clauseContext.class,0);
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
			setState(92);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				create_clause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				drop_table_clause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				select_clause();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				insert_clause();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				update_clause();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				delete_clause();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				show_tables_clause();
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
			setState(94);
			match(CREATE);
			setState(95);
			match(TABLE);
			setState(99);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(96);
				match(IF);
				setState(97);
				match(NOT);
				setState(98);
				match(EXISTS);
				}
			}

			setState(101);
			table_name();
			setState(102);
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
			setState(112);
			switch (_input.LA(1)) {
			case INT_DT:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(INT_DT);
				}
				break;
			case DOUBLE_DT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(DOUBLE_DT);
				}
				break;
			case DATE_DT:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(DATE_DT);
				}
				break;
			case VARCHAR_DT:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(VARCHAR_DT);
				setState(108);
				match(LPAREN);
				setState(109);
				match(INT);
				setState(110);
				match(RPAREN);
				}
				break;
			case BLOB_DT:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
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
			setState(114);
			match(LPAREN);
			setState(115);
			column_definition();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				column_definition();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			table_list_constraints();
			setState(124);
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
			setState(126);
			column_name();
			setState(127);
			data_type();
			setState(128);
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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AUTO || _la==NOT) {
				{
				{
				setState(130);
				column_attribute();
				}
				}
				setState(135);
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
			setState(140);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(NOT);
				setState(137);
				match(NULL);
				}
				break;
			case AUTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(AUTO);
				setState(139);
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMARY) {
				{
				{
				setState(142);
				table_constraint();
				}
				}
				setState(147);
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
			setState(148);
			match(PRIMARY);
			setState(149);
			match(KEY);
			setState(150);
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
			setState(152);
			match(DROP);
			setState(153);
			match(TABLE);
			setState(156);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(154);
				match(IF);
				setState(155);
				match(EXISTS);
				}
			}

			setState(158);
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
		public TerminalNode VALUES() { return getToken(MySQLParser.VALUES, 0); }
		public List_valuesContext list_values() {
			return getRuleContext(List_valuesContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(INSERT);
			setState(161);
			match(INTO);
			setState(162);
			table_name();
			setState(164);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(163);
				column_list();
				}
			}

			setState(166);
			match(VALUES);
			setState(167);
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
			setState(169);
			match(LPAREN);
			setState(170);
			expression();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(171);
				match(COMMA);
				setState(172);
				expression();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
			setState(180);
			match(UPDATE);
			setState(181);
			table_name();
			setState(182);
			match(SET);
			setState(183);
			column_list_assignment();
			setState(185);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(184);
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
			setState(187);
			match(LPAREN);
			setState(188);
			column_assignment();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				column_assignment();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
			setState(198);
			column_name();
			setState(199);
			match(EQ);
			setState(200);
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
			setState(202);
			match(DELETE);
			setState(203);
			match(FROM);
			setState(204);
			table_name();
			setState(205);
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
			setState(207);
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
		public TerminalNode MUL() { return getToken(MySQLParser.MUL, 0); }
		public Column_list_clauseContext column_list_clause() {
			return getRuleContext(Column_list_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
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
			setState(209);
			match(SELECT);
			setState(212);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(210);
				match(MUL);
				}
				break;
			case ID:
				{
				setState(211);
				column_list_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(214);
				match(FROM);
				setState(217);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(215);
					table_references();
					}
					break;
				case EOF:
				case CREATE:
				case DROP:
				case INSERT:
				case UPDATE:
				case DELETE:
				case SELECT:
				case WHERE:
				case SHOW:
					{
					setState(216);
					join_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(222);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(221);
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

	public static class Table_aliasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(229);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(227);
				match(AS);
				setState(228);
				match(ID);
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

	public static class Column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MySQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MySQLParser.DOT, i);
		}
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
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
			setState(231);
			match(ID);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(DOT);
					setState(233);
					match(ID);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(239);
				match(AS);
				setState(240);
				match(ID);
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
			setState(243);
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
		enterRule(_localctx, 46, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LPAREN);
			setState(246);
			column_name();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				column_name();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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
		enterRule(_localctx, 48, RULE_column_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			column_name();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				column_name();
				}
				}
				setState(263);
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
		enterRule(_localctx, 50, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(FROM);
			setState(265);
			table_name();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				table_name();
				}
				}
				setState(272);
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
		enterRule(_localctx, 52, RULE_select_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 54, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(WHERE);
			setState(276);
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

	public static class Show_tables_clauseContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MySQLParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(MySQLParser.TABLES, 0); }
		public Show_tables_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_tables_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterShow_tables_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitShow_tables_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLParserVisitor ) return ((MySQLParserVisitor<? extends T>)visitor).visitShow_tables_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_tables_clauseContext show_tables_clause() throws RecognitionException {
		Show_tables_clauseContext _localctx = new Show_tables_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_show_tables_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(SHOW);
			setState(279);
			match(TABLES);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expr(0);
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
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Expr_opContext expr_op() {
			return getRuleContext(Expr_opContext.class,0);
		}
		public Mul_opContext mul_op() {
			return getRuleContext(Mul_opContext.class,0);
		}
		public TerminalNode SUM() { return getToken(MySQLParser.SUM, 0); }
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
			setState(291);
			switch (_input.LA(1)) {
			case RES:
				{
				setState(284);
				match(RES);
				setState(285);
				expr(2);
				}
				break;
			case ID:
			case INT:
			case DOUBLE:
			case STRING:
				{
				setState(286);
				element();
				}
				break;
			case LPAREN:
				{
				setState(287);
				match(LPAREN);
				setState(288);
				expr(0);
				setState(289);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						relational_op();
						setState(295);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(298);
						expr_op();
						setState(299);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(302);
						mul_op();
						setState(303);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(306);
						match(SUM);
						setState(307);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(309);
						match(RES);
						setState(310);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
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
			setState(323);
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
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
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
			setState(327);
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
			setState(329);
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
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(IS);
				setState(333);
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
		public List<Table_aliasContext> table_alias() {
			return getRuleContexts(Table_aliasContext.class);
		}
		public Table_aliasContext table_alias(int i) {
			return getRuleContext(Table_aliasContext.class,i);
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
		enterRule(_localctx, 74, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			table_alias();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(337);
				match(COMMA);
				setState(338);
				table_alias();
				}
				}
				setState(343);
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

	public static class Join_clauseContext extends ParserRuleContext {
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
		enterRule(_localctx, 76, RULE_join_clause);
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
		enterRule(_localctx, 78, RULE_join_condition);
		int _la;
		try {
			setState(358);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(346);
				match(ON);
				setState(347);
				expression();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
					{
					{
					setState(348);
					expr_op();
					setState(349);
					expression();
					}
					}
					setState(355);
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
				setState(356);
				match(USING);
				setState(357);
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
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3`\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\6\2T\n\2\r"+
		"\2\16\2U\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"f\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6"+
		"\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\7\b\u0086"+
		"\n\b\f\b\16\b\u0089\13\b\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\7\n\u0092\n"+
		"\n\f\n\16\n\u0095\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u009f\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00bc\n\17\3\20\3\20\3\20\3\20\7\20\u00c2\n\20\f\20\16\20"+
		"\u00c5\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\5\24\u00d7\n\24\3\24\3\24\3\24\5\24\u00dc\n\24"+
		"\5\24\u00de\n\24\3\24\5\24\u00e1\n\24\3\25\3\25\3\26\3\26\3\26\5\26\u00e8"+
		"\n\26\3\27\3\27\3\27\7\27\u00ed\n\27\f\27\16\27\u00f0\13\27\3\27\3\27"+
		"\5\27\u00f4\n\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00fc\n\31\f\31\16"+
		"\31\u00ff\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u0106\n\32\f\32\16\32\u0109"+
		"\13\32\3\33\3\33\3\33\3\33\7\33\u010f\n\33\f\33\16\33\u0112\13\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\5 \u0126\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 "+
		"\u013a\n \f \16 \u013d\13 \3!\3!\3!\3!\3!\5!\u0144\n!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3&\5&\u0151\n&\3\'\3\'\3\'\7\'\u0156\n\'\f\'\16\'\u0159"+
		"\13\'\3(\3(\3)\3)\3)\3)\3)\7)\u0162\n)\f)\16)\u0165\13)\3)\3)\5)\u0169"+
		"\n)\3)\2\3>*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNP\2\5\4\2<?AB\3\2\31\33\3\2\'(\u0170\2S\3\2\2\2\4^\3\2"+
		"\2\2\6`\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f\u0080\3\2\2\2\16\u0087\3\2\2\2"+
		"\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u0096\3\2\2\2\26\u009a\3\2\2\2\30"+
		"\u00a2\3\2\2\2\32\u00ab\3\2\2\2\34\u00b6\3\2\2\2\36\u00bd\3\2\2\2 \u00c8"+
		"\3\2\2\2\"\u00cc\3\2\2\2$\u00d1\3\2\2\2&\u00d3\3\2\2\2(\u00e2\3\2\2\2"+
		"*\u00e4\3\2\2\2,\u00e9\3\2\2\2.\u00f5\3\2\2\2\60\u00f7\3\2\2\2\62\u0102"+
		"\3\2\2\2\64\u010a\3\2\2\2\66\u0113\3\2\2\28\u0115\3\2\2\2:\u0118\3\2\2"+
		"\2<\u011b\3\2\2\2>\u0125\3\2\2\2@\u0143\3\2\2\2B\u0145\3\2\2\2D\u0147"+
		"\3\2\2\2F\u0149\3\2\2\2H\u014b\3\2\2\2J\u0150\3\2\2\2L\u0152\3\2\2\2N"+
		"\u015a\3\2\2\2P\u0168\3\2\2\2RT\5\4\3\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2V\3\3\2\2\2W_\5\6\4\2X_\5\26\f\2Y_\5&\24\2Z_\5\30\r\2[_\5\34"+
		"\17\2\\_\5\"\22\2]_\5:\36\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^["+
		"\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\5\3\2\2\2`a\7\3\2\2ae\7\4\2\2bc\7\5\2\2"+
		"cd\7@\2\2df\7 \2\2eb\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5(\25\2hi\5\n\6\2i"+
		"\7\3\2\2\2js\7\6\2\2ks\7\7\2\2ls\7\b\2\2mn\7\t\2\2no\7\67\2\2op\7\\\2"+
		"\2ps\7\66\2\2qs\7\n\2\2rj\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rq\3\2"+
		"\2\2s\t\3\2\2\2tu\7\67\2\2uz\5\f\7\2vw\7D\2\2wy\5\f\7\2xv\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\5\22\n\2~\177\7\66\2"+
		"\2\177\13\3\2\2\2\u0080\u0081\5,\27\2\u0081\u0082\5\b\5\2\u0082\u0083"+
		"\5\16\b\2\u0083\r\3\2\2\2\u0084\u0086\5\20\t\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\17\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u008a\u008b\7@\2\2\u008b\u008f\7\35\2\2\u008c\u008d"+
		"\7\f\2\2\u008d\u008f\7\r\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u0092\5\24\13\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\7\13\2\2\u0097\u0098\7M\2\2\u0098\u0099\5\60\31\2"+
		"\u0099\25\3\2\2\2\u009a\u009b\7\16\2\2\u009b\u009e\7\4\2\2\u009c\u009d"+
		"\7\5\2\2\u009d\u009f\7 \2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\5(\25\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\17\2"+
		"\2\u00a3\u00a4\7\20\2\2\u00a4\u00a6\5(\25\2\u00a5\u00a7\5\60\31\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\21"+
		"\2\2\u00a9\u00aa\5\32\16\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\67\2\2\u00ac"+
		"\u00b1\5<\37\2\u00ad\u00ae\7D\2\2\u00ae\u00b0\5<\37\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\66\2\2\u00b5\33\3\2\2"+
		"\2\u00b6\u00b7\7\22\2\2\u00b7\u00b8\5(\25\2\u00b8\u00b9\7\23\2\2\u00b9"+
		"\u00bb\5\36\20\2\u00ba\u00bc\58\35\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\35\3\2\2\2\u00bd\u00be\7\67\2\2\u00be\u00c3\5 \21\2\u00bf"+
		"\u00c0\7D\2\2\u00c0\u00c2\5 \21\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\66\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\5,\27"+
		"\2\u00c9\u00ca\7<\2\2\u00ca\u00cb\5<\37\2\u00cb!\3\2\2\2\u00cc\u00cd\7"+
		"\24\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\58\35\2\u00d0"+
		"#\3\2\2\2\u00d1\u00d2\7Z\2\2\u00d2%\3\2\2\2\u00d3\u00d6\7\26\2\2\u00d4"+
		"\u00d7\7\'\2\2\u00d5\u00d7\5\62\32\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00db\7\27\2\2\u00d9\u00dc\5L\'\2\u00da"+
		"\u00dc\5N(\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00de\3\2\2"+
		"\2\u00dd\u00d8\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1"+
		"\58\35\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2\u00e2"+
		"\u00e3\7Z\2\2\u00e3)\3\2\2\2\u00e4\u00e7\7Z\2\2\u00e5\u00e6\7\25\2\2\u00e6"+
		"\u00e8\7Z\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8+\3\2\2\2\u00e9"+
		"\u00ee\7Z\2\2\u00ea\u00eb\7E\2\2\u00eb\u00ed\7Z\2\2\u00ec\u00ea\3\2\2"+
		"\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\25\2\2\u00f2\u00f4\7Z\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f6\7Z\2\2\u00f6"+
		"/\3\2\2\2\u00f7\u00f8\7\67\2\2\u00f8\u00fd\5,\27\2\u00f9\u00fa\7D\2\2"+
		"\u00fa\u00fc\5,\27\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\66\2\2\u0101\61\3\2\2\2\u0102\u0107\5,\27\2\u0103\u0104\7D\2"+
		"\2\u0104\u0106\5,\27\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\63\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\7\27\2\2\u010b\u0110\5(\25\2\u010c\u010d\7D\2\2\u010d\u010f\5("+
		"\25\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\65\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\26\2"+
		"\2\u0114\67\3\2\2\2\u0115\u0116\7\30\2\2\u0116\u0117\5<\37\2\u01179\3"+
		"\2\2\2\u0118\u0119\7W\2\2\u0119\u011a\7X\2\2\u011a;\3\2\2\2\u011b\u011c"+
		"\5> \2\u011c=\3\2\2\2\u011d\u011e\b \1\2\u011e\u011f\7&\2\2\u011f\u0126"+
		"\5> \4\u0120\u0126\5@!\2\u0121\u0122\7\67\2\2\u0122\u0123\5> \2\u0123"+
		"\u0124\7\66\2\2\u0124\u0126\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0120\3"+
		"\2\2\2\u0125\u0121\3\2\2\2\u0126\u013b\3\2\2\2\u0127\u0128\f\t\2\2\u0128"+
		"\u0129\5B\"\2\u0129\u012a\5> \n\u012a\u013a\3\2\2\2\u012b\u012c\f\b\2"+
		"\2\u012c\u012d\5D#\2\u012d\u012e\5> \t\u012e\u013a\3\2\2\2\u012f\u0130"+
		"\f\7\2\2\u0130\u0131\5F$\2\u0131\u0132\5> \b\u0132\u013a\3\2\2\2\u0133"+
		"\u0134\f\6\2\2\u0134\u0135\7%\2\2\u0135\u013a\5> \7\u0136\u0137\f\5\2"+
		"\2\u0137\u0138\7&\2\2\u0138\u013a\5> \6\u0139\u0127\3\2\2\2\u0139\u012b"+
		"\3\2\2\2\u0139\u012f\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0136\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c?\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\u0144\7Z\2\2\u013f\u0144\7\\\2\2\u0140\u0144"+
		"\7]\2\2\u0141\u0144\7^\2\2\u0142\u0144\5,\27\2\u0143\u013e\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2"+
		"\2\2\u0144A\3\2\2\2\u0145\u0146\t\2\2\2\u0146C\3\2\2\2\u0147\u0148\t\3"+
		"\2\2\u0148E\3\2\2\2\u0149\u014a\t\4\2\2\u014aG\3\2\2\2\u014b\u014c\7*"+
		"\2\2\u014cI\3\2\2\2\u014d\u0151\7\34\2\2\u014e\u014f\7\34\2\2\u014f\u0151"+
		"\7@\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0151K\3\2\2\2\u0152\u0157"+
		"\5*\26\2\u0153\u0154\7D\2\2\u0154\u0156\5*\26\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158M\3\2\2\2"+
		"\u0159\u0157\3\2\2\2\u015a\u015b\3\2\2\2\u015bO\3\2\2\2\u015c\u015d\7"+
		"Y\2\2\u015d\u0163\5<\37\2\u015e\u015f\5D#\2\u015f\u0160\5<\37\2\u0160"+
		"\u0162\3\2\2\2\u0161\u015e\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0169\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7K\2\2\u0167\u0169\5\60\31\2\u0168\u015c\3\2\2\2\u0168\u0166\3"+
		"\2\2\2\u0169Q\3\2\2\2!U^erz\u0087\u008e\u0093\u009e\u00a6\u00b1\u00bb"+
		"\u00c3\u00d6\u00db\u00dd\u00e0\u00e7\u00ee\u00f3\u00fd\u0107\u0110\u0125"+
		"\u0139\u013b\u0143\u0150\u0157\u0163\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}