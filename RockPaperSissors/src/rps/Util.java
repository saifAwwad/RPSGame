package rps;

/**
 * 
 * @author Saif Represents Utility class with all necessary methods.
 */
public class Util {

	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SISSORS = 3;

	/**
	 * Show what is the user selection.
	 * @param player
	 * @param selection
	 */
	public static void display(String player, int s) {

		switch (s) {
		case Util.ROCK:
			System.out.println(player + " selected rock.");
			break;
		case Util.PAPER:
			System.out.println(player + " selected paper.");
			break;
		case Util.SISSORS:
			System.out.println(player + " selected sissors.");
			break;
		default:
			break;
		}
	}

	/**
	 * Compare tow players selection
	 * @param playerOneSelection
	 * @param playerTwoSelection
	 * @return 1 if PlayerOne won, 2 if PlayerTwo won, 0 when tie
	 */
	public static int compareSelections(int playerOneSelection, int playerTwoSelection) {
		if (playerOneSelection == playerTwoSelection)
			return 0;
		switch (playerOneSelection) {
		case Util.ROCK:
			return playerTwoSelection == Util.PAPER ? 2 : 1;
		case Util.PAPER:
			return playerTwoSelection == Util.SISSORS ? 2 : 1;
		case Util.SISSORS:
			return playerTwoSelection == Util.ROCK ? 2 : 1;
		}
		return 0;
	}

}
