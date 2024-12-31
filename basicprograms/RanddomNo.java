package org.basicprograms;

import java.util.Random;

public class RanddomNo {
public static void main(String[] args) {
	//Generation of Random no
	
	int a = 10;
	int b = 50;
	
	Random random = new Random();
	
	int a1 = random.nextInt();
	int b1 = random.nextInt(a);
	int b2 = random.nextInt(b);
	
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(b2);
	
	int c = random.nextInt(b - a ) + a;
	System.out.println(c);
	
	int d = random.nextInt(b - a + 1) + a;
	System.out.println(d);
}
}
