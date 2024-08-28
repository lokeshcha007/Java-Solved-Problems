import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Year to check Leap year or not: ");
        int year = scn.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println("Its not a leap year : " + year);
        }

    }
}
