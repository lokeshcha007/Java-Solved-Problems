import java.util.*;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your num1 : ");
        int num1 = scn.nextInt();
        System.out.print("Enter your num2 : ");
        int num2 = scn.nextInt();

        int max = (num1 + num2 + -(num1 - num2)) / 2;
        System.out.println("The maximum of number1 and number2 is : " + max);

    }
}