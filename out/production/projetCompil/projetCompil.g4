grammar projetCompil;

tinyLang : COMPIL NAMEPROG '(' ')' '{' decList START instsList '}'EOF;

// ***********************déclarations**********************//
decList :dec decList
        |dec
        |
        ;
dec : type var ';' ;
type : INT | FLOAT |STRING;
var : ID ',' var
    | ID ;

//************************ instructions***********************//
instsList : inst instsList
            | inst
            | ;
inst : affect
      | ifinst
      | dowhile_inst
      | read
      | write;

// affectation\
affect : ID AFF suite_operation ';';

suite_operation :suite_operation operateurP suite_operation2
                |suite_operation2
                ;
suite_operation2 : suite_operation2 operateurM operand
                   |operand;
operateurP : PLUS | MINUS ;
operateurM: MUL | DIV ;
operand : ID
        | val
        |'(' suite_operation')';
val : INTEGERVAL | FLOATVAL | STRINGVAL |MINUS INTEGERVAL|MINUS FLOATVAL ;

// instruction if
ifinst : IF '(' cond ')' THEN '{' instsList '}' elseinst;
elseinst : ELSE '{' instsList '}'
        |
        ;
cond : operandif op operandif ;
operandif : ID
        | val
        ;
op : SUP | INF | SUPE | INFE | DIF | EQ;

//instruction do_while
dowhile_inst : DO '{' instsList '}' WHILE '(' cond ')';

// instruction read/write
read :  SCAN '(' listIDR ');' ;
listIDR : ID ',' listIDR
        | ID ;

write : PRINT '('chaine ');' ;
chaine: listID
        | STRINGVAL;
listID : ID ',' listID
        | ID ;



//**************Skip*******************//
WS:[\n\t\r]+-> skip;
SPACE: [ ] -> skip;
ONELINE : '/''/'(~[\n])* -> skip;
MULLINE : '/*'(.)*?'*/' -> skip;

//*** Mots clés ***//
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


//*********** Valeurs ***************** //
INTEGERVAL : '0'|[1-9][0-9]*;
FLOATVAL : '-'?[1-9][0-9]*('.'[0-9]*);
NAMEPROG : [A-Z][a-zA-Z0-9]*;
ID : [a-zA-Z][a-zA-Z0-9]*;
STRINGVAL : '"'(~["]|'\\"')*'"';

// ************ opérateurs **************//
//*Arithmetique*//
AFF : '=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';

//*Logique*//
SUP : '>';
INF : '<';
SUPE : '>=';
INFE : '<=';
EQ : '==';
DIF : '!=';
