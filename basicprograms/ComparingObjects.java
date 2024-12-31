package org.basicprograms;

public class ComparingObjects {
public static void main(String[] args) {
	
	int a = 10;
	float b = 10f;
	
	Integer i = new Integer(10);
	Float f = new Float(10f);
	
	System.out.println("Is the objects of int and float were same: "+i.equals(f));
	System.out.println("Is the objects of int and float were same: "+(a==b));
}
}
