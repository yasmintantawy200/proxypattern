<%-- 
    Document   : bookDetails
    Created on : Apr 15, 2024, 4:04:05 AM
    Author     : dalia
--%>

<!DOCTYPE html>
<html>
<head>
    <title>Book Details Page</title>
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

        h2 {
            color: #333;
        }

        h3 {
            color: #777;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Book Details</h1>
        <h2>Title: <%= book.getTitle() %></h2>
        <h3>Author: <%= book.getAuthor() %></h3>
        <h3>Price: $<%= book.getPrice() %></h3>
        <p><a href="books.jsp">Back to Books</a></p>
    </div>
</body>
</html>
