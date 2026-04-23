import java.util.Scanner;

class SwitchCalc {
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

        switch (choice) {
            case 1:
                System.out.println("Addition = " + calc.add(x,y));
                break;

            case 2:
                System.out.println("Substraction = " + calc.sub(x,y));
                break;

            case 3:
                System.out.println("Multiply = " + calc.multiply(x,y));
                break;

            case 4:
                System.out.println("Division = " + calc.divide(x,y));
                break;

            case 5:
                System.out.println("Exited Successfully!!");
                break;

            default:
                System.out.println("Invalid Choice!");
                break;
        }

    }
}
