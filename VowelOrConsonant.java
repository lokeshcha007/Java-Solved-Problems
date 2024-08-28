import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your charcter to check vowel or consonant : ");

        char character = scn.nextLine().toUpperCase().charAt(0);
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("Given character is a Vowel...");
        } else {
            System.out.println("Given character is a Consonant...");
        }

    }

}