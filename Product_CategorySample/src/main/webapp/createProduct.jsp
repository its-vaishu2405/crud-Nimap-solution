<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<!DOCTYPE html>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
    <h1>Create Product</h1>
    <form action="createProduct" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" required>
        <label for="category">Category:</label>
        <select id="category" name="category.id" required>
            <c:forEach var="category" items="${categories}">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        <button type="submit">Create</button>
    </form>
</body>
</html>
