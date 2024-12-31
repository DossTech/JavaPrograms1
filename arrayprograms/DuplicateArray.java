package org.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {
public static void main(String[] args) {
	
	int a[] = {10,20,30,40,50,40,30};
	
	Set<Integer> s = new LinkedHashSet<Integer>();
	System.out.println("The duplicate no: ");
	for (Integer b : a) {
		
		if (!s.add(b)) {
			System.out.println(b);
		}
		
		
		
	}
}
}
}
