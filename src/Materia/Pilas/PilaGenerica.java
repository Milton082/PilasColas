package Materia.Pilas;

import Materia.Models.NodoGenerico;
import java.util.EmptyStackException;

public class PilaGenerica<T> {

    private NodoGenerico<T> top;
    public NodoGenerico<T> size;

    public PilaGenerica() {
        top = null;
    }

    public int size(){
        return 0;
    }

    public void push(T dato) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(dato);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        return top.data;
    }
}
