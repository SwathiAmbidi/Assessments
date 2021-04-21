package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckPositiveTest {

	@Test
	void test() {
		CheckPositive obj = new CheckPositive();
		String check = "ANT";
		boolean expected = true;
		boolean actual = obj.isPositiveString(check);
		assertEquals(expected, actual);
	}

}
