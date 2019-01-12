package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		MakeChangeDriver reg = new MakeChangeDriver();

		double price, money, changeDue;
		int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, one = 0, quarter = 0, dime = 0, nickle = 0, cent = 0,
				diff = 0;

		System.out.println("Hello. What is the price of the customer's item?");
		price = kb.nextDouble();

		System.out.println("Great! How have they paid for it?");
		money = kb.nextDouble();

		if (!reg.enough(price, money)) {
			System.out.println("Tell the customer \"Im sorry, thats not enough money.\" Transaction canelled.");
			System.exit(0);
			// TODO - this may not be right - we may want to fix so that the user is
			// prompted again.

		} else {
			changeDue = money - price;
			System.out.println("They need " + changeDue + " in change");

			diff = (int) ((money - price) * 100);
			while (diff > 1) {

				if (diff >= 10000) {
					hundred = reg.change(diff, 100);
					diff = reg.remainder(diff, 100);
				}
				if (diff >= 5000) {
					fifty = reg.change(diff, 50);
					diff = reg.remainder(diff, 50);
				}
				if (diff >= 2000) {
					twenty = reg.change(diff, 20);
					diff = reg.remainder(diff, 20);
				}
				if (diff >= 1000) {
					five = reg.change(diff, 10);
					diff = reg.remainder(diff, 10);
				}
				if (diff >= 100) {
					one = reg.change(diff, 5);
					diff = reg.remainder(diff, 5);
				}

			}

		}
//			if (diff>=0.25) {
	}
	// TODO - figure this part out....
}

// call cashregister

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