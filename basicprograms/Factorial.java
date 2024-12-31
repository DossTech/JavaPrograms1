package org.basicprograms;

public class Factorial {
	
	
	public static int fact(int n1) {
		
		int b =1;
		while (n1>0) {
			
			b = b *n1;
			n1--;
		}
		System.out.println(b);
		return b;

	}
	
	public static void main(String[] args) {
		int n1 = 10;
		if (n1>0) {
			fact(n1);
		}
		else {
			System.out.println("Can't find factorial");
		}
	

	}

}
