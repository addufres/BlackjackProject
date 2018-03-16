package com.skilldistillery.projects.blackjackproject.player;

import java.util.List;

import com.skilldistillery.projects.blackjackproject.cards.Card;
import com.skilldistillery.projects.blackjackproject.cards.Deck;

public class Player {
	private Hand hand;

	public Player() {
		this.hand = new Hand();
	}
	
	public void hit(Deck d) {
		hand.addCard(d.dealCard());
	}
	
	public void stay() {
		System.out.println("You chose to stay. Your hand still totals " + hand.getValOfHand());
	}

	public List<Card> getHand() {
		return hand.getHand();
	}
	public Hand getHandNotList() {
		return this.hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hand == null) ? 0 : hand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (hand == null) {
			if (other.hand != null)
				return false;
		} else if (!hand.equals(other.hand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}
	
	
}
