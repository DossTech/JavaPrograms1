package org.basicprograms;

public class Palindrome {
public static void main(String[] args) {
	//let the no be 121
	
	int a = 12333321;
	int a1 = a;
	int count=0;
	int b=0,c=0;
	
	while (a>0) {
		
		b = a%10;
		
		c = (c*10) +b;
		
		a=a/10;
	
		if (c==a1) {
			System.out.println("a is a Palindrome");
			count++;
		} 
	}
	if (count==0) {
		System.out.println("a is not Palindrome");
	}

}
}
