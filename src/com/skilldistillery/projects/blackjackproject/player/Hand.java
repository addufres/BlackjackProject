package com.skilldistillery.projects.blackjackproject.player;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.projects.blackjackproject.cards.Card;
import com.skilldistillery.projects.blackjackproject.cards.Deck;

public class Hand {
	private List<Card> hand;
	
	public Hand() {
		this.hand = new ArrayList<>();
	}
	
	public void addCard(Deck d) {
		Card card = d.dealCard();
		hand.add(card);
		System.out.println("You were dealt a: " + card.toString());
		System.out.println("Your hand is now ");
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public int getValOfHand() {
		int value = 0;
		for (Card card : hand) {
			value += card.getRank();
		}
		return value;
	}
	
}
