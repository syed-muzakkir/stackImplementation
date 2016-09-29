package lab.muzakkir.StackAsList;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class StackImplTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	 public void testPushForInt(){
		StackImpl stackList = new StackImpl();
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		assertEquals(3, stackList.size());
		Object[] objects = stackList.toArray();
        assertArrayEquals(new Object[]{100, 200, 300}, objects);
	}
	
	@Test
	 public void testPushForNull() throws NullPointerException {
		thrown.expect(NullPointerException.class);
		StackImpl stackList = new StackImpl();
		stackList.push(null);
	}
	
	@Test
	 public void testPushForDouble(){
		StackImpl stackList = new StackImpl();
		stackList.push(100.0);
		stackList.push(200.1);
		stackList.push(300.3);
		assertEquals(3, stackList.size());
		Object[] objects = stackList.toArray();
       assertArrayEquals(new Object[]{100.0, 200.1, 300.3}, objects);
	}
	
	@Test
	 public void testPushForString(){
		StackImpl stackList = new StackImpl();
		stackList.push("100");
		stackList.push("200");
		stackList.push("300");
		assertEquals(3, stackList.size());
		Object[] objects = stackList.toArray();
        assertArrayEquals(new Object[]{"100", "200","300"}, objects);
	}
	
	@Test
	 public void testPop() {
		StackImpl stackList = new StackImpl();
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		assertEquals(3, stackList.size());
		Integer popedValue = stackList.pop();
		System.out.println("Poped Value : "+popedValue);
		Object[] objects = stackList.toArray();
		assertEquals(2, stackList.size());
        assertArrayEquals(new Object[]{100, 200}, objects);
	}
	
	@Test
	 public void testPopForNull() {
		StackImpl stackList = new StackImpl();
		assertEquals(0, stackList.size());
		assertEquals(null, stackList.pop());
	}
	
	@Test
	 public void testPopForDouble(){
		StackImpl stackList = new StackImpl();
		stackList.push(100.0);
		stackList.push(200.1);
		stackList.push(300.333);
		assertEquals(3, stackList.size());
		Integer popedValue = stackList.pop();
		System.out.println("Poped Value : "+popedValue);
		Object[] objects = stackList.toArray();
      assertArrayEquals(new Object[]{100.0, 200.1}, objects);
	}
	
	@Test
	 public void testPopForString(){
		StackImpl stackList = new StackImpl();
		stackList.push("100");
		stackList.push("200");
		stackList.push("300");
		assertEquals(3, stackList.size());
		Integer popedValue = stackList.pop();
		System.out.println("Poped Value : "+popedValue);
		Object[] objects = stackList.toArray();
		assertEquals(2, stackList.size());
       assertArrayEquals(new Object[]{"100", "200"}, objects);
	}
	
	@Test
	 public void testToArray() {
		StackImpl stackList = new StackImpl();
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		Object[] objects = stackList.toArray();
        assertArrayEquals(new Object[]{100, 200, 300}, objects);
	}
	
	@Test
	 public void testToArrayForEmptyList() {
		StackImpl stackList = new StackImpl();
		Object[] objects = stackList.toArray();
       assertArrayEquals(new Object[]{}, objects);
	}
	
	@Test
	 public void testSize() {
		StackImpl stackList = new StackImpl();
		assertEquals(0, stackList.size());
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		assertEquals(3, stackList.size());
		Integer popedValue = stackList.pop();
		System.out.println("Poped Value : "+popedValue);
		Integer popedValue2 = stackList.pop();
		System.out.println("Poped Value : "+popedValue2);
		assertEquals(1, stackList.size());
		Object[] objects = stackList.toArray();
        assertArrayEquals(new Object[]{100}, objects);
	}
	
	@Test
	 public void testIsEmpty(){
		StackImpl stackList = new StackImpl();
		assertTrue(stackList.isEmpty());
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		assertFalse(stackList.isEmpty());
	}
	
	@Test
	 public void testContains(){
		StackImpl stackList = new StackImpl();
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		assertTrue(stackList.contains(100));
	}
	
	@Test
	 public void testContainsWithNull(){
		thrown.expect(NullPointerException.class);
		StackImpl stackList = new StackImpl();
		stackList.contains(null);
		stackList.push(100);
		stackList.push(200);
		stackList.push(300);
		stackList.contains(null);
	}
}
