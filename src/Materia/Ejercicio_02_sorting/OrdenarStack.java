package Materia.Ejercicio_02_sorting;

import java.util.Stack;

public class OrdenarStack {
    public static void ordenarStack(Stack<Integer> stack) {
        Stack<Integer> auxStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!auxStack.isEmpty() && auxStack.peek() > temp) {
                stack.push(auxStack.pop());
            }

            auxStack.push(temp);
        }

        // Pasar los elementos ordenados de vuelta al stack original
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(90);
        stack.push(10);
        stack.push(49);
        stack.push(22);

        System.out.println("Stack antes de ordenar: " + stack);
        ordenarStack(stack);
        System.out.println("Stack después de ordenar: " + stack);
    }
}

