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
    <title>Llenar Carrito</title>
</head>
<body>
<h1>Carrito ID: ${carrito.id}</h1>
<h2>Comprador: ${carrito.persona}</h2>
<ul>
    <c:forEach var="item" items="${carrito.items}">
        <li>${item.nombre} - $${item.precio}</li>
    </c:forEach>
</ul>
<form action="confirmarCarritoServlet" method="post">
    <button type="submit">Confirmar</button>
</form>
</body>
</html>
