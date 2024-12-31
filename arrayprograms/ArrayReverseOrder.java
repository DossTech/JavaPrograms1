public class ArrayReverseOrder {
    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50 };

        System.out.println("Original Order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println("Reverse Order: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}