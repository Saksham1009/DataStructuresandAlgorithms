package doubleendedqueue;

import java.util.ArrayDeque;

public class Intro {

	public static void main(String[] args) {
		//Functions are same as that in queue but has double the number of functions as the functions are from both the end First and Last, for example:
		//offerFirst-->addFirst(throws Exception)
		//pollFirst-->removeFirst(throws Exception)
		//elementFirst-->peekFirst(throws Exception)
		ArrayDeque<Integer> ad = new ArrayDeque();
		
		ad.addFirst(1);
		ad.addFirst(13);
		System.out.println(ad.peek());
		ad.addLast(10);
		System.out.println(ad.pop());
		System.out.println(ad.peek());
		System.out.println(ad.pop());
		System.out.println(ad.peek());
		
	}

}
