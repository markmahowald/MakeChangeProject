package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		MakeChangeDriver reg = new MakeChangeDriver();
		double price, money, diff;
		int hundred, fifty, twenty, ten, five, one, quarter, dime, nickle, cent;

		System.out.println("Hello. What is the price of the customer's item?");
		price = kb.nextDouble();

		System.out.println("Great! How have they paid for it?");
		money = kb.nextDouble();

		if (!reg.enough(price, money)) {
			System.out.println("Im sorry, thats not enough money. Transaction canelled.");
			break;
		} else {
			diff = money-price;
			System.out.println("They need " + diff + " in change");
			
			while (diff>=100) {
				
				if (diff>= 100);
				hundred ++;
				diff -= 100;
				
				
				
			} while (condition);
			//TODO - figure this part out....
			
			
			
			
			
		}

		kb.close();
// call cashregister

	}
}

//Hint: Mod operator
//
//User Story #1
//The user is prompted asking for the price of the item.
//
//User Story #2
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.