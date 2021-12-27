package linkedlist;

public class StackwithLinkedList<E> {
	private Usingnodes<E> ll = new Usingnodes();
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from an empty stack, naughty naughty!");
		}
		return ll.remove();
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeking from an empty stack, naughty naughty!");
		}
		return ll.getlast();
	}
}
