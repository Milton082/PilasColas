package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    public int size;

    public ColaGenerica() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    public void addNode(T data) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
        } else {
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
        size +=1;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }
        size -=1;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getsize() {
        return size;
    }
}
