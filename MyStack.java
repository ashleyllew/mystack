
public class MyStack {
	
	int size;
	boolean isEmpty;
	Element root;
	
	public Element getRoot() {
		return root;
	}

	public void setRoot(Element root) {
		this.root = root;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getSize() {
		return size;
	}

	public void push(Element element) {
		Element root = getRoot();
		Element first = root.getNextElement();
		root.setNextElement(element);
		element.setNextElement(first);
		size++;
	}
	
	public Element pop() {
		if (size <= 0) {
			// throw an error here
			return null;
		}
		else {
			// redundant to have test element but necessary to get the top of the stack item
			Element root = getRoot();
			Element first = root.getNextElement();
			
			root.setNextElement(first.getNextElement());
			size--;
			return first;
		}
	}
	
	public String top() {
		Element top = getRoot();
		if (size == 0 || top.getNextElement() == null) {
			// throw an error here
			return null;
		}
		else {
			Element first = top.getNextElement();
			return first.getData();
		}
	}
	
	public void clear() {
		while (size > 0) {
			pop();
		}
	}	
}
