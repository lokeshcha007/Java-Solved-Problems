import java.util.Scanner;

class CountNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int amt = input.nextInt();
        int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
        if (amt >= 500) {
            n500 = amt / 500;
            amt -= n500 * 500;
        }
        if (amt >= 100) {
            n100 = amt / 100;
            amt -= n100 * 100;
        }
        if (amt >= 50) {
            n50 = amt / 50;
            amt -= n50 * 50;
        }
        if (amt >= 20) {
            n20 = amt / 20;
            amt -= n20 * 20;
        }
        if (amt >= 10) {
            n10 = amt / 10;
            amt -= n10 * 10;
        }
        if (amt >= 5) {
            n5 = amt / 5;
            amt -= n5 * 5;
        }
        if (amt >= 2) {
            n2 = amt / 2;
            amt -= n2 * 2;
        }
        if (amt >= 1) {
            n1 = amt;
        }
        System.out.println("Number of 500-rupee notes: " + n500);
        System.out.println("Number of 100-rupee notes: " + n100);
        System.out.println("Number of 50-rupee notes: " + n50);
        System.out.println("Number of 20-rupee notes: " + n20);
        System.out.println("Number of 10-rupee notes: " + n10);
        System.out.println("Number of 5-rupee notes: " + n5);
        System.out.println("Number of 2-rupee coins: " + n2);
        System.out.println("Number of 1-rupee coins: " + n1);

    }
}