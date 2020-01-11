package Battleship;

import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			Grid play = new Grid();
			play.shoot();
			if (play.isAllHit()) {
				System.out.println("YOU WON!");
			} else {
				System.out.println("YOU LOST!");
			}
			play.isShip();
			play.display();
			System.out.println("Would you like to play again? y/n");
			String choice = scanner.next();
			if (!choice.equalsIgnoreCase("y")) {
				break;
			}
		}
	}
}