package rps;

/**
 * 
 * @author Saif 
 * Main class.
 */
public class Game {
	// Instance variables declaration
	private Player playerOne;
	private Player playerTwo;
	private int playerOneScore;
	private int playerTwoScore;
	private int numberOfGames;
	private int numberOfRounds;

	// Default Constructor initializing the instance variables
	public Game() {
		playerOne = new Player();
		playerTwo = new Player();
		playerOneScore = 0;
		playerTwoScore = 0;
		numberOfGames = 0;
		numberOfRounds = 100;
	}

	public static void main(String[] args) {

		Game rps = new Game();// Initialization occurred.
		rps.getplayersNames();// Getting users names.
		rps.startGame();
	}

	// This function is called recursively.
	public void startGame() {
		int playerOneInput = playerOne.getInput(1);
		Util.display(playerOne.getUserName(), playerOneInput);
		// Get moves
		int playerTwoInput = playerTwo.getInput(3);
		Util.display(playerTwo.getUserName(), playerTwoInput);
		// Compare moves and determine winner
		int compareResult = Util.compareSelections(playerOneInput, playerTwoInput);
		switch (compareResult) {
		case 0: // Tie
			System.out.println("Tie!");
			break;
		case 1: // playerOne wins
			System.out.println(playerOne.getUserName() + " Beats " + playerTwo.getUserName());
			playerOneScore++;
			break;
		case 2: // playerTwo wins
			System.out.println(playerTwo.getUserName() + " Beats " + playerOne.getUserName());
			playerTwoScore++;
			break;
		}
		numberOfGames++;
		if (numberOfGames < numberOfRounds) {
			System.out.println();
			startGame();
		} else {
			printStats();
		}
	}

	// helps to get the users name
	public void getplayersNames() {
		System.out.println("*******Player 1********");
		playerOne.askName();
		System.out.println("*******Player 2********");
		playerTwo.askName();
	}

	// Prints the result.
	public void printStats() {
		System.out.println("Number of games played is " + numberOfGames);
		System.out.println(playerOne.getUserName() + "'s score " + playerOneScore);
		System.out.println(playerTwo.getUserName() + "'s score " + playerTwoScore);
	}
}
