package DiffTypesofInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String textString = scanner.nextLine();
        System.out.print("Give an integer: ");
        int integerVal = scanner.nextInt();
        System.out.print("Give a double: ");
        double doubleVal = scanner.nextDouble();
        System.out.print("Give a boolean: ");
        boolean booleanVal = scanner.nextBoolean();

        System.out.println("Integer: " + integerVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Boolean: " + booleanVal);
        scanner.close();
    }
}
