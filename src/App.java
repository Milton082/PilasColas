import Materia.Colas.Cola;
import Materia.Colas.ColaGenerica;
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
        System.out.println("Elemento en la clase de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());
        System.out.println("Elemento en la clase de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());
        System.out.println("Elemento en la clase de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());
        System.out.println("Elemento en la clase de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());

        System.out.println();

        PilaGenerica<Pantalla> pilaPantalla = new PilaGenerica<>();
        pilaPantalla.push(new Pantalla("Home page", "/home"));
        pilaPantalla.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantalla.push(new Pantalla("Settings Page", "/home/menu/setings"));

        System.out.println("Estoy en la pantalla:\n\t  -->" + pilaPantalla.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t  -->" + pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t  -->" + pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t  -->" + pilaPantalla.peek().getNombre());

        System.out.println();

        Cola cola = new Cola();
        cola.addNode(5);
        cola.addNode(3);
        cola.addNode(2);
        cola.addNode(1);

        System.out.println("Elemento en la clase de la cola es: " + cola.peek());
        System.out.println("Elemento eliminado de la cola es: " + cola.remove());
        System.out.println("Elemento en la clase de la cola es: " + cola.peek());

        System.out.println();

        ColaGenerica<Pantalla> colaGenerica = new ColaGenerica<>();
        colaGenerica.addNode(new Pantalla("Home page", "/home"));
        colaGenerica.addNode(new Pantalla("Menu Page", "/home/menu"));
        colaGenerica.addNode(new Pantalla("Settings Page", "/home/menu/setings"));

        ColaGenerica<Double> colaDouble = new ColaGenerica<>();
        System.out.println("");
        colaDouble.addNode(10.8);
        colaDouble.addNode(6.0);
        colaDouble.addNode(3.90);
        colaDouble.addNode(4.69);
        System.out.println("Elememtos de la cola  " + colaDouble.getsize());
        System.out.println("Elemento al inicio de la colaInt " + colaDouble.peek());
        System.out.println("Eliminado el primer objeto" + colaDouble.remove());
        System.out.println("Elemento al inicio de la colaInt " + colaDouble.peek());
        System.out.println("Tamaño de la cola  " + colaDouble.getsize());
    }
}
