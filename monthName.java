import java.util.*;

public class MonthName {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the month number between 1 - 12 : ");
        int value = scn.nextInt();

        if(value == 1){
            System.out.println("This is an January");
        }else if(value == 2){
            System.out.println("This is an February");
        }else if(value == 3){
            System.out.println("This is an March");
        }else if(value == 4){
            System.out.println("This is an April");
        }else if(value == 5){
            System.out.println("This is an May");
        }else if(value == 6){
            System.out.println("This is an June");
        }else if(value == 7){
            System.out.println("This is an July");
        }else if(value == 8){
            System.out.println("This is an August");
        }else if(value == 9){
            System.out.println("This is an Sepetember");
        }else if(value == 10){
            System.out.println("This is an October");
        }else if(value == 11){
            System.out.println("This is an November");
        }else if(value == 12){
            System.out.println("This is an December");
        }else {
            System.out.println("Give input between 1- 12 only");
        }
    }
}