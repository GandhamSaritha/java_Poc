package com.Poc;

import java.util.Scanner;

public class Food_Ordering_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grandTotal = 0;
		String createBill;
		System.out.println("Do you want to create a new bill? (yes/no)");
		createBill = sc.next();
		if (createBill.equalsIgnoreCase("yes")) {
			String yn;
			do {
				System.out.println("========Category Menu=======");
				System.out.println("1. Pizza");
				System.out.println("2.Burger");
				System.out.println("3.Biryani");
				System.out.println("4.Noodles");
				System.out.println("Select an item");
				int item = sc.nextInt();
				double price = 0;
				double total=0;
				switch (item) {
				case 1 -> {
					System.out.println("item name:Pizza ; cost=200rs.");
					System.out.println("enter quantity (in units):");
					int quantity = sc.nextInt();
					price = quantity * 200;
					System.out.println("price :" + price);
					grandTotal += price;
				}
				case 2 -> {
					System.out.println("item name:Burger ; cost=120rs.");
					System.out.println("enter quantity (in units):");
					int quantity = sc.nextInt();
					price = quantity * 120;
					System.out.println("price :" + price);
					grandTotal += price;
				}
				case 3 -> {
					System.out.println("item name:Biryani ; cost=180rs.");
					System.out.println("enter quantity (in units):");
					int quantity = sc.nextInt();
					price = quantity * 180;
					System.out.println("price :" + price);
					grandTotal += price;
				}
				case 4 -> {
					System.out.println("item name:Noodles ; cost=100rs.");
					System.out.println("enter quantity (in units):");
					int quantity = sc.nextInt();
					price = quantity * 100;
					System.out.println("price :" + price);
					grandTotal += price;
					
				}
				default -> System.out.println("Selected item is not available!!");
				}
				System.out.println("Do you want to continue to buy another item (y for yes, n for no)");
				yn=sc.next();
			}while(yn.equalsIgnoreCase("y"));
			System.out.println("grandtotal bill:"+grandTotal);
		}else if (createBill.equalsIgnoreCase("no")) {
            System.out.println("Thank you!");
        } else {
            System.out.println("Invalid choice. Please enter yes or no.");
        }
        sc.close();
	}
	
	

}	
