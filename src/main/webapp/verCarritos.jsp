<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="utez.edu.mx.integradoraderick.model.Carrito" %>
<%@ page import="utez.edu.mx.integradoraderick.utils.Item" %>
<%@ page import="utez.edu.mx.integradoraderick.model.ColaCarritos" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Carritos Procesados</title>
    <style>
        body { font-family: Arial, sans-serif; }
        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
        .details-table {
            width: 100%;
            border-collapse: collapse;
        }
        .details-table th,
        .details-table td {
            border: 1px solid #ddd;
            padding: 5px;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>Lista de Carritos Procesados</h1>
<form action="/IntegradoraDerick_war_exploded/atenderCarritosServlet" method="get">
    <button type="submit" class="raise">Atender carritos</button>
</form>

<%
    // Obtener la cola de carritos desde el contexto de la aplicación
    ColaCarritos cola = (ColaCarritos) application.getAttribute("colaCarritos");

    if (cola != null && !cola.isEmpty()) {
        // Convertir la cola a una lista para poder iterar
        List<Carrito> carritos = new ArrayList<>();
        while (!cola.isEmpty()) {
            carritos.add(cola.atender());
        }

        // Volver a llenar la cola con los carritos
        for (Carrito carrito : carritos) {
            cola.offer(carrito);
        }

        // Guardar la cola actualizada en el contexto
        application.setAttribute("colaCarritos", cola);

        // Mostrar los carritos
        for (Carrito carrito : carritos) {
%>
<table>
    <thead>
    <tr>
        <th>Detalles Completos del Carrito</th>
    </tr>
    </thead>
    <tbody>

    <tr>
        <td>
            <h2>Carrito #<%= carrito.getId() %></h2>
            <table class="details-table">
                <tr>
                    <th>Propiedad</th>
                    <th>Valor</th>
                </tr>
                <tr>
                    <td>ID del Carrito</td>
                    <td><%= carrito.getId() %></td>
                </tr>
                <tr>
                    <td>Persona</td>
                    <td><%= carrito.getPersona() %></td>
                </tr>
                <tr>
                    <td>Número de Items</td>
                    <td><%= carrito.getItems().size() %></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <h3>Detalles de Items</h3>
                        <table class="details-table">
                            <tr>
                                <th>Índice</th>
                                <th>Nombre</th>
                                <th>toString()</th>
                            </tr>
                            <%
                                int index = 1;
                                for (Item item : carrito.getItems()) {
                            %>
                            <tr>
                                <td><%= index++ %></td>
                                <td><%= item.getNombre() %></td>
                                <td><%= item.toString() %></td>
                            </tr>
                            <% } %>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    </tbody>
</table>

<%
    }
    } else {
%>
<h1>No hay carritos procesados. </h1>
<%
    }
%>
<div class="position-fixed bottom-0 start-0 p-3">
    <% if ((Carrito) request.getSession().getAttribute("carrito") != null) {%>
    <div class="alert alert-primary" role="alert">
        <%Carrito carritoActual = (Carrito) request.getSession().getAttribute("carrito");%>

        <h4 class="alert-heading"><%="Se va a atender el carrito con ID: " + carritoActual.getId()%></h4>
        <ul>
        <%
            double total = 0.0;
            for (int i = 0; i < carritoActual.getItems().size(); i++){%>
            <li><%="Escaneando: " + carritoActual.getItems().peek().getNombre()%></li>
            <%total+=carritoActual.getItems().pop().getPrecio();}%>
        </ul>
        <p>
        <hr>
        <p><%="Se cobró: " + total + "..."%></p>
        <p class="mb-0"><%="Se atendio al carrito con ID: "+carritoActual.getId()%></p>
        <p class="mb-0"><%="Atendido por: "+carritoActual.getPersona()%></p>
        <p class="mb-0"><%="Gracias por su compra"%></p>
    </div>
    <%}%>
</div>
<%
    request.getSession().removeAttribute("carrito");
%>
</body>
</html>