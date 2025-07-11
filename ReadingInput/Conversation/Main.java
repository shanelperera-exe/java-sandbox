package Conversation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question1 = "Greetings! How are you doing?";
        String question2 = "Oh, how interesting. Tell me more!";
        String question3 = "Thanks for sharing!";

        Scanner scanner = new Scanner(System.in);
        System.out.println(question1);
        String firstAns = scanner.nextLine();
        System.out.println(question2);
        String secondAns = scanner.nextLine();
        System.out.println(question3 + "\n");

        System.out.println(question1);
        System.out.println(firstAns);
        System.out.println(question2);
        System.out.println(secondAns);
        System.out.println(question3);

        scanner.close();
    }
}
