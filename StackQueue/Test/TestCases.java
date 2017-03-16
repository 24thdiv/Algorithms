import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCases {

	StackA stack = new StackA(3);

	/*@Before
	public void setUp() throws Exception {
		stack = new StackA(5);
	}*/
	
	@Test
	public void testIsEmpty() {
		assertEquals(true, stack.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertEquals(false, stack.isFull());
	}

	@Test
	public void testPush() {
		assertEquals(true, stack.push(0));
	}

	@Test
	public void testPop() {
		assertEquals(-1, stack.pop());
	}

	@Test
	public void testPeek() {
		assertEquals(-1, stack.peek());
	}

}
