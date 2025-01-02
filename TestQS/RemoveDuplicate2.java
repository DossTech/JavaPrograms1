package JavaPrograms.TestQS;

import java.util.LinkedHashSet;
import java.util.Set;

    public class RemoveDuplicate2{  

	public static void main(String[] args) {

		int a[] = new int[]{2,3,6,6,9,10,10,10,12,12};
		int al = a.length;
        int count =0;
	Set s = new LinkedHashSet();
	
	for (int i = 0; i < a.length; i++) {
		if (!s.contains(a[i])) {
			s.add(a[i]);
			count++;
		}
	}
for (Object object : s) {
	System.out.println(object);
}
System.out.println("The count of duplicates: ");
System.out.println(al-count);

}}
}
