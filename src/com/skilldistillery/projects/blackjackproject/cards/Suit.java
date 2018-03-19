package com.skilldistillery.projects.blackjackproject.cards;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	final private String name;

	private Suit(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}
	
}

