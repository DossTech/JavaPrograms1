package org.basicprograms;

public class Armstrongno {

	public static void main(String[] args) {

		int n1 = 153;

		int no = n1;
		int n2,n3=0;
		while (n1>0) {
			n2 = n1%10;
			n3 = (n3)  +( n2*n2*n2);
			n1=n1/10;
		}
		if (n3==no) {
			System.out.println("Armstrong");

		} else {
			System.out.println("Not Armstrong");

		}

	}


}

