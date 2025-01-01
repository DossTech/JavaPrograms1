public class V_C_Count {
    

        public static void main(String[] args) {
    
            String s1 = "Knowledge wisdom peoplehandling";
    
            int v=0,c=0;
    
            String lc = s1.toLowerCase();
            System.out.println("Lowercase: "+lc);
            String tp = lc.replace(" ", "");
            System.out.println("Without space: "+tp);
    
            for (int i = 0; i < tp.length(); i++) {
                char ca = s1.charAt(i);
                if (ca=='a'||ca=='e'||ca=='i'||ca=='o'||ca=='u') {
                    v++;
                } else {
                    c++;
                }
            }
            System.out.println("The vowels count: "+v);
            System.out.println("The consonantsa count: "+c);
        }  }
     
}
