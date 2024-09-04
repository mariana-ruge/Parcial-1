#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LONGITUD_LINEA 1024

// Función para contar las ocurrencias de la palabra clave en una línea
int contar_ocurrencias(const char *linea, const char *clave) {
    int conteo = 0;
    const char *ptr = linea;

    // Busca la primera ocurrencia de la palabra clave en la línea
    while ((ptr = strstr(ptr, clave)) != NULL) {
        conteo++;
        // Avanza el puntero después de la palabra clave encontrada
        ptr += strlen(clave);
    }

    return conteo;
}

int main(int argc, char *argv[]) {
    // Verifica que se hayan pasado exactamente dos argumentos
    if (argc != 3) {
        fprintf(stderr, "Uso: %s <archivo> <palabra_clave>\n", argv[0]);
        return 1;
    }

    // Asigna los nombres de archivo y palabra clave a variables
    const char *nombre_archivo = argv[1];
    const char *palabra_clave = argv[2];
    
    // Abre el archivo para lectura
    FILE *archivo = fopen(nombre_archivo, "r");

    // Verifica si el archivo se abrió correctamente
    if (archivo == NULL) {
        perror("Error al abrir el archivo");
        return 1;
    }

    char linea[MAX_LONGITUD_LINEA];
    int conteo_total = 0;

    // Lee el archivo línea por línea
    while (fgets(linea, sizeof(linea), archivo) != NULL) {
        // Suma las ocurrencias encontradas en cada línea
        conteo_total += contar_ocurrencias(linea, palabra_clave);
    }

    // Cierra el archivo
    fclose(archivo);

    // Muestra el resultado
    printf("La palabra '%s' se repite %d veces en el texto.\n", palabra_clave, conteo_total);

    return 0;
}

