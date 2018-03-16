package com.skilldistillery.projects.blackjackproject.game;
import java.util.Scanner;

import com.skilldistillery.projects.blackjackproject.cards.Card;
import com.skilldistillery.projects.blackjackproject.cards.Deck;

public class Game {
	private Deck d = new Deck();

	public static void main(String[] args) {
		Game dealer = new Game();
		Scanner sc = new Scanner(System.in);
		dealer.run(sc);
		sc.close();
	}

	private void run(Scanner sc) {
		while(true) {
			System.out.println("Please enter how many cards you want me to deal you: ");
			int amountToDeal = sc.nextInt();
			if(amountToDeal > 52 | amountToDeal < 1) {
				System.out.println("Error incorrect amount\nPlease enter another number: ");
				amountToDeal = sc.nextInt();
			} else {
				d.shuffle();
				for (int i = 0; i < amountToDeal; i++) {
					Card dealt = d.dealCard();
					System.out.println(dealt);
				}
				System.out.println("There are " + d.checkDeckSize() + " cards left.");
				break;
			}
		}
	}

	
}
