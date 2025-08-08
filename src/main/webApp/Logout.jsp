<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Logout</title>
<style>
  body {
    font-family: sans-serif;
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
  }

  .logout-container {
    background-color: purple;
    padding: 30px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    text-align: center;
  }

  h2 {
    color: #333;
    margin-bottom: 20px;
  }

  p {
    font-size: 18px;
    color: #555;
    margin-bottom: 30px;
  }

  div.logout-button {
    display: inline-block;
    padding: 12px 25px;
    background-color: #d9534f; /* Red for logout */
    color: white;
    text-decoration: none;
    border-radius: 5px;
    transition: background-color 0.3s ease;
  }

  a.logout-button:hover {
    background-color: #c9302c;
  }
</style>
</head>
<body>
    <div class="logout-container">
        <h2>Admin Logout</h2>
        <p>log out</p>
        <div>Logout</div>
    </div>
</body>
</html>