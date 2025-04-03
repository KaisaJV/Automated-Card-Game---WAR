

# Automated Card Game - WAR


### Overview

This is a Java-based automated simulation of the classic card game War. The program shuffles a standard 52-card deck, distributes the cards evenly between two players, and then simulates the game by having each player reveal their top card in each round. The player with the higher-ranked card wins the round and earns a point. The game continues until all cards have been played, and the player with the most points is declared the winner.

### Features

- Automatically shuffles and distributes a standard 52-card deck.
- Simulates each round by comparing cards drawn by the players.
- Awards points to the player with the higher-ranked card.
- Displays a scoreboard after each round.
- Declares the final winner based on total points.

### Project Structure


Week06FinalCodingProjectWAR/\
├── src/finalCodingProject/ \
│   ├── App.java    # Main program entry point\
│   ├── Card.java   # Represents a playing card\
│   ├── Deck.java   # Manages the deck of cards\
│   ├── Player.java # Represents a player in the game\
├── README.md       # Project documentation

### Requirements

- Java Development Kit (JDK) installed (version 8 or later recommended).
- An IDE such as Eclipse (optional) or a command-line interface to compile and run Java programs.
- No external dependencies—this project uses only Java's built-in libraries.

### How to Run

In Eclipse:

1. Open Eclipse and import the project.
2. Navigate to App.java and run the program.
3. Using the Command Line:
4. Navigate to the project directory containing the src folder.
5. Compile the Java files:
6. javac src/finalCodingProject/*.java
7. Run the program:
8. java -cp src finalCodingProject.App

### Expected Output

- The console will display each round of play, showing the cards drawn and which player wins the round.
- A scoreboard will be shown after each round.
- At the end of the game, the total points for each player will be displayed along with the winner.

### Personal Experience & Challenges

This was my first time completing a full Java project, and every step presented a fresh challenge that I was able to overcome. I was especially proud when the program ran successfully. Some of my favorite features include:

- Using for loops to efficiently deal and flip cards.
- Implementing if statements to compare card values and determine winners.
- Utilizing the describe() method dynamically at different stages of the game for debugging and troubleshooting.

Although there are areas where the code can be refined, I am proud of what I accomplished and learned throughout the process.

#### Future Enhancements

- Implement a graphical user interface (GUI) to visualize the game.
- Add an interactive mode where users can play manually instead of an automated simulation.
- Introduce additional game variations and rule customizations.
