package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rps.Player;

class GameTest {

	private Player one;
	private Player two;

	void setUp() {
		one = new Player();
		one.setUserName("one");
		two = new Player();
		two.setUserName("two");
	}

	@Test
	void testGetplayersNames() {
		setUp();
		String expected = one.getUserName();
		String actual = "one";
		assertEquals(expected, actual);
		expected = two.getUserName();
		actual = "two";
		assertEquals(expected, actual);
	}

	@Test
	void testPrintStats() {
		setUp();
		int playerOneScore = 42;
		int playerTwoScore = 23;
		String actual = one.getUserName() + "'s score " + playerOneScore;
		String expected = "one" + "'s score " + 42;
		assertEquals(expected, actual);
		actual = two.getUserName() + "'s score " + playerTwoScore;
		expected = "two" + "'s score " + 23;
		assertEquals(expected, actual);
	}

}
