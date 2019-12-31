package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rps.Player;
import rps.Util;

class PlayerTest {
private Player one;
	@Test
	void testGetInput() {
		one = new Player();
		int selection = one.getInput(1);
		assertEquals(Util.ROCK, selection);
	}

}
