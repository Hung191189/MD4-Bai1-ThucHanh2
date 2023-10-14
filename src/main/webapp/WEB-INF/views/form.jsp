<%--
  Created by IntelliJ IDEA.
  User: Le Khanh
  Date: 10/13/2023
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="global">
  <form  method="post">
    <fieldset>
      <legend>Add a customers</legend>
      <label for="name">Name: </label>
      <input type="text" id="name" name="name" value=""
             tabindex="1">
      <label for="email">Email: </label>
      <input type="text" id="email" name="email"
             tabindex="2">
      <label for="address">Address: </label>
      <input type="text" id="address" name="address" tabindex="3">
      <div id="buttons">
        <label > </label>
        <input id="reset" type="reset" tabindex="4">
        <input id="submit" type="submit" tabindex="5"
               value="Add Product">
      </div>
    </fieldset>
  </form>
</div>
</body>
</html>
