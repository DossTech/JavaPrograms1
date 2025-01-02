package JavaPrograms.TestQS;

import java.util.Scanner;


    public class StringReverse{  

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String s1 = s.nextLine();
	
		for (int i =s1.length()-1; i >=0; i--) {
			char ca = s1.charAt(i);
			System.out.println(ca+" ");
		}
	}}

}
