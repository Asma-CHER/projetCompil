grammar projetCompil;

programme : COMPIL Nameprog '(' ')' '{' declarations START insts '}';



// déclarations
declarations : (dec declarations)|dec  ;
dec : type var ';' ;
type : INT | FLOAT|STRING;
var : ((ID ',' var) | ID) ;

// instructions
insts : (inst ';' insts) | inst ';' ;
inst : affect | ifinst | dowhile_inst| read | write;

// affectation
affect : ID AFF exp ;
exp : exp opmi t | t;
t : t opma endEx | endEx;
opmi : PLUS | MINUS ;
opma : MUL | DIV ;
endEx : ID | '(' exp ')' | val ;
val : INTEGERVAL | FLOATVAL | STRINGVAL;

// instruction if
ifinst : IF '(' comp ')' THEN '{' insts '}' (|ELSE '{' insts '}' ) ;
comp : exp op exp ;
op : SUP | INF | SUPE | INFE | DIF | EQ;

//instruction do_while

dowhile_inst : DO '{' insts '}' WHILE '(' comp ')' ;

// instruction read/write
read :  SCAN '(' listID ')' ;
write : PRINT '(' (STRINGVAL|listID) ')' ;
listID : ID ',' listID | ID ;



//*********** REGEX ******************* //

Nameprog : [A-Z][a-zA-Z0-9]*;
ID : [a-zA-Z][a-zA-Z0-9]*;
INTEGERVAL : '0'|[+-]?[1-9][0-9]*;
FLOATVAL : '0'|[+-]?[1-9][0-9]*('.'[0-9]*);
STRINGVAL : '.*';

//******************* Mots clés *******************//

COMPIL : 'compil';
INT : 'intCompil';
FLOAT : 'floatCompil';
STRING : 'StringCompil';
SCAN : 'scanCompil' ;
PRINT : 'printCompil' ;
START : 'start' ;
IF : 'if';
THEN : 'then';
ELSE : 'else';
DO : 'do';
WHILE : 'while';

// ************** opérateurs **************//

AFF : '=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
SUP : '>';
INF : '<';
SUPE : '>=';
INFE : '<=';
EQ : '==';
DIF : '!=';
