Advanced Java Lab Project - Online Billing System
Overview
This is a Java-based web application designed as an Online Billing System for product and customer management. The system enables admin login/logout, product addition/removal, customer details management, and bill generation with payment processing. It is built using Java Servlets, JSP, and Oracle Database.

Features
Admin Module
-------------
Secure login and logout functionality.
Manage products: add new products or remove existing ones.
View customer details.

Customer Module
---------------
View products.
Generate bills for purchased products.
Process payments and mark bills as paid.

Database Integration
---------------------
Uses Oracle DB to store product, customer, and billing information.
JDBC connectivity for seamless database operations.

Technologies Used
------------------
Java EE Servlets and JSP
Oracle Database with JDBC (ojdbc11.jar)
HTML and JSP for frontend pages
Eclipse IDE project structure
Apache Tomcat (recommended) for deployment





The system provides a secure and efficient platform for both administrators and customers. Admins begin by logging into a protected login page using their credentials, granting them access to various management features. They can easily add new products with relevant details like name and price or remove outdated products to keep the inventory current. Additionally, admins can view customer information, track billing histories, and manage customer-related data, ensuring smooth operational control.

On the customer side, users can browse the available product catalog through an intuitive web interface. When customers select products, the system automatically generates a detailed bill reflecting their choices and prices. They can then proceed to pay their bills online, after which the system updates the bill status to "Paid" and securely records the transaction. All product, customer, billing, and payment data is maintained in an Oracle Database, with the application leveraging JDBC connectivity  to facilitate reliable and seamless database interactions. The user-friendly web interface, built with JSP and HTML, provides convenient access to all these functionalities for both admins and customers.
