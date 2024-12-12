package utez.edu.mx.integradoraderick.model;

import utez.edu.mx.integradoraderick.utils.Queue;

public class ColaCarritos {
    private static Queue<Carrito> fila;

    public ColaCarritos() {
        fila = new Queue<>();
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

    public Queue<Carrito> getFila() {
        return fila;
    }

    public void setFila(Queue<Carrito> fila) {
        this.fila = fila;
    }

    public Queue<Carrito> getCarritos() {
        return fila;
    }
}
