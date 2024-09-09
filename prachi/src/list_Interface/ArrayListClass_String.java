package list_Interface;

import java.util.ArrayList;

public class ArrayListClass_String {
	public static void main(String[] args) {
		ArrayList<String> course =new ArrayList<String>();
		course.add(null);
		course.add("Manual Testing");
		course.add("Automation Testing");
		course.add(null);
		course.add("API");
		course.add("Java");
		course.add("Core Java");
		course.add("Manual Testing");
		course.add("Azure Devop");
		course.add("API");
		System.out.println(course);
		System.out.println(course.get(2));
		System.out.println(course.indexOf("Manual Testing"));
		//first Manual Testing value get removed out of Duplicate values
		course.remove("Manual Testing");
		System.out.println(course);
		System.out.println(course.isEmpty());
		System.out.println(course.contains("Java"));
		System.out.println(course.getFirst());
		System.out.println(course.getLast());
		System.out.println(course.removeFirst());
		System.out.println(course.removeLast());
		System.out.println(course);
		System.out.println(course.clone());
		System.out.println(course.size());
		System.out.println(course.reversed());

	}
}
