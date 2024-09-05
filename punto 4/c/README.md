## Quicksort en C
Este programa en C utiliza el algoritmo Quicksort para ordenar un array de números enteros generados aleatoriamente. Mide el tiempo de ejecución del algoritmo.

### Funciones Principales

1. **`intercambiar(int *a, int *b)`**
   - Intercambia dos elementos en el array.

2. **`particionar(int arr[], int bajo, int alto)`**
   - Particiona el array alrededor de un pivote.

3. **`quicksort(int arr[], int bajo, int alto)`**
   - Ordena el array usando el algoritmo Quicksort.

4. **`imprimirArray(int arr[], int tamaño)`**
   - Imprime los elementos del array.

### Requisitos

1. **Compilador de C:** Necesitas un compilador de C, como GCC. Puedes instalarlo con:

    ```sh
    sudo apt-get install gcc
    ```

### Uso

1. **Compila el Programa:**

    Utiliza GCC para compilar el programa:

    ```sh
    gcc quicksort.c -o quicksort
    ```

2. **Ejecuta el Programa:**

    Ejecuta el archivo compilado:

    ```sh
    ./quicksort
    ```

