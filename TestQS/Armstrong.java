package JavaPrograms.TestQS;

public class Armstrong {

    public static void main(String[] args) {

        int a = 371;
        int n = a;
        int b, c = 0;

        while (a > 0) {

            b = a % 10;
            c = c + (b * b * b);
            a = a / 10;

        }
        if (n == c) {
            System.out.println("Its Armstrong");
        } else {
            System.out.println("Its not Armstrong");
        }
    }
}
