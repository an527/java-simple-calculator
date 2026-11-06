import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the Calculator!");
        System.out.print("Choose an option ([1] Calculate [2] Exit): ");
        Scanner option = new Scanner(System.in);
        int userChoice = option.nextInt();
        if(userChoice == 1){
            calculate();
        } else if(userChoice == 2){
            System.out.println("Quit"); // Check on how to QUIT later
        }
        

        option.close();

    }

    public static void calculate(){
        System.out.print("Input a number: ");
        Scanner num = new Scanner(System.in);
        double first = num.nextInt();
        System.out.println();

        System.out.print("Input an operation (+,-,*,/): ");
        Scanner operator = new Scanner(System.in);
        String operate = operator.nextLine();
        System.out.println();

        System.out.print("Input a number: ");
        num = new Scanner(System.in);
        double second = num.nextInt();
        System.out.println();

        if(operate.equals("+")){
            System.out.println(first + " " + operate +  " " + second + " = " + add(first, second));
        }

        num.close();
        operator.close();
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static void subtract(){

    }

    public static void multiply(){

    }
    
    public static void divide(){

    }
}
