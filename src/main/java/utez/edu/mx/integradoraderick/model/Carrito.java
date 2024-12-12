package utez.edu.mx.integradoraderick.model;

import utez.edu.mx.integradoraderick.utils.ArrayList;
import utez.edu.mx.integradoraderick.utils.Item;

import java.util.Stack;


public class Carrito {
    private int id;
    private Persona persona;
    private Stack<Item> items;

    public Carrito(int id, Persona persona) {
        this.id = id;
        this.persona = persona;
        this.items = new Stack<>();
    }

    public int getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    // Obtenemos los items del carrito
    public Stack<Item> getItems() {
        return items;
    }

    // Agregamos el item al carrito
    public void agregarAlCarrito(Item item) {
        this.items.push(item);
    }

    // Sacamos el item del Stack (del carrito)
    public void escanearProducto() {
        this.items.pop();
    }

    // Agarramos un item pero sin scanearlo
    public Item verItem() {
        return this.items.peek();
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "id=" + id +
                ", persona='" + persona + '\'' +
                ", items=" + items +
                '}';
    }
}
