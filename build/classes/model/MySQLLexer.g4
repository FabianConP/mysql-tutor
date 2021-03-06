
lexer grammar MySQLLexer;
@ header { 
 }


// Start mysql-tutor

CREATE
    : 'create'
    ;

TABLE
    : 'table'
    ;

IF
    : 'if'
    ;

INT_DT
    : 'int'
    ;

DOUBLE_DT
    : 'double'
    ;

DATE_DT
    : 'date'
    ;

VARCHAR_DT
    : 'varchar'
    ;

BLOB_DT
    : 'blob'
    ;

PRIMARY
    : 'primary'
    ;

AUTO
    : 'auto'
    ;

INCREMENT
    : 'increment'
    ;

DROP
    : 'drop'
    ;

INSERT
    : 'insert'
    ;

INTO
    : 'into'
    ;

VALUES
    : 'values'
    ;

UPDATE
    : 'update'
    ;

SET
    : 'set'
    ;

DELETE
    : 'delete'
    ;

AS
    : 'as'
    ;
// End mysql-tutor


SELECT
   : 'select'
   ;


FROM
   : 'from'
   ;


WHERE
   : 'where'
   ;


AND
   : 'and' | '&&'
   ;


OR
   : 'or' | '||'
   ;


XOR
   : 'xor'
   ;


IS
   : 'is'
   ;


NULL
   : 'null'
   ;


LIKE
   : 'like'
   ;


IN
   : 'in'
   ;


EXISTS
   : 'exists'
   ;


ALL
   : 'all'
   ;


ANY
   : 'any'
   ;


TRUE
   : 'true'
   ;


FALSE
   : 'false'
   ;


SUM
    : '+'
    ;

RES
    : '-'
    ;

MUL
    : '*'
    ;

DIV
   : 'div' | '/'
   ;


MOD
   : 'mod' | '%'
   ;


BETWEEN
   : 'between'
   ;


REGEXP
   : 'regexp'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


NEGATION
   : '~'
   ;


VERTBAR
   : '|'
   ;


BITAND
   : '&'
   ;


POWER_OP
   : '^'
   ;


BINARY
   : 'binary'
   ;


SHIFT_LEFT
   : '<<'
   ;


SHIFT_RIGHT
   : '>>'
   ;


ESCAPE
   : 'escape'
   ;


//ASTERISK
//   : '*'
//   ;


RPAREN
   : ')'
   ;


LPAREN
   : '('
   ;


RBRACK
   : ']'
   ;


LBRACK
   : '['
   ;


COLON
   : ':'
   ;


ALL_FIELDS
   : '.*'
   ;


EQ
   : '='
   ;


LTH
   : '<'
   ;


GTH
   : '>'
   ;


NOT_EQ
   : '!='
   ;


NOT
   : 'not'
   ;


LET
   : '<='
   ;


GET
   : '>='
   ;


SEMI
   : ';'
   ;


COMMA
   : ','
   ;


DOT
   : '.'
   ;


COLLATE
   : 'collate'
   ;


INNER
   : 'inner'
   ;


OUTER
   : 'outer'
   ;


JOIN
   : 'join'
   ;


CROSS
   : 'cross'
   ;


USING
   : 'using'
   ;


INDEX
   : 'index'
   ;


KEY
   : 'key'
   ;


ORDER
   : 'order'
   ;


GROUP
   : 'group'
   ;


BY
   : 'by'
   ;


FOR
   : 'for'
   ;


USE
   : 'use'
   ;


//IGNORE
//   : 'ignore'
//   ;


//PARTITION
//   : 'partition'
//   ;


STRAIGHT_JOIN
   : 'straight_join'
   ;


NATURAL
   : 'natural'
   ;


LEFT
   : 'left'
   ;


RIGHT
   : 'right'
   ;


SHOW
    : 'show'
    ;

TABLES
    : 'tables'
    ;


ON
   : 'on'
   ;


ID
   : ( LETTER | '_' )+(DOT? (LETTER | INT | '_'))*
   ;

LETTER
    : 'a' .. 'z' | 'A' .. 'Z'
    ;

INT
   : '0' .. '9'+
   ;

DOUBLE
    : INT DOT INT
    ;

STRING
    : ('\'' | '"') ~['\'"']* ('\'' | '"')
    ;


NEWLINE
   : '\r'? '\n' -> skip
   ;

//LINE_COMMENT
//   : '//' ~[\r\n]* -> skip ;

WS
   : ( ' ' | '\t' | '\n' | '\r' )+ -> skip
   ;

/*
USER_VAR
   : '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 )
   ;


fragment USER_VAR_SUBFIX1
   : ( '`' ( ~ '`' )+ '`' )
   ;


fragment USER_VAR_SUBFIX2
   : ( '\'' ( ~ '\'' )+ '\'' )
   ;


fragment USER_VAR_SUBFIX3
   : ( '\"' ( ~ '\"' )+ '\"' )
   ;


fragment USER_VAR_SUBFIX4
   : ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+
   ;
*/