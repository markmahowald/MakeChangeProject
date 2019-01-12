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
			System.out.println("Tell the customer \"Im sorry, thats not enough money.\" Transaction canelled.");
		} else {
			diff = money-price;
			System.out.println("They need " + diff + " in change");
			
			if (diff>=100) {
				hundred = reg.change(diff, 100);
				diff = reg.remainder(diff, 100);
			} 
			if (diff>=50) {
				hundred = reg.change(diff, 50);
				diff = reg.remainder(diff, 50);
			} 
			if (diff>=20) {
				hundred = reg.change(diff, 20);
				diff = reg.remainder(diff, 20);
			} 
			if (diff>=10) {
				hundred = reg.change(diff, 10);
				diff = reg.remainder(diff, 10);
			} 
			if (diff>=1) {
				hundred = reg.change(diff, 5);
				diff = reg.remainder(diff, 5);
			} 
//			if (diff>=0.25) {
//				hundred = reg.change(diff, 1);
//				diff = reg.remainder(diff, 1);
//			} 
//			if (diff>=0.10) {
//				hundred = reg.change(diff, 0.25);
//				diff = reg.remainder(diff, 0.25);
//			} 
//			if (diff>=0.5) {
//				hundred = reg.change(diff, 0.10);
//				diff = reg.remainder(0.10);
//			} 
//			if (diff>=0.01) {
//				hundred = reg.change(diff, 0.10);
//				diff = reg.remainder(diff, 0.10);
			} 
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