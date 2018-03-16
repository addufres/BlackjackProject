package com.skilldistillery.projects.blackjackproject.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<>();

	public Deck() {
		super();
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
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
		System.out.println("Shuffling...\n");
		System.out.println("\tShuffling...\n");
		System.out.println("\t\tShuffling...\n");
		System.out.println("\tShuffling...\n");
		System.out.println("Shuffling...\n");
		Collections.shuffle(deck);
	}
}
