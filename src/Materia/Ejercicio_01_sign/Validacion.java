package Materia.Ejercicio_01_sign;

import Materia.Pilas.PilaGenerica;

public class Validacion {
    public static boolean isValid (String caracteres) {
        PilaGenerica<Character> pila = new PilaGenerica<>();

        for (char c : caracteres.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char arriba = pila.pop();
                if ((c == ')' && arriba != '(' || (c == ']' && arriba != ']') || (c == '}' && arriba != '}'))){
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
