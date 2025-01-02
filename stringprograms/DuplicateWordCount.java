import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordCount {

    public static void main(String[] args) {

        String s = "Happy New Year 2025 ; Thank You Old Year 2024";

        String[] sp = s.split(" ");

        Map<String, Integer> m = new LinkedHashMap<String, Integer>();

        for (String s1 : sp) {
            if (m.containsKey(s1)) {
                m.put(s1, (m.get(s1)) + 1);
            } else {
                m.put(s1, 1);
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("Keys" + "     |     " + "Values");
        System.out.println("------------------------------------------");
        Set<Entry<String, Integer>> entrySet = m.entrySet();
        for (Entry<String, Integer> e1 : entrySet) {

            System.out.print(e1.getKey() + " :" + e1.getValue());
            System.out.println();
        }

    }
}
