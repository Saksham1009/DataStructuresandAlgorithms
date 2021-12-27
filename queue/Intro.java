package queue;

import java.util.*;

public class Intro {

	public static void main(String[] args){
		//Queue<Integer> q = new LinkedList<>();
		//remove(Exception)-->poll(null)
		//element(Exception)-->peek(null)
		//add(Excpetion)-->offer(null)
//		System.out.println(q.peek());
//		q.add(1);
//		q.add(2);
//		q.remove();
//		q.remove();
//		q.add(1);
//		System.out.println(q.poll());
		Myqueue<Integer> q = new Myqueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.dequeue());
		q.dequeue();
		q.print();
		

	}

}
