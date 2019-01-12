package com.skilldistillery.makechange;

public class MakeChangeDriver {
	
	public boolean enough(double price, double money){
		if (money >= price) {
			return true;
		}else 
			return false;
		
	}
	public int change(int diff, int size){
		int bills = diff/size;
		return bills;
		
				
	}
	
	public int remainder(int diff, int size) {
		int remainder = diff%size;
		return remainder;		//TODO - modulus the remainder.
	}

}
