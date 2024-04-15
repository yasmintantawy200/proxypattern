<%-- 
    Document   : books
    Created on : Apr 15, 2024, 4:03:35 AM
    Author     : dalia
--%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Books Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        .container {
            width: 80%;
            margin: 20px auto;
        }

        h1 {
            color: #333;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        li {
            background-color: #fff;
            margin: 10px 0;
            padding: 10px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Books</h1>
        <ul>
            <% if (books != null) { %>
                <% for (Book book : books) { %>
                    <li><a href="bookDetails.jsp?id=<%= book.getId() %>"><%= book.getTitle() %> by <%= book.getAuthor() %> - $<%= book.getPrice() %></a></li>
                <% } %>
            <% } else { %>
                <li>No books available</li>
            <% } %>
        </ul>
    </div>
</body>
</html>

