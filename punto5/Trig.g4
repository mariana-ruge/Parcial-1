grammar Trig;

options { 
    visitor = true; 
}

program : expr+ EOF ;

expr
    : 'Sin' '(' NUMBER ')'   # SinExpr
    | 'Cos' '(' NUMBER ')'   # CosExpr
    | 'Tan' '(' NUMBER ')'   # TanExpr
    ;

NUMBER : [0-9]+ ('.' [0-9]+)? ;

WS : [ \t\n\r]+ -> skip ;
