package org.basicprograms;

public class AsciiGeneration {
//48,65,97
	public static void main(String[] args) {
		
	char a1 = 'a';
	char b1 = 'A';
	char c1 = '9';
	
	int A1 = a1;
	int B1 = b1;
	int C1 = c1;
	
	System.out.println(A1);
	System.out.println(B1);
	System.out.println(C1);
	
	System.out.println();
	
	for(int i = 0; i <= 255; i++)  
	{  
	System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
	}  
	}
}
