//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int sub(int a, int b){
        return a-b;
    }

    int multiply(int a, int b) {
        return a*b;
    }

    int divide(int a, int b) {
        return a/b;
    }
}

class CalculatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("MENU");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();


        if (choice == 1){
            int result = calc.add(x,y);
            System.out.println("Addition = " + result);
        }

        else if (choice == 2){
            int result = calc.sub(x,y);
            System.out.println("Substraction = " + result);
        }

        else if (choice == 3){
            int result = calc.multiply(x,y);
            System.out.println("Multiplication = " + result);
        }

        else if (choice == 4){
            int result = calc.divide(x,y);
            System.out.println("Division = " + result);
        }

        else if (choice == 5){
            System.out.println("Program ended!");
        }

        else{
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}