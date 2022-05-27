grammar Yolt;

application: class_declaration? function_declaration* EOF ;

//TODO's:
//Consider adding a ! in front of a logic expression, making the logic switch around?!
//Consider making a break statement, but not sure how to do that neatly.

class_declaration: CLASS IDENTIFIER PAREN_OPEN variables*  PAREN_CLOSE BRACKET_OPEN function_declaration+ BRACKET_CLOSE; //Could add declerations* here on both sides to make it possible to have global variables.
function_declaration: FUNCTION IDENTIFIER PAREN_OPEN (variables (COMMA variables)*)? PAREN_CLOSE BRACKET_OPEN statement+ BRACKET_CLOSE;
function_call: IDENTIFIER PAREN_OPEN (IDENTIFIER (COMMA IDENTIFIER)*)? PAREN_CLOSE SEMICOLON;

var_declaration: (INT | STRING | BOOLEAN | GOLD) IDENTIFIER EQUALS expr SEMICOLON;

var_addition: IDENTIFIER EQUALS expr SEMICOLON;

var_addition_short: IDENTIFIER (POW | MOD | MUL | DIV | ADD | SUB) EQUALS expr SEMICOLON;
string_addition_short: IDENTIFIER ADD EQUALS STRING_VALUE SEMICOLON;
//TODO Var assignment?

prompt_input: PROMPT PAREN_OPEN PAREN_CLOSE;
random_input: RANDOM PAREN_OPEN (INT_VALUE | IDENTIFIER)? PAREN_CLOSE;

if_statement: IF PAREN_OPEN logic_expr PAREN_CLOSE COLON BRACKET_OPEN statement+ BRACKET_CLOSE else_if_statement* else_statement?;
else_if_statement: ELSE_IF PAREN_OPEN logic_expr PAREN_CLOSE COLON BRACKET_OPEN statement+ BRACKET_CLOSE;
else_statement: ELSE COLON BRACKET_OPEN statement+ BRACKET_CLOSE;
return_statement: RETURN PAREN_OPEN IDENTIFIER PAREN_CLOSE SEMICOLON;

while_loop: LOOP PAREN_OPEN logic_expr PAREN_CLOSE COLON BRACKET_OPEN statement+ break_statement? BRACKET_CLOSE;
do_while_loop: LOOP COLON BRACKET_OPEN statement+ break_statement? BRACKET_CLOSE WHILE PAREN_OPEN logic_expr PAREN_CLOSE SEMICOLON;

variables: ((GOLD | INT | BOOLEAN | STRING) IDENTIFIER);


//TODO LATER CONSIDER ADDING A BREAK STATEMENT.
break_statement: BREAK SEMICOLON;




logic_expr:  logic_expr  LOGIC_AND logic_expr  # LogicAnd
           | logic_expr  LOGIC_OR logic_expr   # LogicOr
           | compare_values                    # ValueExpression
           ;


compare_values: expr (LOGIC_BIGGER | LOGIC_EQUAL | LOGIC_LOWER | LOGIC_UNEQUAL | LOGIC_BIGGER_EQUAL | LOGIC_LOWER_EQUAL) expr;

print_stmt: PRINT PAREN_OPEN expr PAREN_CLOSE SEMICOLON; //TODO CHANGE TO EXPR


statement: function_call | return_statement | string_addition_short | if_statement | var_declaration | do_while_loop | while_loop | print_stmt | var_addition_short | 'ADD' expr | var_addition;



expr: (PAREN_OPEN expr PAREN_CLOSE)    # ParanExpression
    | SUB expr                         # NegativeExpression //TODO PERHAPS CHANGE OR REMOVE THIS.
    | left=expr (POW | MOD) right=expr # PowModExpression
    | left=expr (MUL | DIV) right=expr # MulDivExpression
    | left=expr (ADD | SUB) right=expr # AddSubExpression
    | IDENTIFIER # VarIdentifier
    | random_input # RandomIdentifier
    | prompt_input # TextIdentifier
    | INT_VALUE # IntIdentifier
    | BOOLEAN_VALUE #BoolIdentifier
    | GOLD_VALUE # GoldIdentifier
    | STRING_VALUE #StringIdentifier
    ;

ADD: '+';
SUB: '-';
MUL: '*';
MOD: '%';
DIV: '/';
POW: '^';

LOGIC_EQUAL: '==';
LOGIC_UNEQUAL: '=!=';
LOGIC_BIGGER: '>';
LOGIC_LOWER: '<';
LOGIC_BIGGER_EQUAL: '>=';
LOGIC_LOWER_EQUAL: '<=';
LOGIC_OR: '||';
LOGIC_AND: '&&';

IF: 'IF';
ELSE_IF: 'ELSE IF';
ELSE: 'ELSE';

BREAK: 'STOP';

CLASS: 'CLASS';
LOOP: 'REPEAT';
WHILE: 'WHILE';
FUNCTION: 'FUNCTION';
RETURN: 'RETURN';

GOLD: 'COINS';
STRING: 'WORDS';
INT: 'NUMBER';
BOOLEAN: 'BOOL';


PRINT: 'SPEAK';
PROMPT: 'TELL';
RANDOM: 'RANDOM';
EQUALS: '=';

INT_VALUE: [-]?[1-9][0-9]* |[0];
GOLD_VALUE: [-]?[1-9][0-9]*[G];
COINS_VALUE: [-]?[1-9][0-9]*[G][_][-]?([0] |[1-9][0-9]?)[S][_][-]?([0] |[1-9][0-9]?)[B]; //5G_11S_6B;
BOOLEAN_VALUE: 'FALSE' | 'TRUE';
STRING_VALUE: '"'[a-zA-Z0-9,/!: ]+'"';

IDENTIFIER: [a-zA-Z0-9]+;

COMMA: ',';
SEMICOLON: ';';
COLON: ':';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
APOSTROPHE: '"';
COMMENT: '//*'; //TODO Add comments functionality!

WS: [\r\n ]+ -> skip;

