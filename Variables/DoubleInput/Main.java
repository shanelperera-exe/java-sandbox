package DoubleInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You entered " + number);
        scanner.close();
    }
}
