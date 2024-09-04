# Definición de patrones y tokens
BEGIN {  
    # Token para el símbolo de suma
    token_suma = "\\+"          
    # Token para el operador de incremento
    token_incremento = "\\+\\+"  
    # Expresión regular para números enteros
    token_entero = "^[0-9]+"    
    # Expresión regular para números reales
    token_real = "^[0-9]+\\.[0-9]+"  
}  

{
    # Eliminar espacios y tabulaciones al inicio de la línea
    gsub(/^[ \t]+/, "", $0)
    
    # Procesar la línea mientras tenga longitud
    while (length($0) > 0) {
        # Eliminar espacios y tabulaciones al inicio de la línea (repetido para cada iteración)
        gsub(/^[ \t]+/, "", $0)
        
        # Procesar cada patrón en el orden especificado
        if (match($0, token_incremento)) {
            # Imprimir "INCREMENTO" si se encuentra el operador de incremento
            print "INCREMENTO"
            # Eliminar el token procesado de la línea
            $0 = substr($0, RSTART + RLENGTH)
        } else if (match($0, token_suma)) {
            # Imprimir "SUMA" si se encuentra el símbolo de suma
            print "SUMA"
            # Eliminar el token procesado de la línea
            $0 = substr($0, RSTART + RLENGTH)
        } else if (match($0, token_real)) {
            # Imprimir "NUMERO_REAL" si se encuentra un número real
            print "NUMERO_REAL"
            # Eliminar el token procesado de la línea
            $0 = substr($0, RSTART + RLENGTH)
        } else if (match($0, token_entero)) {
            # Imprimir "NUMERO_ENTERO" si se encuentra un número entero
            print "NUMERO_ENTERO"
            # Eliminar el token procesado de la línea
            $0 = substr($0, RSTART + RLENGTH)
        } else {
            # Si no se encuentra un patrón coincidente
            # Eliminar el primer carácter para evitar un bucle infinito
            $0 = substr($0, 1)
        }
    }
}


