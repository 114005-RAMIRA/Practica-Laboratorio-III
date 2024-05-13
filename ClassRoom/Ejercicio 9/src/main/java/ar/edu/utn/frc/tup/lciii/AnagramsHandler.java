package ar.edu.utn.frc.tup.lciii;

// Clase para manejar operaciones relacionadas con anagramas
public class AnagramsHandler {

    // Método para verificar si dos cadenas son anagramas
    static boolean isAnagram(String a, String b) {
        // Convertir las cadenas a minúsculas y convertirlas en matrices de caracteres
        char aa[] = a.toLowerCase().toCharArray();
        char bb[] = b.toLowerCase().toCharArray();

        // Verificar si las cadenas tienen la misma longitud
        if(a.length() != b.length()){
            // Si no tienen la misma longitud, no pueden ser anagramas
            return false;
        }
        else{
            // Ordenar las matrices de caracteres
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            // Verificar si las matrices ordenadas son iguales
            return java.util.Arrays.equals(aa, bb);
        }
    }
}

