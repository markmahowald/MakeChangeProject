package com.skilldistillery.makechange;

public class MakeChangeDriver {
	
	public boolean enough(double price, double money){
		if (money >= price) {
			return true;
		}else 
			return false;
		
	}
	public int change(double diff, int size){
		int bills =  ((int)diff)/size;
		return bills;
		
				
	}
	
	public int remainder(double diff, int size) {
		int remainder = ((int)diff)%size;
		return remainder;		//TODO - modulus the remainder.
	}

}
