package com.skilldistillery.makechange;

public class MakeChangeDriver {

	public boolean enough(double price, double money) {
		if (money >= price) {
			return true;
		} else
			return false;

	}

	public int change(int diff, int [] denomination, int []change, int i) {
		int bills = (diff) / denomination[i];
		change[i] =  bills;
		
		int remainder = (diff) % denomination[i];
		return remainder;
		
	}
	public void  printChange(int[] change){
		
		System.out.println("The customer's change is: ");
	
	if(change[0]>0) {
		System.out.println(change[0] + " hundreds");
	}
	if(change[1]>0) {
		System.out.println(change[1] + " fifties");
	}
	if(change[2]>0) {
		System.out.println(change[2] + " twenties");
	}
	if(change[3]>0) {
		System.out.println(change[3] + " tens");
	}
	if(change[4]>0) {
		System.out.println(change[4] + " fives");
	}
	if(change[5]>0) {
		System.out.println(change[5] + " ones");
	}
	if(change[6]>0) {
		System.out.println(change[6] + " quarters");
	}
	if(change[7]>0) {
		System.out.println(change[7] + " dimes");
	}
	if(change[8]>0) {
		System.out.println(change[8] + " nickels");
	}
	if(change[9]>0) {
		System.out.println(change[9] + " pennies");
	}
	
	}

}
