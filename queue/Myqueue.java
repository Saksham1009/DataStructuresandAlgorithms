package queue;
import linkedlist.Usingnodes.Node;
public class Myqueue<E> {
	private Node<E> head,rear;
	
	public void enqueue(E e) {
		Node<E> toadd = new Node(e);
		if(rear==null) {
			head=toadd;
			rear=toadd;
			return;
		}
		rear.next = toadd;
		rear=rear.next;
	}
	public E dequeue(){
		if(head==null) {
			return null;
		}else if(head.next==null){
			Node<E> temp = head;
			head=null;
			rear=null;
			return temp.data;
		}else {
			Node<E> temp = head;
			head=head.next;
			return temp.data;
		}
		
	}
	public void print() {
		if(head==null) {
			System.out.println("Empty queue!");
		}else {
			Node<E> temp = head;
			while(temp!=rear) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(rear.data);
		}
	}
}
