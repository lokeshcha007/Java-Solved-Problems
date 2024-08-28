import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your character :  ");
        String value = scn.nextLine();
        if (value.charAt(0) >= 'a' && value.charAt(0) <= 'z') {
            System.out.println("Given input is an lowercase alphabet " + value);
        } else if (value.charAt(0) >= 'A' && value.charAt(0) <= 'Z') {
            System.out.println("Given input is an Uppercase alphabet " + value);
        } else {
            System.out.println("Enter the valud Charcater! ");
        }

    }
}
