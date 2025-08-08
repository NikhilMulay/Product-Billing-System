<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .success-container {
            background-color: white;
            padding: 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            width: 100%;
            max-width: 500px;
            text-align: center;
        }

        h2 {
            color: #5cb85c;
            font-size: 24px;
            margin-bottom: 20px;
        }

        .admin-name {
            color: #5bc0de;
            font-size: 20px;
            font-weight: bold;
            margin-top: 10px;
        }

        .back-link {
            margin-top: 20px;
            display: block;
            color: #007BFF;
            font-size: 16px;
            text-decoration: none;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body> 
        <%@include file="Product.html" %>
</body>
</html>
