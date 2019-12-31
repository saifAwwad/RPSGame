package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rps.Util;

class UtilTest {

	@Test
	void testCompareSelections() {
		int oneSelection = Util.ROCK;
		int twoSelection = Util.PAPER;
		int expected = Util.compareSelections(oneSelection, twoSelection);
		int actual = 2;
		assertEquals(expected, actual);
		oneSelection = Util.SISSORS;
		twoSelection = Util.PAPER;
		expected = Util.compareSelections(oneSelection, twoSelection);
		actual = 1;
		assertEquals(expected, actual);
	}

}
