import java.util.Arrays;


    public class StringAnagram{  

	public static void main(String[] args) {

		String s1 = "abcd";

		String s2 = "abc6";

		if(s1.length()!=s2.length()) {
			System.out.println("They were not Anagram");
		}

		else {
			String lc1 = s1.toLowerCase();
			String lc2 = s2.toLowerCase();

			char[] ca1 = lc1.toCharArray();
			char[] ca2 = lc2.toCharArray();

			Arrays.sort(ca1);
			Arrays.sort(ca2);

			if(Arrays.equals(ca1, ca2)==true) {
				System.out.println("Its Anagram");
			}
			else {		
				System.out.println("Not Anagram");	
			}
	 }
	}}

}
