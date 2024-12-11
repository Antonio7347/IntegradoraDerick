package utez.edu.mx.integradoraderick.model;

import java.util.LinkedList;
import java.util.Queue;

public class ColaCarritos {
    private Queue<Carrito> cola;

    public ColaCarritos() {
        this.cola = new LinkedList<>();
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
}
