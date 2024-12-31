package org.javanoprograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a no: ");
		int a = s.nextInt();

		System.out.print("Result: " +"");
		if ((a%2==0)||(a==0||(a==1))) {

			System.out.print(""+"Not Prime No ");

		} else {

			System.out.println(" "+"Prime No");

		}

	}

}
