package com.skilldistillery.projects.blackjackproject.player;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.projects.blackjackproject.cards.Card;
import com.skilldistillery.projects.blackjackproject.cards.Deck;

public class Hand extends Deck{
	private List<Card> hand;
	
	public Hand() {
		this.hand = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		hand.add(card);
		System.out.println("A: " + card.toString() + " was dealt.");
	}
	public void addCardDealersFirst(Card c) {
		hand.add(c);
		System.out.println("You were dealt the first card face down.");
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public int getValOfHand() {
		int value = 0;
		for (Card card : hand) {
			value += card.getRank().getValue();
		}
		return value;
	}

	@Override
	public int checkDeckSize() {
		return super.checkDeckSize();
	}

	@Override
	public Card dealCard() {
		return super.dealCard();
	}

	@Override
	public void shuffle() {
		super.shuffle();
	}

	
}
