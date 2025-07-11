package Message3Times;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
        scanner.close();
    }
}
