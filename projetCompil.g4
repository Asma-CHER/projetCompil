grammar projetCompil;

tinyLang : COMPIL NAMEPROG '(' ')' '{' decList START instsList '}';

// ***********************déclarations**********************//
decList : dec decList|dec|;
dec : type var ';' ;
type : INT | FLOAT|STRING;
var : ID ',' var | ID ;

//************************ instructions***********************//
instsList : inst instsList| inst | ;
inst : affect | ifinst | dowhile_inst| read | write;

// affectation
affect : ID AFF suite_operation ';';
suite_operation : operation|operation operateur suite_operation|operand;
operation : operand operateur operand ;
operateur : PLUS | MINUS |MUL | DIV ;
operand : ID | val ;
val : INTEGERVAL | FLOATVAL | STRINGVAL;

// instruction if
ifinst : IF '(' cond ')' THEN '{' instsList '}' (|ELSE '{' instsList '}' ) ;
cond : operand op operand ;
op : SUP | INF | SUPE | INFE | DIF | EQ;

//instruction do_while
dowhile_inst : DO '{' instsList '}' WHILE '(' cond ')' ;

// instruction read/write
read :  SCAN '(' listID ')' ;
write : PRINT '(' (STRINGVAL|listID) ')' ;
listID : ID ',' listID | ID ;


//**************Skip*******************//
WS:[\n\t] -> skip;
//COMNT:  -> skip;

//******************* Mots clés *******************//

COMPIL :'compil';
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


//*********** Valeurs ******************* //


INTEGERVAL : '0'|[+-]?[1-9][0-9]*;
FLOATVAL : '0'|[+-]?[1-9][0-9]*('.'[0-9]*);
STRINGVAL : '.*';
NAMEPROG : [A-Z][a-zA-Z0-9]*;
ID : [a-zA-Z][a-zA-Z0-9]*;



// ************ opérateurs **************//

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
