package JavaPrograms.TestQS;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicate1 {
 

	public static void main(String[] args) {

		int a[] = new int[]{2,3,6,6,9,10,10,10,12,12};

		Set s = new LinkedHashSet();

		for (int i = 0; i < a.length; i++) {
			if (!s.add(a[i])) {
				
			} else {
				s.add(a[i]);
			}
		}
for (Object t : s) {
	System.out.println(t);
}
	}

}  
}
