import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input your character : ");
        char character = scn.nextLine().charAt(0);

        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            System.out.println("Given input is a alphabet");
        } else if (character >= '0' && character <= '9') {
            System.out.println("Given input is a number");
        } else {
            System.out.println("Given input is a  Special character");
        }

    }
}
