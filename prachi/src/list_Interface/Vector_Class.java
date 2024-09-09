package list_Interface;

import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) {
		Vector<Float> id=new Vector<Float> ();

		for(float a=100.00f;a<=120.00f;a++) {
			id.add(a);
		}
		System.out.println(id);
		id.add(11, null);
		System.out.println(id);
		System.out.println(id.indexOf(null));
		System.out.println(id.clone());
		System.out.println(id.capacity());
		System.out.println(id.contains(107.06));
		System.out.println(id.getFirst());
		System.out.println(id.getLast());
	}

}
