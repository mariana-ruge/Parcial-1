# Contador de Ocurrencias de Palabras en un Archivo

Este programa en C cuenta las ocurrencias de una palabra clave en un archivo de texto. Utiliza funciones estándar de la biblioteca C para leer el archivo y buscar la palabra clave en cada línea.

## Descripción del Programa

El programa se encarga de contar cuántas veces aparece una palabra clave específica en un archivo de texto. La búsqueda es sensible al caso y se realiza línea por línea. 

### Funciones Principales

1. **`contar_ocurrencias(const char *linea, const char *clave)`**
   - **Descripción:** Cuenta las ocurrencias de la palabra clave en una línea de texto.
   - **Parámetros:**
     - `linea`: Línea de texto en la que se busca la palabra clave.
     - `clave`: Palabra clave que se está buscando.
   - **Devuelve:** Número de veces que la palabra clave aparece en la línea.

2. **`main(int argc, char *argv[])`**
   - **Descripción:** Función principal que abre el archivo, lee línea por línea, y cuenta las ocurrencias de la palabra clave.
   - **Parámetros:**
     - `argc`: Número de argumentos de línea de comandos.
     - `argv`: Array de argumentos de línea de comandos, donde el primer argumento es el nombre del archivo y el segundo es la palabra clave.

## Requisitos

1. **Compilador de C:** Necesitas tener un compilador de C instalado. Puedes usar GCC (GNU Compiler Collection) para compilar el programa. Puedes instalar GCC usando el siguiente comando en una distribución basada en Debian:

    ```sh
    sudo apt-get install gcc
    ```

2. **Archivos de Entrada:** El programa requiere un archivo de texto de entrada y una palabra clave como argumentos. Asegúrate de que el archivo de texto existe y es accesible desde el programa.

## Uso

1. **Compila el Programa:**

    Utiliza GCC para compilar el programa. En la terminal, ejecuta:

    ```sh
    gcc -o contador contador.c
    ```

    Esto generará un archivo ejecutable llamado `contador_ocurrencias`.

2. **Ejecuta el Programa:**

    Ejecuta el programa proporcionando el nombre del archivo y la palabra clave como argumentos. Por ejemplo:

    ```sh
    ./contador archivo.txt palabra
    ```

    Donde `archivo.txt` es el archivo de texto en el que quieres buscar y `palabra` es la palabra clave que deseas contar.