package set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet<String> name = new LinkedHashSet();
		name.add("Joe");
		name.add("Justin");
		name.add("Martina");
		name.add("Karry");
		name.add("Scott");
		name.add("Micheal");
		name.add("Ben");
		System.out.println(name);
		System.out.println(name.clone());
		System.out.println(name.contains("Micheal"));
		System.out.println(name.isEmpty());
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		name.remove("Scott");
		System.out.println(name);
		Iterator<String> p = name.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
	}
}
