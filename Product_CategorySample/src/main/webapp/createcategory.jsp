<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create category</title>
</head>

<body>
    <h1>Create Category</h1>
    <form action="createCategory" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <button type="submit">Create</button>
    </form>
</body>
</html>

