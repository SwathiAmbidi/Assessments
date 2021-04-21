package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseAndSortArrayTest {

	@Test
	void test() {
		ReverseAndSortArray obj = new ReverseAndSortArray();
		int a[] = {12,32,21,65,45};
		int expected[] = {12,21,23,54,56};
		int b[] = obj.getSorted(a);
		assertArrayEquals(expected, b);
	}

}
