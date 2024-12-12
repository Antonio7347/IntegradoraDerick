package utez.edu.mx.integradoraderick.controller;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.utils.Item;

import java.io.IOException;
import java.util.Random;

@WebServlet("/llenarCarritoServlet")
public class LlenarCarritoServlet extends HttpServlet {
    private static final Random random = new Random();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = random.nextInt(1000);
        String persona = "Persona " + (random.nextInt(100) + 1);
        Carrito carrito = new Carrito(id, persona);

        Item[] itemsDisponibles = Item.values();
        int cantidadItems = random.nextInt(6) + 5;
        for (int i = 0; i < cantidadItems; i++) {
            Item itemAleatorio = itemsDisponibles[random.nextInt(itemsDisponibles.length)];
            carrito.addItem(itemAleatorio);
        }

        HttpSession session = request.getSession();
        session.setAttribute("carritoActual", carrito);

        request.setAttribute("carrito", carrito);
        request.getRequestDispatcher("llenarCarrito.jsp").forward(request, response);
    }
}

