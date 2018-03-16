package com.skilldistillery.projects.blackjackproject.game;

import java.util.Scanner;

import com.skilldistillery.projects.blackjackproject.cards.Card;
import com.skilldistillery.projects.blackjackproject.cards.Deck;
import com.skilldistillery.projects.blackjackproject.player.Hand;
import com.skilldistillery.projects.blackjackproject.player.Player;

public class Game {
	private static Deck d = new Deck();
	private Player player = new Player();
	private Player dealer = new Player();

	public static void main(String[] args) {
		Game game = new Game();
		Scanner sc = new Scanner(System.in);
		game.printWelcome();
		while(d.checkDeckSize() > 4) {
		game.run(sc);
		}
		sc.close();
	}

	private void run(Scanner sc) {
		boolean gameOver = false;
		d.shuffle();
		startingHands();
		while (gameOver != true) {
			if (dealer.getHandNotList().getValOfHand() == 21) {
				System.out.println("Dealer Won.");
				gameOver = true;
			} else if (player.getHandNotList().getValOfHand() == 21) {
				System.out.println("You won!");
				gameOver = true;
			} else {
				int input = 0;
				do {
					System.out.println("Do you want to 1. hit or 2. stay");
					input = sc.nextInt();
					switch (input) {
					case 1:
						player.hit(d);
						System.out.println(player.getHand());
						if (player.getHandNotList().getValOfHand() > 21) {
							System.out.println("BUST! You Lose.");
							System.out.println("\nThe total for your hand is: " + player.getHandNotList().getValOfHand());
							gameOver = true;
							System.out.println("GAME OVER GOOD GAME.");
							return;
						} else if (player.getHandNotList().getValOfHand() == 21) {
							System.out.println("BLACKJACK!!!! YOU WIN!!!!!");
							gameOver = true;
							return;
						} else {
							System.out.println(player.getHand() + "\nThe total for your hand is: "
									+ player.getHandNotList().getValOfHand());
						}
						break;
					case 2:
						player.stay();
						break;
					}
				} while (input != 2);
				System.out.println("DEALER MAKES HIS TURN");
				System.out.println("*********************");
				if (dealer.getHandNotList().getValOfHand() <= 17) {
					do {
						dealer.hit(d);
					} while (dealer.getHandNotList().getValOfHand() <= 17);
					System.out.println(dealer.getHand());						
					if (dealer.getHandNotList().getValOfHand() > 21) {
						printEndTurn();
						System.out.println("DEALER BUSTS!! PLAYER WINS!");
						gameOver = true;
						return;
					} else if(dealer.getHandNotList().getValOfHand() < player.getHandNotList().getValOfHand()) {
						printEndTurn();
						System.out.println("DEALER LOSES!!! PLAYER WINS!!!!!!!!!!!!!!");
						gameOver = true;
						return;
					} else if(dealer.getHandNotList().getValOfHand() > player.getHandNotList().getValOfHand()) {
						printEndTurn();
						System.out.println("PLAYER LOSES!!! DEALER WINS!!!!!!!!!!!!!!");
						gameOver = true;
						return;
					} else if(dealer.getHandNotList().getValOfHand() == player.getHandNotList().getValOfHand()) {
						printEndTurn();
						System.out.println("PUSH...IT'S A TIE!");
						break;
					}
				} else if(dealer.getHandNotList().getValOfHand() > 17) {
					dealer.stay();
					printEndTurn();
					
					if(dealer.getHandNotList().getValOfHand() > player.getHandNotList().getValOfHand()) {
						System.out.println("PLAYER LOSES!!! DEALER WINS!!!!!!!!!!!!!!");
						gameOver = true;
						return;
					} else if(dealer.getHandNotList().getValOfHand() < player.getHandNotList().getValOfHand()) {
						System.out.println("DEALER LOSES!!! PLAYER WINS!!!!!!!!!!!!!!");
						gameOver = true;
						return;
					}
				} 
			}
		}
		System.out.println("GAME OVER GOOD GAME");
		printScrollDown();
	}
	private void printScrollDown() {
		System.out.println("\n\n\nSCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
		System.out.println("SCROLL DOWN FOR NEW HAND");
		System.out.println("\\/  \\/  \\/  \\/  \\/ ");
	}
	private void printEndTurn() {
		System.out.println(dealer.getHand());
		System.out.println("***********************");
		System.out.println(" DEALER ENDS HIS TURN\n");
	}
	private void printWelcome() {
		System.out.println("***********************");
		System.out.println("*Welcome to Blackjack!*");
		System.out.println("***********************\n\n");
	}

	private void startingHands() {
		System.out.println("\nPLAYER IS DEALT INITIAL HAND");
		System.out.println("****************************");
		Hand pStartHand = dealStartingHand(player);
		int pStartHandValue = pStartHand.getValOfHand();
		System.out.println(player.getHand() + "\nThe total for your hand is: " + pStartHandValue);
		System.out.println("\nDEALER IS DEALT INITIAL HAND");
		System.out.println("****************************");
		Hand dStartHand = dealerDealStartingHand(dealer);
		int dStartHandValue = dStartHand.getHand().get(1).getRank().getValue();
		System.out.println(dealer.getHand().subList(1, dealer.getHand().size())
				+ "\nThe shown value for the dealer is: " + dStartHandValue);
		System.out.println("\n");
	}

	private Hand dealStartingHand(Player p) {
		Card card1 = d.dealCard();
		Card card2 = d.dealCard();
		Hand hand = new Hand();
		hand.addCard(card1);
		hand.addCard(card2);
		p.setHand(hand);
		return hand;
	}

	private Hand dealerDealStartingHand(Player p) {
		Card card1 = d.dealCard();
		Card card2 = d.dealCard();
		Hand hand = new Hand();
		hand.addCardDealersFirst(card1);
		hand.addCard(card2);
		p.setHand(hand);
		return hand;
	}
}
