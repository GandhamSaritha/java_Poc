
package com.Poc;

import java.util.Scanner;

public class Veg_and_fruits_invoice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double grandTotal = 0;
        String createBill;
        System.out.println("Do you want to create a new bill? (yes/no)");
        createBill = sc.next();
        if (createBill.equalsIgnoreCase("yes")) {
            String choice;
            do {
                System.out.println("\n===== CATEGORY MENU =====");
                System.out.println("1. Fruits");
                System.out.println("2. Vegetables");
                System.out.println("3. Dairy Products");
                System.out.println("4. Snacks");
                System.out.println("Enter category number:");
                int category = sc.nextInt();
                switch (category) {
                    // ================= FRUITS =================
                    case 1 -> {
                        System.out.println("\n===== FRUITS =====");
                        System.out.println("1. Apple - Rs.150/kg");
                        System.out.println("2. Banana - Rs.70/12 pieces");
                        System.out.println("3. Orange - Rs.60/kg");
                        System.out.println("4. Grapes - Rs.120/kg");
                        System.out.println("5. Guava - Rs.75/kg");
                        System.out.println("6. Papaya - Rs.50/kg");
                        System.out.println("7. Pomegranate - Rs.150/kg");
                        System.out.println("8. Mango - Rs.100/kg");
                        System.out.println("9. Watermelon - Rs.40/kg");
                        System.out.println("10. Pineapple - Rs.60/piece");

                        System.out.println("Choose fruit number:");
                        int item = sc.nextInt();
                        double price = 0;
                        String name = "";
                        String unit = "kg";

                        switch (item) {
                            case 1 -> { name = "Apple"; price = 150; }
                            case 2 -> { name = "Banana"; price = 70.0 / 12; unit = "pieces"; }
                            case 3 -> { name = "Orange"; price = 60; }
                            case 4 -> { name = "Grapes"; price = 120; }
                            case 5 -> { name = "Guava"; price = 75; }
                            case 6 -> { name = "Papaya"; price = 50; }
                            case 7 -> { name = "Pomegranate"; price = 150; }
                            case 8 -> { name = "Mango"; price = 100; }
                            case 9 -> { name = "Watermelon"; price = 40; }
                            case 10 -> { name = "Pineapple"; price = 60; unit = "pieces"; }
                            default -> System.out.println("Invalid fruit");
                        }

                        if (price > 0) {
                            System.out.println("Enter quantity in " + unit + ":");
                            double quantity = sc.nextDouble();

                            if (quantity > 0 &&
                                (unit.equals("kg") || quantity == Math.floor(quantity))) {
                                double total = price * quantity;
                                grandTotal += total;

                                System.out.println("Item: " + name);
                                System.out.println("Quantity: " + quantity + " " + unit);
                                System.out.printf("Item Total: Rs.%.2f%n", total);
                            } else {
                                System.out.println("Invalid quantity");
                            }
                        }
                    }
                    // ================= VEGETABLES =================
                    case 2 -> {
                        System.out.println("\n===== VEGETABLES =====");
                        System.out.println("1. Tomato - Rs.30/kg");
                        System.out.println("2. Potato - Rs.40/kg");
                        System.out.println("3. Onion - Rs.50/kg");
                        System.out.println("4. Carrot - Rs.60/kg");
                        System.out.println("5. Cabbage - Rs.35/kg");
                        System.out.println("6. Cauliflower - Rs.45/piece");
                        System.out.println("7. Brinjal - Rs.40/kg");
                        System.out.println("8. Cucumber - Rs.30/kg");
                        System.out.println("9. Spinach - Rs.20/bunch");
                        System.out.println("10. Capsicum - Rs.80/kg");

                        System.out.println("Choose vegetable number:");
                        int item = sc.nextInt();

                        double price = 0;
                        String name = "";
                        String unit = "kg";

                        switch (item) {
                            case 1 -> { name = "Tomato"; price = 30; }
                            case 2 -> { name = "Potato"; price = 40; }
                            case 3 -> { name = "Onion"; price = 50; }
                            case 4 -> { name = "Carrot"; price = 60; }
                            case 5 -> { name = "Cabbage"; price = 35; }
                            case 6 -> { name = "Cauliflower"; price = 45; unit = "pieces"; }
                            case 7 -> { name = "Brinjal"; price = 40; }
                            case 8 -> { name = "Cucumber"; price = 30; }
                            case 9 -> { name = "Spinach"; price = 20; unit = "bunches"; }
                            case 10 -> { name = "Capsicum"; price = 80; }
                            default -> System.out.println("Invalid vegetable");
                        }

                        if (price > 0) {
                            System.out.println("Enter quantity in " + unit + ":");
                            double quantity = sc.nextDouble();

                            if (quantity > 0 &&
                                (unit.equals("kg") || quantity == Math.floor(quantity))) {
                                double total = price * quantity;
                                grandTotal += total;

                                System.out.println("Item: " + name);
                                System.out.println("Quantity: " + quantity + " " + unit);
                                System.out.printf("Item Total: Rs.%.2f%n", total);
                            } else {
                                System.out.println("Invalid quantity");
                            }
                        }
                    }
                    // ================= DAIRY PRODUCTS =================
                    case 3 -> {
                        System.out.println("\n===== DAIRY PRODUCTS =====");
                        System.out.println("1. Milk - Rs.30/litre");
                        System.out.println("2. Curd - Rs.40/kg");
                        System.out.println("3. Paneer - Rs.100/200g pack");
                        System.out.println("4. Butter - Rs.55/100g pack");
                        System.out.println("5. Cheese - Rs.120/200g pack");
                        System.out.println("6. Ghee - Rs.150/200ml pack");
                        System.out.println("7. Buttermilk - Rs.20/pack");
                        System.out.println("8. Yogurt - Rs.25/cup");
                        System.out.println("9. Cream - Rs.60/pack");
                        System.out.println("10. Condensed Milk - Rs.80/can");

                        System.out.println("Choose dairy product number:");
                        int item = sc.nextInt();

                        String[] names = {
                            "", "Milk", "Curd", "Paneer", "Butter",
                            "Cheese", "Ghee", "Buttermilk", "Yogurt",
                            "Cream", "Condensed Milk"
                        };

                        double[] prices = {
                            0, 30, 40, 100, 55, 120, 150, 20, 25, 60, 80
                        };

                        String[] units = {
                            "", "litres", "kg", "packs", "packs",
                            "packs", "packs", "packs", "cups", "packs", "cans"
                        };

                        if (item >= 1 && item <= 10) {
                            System.out.println("Enter quantity in " + units[item] + ":");
                            int quantity = sc.nextInt();

                            if (quantity > 0) {
                                double total = prices[item] * quantity;
                                grandTotal += total;

                                System.out.println("Item: " + names[item]);
                                System.out.println("Quantity: " + quantity + " " + units[item]);
                                System.out.printf("Item Total: Rs.%.2f%n", total);
                            } else {
                                System.out.println("Invalid quantity");
                            }
                        } else {
                            System.out.println("Invalid dairy product");
                        }
                    }
                    // ================= SNACKS =================
                    case 4 -> {
                        System.out.println("\n===== SNACKS =====");
                        System.out.println("1. Biscuits - Rs.20/packet");
                        System.out.println("2. Chips - Rs.30/packet");
                        System.out.println("3. Chocolate - Rs.40/bar");
                        System.out.println("4. Popcorn - Rs.50/packet");
                        System.out.println("5. Namkeen - Rs.35/packet");
                        System.out.println("6. Cookies - Rs.60/packet");
                        System.out.println("7. Mixture - Rs.40/packet");
                        System.out.println("8. Crackers - Rs.25/packet");
                        System.out.println("9. Cake - Rs.50/piece");
                        System.out.println("10. Nuts - Rs.100/pack");

                        System.out.println("Choose snack number:");
                        int item = sc.nextInt();

                        String[] names = {
                            "", "Biscuits", "Chips", "Chocolate", "Popcorn",
                            "Namkeen", "Cookies", "Mixture", "Crackers",
                            "Cake", "Nuts"
                        };

                        double[] prices = {
                            0, 20, 30, 40, 50, 35, 60, 40, 25, 50, 100
                        };
                        String[] units = {
                            "", "packets", "packets", "bars", "packets",
                            "packets", "packets", "packets", "packets",
                            "pieces", "packs"
                        };
                        if (item >= 1 && item <= 10) {
                            System.out.println("Enter quantity in " + units[item] + ":");
                            int quantity = sc.nextInt();
                            if (quantity > 0) {
                                double total = prices[item] * quantity;
                                grandTotal += total;
                                System.out.println("Item: " + names[item]);
                                System.out.println("Quantity: " + quantity + " " + units[item]);
                                System.out.printf("Item Total: Rs.%.2f%n", total);
                            } else {
                                System.out.println("Invalid quantity");
                            }
                        } else {
                            System.out.println("Invalid snack");
                        }
                    }
                    default -> System.out.println("Invalid category");
                }
                System.out.println("\nDo you want to buy another item? (yes/no)");
                choice = sc.next();
            } while (choice.equalsIgnoreCase("yes"));
            double discount = 0;
            if (grandTotal >= 1000) {
                discount = grandTotal * 0.10;
            }
            double finalAmount = grandTotal - discount;
            System.out.println("\n========== FINAL INVOICE ==========");
            System.out.printf("Subtotal: Rs.%.2f%n", grandTotal);
            System.out.printf("Discount: Rs.%.2f%n", discount);
            System.out.printf("Final Amount: Rs.%.2f%n", finalAmount);
            System.out.println("\nSelect payment method:");
            System.out.println("1. Cash");
            System.out.println("2. UPI");
            System.out.println("3. Card");
            int payment = sc.nextInt();
            switch (payment) {
                case 1 -> System.out.println("Payment method: Cash");
                case 2 -> System.out.println("Payment method: UPI");
                case 3 -> System.out.println("Payment method: Card");
                default -> System.out.println("Invalid payment method");
            }
            System.out.println("Thank you for shopping!");
        } else if (createBill.equalsIgnoreCase("no")) {
            System.out.println("Thank you!");
        } else {
            System.out.println("Invalid choice. Please enter yes or no.");
        }
        sc.close();
    }
}
