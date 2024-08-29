import java.util.Scanner;

class TraingleAngles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Alpha : ");
        int side1 = scn.nextInt();
        System.out.print("Enter the Beta : ");
        int side2 = scn.nextInt();
        System.out.print("Enter the Gamma : ");
        int side3 = scn.nextInt();

        if (side1 + side2 + side3 == 180) {
            if (side1 > 0 && side2 > 0 && side3 > 0) {
                System.out.println("This angles form a valid triangle.");
            }
        } else {
            System.out.println("This angles form a Invalid triangle.");

        }
    }
}