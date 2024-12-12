package utez.edu.mx.integradoraderick.controller;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.model.ColaCarritos;
import utez.edu.mx.integradoraderick.model.Persona;
import utez.edu.mx.integradoraderick.utils.Item;

import java.io.IOException;
import java.util.Random;

@WebServlet("/llenarCarritoServlet")
public class LlenarCarritoServlet extends HttpServlet {
    private static final Random random = new Random();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la cola de carritos desde el contexto de la aplicación
        ServletContext context = getServletContext();
        ColaCarritos colaCarritos = (ColaCarritos) context.getAttribute("colaCarritos");

        // Si no existe la cola, inicializarla
        if (colaCarritos == null) {
            colaCarritos = new ColaCarritos();
        }

        // Crear un nuevo carrito
        Carrito carrito = new Carrito(random.nextInt(1000)+1, getRandomPersona());
        System.out.println("Carrito: " + carrito.getId());

        int cantidadItems = random.nextInt(25)+1;
        System.out.println("Cantidad de items: " + cantidadItems);

        for (int i = 0; i < cantidadItems; i++) {
            Item randomItem = getRandomItem();
            System.out.println("Item: " + randomItem.toString());
            carrito.agregarAlCarrito(randomItem);
        }

        // Agregar el carrito a la cola
        colaCarritos.offer(carrito);

        // Guardar la cola actualizada en el contexto
        context.setAttribute("colaCarritos", colaCarritos);

        // Redirigir a la página de ver carritos
//        response.sendRedirect("/index.jsp");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public static Persona getRandomPersona() {
        // Obtener todos los valores del enum
        Persona[] personas = Persona.values();
        // Generar un índice aleatorio
        int randomIndex = new Random().nextInt(personas.length);
        // Retornar el elemento aleatorio
        return personas[randomIndex];
    }

    public static Item getRandomItem() {
        // Obtener todos los valores del enum
        Item[] items = Item.values();
        // Generar un índice aleatorio
        int randomIndex = new Random().nextInt(items.length);
        // Retornar el elemento aleatorio
        return items[randomIndex];
    }
}

