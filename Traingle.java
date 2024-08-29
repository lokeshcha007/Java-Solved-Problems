import java.util.Scanner;

class Traingle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the side 1 : ");
        int side1 = scn.nextInt();
        System.out.print("Enter the side 2 : ");
        int side2 = scn.nextInt();
        System.out.print("Enter the side 3 : ");
        int side3 = scn.nextInt();

        if (side1 + side2 > side3) {
            if (side2 + side3 > side1) {
                if (side3 + side1 > side2) {
                    System.out.println("The sides form a valid triangle.");
                }
            }
        } else {
            System.out.println("The sides form a Invalid triangle.");

        }
    }
}