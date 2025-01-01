
public class CountChara {

    public static void main(String[] args) {

        String s1 = "Knowledge wisdom peoplehandling";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {

            if ((s1.charAt(i)) != ' ') {
                count++;
            }
        }
        System.out.println("The count of characters: " + s1.length());
        System.out.println("The count of characters: " + count);

    }
}
