import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest 
{
	Stack<Integer> stack;
	private static final int SIZE = 2;

	@BeforeEach
	void setUp() throws Exception 
	{
		stack = new Stack(StackTest.SIZE, Integer.MIN_VALUE);
	}

	@Test
	void testIsEmpty() 
	{
		Stack stack = new Stack(StackTest.SIZE, Integer.MIN_VALUE);
		assertTrue(stack.isEmpty());
		
		stack.push(13);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	void testNotEmpty() 
	{		
		for(int i = 0; i < StackTest.SIZE; i++)
			stack.push(13);

		assertFalse(stack.isEmpty());
		assertTrue(stack.isFull());
	}
	
	@Test
	void testPushTooMuch() 
	{		
		for(int i = 0; i < StackTest.SIZE; i++)
		{
			assertTrue(stack.push(13));
		}
		
		//should be full
		boolean check = stack.push(0);
		assertFalse(check);
	}
	
	@Test
	void testPop() 
	{		
		//0,1
		for(int i = 0; i < StackTest.SIZE; i++)
			stack.push(i);

		int actual = stack.pop();
		int expected = 1;
		assertEquals(expected, actual);
		
		Stack empty = new Stack(3);
		int value = empty.pop();
	}
	
	@Test
	void testPeek() 
	{		
		//0,1
		int expected = 7;
		stack.push(expected);

		int actual = stack.peek();
		assertEquals(expected, actual);
		
		Stack empty = new Stack(2);
		actual = empty.peek();
		assertEquals(Stack.NOT_VALID, actual);
	}

}
