import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyStackTests {

	@Test
	public void initialStack() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
		
		assertEquals(stack.getSize(), 0);
	}
	
	@Test
	public void push() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
		
		Element element = new Element();
		stack.push(element);
		
		assertEquals(stack.getSize(), 1);
	}
	
	@Test
	public void pushAndPop() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);

		Element element = new Element();
		stack.push(element);

		stack.pop();
		assertEquals(stack.getSize(), 0);
	}
	
	@Test
	public void popEmpty() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
		assertEquals(stack.pop(), null);
	}
	
	@Test
	public void addMultipleElements() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
		
		Element element = new Element();
		stack.push(element);
		
		Element element2 = new Element();
		stack.push(element2);
		
		assertEquals(stack.getSize(), 2);
	}
	
	@Test
	public void clearStack() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
		
		Element element = new Element();
		stack.push(element);
		
		Element element2 = new Element();
		stack.push(element2);
		
		stack.clear();
		
		assertEquals(stack.getSize(), 0);
	}
	
	@Test
	public void isStackEmpty() {
		MyStack stack = new MyStack();
		assertEquals(stack.isEmpty(), true);
	}
	
	@Test
	public void stackIsNotEmpty() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
		
		Element element = new Element();
		stack.push(element);
		
		Element element2 = new Element();
		stack.push(element2);
		
		assertEquals(stack.isEmpty(), false);
	}	
	
	@Test
	public void nullTop() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);
				
		assertEquals(stack.top(), null);
	}
	
	@Test
	public void pushWorks() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);

		Element element = new Element();
		stack.push(element);
		
		assertEquals(stack.getRoot().getNextElement(), element);
		
		Element element2 = new Element();
		stack.push(element2);

		assertEquals(stack.getRoot().getNextElement(), element2);
	}
	
	@Test
	public void top() {
		MyStack stack = new MyStack();
		Element root = new Element();
		stack.setRoot(root);

		Element element = new Element();
		element.setData("peach");
		stack.push(element);
		String data = stack.top();
		
		assertEquals("peach", data);
	}


}