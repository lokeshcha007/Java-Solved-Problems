import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your Character : ");
        char character = scn.nextLine().charAt(0);
        System.out.println(character);

        if (character >= 'a' && character <= 'z') {
            System.out.println("This is a Alphabet");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("This is a Alphabet");
        } else {
            System.out.println("This is not a Alphabet");
        }

    }
}
