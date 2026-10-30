**Vegetables and Fruits Invoice System – Java POC**

Overview:
The Vegetables and Fruits Invoice System is a console-based billing application developed using Core Java.
The application simulates a basic grocery shopping and invoice generation process. Users can select products from different categories, specify quantities, calculate item-wise totals, receive discounts based on the purchase amount, and select a payment method.
The application is designed to demonstrate practical Java programming concepts through a simple retail billing workflow.

Key Features:
 - Interactive category-based product menu.
 - Multiple product categories.
 - Product selection with predefined prices.
 - Quantity-based price calculation.
 - Supports different measurement units such as kg, litres, pieces, packets, and packs.
 - Validates product selection.
 - Validates positive quantities.
 - Supports multiple item purchases.
 - Automatic subtotal calculation.
 - 10% discount for purchases of ₹1,000 or above.
 - Final invoice generation.
 - Payment method selection.
 - Displays the final payable amount.
   
Available Product Categories
1. Fruits
 - Apple
 - Banana
 - Orange
 - Grapes
 - Guava
 - Papaya
 - Pomegranate
 - Mango
 - Watermelon
 - Pineapple
2. Vegetables
 - Tomato
 - Potato
 - Onion
 - Carrot
 - Cabbage
 - Cauliflower
 - Brinjal
 - Cucumber
 - Spinach
 - Capsicum
3. Dairy Products
 - Milk
 - Curd
 - Paneer
 - Butter
 - Cheese
 - Ghee
 - Buttermilk
 - Yogurt
 - Cream
 - Condensed Milk
4. Snacks
 - Biscuits
 - Chips
 - Chocolate
 - Popcorn
 - Namkeen
 - Cookies
 - Mixture
 - Crackers
 - Cake
 - Nuts
   
Billing and Discount Logic:
 - Each product has a predefined price and measurement unit.
 - The item total is calculated based on the selected quantity.
 - Multiple purchases are added to the grand total.
 - A 10% discount is applied when the subtotal reaches ₹1,000 or above.
 - The final payable amount is calculated after discount deduction.
   
Payment Methods:
 - Cash
 - UPI
 - Card
   
Technical Concepts Used:
 - Java Classes and Methods
 - Scanner Class
 - Variables and Data Types
 - Conditional Statements (if-else)
 - Switch Expressions
 - Do-While Loop
 - Arithmetic Operations
 - Relational and Logical Operators
 - Type Conversion
 - Formatted Console Output using printf()
 - Quantity and Input Validation

Technologies Used:
 - Programming Language: Java
 - IDE: Eclipse
 - Input Handling: Java Scanner
 - Application Type: Console-Based Application
   
How to Run:
 - Clone or download the repository.
 - Import the project into Eclipse IDE.
 - Navigate to Veg_and_fruits_invoice.java.
 - Open the Java file.
 - Right-click and select Run As → Java Application.
 - Choose whether to create a new bill.
 - Select a product category and item.
 - Enter the required quantity.
 - Continue adding products as needed.
 - Review the final invoice and select a payment method.
   
Sample Invoice:
========== FINAL INVOICE ==========
Subtotal: Rs.1200.00
Discount: Rs.120.00
Final Amount: Rs.1080.00

Select payment method:
1. Cash
2. UPI
3. Card

Payment method: UPI
Thank you for shopping!

Learning Objectives:
The objective of this POC is to understand how fundamental Core Java concepts can be applied to develop a practical retail billing application.
It focuses on category-based product selection, arrays, switch expressions, quantity-based calculations, discount handling, conditional logic, and formatted invoice generation.

Future Enhancements:
 - Maintain an itemized shopping cart.
 - Generate detailed invoices with individual product information.
 - Add customer details.
 - Store product and billing information in a database.
 - Implement inventory and stock management.
 - Add coupon and promotional discount functionality.
 - Implement separate classes for products, billing, and payments.
 - Integrate JDBC or Spring Boot for database-backed functionality.
 - Generate downloadable PDF invoices.
   
Disclaimer:
This is an educational Proof of Concept. Product details, prices, discounts, and payment options are predefined for demonstration purposes. No actual payment processing is performed.

License:
This project is licensed under the MIT License.
