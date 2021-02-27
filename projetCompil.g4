grammar projetCompil;
IF:'if';
INT:[0-9]+;
CHAR : 'a'..'z'|' '|'A'..'Z';

WS:[\n\t] -> skip;
ID:[a-z]+;

exp:ID'=' INT ';' { int x; x=$INT.text;
                    if(x==1)
                          system.out.println("affectation valide");
                    };  //x=$INT.ligne (pour la ligne)

r:INT{int x=$INT.line;}
    (ID{if($INT line==$ID.line})
    k=Float v=Float {if($k.line = $v.line};

prule: 'hello' CHAR+ exp ;