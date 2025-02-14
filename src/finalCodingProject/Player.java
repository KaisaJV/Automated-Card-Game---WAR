package finalCodingProject;

import java.util.*;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	
	String name;
	int score;
	
	Player (String name) { //constructor's only parameter is string so that...
		this.hand = new ArrayList<Card>(); //both have unique hands, if this.hand = hand then they both share a hand
		this.name = name;
		this.score = 0; //and both have scores starting at 0
	}
	
	public String getName() { //getter to call player String name
		return this.name;
	}
	
	public int getScore() { //getter to compare the int value of score at the end to determine winner
		return this.score;
	}
	
	public void describe() {
		if (hand.size() > 0) { //if hand has cards, will describe each card
			System.out.println("\n------< " + this.name + "'s hand >------\t"); //only useful to print out all cards in a player's hand for coding feedback
			for (Card card : hand) { //loops through each card in hand
				card.describe();
			}
		} //this if statement doesn't trigger because .describe() isn't called before the game
		
		if (score > 0 && hand.size() > 0) { //if both score is greater than 0 and hand has cards, will print out score
			System.out.println(this.name + "'s score is: " + score); //this is actually unused except for coding feedback
		} else if (score > 0 && hand.size() == 0) { //if hand is empty and score is greater than 0, will print out final score
			System.out.println(this.name + "'s final score is... " + score + "!");
		}
	}
	
	public Card flip() { //removes the top card from hand and stores it in flippedCard
		Card flippedCard = hand.remove(0);
		return flippedCard;
	}
	
	
	public void draw(Deck card) { //used to populate each player's hands
		Card drawnCard = card.draw();
		hand.add(drawnCard);
	}
	
	public int incrementScore() {
		return score++;
	}
	
	
}
