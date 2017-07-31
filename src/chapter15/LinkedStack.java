package chapter15;

public class LinkedStack<T> {
	private static class Node<U> {
		U item;
		Node<U> next;
		Node() {
			item = null;
			next = null;
		}
		
		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}
		
		boolean end() {
			return item == null && next == null;
		}
	}
	
	private Node<T> top = new Node<T>();
	
	public void push(T item) {
		top = new Node<T>(item, top);
	}
	
	public T pop() {
		if (!top.end()) {
			T result = top.item;
			top = top.next;
			return result;
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<>();
		for (String s : "how are you  I'm fine".split(" ")) {
			ls.push(s);
		}
		String s;
		while ((s = ls.pop() )!= null) {
			System.out.println(s);
		}
	}
}
