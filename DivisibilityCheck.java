import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your number to check divisibility by 5 and 11 : ");
        int number = scn.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("Its divisible by both 5 and 11 : " + number);
        } else {
            System.out.println("Not divisible by 5 and 11...Try again !");
        }

    }
}
