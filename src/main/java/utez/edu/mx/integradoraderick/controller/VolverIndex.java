package utez.edu.mx.integradoraderick.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utez.edu.mx.integradoraderick.model.Carrito;
import utez.edu.mx.integradoraderick.model.ColaCarritos;
import utez.edu.mx.integradoraderick.model.Persona;
import utez.edu.mx.integradoraderick.utils.Item;

import java.io.IOException;

@WebServlet("/index")
public class VolverIndex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}


