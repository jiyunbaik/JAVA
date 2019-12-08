
package assignment2;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplication multiplication = new Multiplication();
        String input;

        do {
            System.out.println("Please enter a number from 1 - 9 to test multiplication skills or press 'E' to exit the game");
            input = sc.next();
            multiplication.var(input);
        } while (!input.equals("E"));

    }

}
