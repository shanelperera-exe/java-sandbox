package Message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a message: ");
        String message = scanner.nextLine();
//      String message = scanner.next();     If no need of spaces in the input
        System.out.println(message);
        scanner.close();
    }
}
