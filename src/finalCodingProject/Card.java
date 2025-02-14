package finalCodingProject;

public class Card {

	
	private String name; //Ace, Jack, Queen, Two, Three
	private String suit; //Diamonds, Hearts, Clubs, Spades
	private int value; //2-14, representing 2-Ace
	
	//constructor
	Card(String name, String suit, int value) { //when calling on this card, requires parameters
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	//describes the card
	public void describe() {
		System.out.println("\t" + getName() + " of " + getSuit() + " (" + getValue() + ")");
	}
	
	
} //end of class
