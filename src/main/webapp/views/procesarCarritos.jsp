<%--
  Created by IntelliJ IDEA.
  User: Joseb
  Date: 10/12/2024
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Procesar Carrito</title>
</head>
<body>
<c:choose>
    <c:when test="${not empty carrito}">
        <h1>Procesando Carrito ID: ${carrito.id}</h1>
        <h2>Comprador: ${carrito.persona}</h2>
        <ul>
            <c:forEach var="item" items="${carrito.items}">
                <li>${item.nombre} - $${item.precio}</li>
            </c:forEach>
        </ul>
        <form action="procesarSiguienteServlet" method="post">
            <button type="submit">Confirmar y procesar siguiente</button>
        </form>
    </c:when>
    <c:otherwise>
        <h1>No hay más pedidos</h1>
    </c:otherwise>
</c:choose>
</body>
</html>

