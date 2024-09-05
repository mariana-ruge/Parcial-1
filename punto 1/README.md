# Análisis Léxico en AWK

Este archivo contiene un programa para  análisis léxico escrito en AWK (Nombrado así por los apellidos de sus autores) que identifica y clasifica diferentes tipos de tokens en una secuencia de texto. El script está diseñado para procesar líneas de entrada y extraer tokens de suma, incremento, números enteros y números reales.

## Descripción del Script

El script está dividido en dos partes principales:

1. **Definición de Patrones y Tokens:**
   - `token_suma`: Expresión regular para el símbolo de suma (`+`).
   - `token_incremento`: Expresión regular para el operador de incremento (`++`).
   - `token_entero`: Expresión regular para números enteros.
   - `token_real`: Expresión regular para números reales (que contienen un punto decimal).También pueden ser enteros, por eso no son solo considerados números decimales.

2. **Procesamiento de Líneas:**
   - Elimina espacios y tabulaciones al inicio de cada línea.
   - Itera sobre cada línea para identificar y clasificar los tokens según los patrones definidos.
   - Imprime el tipo de token encontrado y elimina el token procesado de la línea.

## Requisitos
**1.**  Verifica que por defecto, tu distribución del Linux tenga instalado ** AWK** para ello, ejecuta en tu terminal.
`
awk -W version
`
En caso de no tenerlo instalado, ejecuta en tu terminal.
`
sudo apt-get install gawk
`
Esto instalaría AWK en tu distribución Unix.

Este programa usa la siguiente versión de AWK.

    mawk 1.3.4 20200120
    Copyright 2008-2019,2020, Thomas E. Dickey
    Copyright 1991-1996,2014, Michael D. Brennan

## Uso



Al clonar el repositorio general, se guardarán en carpetas por puntos, esta guía es para ejecutar el punto.
1. Un programa en AWK basado en el siguiente diagrama de estados de un AFD.

[http://https://drive.google.com/file/d/1oxkmHjdxqbwsujcJzYUsWL5PoXdQ2sLX/view?usp=sharing](http://https://drive.google.com/file/d/1oxkmHjdxqbwsujcJzYUsWL5PoXdQ2sLX/view?usp=sharing)

Para ejecutar este script, guarda el código en un archivo con una extensión `.awk` (por ejemplo, `Autiomata.awk`) y utilízalo con el comando `awk` en una terminal. A continuación, se muestra un ejemplo de cómo ejecutarlo:

1. Ubicate en la carpeta de este repositorio.
```sh
    cd 'Parcial-1'
```

2. Ubicate en la carpeta del punto 1.
```sh
    cd 'punto 1'
```
	- Ten en cuenta que el programa recibe un archivo de entrrada llamada prueba.txt.

3. Por último ejecuta en tu terminal.

```sh
awk -f Automata.awk archivo_entrada.txt
```

En el archivo de entrada (llamado "prueba.txt"), se encuentra la denominación de cada uno de los tokens sobre los patrones definidos.

Deberá mostrarte en pantalla la interpretación de cada uno de los tokens.