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
        System.out.println("Elemento en la clase de la pila es: "+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la clase de la pila es: "+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la clase de la pila es: "+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la clase de la pila es: "+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());

        System.out.println();
       
        PilaGenerica<Pantalla> pilaPantalla = new PilaGenerica<>();
        pilaPantalla.push(new Pantalla("Home page", "/home"));
        pilaPantalla.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantalla.push(new Pantalla("Settings Page", "/home/menu/setings"));

        System.out.println("Estoy en la pantalla:\n\t  -->"+pilaPantalla.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t  -->"+pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t  -->"+pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t  -->"+pilaPantalla.peek().getNombre());
    }
}
