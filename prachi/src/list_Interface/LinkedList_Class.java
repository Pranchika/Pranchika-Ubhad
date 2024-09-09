package list_Interface;

import java.util.LinkedList;

public class LinkedList_Class {

	public static void main(String[] args) {
		LinkedList<Integer> id = new LinkedList<Integer>();
		for (int a = 1; a <= 10; a++) {
			id.add(a);
		}
		System.out.println(id); 
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		id.add(2, null);
		System.out.println(id); 
		// [1, 2, null, 3, 4, 5, 6, 7, 8, 9, 10]
		
		System.out.println(id.clone()); 
		// [1, 2, null, 3, 4, 5, 6, 7, 8, 9, 10]
		
		System.out.println(id.contains(5)); 
		// true
		
		System.out.println(id.indexOf(5)); 
		// 5
		
		System.out.println(id.isEmpty()); 
		// false
		
		id.offerFirst(null);
		System.out.println(id);
		// [null, 1, 2, null, 3, 4, 5, 6, 7, 8, 9, 10]

		id.offerLast(11);
		System.out.println(id);
		// [null, 1, 2, null, 3, 4, 5, 6, 7, 8, 9, 10, 11]

		id.offer(0);
		System.out.println(id);
		// [null, 1, 2, null, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0]

		System.out.println(id.lastIndexOf(7));
		// 8

		id.remove(9);
		System.out.println(id);
		// [null, 1, 2, null, 3, 4, 5, 6, 7, 9, 10, 11, 0]

		System.out.println(id.size());
		// 13

		id.removeFirstOccurrence(null);
		System.out.println(id);
		// [1, 2, null, 3, 4, 5, 6, 7, 9, 10, 11, 0]

		id.removeLastOccurrence(null);
		System.out.println(id);
		// [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 0]

		System.out.println(id.get(10));
		// 0

		System.out.println(id.getFirst());
		// 1

		System.out.println(id.getLast());
		// 0

		System.out.println(id);
		// [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 0]

		System.out.println(id.pollFirst());
		// 1

		System.out.println(id);
		// [2, 3, 4, 5, 6, 7, 9, 10, 11, 0]

		System.out.println(id.pollLast());
		// 0

		System.out.println(id);
		// [2, 3, 4, 5, 6, 7, 9, 10, 11]

		System.out.println(id.poll());
		// 2

		System.out.println(id);
		// [3, 4, 5, 6, 7, 9, 10, 11]

		System.out.println(id.getFirst());
		// 3

		System.out.println(id);
		// [3, 4, 5, 6, 7, 9, 10, 11]

		System.out.println(id.getLast());
		// 11

		System.out.println(id.reversed());
		// [11, 10, 9, 7, 6, 5, 4, 3]

		System.out.println(id.peekFirst());
		// 3

		System.out.println(id.peek());
		// 3

		System.out.println(id.peekLast());
		// 11

		System.out.println(id);
		// [3, 4, 5, 6, 7, 9, 10, 11]

		id.clear();
		System.out.println(id);
		// []

	}

}
