package list_Interface;

import java.util.ArrayList;

public class ArrayListClass_Int {

	public static void main(String[] args) {
		ArrayList<Integer> sr_no =new ArrayList<Integer>();
		sr_no.add(null);
		sr_no.add(1);
		sr_no.add(2);
		sr_no.add(null);
		sr_no.add(3);
		sr_no.add(4);
		sr_no.add(5);
		sr_no.add(6);
		sr_no.add(2);
		sr_no.add(3);
		System.out.println(sr_no);
		System.out.println(sr_no.get(2));
		System.out.println(sr_no.indexOf(5));
		sr_no.remove(8);
		System.out.println(sr_no);
		System.out.println(sr_no.isEmpty());
		System.out.println(sr_no.contains(9));
		System.out.println(sr_no.getFirst());
		System.out.println(sr_no.getLast());
		System.out.println(sr_no.removeFirst());
		System.out.println(sr_no.removeLast());
		System.out.println(sr_no);
		System.out.println(sr_no.clone());
		System.out.println(sr_no.size());
		System.out.println(sr_no.reversed());

	}

}
