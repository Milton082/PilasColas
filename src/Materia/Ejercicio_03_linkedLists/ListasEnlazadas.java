package Materia.Ejercicio_03_linkedLists;

import Materia.Models.Node;

public class ListasEnlazadas {

    private Node head;

    public ListasEnlazadas() {
        this.head = null;
    }

    // Agregamos nodos a la lista
    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node actual = head;
        while (actual.next != null) {
            actual = actual.next;
        }

        actual.next = new Node(value);

    }

    public void imprimirLista(){
        if (head == null) {
            System.out.println("La lista está vacia");
            return;
        }

        Node actual = head;
        while (actual != null) {
            System.out.println(actual.value + " -> ");
            actual = actual.next;
            
        }
        System.out.println();
    }

    // Método para encontrar el nodo N desde el final.
    public Node encotrarNode (int N){
        if (head == null || N < 0 ) {
            return null;
        }

        Node first = head;
        Node second = head;

        // Mover el primer puntero N pasos adelante
        for (int i = 0; i < N; i++) {
            if (first == null) {
                return null; // Si N es mayor que la longitud de la lista
            }
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
    
        return second;
    }

}
