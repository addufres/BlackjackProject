package com.skilldistillery.projects.blackjackproject.game;

import java.util.Scanner;

import com.skilldistillery.projects.blackjackproject.cards.Card;
import com.skilldistillery.projects.blackjackproject.cards.Deck;
import com.skilldistillery.projects.blackjackproject.player.Hand;
import com.skilldistillery.projects.blackjackproject.player.Player;

public class BlackjackGameAppMESSAROUNDFILEDONTGRADE {
	private static Deck d = new Deck();
	private Player player = new Player();
	private Player dealer = new Player();
	private int playerHand;
	private int dealerHand = dealer.getHandNotList().getValOfHand();

	public static void main(String[] args) {
		BlackjackGameAppMESSAROUNDFILEDONTGRADE game = new BlackjackGameAppMESSAROUNDFILEDONTGRADE();
		Scanner sc = new Scanner(System.in);
		game.printWelcome();
		while (d.checkDeckSize() > 10) {
			System.out.println(d.checkDeckSize() + " cards left in the deck.");
			game.run(sc);
		}
		System.out.println("\n\nNOT ENOUGH CARDS TO CONTINUE\n\n\nGOOD GAME COME BACK SOON!\n\n\n");
		sc.close();
	}

	private void run(Scanner sc) {
		// begin hand portion
		d.shuffle();
		startingHands();
		boolean roundEndsOnDeal = ((playerHand == 21) || (dealerHand == 21))
				|| ((playerHand > 21) || (dealerHand > 21));
		if (roundEndsOnDeal == false) {
			// playerTurn() if roundEndsOnDeal is false
			playerTurn(sc);
		} else {
			if (playerHand > dealerHand) {
				dealerLosePlayerWin();
			} else {
				playerLoseDealerWin();
			}
			return;
		}

		// if playerHandVal > 21 print playerLoseDealerWin()
		// if playerHandVal == 21 print dealerLosePlayerWin()
		// if playerHandVal < 21 dealer has turn
		// dealerTurn() runs
		//
	}

	private void playerTurn(Scanner sc) {
		System.out.println("Do you want to 1. hit or 2. stay");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			player.hit(d);
			playerHand = player.getHandNotList().getValOfHand();
			if (playerHand > 21) {
				System.out.println("BUST! You Lose.");
				playerLoseDealerWin();
				return;
			} else if (playerHand == 21) {
				System.out.println("BLACKJACK!!!! YOU WIN!!!!!");
				return;
			} else {
				System.out.println("Player Hand: " + player.getHand() + "\nThe total for your hand is: "
						+ playerHand);
			}
			break;
		case 2:
			player.stay();
			break;
		default:
			System.out.println("ERROR WRONG CHOICE");
		}
	}

	private void playerLoseDealerWin() {
		System.out.println("PLAYER LOSES!!! DEALER WINS!!!!!!!!!!!!!!\nLosing score was "
				+ player.getHandNotList().getValOfHand());
	}

	private void dealerLosePlayerWin() {
		System.out.println("DEALER LOSES!!! PLAYER WINS!!!!!!!!!!!!!!\nLosing score was "
				+ dealer.getHandNotList().getValOfHand());
	}

	private void printStartDealerTurn() {
		System.out.println("DEALER MAKES HIS TURN");
		System.out.println("*********************");
	}

	private void printEndDealerTurn() {
		System.out.println("Dealers Hand: " + dealer.getHand());
		System.out.println("Dealers hand totals " + dealer.getHandNotList().getValOfHand());
		System.out.println("***********************");
		System.out.println(" DEALER ENDS HIS TURN\n");
	}

	private void printWelcome() {
		System.out.println("***********************");
		System.out.println("*Welcome to Blackjack!*");
		System.out.println("***********************");
	}

	private void startingHands() {
		System.out.println("\nPLAYER IS DEALT INITIAL HAND");
		System.out.println("****************************");
		Hand pStartHand = dealStartingHand(player);
		int pStartHandValue = pStartHand.getValOfHand();
		System.out.println("Player Hand: " + player.getHand() + "\nThe total for your hand is: " + pStartHandValue);
		System.out.println("\nDEALER IS DEALT INITIAL HAND");
		System.out.println("****************************");
		Hand dStartHand = dealerDealStartingHand(dealer);
		int dStartHandValue = dStartHand.getHand().get(1).getRank().getValue();
		System.out.println("Dealer Showing: " + dealer.getHand().subList(1, dealer.getHand().size())
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