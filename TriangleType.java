import java.util.Scanner;

/**
 * TriangleType
 */

public class TriangleType {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the side 1 : ");
        int side1 = scn.nextInt();
        System.out.print("Enter the side 2 : ");
        int side2 = scn.nextInt();
        System.out.print("Enter the side 3 : ");
        int side3 = scn.nextInt();

        if (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("All three sides are equal , So its an Equilateral Traingle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3)
            System.out.println("Isosceles Triangle.");
        else
            System.out.println("Scalene Triangle.");
    }

}