<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="DisplayServlet.*,java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill Status</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column; /* Added to stack content vertically */
        }

        .box-container {
            background-color: #ffffff;
            border-radius: 12px;
            padding: 40px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
            max-width: 450px;
            width: 90%;
            text-align: center;
            margin-bottom: 30px; /* Space between box and link */
        }

        .box-container span {
            font-size: 24px;
            color: #333333;
            display: block;
            margin-bottom: 15px;
        }

        .box-container b {
            color: #28a745; /* Green for success */
            font-size: 32px;
            font-weight: 600;
            display: block;
        }

        .box-container {
            border: 2px solid #28a745;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .box-container:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 25px rgba(0, 0, 0, 0.15);
        }

        a {
            display: inline-block;
            padding: 15px 30px;
            background-color: #007bff; /* Blue for primary action */
            color: white;
            text-decoration: none;
            border-radius: 8px;
            font-size: 18px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="box-container">
        <span><%= session.getAttribute("bill") %></span>
        <b>Paid</b>
    </div>

    <a href="Product.html">Home Page</a>

</body>
</html>