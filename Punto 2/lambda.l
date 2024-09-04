%{
#include <stdio.h>
#include <stdlib.h>

int lambda_found = 0;
int print_found = 0;
%}

%%

"lambda"         { lambda_found = 1; }  // Encontró la palabra clave "lambda"
"print"          { print_found = 1; }   // Encontró la palabra clave "print"
[a-zA-Z_][a-zA-Z0-9_]*   { /* Identificador */ }
[0-9]+           { /* Número */ }
"*"              { /* Operador de potencia */ }
"="              { /* Operador de asignación */ }
":"              { /* Dos puntos */ }
"("              { /* Paréntesis izquierdo */ }
")"              { /* Paréntesis derecho */ }
[ \t\n]+         { /* Ignorar espacios, tabulaciones y saltos de línea */ }
.                { /* Ignorar todo lo demás */ }

%%

int main(int argc, char **argv) {
    if (argc < 2) {
        fprintf(stderr, "Uso: %s <archivo>\n", argv[0]);  // Mensaje de uso del programa
        return 1;
    }

    // Abrir el archivo
    FILE *file = fopen(argv[1], "r");
    if (!file) {
        fprintf(stderr, "Error al abrir el archivo %s\n", argv[1]);  // Mensaje de error al abrir el archivo
        return 1;
    }

    // Establecer el archivo de entrada para Lex
    yyin = file;

    // Analizar el archivo de entrada
    yylex();

    // Verificar si se encontraron expresiones lambda y declaraciones print
    if (lambda_found && print_found) {
        printf("ACEPTA\n");  // Si se encontraron ambas, imprimir "ACEPTA"
    } else {
        printf("NO ACEPTA\n");  // Si no se encontraron ambas, imprimir "NO ACEPTA"
    }

    fclose(file);
    return 0;
}
