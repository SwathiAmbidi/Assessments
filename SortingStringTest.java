package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingStringTest {

	@Test
	void test() {
		SortingString obj = new SortingString();
		String ar[] = {"rtyesxf","abcxyz", "cvtr"  ,"avachdf"};
		String expected[] = {"ABCxyz","AVAChdf","CVtr","RTYEsxf"};
		String actual[] = obj.sortStrings(ar);
		assertArrayEquals(expected, actual);
		

	}

}
