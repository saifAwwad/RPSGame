package rps;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Saif 
 * Represents the players class with all necessary methods.
 */
public class Player {

	private String userName;
	Scanner scanner = new Scanner(System.in);

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Asks the user to enter his/her name
	 */
	public void askName() {
		System.out.println("Please enter your name: ");
		userName = scanner.next();
	}

	/**
	 * Gets user selection randomly based on the option: 1 Rock 2 Rock Paper 3 Rock
	 * Paper Scissors
	 * @param options
	 * @return
	 */
	public int getInput(int options) {
		Random random = new Random();
		return random.nextInt(options) + 1;
	}

}
