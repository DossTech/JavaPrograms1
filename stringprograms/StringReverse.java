public class StringReverse{  

	public static void main(String[] args) {

		String s1 = "aabbcc";
		
		for (int i = s1.length()-1; i >=0 ; i--) {
			char ca = s1.charAt(i);
			System.out.print(ca);
		}
		
	}}