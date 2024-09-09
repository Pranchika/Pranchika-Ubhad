package mapInterface;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<String, Integer> sr = new Hashtable<String, Integer>();
		sr.put("Prachi", 1);
		sr.put("Anand", 2);
		sr.put("Madhu", 3);
		sr.put("Diksha", 4);
		sr.put("Santoshi", 5);
		System.out.println(sr);
		System.out.println(sr.contains("Prachi"));
		System.out.println(sr.isEmpty());
		sr.remove("Anand", 2);
		System.out.println(sr);
		System.out.println(sr.size());

	}

}
