import java.util.Scanner;
class DoCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the first number: ");
                int x = sc.nextInt();
                System.out.print("Enter the second number: ");
                int y = sc.nextInt();
                System.out.println("Addition = " + calc.add(x, y));
            } else if (choice == 2) {
                System.out.print("Enter the first number: ");
                int x = sc.nextInt();
                System.out.print("Enter the second number: ");
                int y = sc.nextInt();
                System.out.println("Substraction = " + calc.sub(x, y));
            } else if (choice == 3) {
                System.out.print("Enter the first number: ");
                int x = sc.nextInt();
                System.out.print("Enter the second number: ");
                int y = sc.nextInt();
                System.out.println("Multiply = " + calc.multiply(x, y));
            } else if (choice == 4) {
                System.out.print("Enter the first number: ");
                int x = sc.nextInt();
                System.out.print("Enter the second number: ");
                int y = sc.nextInt();
                System.out.println("Division = " + calc.divide(x, y));
            } else if (choice == 5) {
                System.out.println("Exited Successfully!!");
            } else {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
