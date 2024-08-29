import java.util.*;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the week number (1-7) :");
        int val = scn.nextInt();

        if (val == 1) {
            System.out.println(" This is a Monday");
        } else if (val == 2) {
            System.out.println("This is a Tuesday");
        } else if (val == 3) {
            System.out.println("This is a Wednesday");
        } else if (val == 4) {
            System.out.println("This is a Thursday");
        } else if (val == 5) {
            System.out.println("This is a Friday");
        } else if (val == 6) {
            System.out.println("This is a Saturday");
        } else if (val == 7) {
            System.out.println("This is a Sunday");
        }
    }
}