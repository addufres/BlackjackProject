package com.skilldistillery.projects.blackjackproject.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck;

	public List<Card> getDeck() {
		return deck;
	}

	public Deck() {
		super();
		this.deck = new ArrayList<>();
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck.add(new Card(suits[i], ranks[j]));
			}
		}
	}

	public int checkDeckSize() {
		return deck.size();
	}

	public Card dealCard() {
		return deck.remove(0);
	}

	public void shuffle() {
		System.out.println("\n\nShuffling...\n");
		System.out.println("\tShuffling...\n");
		System.out.println("\t\tShuffling...\n");
		System.out.println("\tShuffling...\n");
		System.out.println("Shuffling...\n\n");
		for(int i = 0; i < 5; i++ ) {
			Collections.shuffle(deck);
		}
	}
}
