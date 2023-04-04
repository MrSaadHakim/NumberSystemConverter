import java.util.Scanner;

class NumberSystemConverter {
    public static void Addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the addition:");
        double ADD_a = scanner.nextDouble();
        System.out.println("Enter the second number of the addition:");
        double ADD_b = scanner.nextDouble();
        double result=ADD_a+ADD_b;
        System.out.println("The result of the addition is: "+result);
    }
    public static void Subtraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the subtraction:");
        double SUB_a = scanner.nextDouble();
        System.out.println("Enter the second number of the subtraction:");
        double SUB_b = scanner.nextDouble();
        double result=SUB_a-SUB_b;
        System.out.println("The result of the subtraction is: "+result);
    }
    public static void Multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the multiplication:");
        double MULTI_a = scanner.nextDouble();
        System.out.println("Enter the second number of the multiplication:");
        double MULTI_b = scanner.nextDouble();
        double result=MULTI_a*MULTI_b;
        System.out.println("The result of the multiplication is: "+result);
    }
    public static void Division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the division:");
        double DIV_a = scanner.nextDouble();
        System.out.println("Enter the second number of the division:");
        double DIV_b = scanner.nextDouble();
        double result=DIV_a/DIV_b;
        System.out.println("The result is of the division: "+result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Choose what operation you wish to perform:");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("W. Exit the program");

            choice = scanner.nextLine().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.println("Enter the number to be converted:");
                    String number = scanner.nextLine();

                    System.out.println("Enter the current number system (2, 3, 4, 5, 6, 8, 9, 10, 16):");
                    int fromBase = scanner.nextInt();

                    int result = Integer.parseInt(number, fromBase);
                    System.out.println("The decimal value of " + number + " in base " + fromBase + " is " + result);
                    scanner.nextLine();

                    break;
                case 'B':
                    System.out.println("Enter the number to be converted:");
                    int decimal = scanner.nextInt();

                    System.out.println("Enter the desired number system (2, 3, 4, 5, 6, 8, 9, 10, 16):");
                    int toBase = scanner.nextInt();

                    String binaryString = Integer.toString(decimal, toBase);
                    System.out.println(decimal + " in base " + toBase + " is " + binaryString);
                    scanner.nextLine();

                    break;
                case 'C':
                    Addition();
                    break;
                case 'D':
                    Subtraction();
                    break;
                case 'E':
                    Multiplication();
                    break;
                case 'F':
                    Division();
                    break;
                case 'W':
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 'W');

        scanner.close();
    }
}