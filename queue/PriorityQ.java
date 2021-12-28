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
		//gets out on the basis of the priority, run the command and see
		//the queue(line 14) might not show the sorted queue, the elements are not put in a sorted order in the queue
		//but when you remove the elements or peek they come out in sorted order
		// for example smaller to bigger number or alphabetical order!
	}

}
