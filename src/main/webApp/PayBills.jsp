<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="DisplayServlet.ProductBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 20px;
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    table {
        width: 90%;
        border-collapse: collapse;
        margin-bottom: 20px;
        background-color: white;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        overflow: hidden;
    }

    th, td {
        padding: 12px 15px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #007bff;
        color: white;
        font-weight: 600;
    }

    tr:hover {
        background-color: #f0f0f0;
    }

    a {
        display: inline-block;
        padding: 10px 20px;
        margin: 5px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }

    a:hover {
        background-color: #0056b3;
    }

    .total-bill {
        font-size: 18px;
        font-weight: bold;
        margin-bottom: 20px;
    }
</style>
<script>
    function addValue(productId) {
        // Implement your JavaScript logic here if needed
        console.log("Checkbox clicked for product ID: " + productId);
    }
</script>
</head>
<body>
    <h2>Product List</h2>
    <table>
        <tr>
            <th>ProductId</th>
            <th>ProductName</th>
            <th>ProductPrice</th>
            <th>ProductQuantity</th>
            <th>ProductRate</th>
            <th>Select</th>
        </tr>
        <%
            ArrayList<ProductBean> list = (ArrayList<ProductBean>) session.getAttribute("arrayList");
            if (list != null && !list.isEmpty()) {
                Iterator<ProductBean> itr = list.iterator();
                double totalBillToBePaid = 0;
                while (itr.hasNext()) {
                    ProductBean bean = itr.next();
                    double productRate = Double.parseDouble(bean.getProductPrice()) * Integer.parseInt(bean.getProductQuantity());
                    totalBillToBePaid += productRate;
        %>
        <tr>
            <td><%=bean.getProductId()%></td>
            <td><%=bean.getProductName()%></td>
            <td><%=bean.getProductPrice()%></td>
            <td><%=bean.getProductQuantity()%></td>
            <td><%=productRate%></td>
            <td><input type="checkbox" value="<%=bean.getProductId()%>" name="product" onclick="addValue('<%=bean.getProductId()%>')"></td>
        </tr>
        <%
                }
                session.setAttribute("bill", totalBillToBePaid);
        %>
        <tr><td colspan="6" class="total-bill">Total Bill: <%= totalBillToBePaid %></td></tr>
        <%
            } else {
        %>
        <tr><td colspan="6">No products found.</td></tr>
        <%
            }
        %>
    </table>
    <div>
        <a href="Product.html">Add product</a>
        <a href="generateBill">Pay Bill</a>
        <a href="remove">Remove product</a>
    </div>
</body>
</html>



