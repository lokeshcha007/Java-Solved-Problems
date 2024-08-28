import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your number : ");
        int number = scn.nextInt();
        if (number >= 0) {
            System.out.println("Given number is a positive number : " + number);

        } else if (number < 0) {
            System.out.println("Given number is a negative number : " + number);
        }

    }
}
