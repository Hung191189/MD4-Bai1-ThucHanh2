<%--
  Created by IntelliJ IDEA.
  User: Le Khanh
  Date: 10/12/2023
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/createCustomers">Create Customer</a>
<%--    ${item.id}, ${item.name}, ${item.email}, ${item.address}--%>
    <table border="1px solid" style="border-collapse: collapse">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
        </tr>
        <c:forEach items="${customersList}" var="item">
   <tr>
       <td>${item.id}</td>
       <td>${item.name}</td>
       <td>${item.email}</td>
       <td>${item.address}</td>
   </tr>
        </c:forEach>
    </table>

</body>
</html>
