package utez.edu.mx.integradoraderick.model;

import utez.edu.mx.integradoraderick.utils.Queue;

import java.util.LinkedList;


public class ColaCarritos {
    private Queue<Carrito> fila;

    public ColaCarritos() {
        this.fila = new Queue<>();
    }

    public void offer(Carrito carrito) {
        fila.offer(carrito);
    }

    public Carrito atender() {
        return fila.poll();
    }

    public Carrito peek() {
        return fila.peek();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public Object getCarritos() {
        return fila;
    }
}
