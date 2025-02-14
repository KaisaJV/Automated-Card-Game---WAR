package finalCodingProject;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck(); //instantiating a new deck
		deck.shuffle(); //calling shuffle method
		
		//instantiating the two players
		Player player1 = new Player("Norman");
		Player player2 = new Player("Gerald");
		
		
		//dealing cards to both players, starting with player 1
		for (int i = 1; i <= 52; i++) { //for loop of 52 cards
			if (i % 2 == 1) { //if odd number, player1 draws, if even number, player2 draws, thus alternating each draw
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		
		System.out.println("+-----The game of WAR begins!-----+");
		
		for (int i = 1; i <= 26; i++) { //each iteration, both players flip a card
			if (player1.getScore() > 0 || player2.getScore() > 0) { //this ensures that the score board won't print out on first iteration
				System.out.println("\t-----Scoreboard-----");
				System.out.println("\t" + player1.getName() + ": " + player1.getScore() + " / " + 
				player2.getName() + ": " + player2.getScore()); //prints out the name and score of each player
			}
			
			System.out.println("\n\t-------Round " + i + "-----"); //prints out each round with a new line to space out rounds + tab to center the message
			
			Card card1 = player1.flip(); //flipped card is held in card1
			System.out.println(player1.getName() + "'s card:"); //prints out who played the card
			card1.describe(); //flipped card is described
			
			Card card2 = player2.flip();
			System.out.println(player2.getName() + "'s card:");
			card2.describe();
			
			if (card1.getValue() > card2.getValue()) { //gets value of each flipped card
				player1.incrementScore(); //adds to the score
				System.out.println("+ " + player1.getName() + " receives a point!"); //uses .getName to call player String name and not reference Object
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("+ " + player2.getName() + " receives a point!");
			} else {
				System.out.println("No points awarded."); //if the value of the flipped cards are equal, no points added
			}
		}
		
		System.out.println();
		System.out.println("    ....calculating final scores.....\n");
		
		player1.describe(); //because hands are empty and scores are above 0, this method prints out the final scores
		player2.describe();
		
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName().toUpperCase() + " is the winner!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName().toUpperCase() + " is the winner!");
		} else {
			System.out.println("It was a DRAW!");
		}
		
		
		
		
		
		
	}

}
