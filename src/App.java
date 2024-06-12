import java.util.Stack;

import Materia.Colas.Cola;
import Materia.Ejercicio_01_sing.Signo;
import Materia.Ejercicio_02_sorting.OrdenarStack;
import Materia.Ejercicio_03_linkedLists.ListasEnlazadas;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Node;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
          Pila pila = new Pila();
          pila.push(10);
          pila.push(20);
          pila.push(30);
          pila.push(40);
        /* System.out.println("Elemento en la clase de la pila es: " + pila.peek());
          System.out.println("Elemento eliminado de la pila es: " + pila.pop());
          System.out.println("Elemento en la clase de la pila es: " + pila.peek());
          System.out.println("Elemento eliminado de la pila es: " + pila.pop());
          System.out.println("Elemento en la clase de la pila es: " + pila.peek());
          System.out.println("Elemento eliminado de la pila es: " + pila.pop());
          System.out.println("Elemento en la clase de la pila es: " + pila.peek());
          System.out.println("Elemento eliminado de la pila es: " + pila.pop());
         */
          System.out.println();
         
          PilaGenerica<Pantalla> pilaPantalla = new PilaGenerica<>();
          pilaPantalla.push(new Pantalla("Home page", "/home"));
          pilaPantalla.push(new Pantalla("Menu Page", "/home/menu"));
          pilaPantalla.push(new Pantalla("Settings Page", "/home/menu/setings"));
         /* 
         * System.out.println("Estoy en la pantalla:\n\t  -->" +
         * pilaPantalla.peek().getNombre());
         * System.out.println("Destruir pantalla:\n\t  -->" +
         * pilaPantalla.pop().getNombre());
         * System.out.println("Estoy en la pantalla:\n\t  -->" +
         * pilaPantalla.peek().getNombre());
         * pilaPantalla.push(new Pantalla("User Page", "/home/menu/user"));
         * System.out.println("Estoy en la pantalla:\n\t  -->" +
         * pilaPantalla.peek().getNombre());
         * 
         * System.out.println();
        */

         
          Cola cola = new Cola();
          cola.addNode(5);
          cola.addNode(3);
          cola.addNode(2);
          cola.addNode(1);
         /*  
         * System.out.println("Elemento en la clase de la cola es: " + cola.peek());
         * System.out.println("Elemento eliminado de la cola es: " + cola.remove());
         * System.out.println("Elemento en la clase de la cola es: " + cola.peek());
         * 
         * System.out.println();
         * 
         * ColaGenerica<Pantalla> colaGenerica = new ColaGenerica<>();
         * System.out.println(("El numero de elementos es: "+colaGenerica.getsize()));
         * colaGenerica.addNode(new Pantalla("Home page", "/home"+
         * "\n El numero de elementos es: "+colaGenerica.getsize()));
         * colaGenerica.addNode(new Pantalla("Menu Page", "/home/menu"));
         * colaGenerica.addNode(new Pantalla("Settings Page", "/home/menu/setings"));
         * 
         * ColaGenerica<Double> colaDouble = new ColaGenerica<>();
         * System.out.println("");
         * colaDouble.addNode(10.8);
         * colaDouble.addNode(6.0);
         * colaDouble.addNode(3.90);
         * colaDouble.addNode(4.69);
         * System.out.println("Elememtos de la cola  " + colaDouble.gesize(t));
         * System.out.println("Elemento al inicio de la colaInt " + colaDouble.peek());
         * System.out.println("Eliminado el primer objeto" + colaDouble.remove());
         * System.out.println("Elemento al inicio de la colaInt " + colaDouble.peek());
         * System.out.println("Tamaño de la cola  " + colaDouble.getsize());
         */
        
       
         String cadena1 = "([]){}";


        //Resultado de clase signo
        if (Signo.validarSignos(cadena1)) {
            System.out.println("La cadena '" + cadena1 + "' está correctamente balanceada.");
        } else {
            System.out.println("La cadena '" + cadena1 + "' NO está correctamente balanceada.");
        }

        String cadena2 = "({)}";
        if (Signo.validarSignos(cadena2)) {
            System.out.println("La cadena '" + cadena2 + "' está correctamente balanceada.");
        } else {
            System.out.println("La cadena '" + cadena2 + "' NO está correctamente balanceada.");
        }

        System.out.println();
        // resultado de la clase Ordenar_un_Stockl
        Stack<Integer> stack = new Stack<>();
        stack.push(90);
        stack.push(10);
        stack.push(49);
        stack.push(22);

        System.out.println("Stack antes de ordenar: " + stack);
        OrdenarStack.ordenarStack(stack);
        System.out.println("Stack después de ordenar: " + stack);

        System.out.println();

         //Lista ENLAZADA
            ListaEnlazada lista = new ListaEnlazada();
            lista.addNode(1);
            lista.addNode(4);
            lista.addNode(3);
            lista.addNode(6);
            lista.print();
            lista.deleteNode(1);
            lista.print();
            lista.deleteNode(3);
            lista.print();

            System.out.println();
            
         //Imprimir listas Enlazadas
         ListasEnlazadas lista2 = new ListasEnlazadas();
         lista2.addNode(3);
         lista2.addNode(42);
         lista2.addNode(23);
         lista2.addNode(13);
         lista2.addNode(44);
        
         int N = 1; // Posición desde el final
         Node resultado = lista2.encotrarNode(N);
         if (resultado != null) {
             System.out.println("El nodo en la posición " + N + " desde el final es: " + resultado.value);
         } else {
             System.out.println("La posición " + N + " es inválida.");
         }
    }
}


