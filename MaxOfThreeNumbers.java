import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your num1 : ");
        int num1 = scn.nextInt();
        System.out.print("Enter your num2 : ");
        int num2 = scn.nextInt();
        System.out.print("Enter Your num3 : ");
        int num3 = scn.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Maximum number is : " + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Maximum Number is : " + num2);
        } else {
            System.out.println("Maximum number is : " + num3);
        }

    }
}
