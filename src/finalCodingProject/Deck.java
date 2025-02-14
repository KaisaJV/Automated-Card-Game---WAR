package finalCodingProject;

import java.util.*;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	//constructor for creating a deck
	Deck() {
		String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) { //iterates through each of the four suits
			int count = 2; //lowest value card starts at 2 and resets after each iteration of names
			for (String name : names) { //iterates through each name in the order of names array list
				Card card = new Card(name, suit, count); //creates 4 new instances of Card constructor from Card class
				cards.add(card); //adds each card into the cards List
				count++; //increases the count from 2-14 each iteration
			}
		}
	} //end of deck() constructor

	
	//getter
	public List<Card> getCards() {
		return cards;
	}
	//setter
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//describe method
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	//shuffle using a Collections method
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//draw top card by removing element 0 and returning what was there
	public Card draw() {
		Card card = cards.remove(0);
		return card;
	}
	
	
	
} //end of class
