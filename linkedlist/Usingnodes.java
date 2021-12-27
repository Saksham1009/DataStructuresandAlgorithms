package linkedlist;

public class Usingnodes<E> {

	Node<E> head;
	void add(E data) {
		Node<E> toadd = new Node<E>(data);
		
		Node<E> temp = head;
		if(head==null) {
			head=toadd;
			return;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toadd;
	}
	void print() {
		Node<E> temp =head;
		// two methods to print one by this and one by the one not commented!
//		while(temp.next!=null) {
//			System.out.println(temp.data);
//			temp=temp.next;
//		}
//		System.out.println(temp.data+" ");
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	boolean isEmpty() {
		return head==null;
	}
	E remove() throws Exception{
		Node<E> temp =head;
		if(temp==null) {
			throw new Exception("Cannot remove last element from an empty linked list");
		}
		if(temp.next==null) {
			E ok = temp.data;
			head=null;
			return ok;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		E ok = temp.next.data;
		temp.next=null;
		return ok;
		
	}
	E getlast() throws Exception{
		Node<E> temp = head;
		if(temp==null) {
			throw new Exception("Empty linked list");
		}
			while(temp.next!=null) {
				temp=temp.next;
			}
			return temp.data;
		
	}
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data=data;
			next=null;
		}
	}
}
