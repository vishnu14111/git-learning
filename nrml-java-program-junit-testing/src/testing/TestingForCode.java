package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingForCode {

	@Test
	void testForAdd() {
		TestingCode test=new TestingCode();
		int expected=6;
		int actual=test.add(3, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	void testForSquare() {
		TestingCode test = new TestingCode();
		int expected=4;
		int actual=test.square(2);
		assertEquals(expected, actual);
	}

}
