package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		MakeChangeDriver reg = new MakeChangeDriver();
		
/*denomination array holds US denominations in cents (for modulus function to work properly), and change holds the amount of each denomination, in the same order as denomination so that their indexes match.  . 
 * Layout - Lines 16 -> 17 declare all necessary variables and arrays. Lines 19 -> 33 cover getting the user's inputs, and dealing with (i) not enough money offered, and (ii) exact change offered.  lines 34 on, cover calculating change through a looping for statement to see if any bills/coins of a specific denomination are required. 
 * 
 */
		
		double price, money, changeDue;
		int diff = 0, i = 0,  denomination[] = new int [] {10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1}, change[] = new int [10];

		System.out.println("Hello. What is the price of the customer's item?");
		price = kb.nextDouble();

		System.out.println("Great! How have they paid for it?");
		money = kb.nextDouble();

		if (!reg.enough(price, money)) {
			System.out.println("Tell the customer \"Im sorry, thats not enough money.\" Transaction canelled.");
			System.exit(0);
			// prompted again.

		} else if (price == money) {
			System.out.println("Exact change! Transaction complete");
			System.exit(0);	
		}
		else {
			changeDue = money - price;
			
			System.out.print("They need ");
			System.out.printf("%.2f", changeDue);
			System.out.println(" back");
			
			diff = (int) (Math.round((money - price) * 100));
			
			for(i = 0; i<10; i++) {
			
				if (diff >= denomination[i]) {
					diff = reg.change(diff, denomination, change, i);
				}
			}
			reg.printChange(change );
			kb.close();
		}
	}	
}
