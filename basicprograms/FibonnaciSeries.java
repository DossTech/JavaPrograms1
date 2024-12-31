package org.basicprograms;

public class FibonnaciSeries {
public static void main(String[] args) {
	
	
	// 0 1 1 2 3 5 8.............
	int a=0,b=1,c=0;
	int count=0;
	while (a>-1) {
		System.out.println(a);
		
		c = a+b;
		a = b;
		b = c;
		count++;
		if (count==10) {
			break;
		}
	}
	
	
}
}
