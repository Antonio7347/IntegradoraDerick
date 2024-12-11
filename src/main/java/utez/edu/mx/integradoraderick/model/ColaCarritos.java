package utez.edu.mx.integradoraderick.model;

import utez.edu.mx.integradoraderick.utils.Queue;

import java.util.LinkedList;


public class ColaCarritos {
    private Queue<Carrito> cola;

    public ColaCarritos() {
        this.cola = new Queue<>();
    }

    public void offer(Carrito carrito) {
        cola.offer(carrito);
    }

    public Carrito poll() {
        return cola.poll();
    }

    public Carrito peek() {
        return cola.peek();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public Object getCarritos() {
        return cola;
    }
}
