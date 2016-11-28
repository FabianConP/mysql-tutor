
parser grammar MySQLParser;

options
   { tokenVocab = MySQLLexer; }

commands
    : stat+
    ;

stat
   : create_clause | drop_table_clause | select_clause | insert_clause | update_clause | delete_clause | show_tables_clause
   ;

create_clause
    : CREATE TABLE (IF NOT EXISTS)? table_name column_list_definition
    ;

data_type
    : INT_DT | DOUBLE_DT | DATE_DT | VARCHAR_DT LPAREN INT RPAREN | BLOB_DT
    ;

column_list_definition
    : LPAREN column_definition (COMMA column_definition)* table_list_constraints RPAREN
    ;

column_definition
    : column_name data_type column_list_attributes
    ;

column_list_attributes
    : column_attribute*
    ;

column_attribute
    : NOT NULL | AUTO INCREMENT
    ;

table_list_constraints
    : table_constraint*
    ;

table_constraint
    : PRIMARY KEY column_list
    ;

drop_table_clause
    : DROP TABLE (IF EXISTS)? table_name
    ;

insert_clause
    : INSERT INTO table_name column_list? VALUES list_values
    ;

list_values
    : LPAREN expression (COMMA expression)* RPAREN
    ;

update_clause
    : UPDATE table_name SET column_list_assignment ( where_clause )?
    ;

column_list_assignment
    : LPAREN column_assignment (COMMA column_assignment)* RPAREN
    ;

column_assignment
    : column_name EQ expression
    ;

delete_clause
    : DELETE FROM table_name where_clause
    ;

schema_name
   : ID
   ;

select_clause
   : SELECT (MUL | column_list_clause) ( FROM (table_references | join_clause))? ( where_clause )?
   ;

table_name
   : ID
   ;

table_alias
   : ID (AS ID)?
   ;

column_name
   : ID (DOT ID)* (AS ID)?
   ;

column_name_alias
   : ID
   ;

column_list
   : LPAREN column_name ( COMMA column_name )* RPAREN
   ;

column_list_clause
   : column_name ( COMMA column_name )*
   ;

from_clause
   : FROM table_name ( COMMA table_name )*
   ;

select_key
   : SELECT
   ;

where_clause
   : WHERE expression
   ;

show_tables_clause
    : SHOW TABLES
    ;

expression
    : expr
   ;

expr
    : element
    | expr relational_op expr
    | expr expr_op expr
    | expr mul_op expr
    | expr SUM expr
    | expr RES expr
    | RES expr
    | LPAREN expr RPAREN
    ;

element
   : ID | INT | DOUBLE | STRING |column_name
   ;

relational_op
   : EQ | LTH | GTH | NOT_EQ | LET | GET
   ;

expr_op
   : AND | XOR | OR // | NOT
   ;

mul_op
    : MUL | DIV
    ;

between_op
   : BETWEEN
   ;

is_or_is_not
   : IS | IS NOT
   ;



table_references
   //: table_reference ( ( COMMA table_reference ) | join_clause )*
    : table_alias (COMMA table_alias)*
   ;

join_clause
   //: ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? ) | ( STRAIGHT_JOIN table_atom ( ON expression )? ) | ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition ) | ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )
    :
   ;

join_condition
   : ( ON expression ( expr_op expression )* ) | ( USING column_list )
   ;

/*
expr
   : left_element relational_op right_element | target_element between_op left_element AND right_element | target_element is_or_is_not NULL
   ;


table_factor1
   : table_factor2 ( ( INNER | CROSS )? JOIN table_atom ( join_condition )? )?
   ;

table_factor2
   : table_factor3 ( STRAIGHT_JOIN table_atom ( ON expression )? )?
   ;

table_factor3
   : table_factor4 ( ( LEFT | RIGHT ) ( OUTER )? JOIN table_factor4 join_condition )?
   ;

table_factor4
   : table_atom ( NATURAL ( ( LEFT | RIGHT ) ( OUTER )? )? JOIN table_atom )?
   ;

table_atom
   : ( table_name ( partition_clause )? ( table_alias )? ( index_hint_list )? ) | ( subquery subquery_alias ) | ( LPAREN table_references RPAREN ) | ( OJ table_reference LEFT OUTER JOIN table_reference ON expression )
   ;


index_hint_list
   : index_hint ( COMMA index_hint )*
   ;

index_options
   : ( INDEX | KEY ) ( FOR ( ( JOIN ) | ( ORDER BY ) | ( GROUP BY ) ) )?
   ;

index_hint
   : USE index_options LPAREN ( index_list )? RPAREN | IGNORE index_options LPAREN index_list RPAREN
   ;

index_list
   : index_name ( COMMA index_name )*
   ;

partition_clause
   : PARTITION LPAREN partition_names RPAREN
   ;

partition_names
   : partition_name ( COMMA partition_name )*
   ;

partition_name
   : ID
   ;

subquery_alias
   : ID
   ;

subquery
   : LPAREN select_clause RPAREN
   ;
*/