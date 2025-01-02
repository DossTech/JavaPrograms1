package JavaPrograms.TestQS;

import java.util.Scanner;

public class SumofNo {
    // 3rd largest no in Array

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a no: ");
        int n = s.nextInt();
        int a, b = 0;
        while (n > 0) {

            a = n % 10;
            b = b + a;
            n = n / 10;
        }
        System.out.println("The Sum is: " + b);
    }
}
