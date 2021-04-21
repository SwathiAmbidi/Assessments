package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondSmallestTest {

	@Test
	void test() {
		int a[] = {12,13,11,24,76};
		SecondSmallest obj = new SecondSmallest();
		int actual = obj.getSecondSmallest(a);
		assertEquals(12, actual);
		
	}

}
