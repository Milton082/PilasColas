package Materia.Ejercicio_01_sing;

import java.util.Stack;

public class Signo {
    public static boolean validarSignos(String cadena) {
        Stack<Character> stack = new Stack<>();
        char[] caracteres = cadena.toCharArray();

        for (char caracter : caracteres) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                stack.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if ((caracter == ')' && stack.peek() == '(') ||
                           (caracter == '}' && stack.peek() == '{') ||
                           (caracter == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        if (validarSignos("([]){}")) {
            System.out.println("La cadena está correctamente balanceada.");
        } else {
            System.out.println("La cadena NO está correctamente balanceada.");
        }

        if (validarSignos("({)}")) {
            System.out.println("La cadena está correctamente balanceada.");
        } else {
            System.out.println("La cadena NO está correctamente balanceada.");
        }
    }
}

