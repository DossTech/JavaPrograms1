package org.programs;

//Array copy
public class ArrayCopy {

    public static void main(String[] args) {
        // Array a
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        // Array b
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            b[i] = a[i];
        }

        // Values of Array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();
        // Values of Array b
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
