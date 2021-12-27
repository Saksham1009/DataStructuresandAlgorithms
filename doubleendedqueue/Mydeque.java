package doubleendedqueue;

public class Mydeque<E> {
	
	Node<E> head,tail;
	
	public void addTohead(E data) {
		Node<E> toadd = new Node(data);
		if(head==null) {
			head=tail=toadd;
		}else {
			head.next=toadd;
			toadd.prev=head;
		}
	}
	public E removeLast() throws Exception{
		if(tail==null) {
			throw new Exception("Cannot remove from an empty Deque");
		}else if(head==tail){
			Node<E> temp = head;
			head=tail=null;
			return temp.data;
		}else{
			Node<E> temp = tail;
			tail=tail.next;
			tail.prev=null;
			temp.next=null;
			return temp.data;
		}
	}
	public E peekFirst() {
		if(head==null) {
			return null;
		}else {
			return head.data;
		}
	}
	public E peekLast() {
		if(head==null) {
			return null;
		}else {
			return tail.data;
		}
	}
	
	//We can also make stack methods for these which will make this work with the logic of a stack and we can name the methods as push,pop&peek.
	
	public void addTotail(E data) {
		if(head==null) {
			Node<E> toadd = new Node(data);
			head=tail=toadd;
		}else{
			Node<E> toadd = new Node(data);
			tail.prev=toadd;
			toadd.next=tail;
			toadd.prev=null;
		}
	}
	public E removeFirst() throws Exception{
		if(head==null) {
			throw new Exception("Cannot remove from an empty Deque");
		}else if(head==tail) {
			Node<E> temp = head;
			head=tail=null;
			return temp.data;
		}else {
			Node<E> temp = head;
			head=head.prev;
			head.next=null;
			return temp.data;
		}
	}
	public static class Node<E>{
		E data;
		Node<E> next,prev;
		
		public Node(E data){
			this.data=data;
			this.next=this.prev=null;
		}
	}
}
