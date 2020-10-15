grammar Tenet;

program: global_scope;

global_scope: operation global_scope | EOF;
scope: operation scope | control_flow |;
operation: (declare_function | define_function | define_variable | define_constant | expression) EOO ;

// definations
declare_function: FUNCTION IDENTIFIER'('function_arguments')' TYPE_SPECIFIER (TYPE | VOID);
define_function: FUNCTION IDENTIFIER'('function_arguments')' TYPE_SPECIFIER (TYPE | VOID) function_body;
define_variable: VAR IDENTIFIER TYPE_SPECIFIER TYPE ASSIGN expression;
define_constant: CONST IDENTIFIER TYPE_SPECIFIER TYPE ASSIGN expression;
function_arguments: function_arguments',' function_arguments | IDENTIFIER TYPE_SPECIFIER TYPE | VOID;
function_body: '{' scope (scope | 'return' expression EOO | ) '}';

// expression is everything that returns some value
expression: (call_function | math_operation | compare | IDENTIFIER | BASIC_TYPES) (expression |);

call_function: IDENTIFIER'('function_params')';
function_params: function_params',' function_params | IDENTIFIER | BASIC_TYPES |;

// math operations
math_operation: MATH_OPERATION '('expression ',' expression')';
compare: COMPARISON '(' expression ',' expression ')';

// control flow
control_flow: while | if;
while: WHILE '(' expression ')' '{' scope '}';
if: IF '(' expression ')' '{' scope '}' (else | );
else: ELSE (if | '{' scope '}');

BASIC_TYPES: INTEGER | REAL | STRING;
INTEGER: ('-' | '+')?(BINARY | TERNARY | OCTAL | HEXADECIMAL | DECIMAL);
REAL: ('-' | '+')?[0-9]+'.'[0-9]*;
STRING: '"' .*? '"';

// Integer Number Types
BINARY: [0-1]+':bin';
TERNARY: ('-1' | '0' | '1')+':ter';
OCTAL: [0-7]+':oct';
HEXADECIMAL: [0-9a-fA-F]+':hex';
DECIMAL: [0-9]+(':dec' | );

// Keywords
FUNCTION: 'function';
VAR: 'var';
CONST: 'const';
WHILE: 'while';
IF: 'if';
ELSE: 'else';

// Operators
ASSIGN: '=';
TYPE_SPECIFIER: ':';
TYPE: 'int' | 'real' | 'string';
VOID: 'void';
MATH_OPERATION: 'mul' | 'div' | 'mod' | 'add' | 'sub' | 'pow';
COMPARISON: 'equal' | 'more' | 'less' | 'emore' | 'eless';
EOO: ';'; // End of operation

IDENTIFIER: (ALPHA | '_')(ALPHA | DIGIT | '_')*;

ALPHA: [a-zA-Z];
DIGIT: [0-9];

WHITESPACE: [ \n\r\t] -> skip;
SINGLE_LINE_COMMENT: '//' ~[\n\r]* ([\n\r] | EOF) -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
