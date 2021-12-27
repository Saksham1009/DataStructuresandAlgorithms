package queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1);
		pq.add(5);
		pq.add(9);
		pq.add(3);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		

	}

}
