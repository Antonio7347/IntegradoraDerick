package utez.edu.mx.integradoraderick.model;

import utez.edu.mx.integradoraderick.utils.ArrayList;
import utez.edu.mx.integradoraderick.utils.Item;

import java.util.Stack;


public class Carrito {
    private int id;
    private String persona;
    private Stack<Item> items;

    public Carrito(int id, String persona) {
        this.id = id;
        this.persona = persona;
        this.items = new Stack<>();
    }

    public int getId() {
        return id;
    }

    public String getPersona() {
        return persona;
    }

    public Stack<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(int index) {
        this.items.remove(index);
    }

    public Item getItem(int index) {
        return this.items.get(index);
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
