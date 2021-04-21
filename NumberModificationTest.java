package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberModificationTest {

	@Test
	void test() {
		int num = 45862;
		int expected = 13242;
		NumberModification obj = new NumberModification();
		assertEquals(expected, obj.modifyNumber(num));

	}

}
