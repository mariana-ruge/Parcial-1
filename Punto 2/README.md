# Análisis Léxico en Flex

Este archivo contiene un programa para análisis léxico escrito en Flex (una herramienta de análisis léxico que genera analizadores a partir de expresiones regulares). El script está diseñado para identificar y clasificar tokens específicos en un archivo de entrada, centrándose en las palabras clave `lambda` y `print`.

## Descripción del Script

El script se divide en dos partes principales:

1. **Definición de Patrones y Tokens:**
   - `"lambda"`: Reconoce la palabra clave `lambda` y establece la variable `lambda_found` a 1 cuando se encuentra.
   - `"print"`: Reconoce la palabra clave `print` y establece la variable `print_found` a 1 cuando se encuentra.
   - `[a-zA-Z_][a-zA-Z0-9_]*`: Coincide con identificadores (nombres de variables o funciones).
   - `[0-9]+`: Coincide con números enteros.
   - `"*"`: Coincide con el operador de potencia.
   - `"="`: Coincide con el operador de asignación.
   - `":"`: Coincide con los dos puntos.
   - `"("`: Coincide con el paréntesis izquierdo.
   - `")"`: Coincide con el paréntesis derecho.
   - `[ \t\n]+`: Ignora espacios, tabulaciones y saltos de línea.
   - `.`: Ignora cualquier otro carácter.

2. **Código C Principal:**
   - Verifica que se haya pasado un archivo como argumento.
   - Abre el archivo especificado para su análisis.
   - Establece el archivo como entrada para el analizador léxico.
   - Ejecuta el análisis léxico con `yylex()`.
   - Imprime `ACEPTA` si se encontraron ambas palabras clave (`lambda` y `print`); de lo contrario, imprime `NO ACEPTA`.
   - Cierra el archivo y termina el programa.

## Requisitos

**1.** Asegúrate de tener Flex y GCC (Compilador de  C) instalados en tu sistema. Puedes instalar estos paquetes usando los siguientes comandos en tu distribución de Linux.
- Para instalar Flex
```sh
sudo apt-get install flex
```
- Para instalar C
```
sudo apt-get install gcc
```
## Uso
1. Compila el archivo flex, en este caso está denominado "analizador.l", luego compilalo con GCC.
Para compilar con Lex (flex)
```
flex lambda.l
```
Para compilar con C (GCC)
```
gcc lex.yy.c -o analizador -lfl
```
2. Ejecuta el analizador.
```
./analizador archivo_entrada.txt
```
El archivo de entrada se llama expresion.txt y es el archivo a analizar.
 