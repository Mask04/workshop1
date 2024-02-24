import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int i;
        int j;
        Scanner obj = new Scanner(System.in);
        i = obj.nextInt();
        j = obj.nextInt();
        int sum = i + j;
        int subtraction = i - j;
        int multiplication = i * j;
        int division = i / j;

        System.out.println("i + j = " + sum);
        System.out.println("i - j = " + subtraction);
        System.out.println("i * j = " + multiplication);
        System.out.println("i / j = " + division);

    }
}
