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
        .details-table th, .details-table td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        .details-table th {
            background-color: #f4f4f4;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="mb-4">Lista de Carritos Procesados</h1>
    <form action="/IntegradoraDerick_war_exploded/atenderCarritosServlet" method="get">
        <button type="submit" class="btn btn-primary">Atender carritos</button>
    </form>

    <div class="row mt-4">
        <%
            // Obtener la cola de carritos desde el contexto de la aplicación
            ColaCarritos cola = (ColaCarritos) application.getAttribute("colaCarritos");

            if (cola != null && !cola.isEmpty()) {
                // Convertir la cola a una lista para iterar
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

        <div class="col-12 mb-5">
            <table class="details-table mb-3">
                <tr>
                    <th>ID del Carrito</th>
                    <td><%= carrito.getId() %></td>
                </tr>
                <tr>
                    <th>Persona</th>
                    <td><%= carrito.getPersona() %></td>
                </tr>
                <tr>
                    <th>Número de Items</th>
                    <td><%= carrito.getItems().size() %></td>
                </tr>
            </table>

            <h3>Productos</h3>
            <div class="row">
                <%
                    int index = 1;
                    for (Item item : carrito.getItems()) {
                %>
                <div class="col-md-4 mb-3">
                    <div class="card">
                        <img src="<%= item.getRutaImagen() %>" class="img-fluid" alt="<%= item.getNombre() %>">
                        <div class="card-body">
                            <h5 class="card-title"><%= item.getNombre() %></h5>
                            <p class="card-text">Precio: $<%= item.getPrecio() %></p>
                        </div>
                    </div>
                </div>
                <% } %>
            </div>
        </div>
        <%
            }
        } else {
        %>
        <div class="col-12">
            <div class="alert alert-info">No hay carritos procesados.</div>
        </div>
        <%
            }
        %>
    </div>

    <div class="position-fixed bottom-0 start-0 p-3">
        <% if ((Carrito) request.getSession().getAttribute("carrito") != null) { %>
        <div class="alert alert-primary" role="alert">
            <% Carrito carritoActual = (Carrito) request.getSession().getAttribute("carrito"); %>

            <h4 class="alert-heading">Se va a atender el carrito con ID: <%= carritoActual.getId() %></h4>
            <ul>
                <%
                    double total = 0.0;
                    for (int i = 0; i < carritoActual.getItems().size(); i++) {
                %>
                <li>Escaneando: <%= carritoActual.getItems().peek().getNombre() %></li>
                <%
                        total += carritoActual.getItems().pop().getPrecio();
                    }
                %>
            </ul>
            <hr>
            <p>Se cobro: $<%= total %></p>
            <p>Atendido por: <%= carritoActual.getPersona() %></p>
            <p>Gracias por su compra</p>
        </div>
        <% } %>
    </div>

    <% request.getSession().removeAttribute("carrito"); %>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
