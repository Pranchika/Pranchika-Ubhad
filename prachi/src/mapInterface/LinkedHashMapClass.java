package mapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> day=new LinkedHashMap<String, Integer> ();
		day.put("Mon", 1);
		day.put("Tues", 2);
		day.put("Wedn", 3);
		day.put("Thurs", 4);
		day.put("Fri", 5);
		day.put("Sat", 6);
		day.put("Sun", 7);
		System.out.println(day);
		System.out.println(day.clone());
		System.out.println(day.containsKey("fri"));
		System.out.println(day.isEmpty());
		System.out.println(day.remove("Wedn", 3));
		day.replace("Sun", 7, 1);
		System.out.println(day);
		day.put("Sunday", 7);
		System.out.println(day);
		System.out.println(day.size());
		day.put("HappyDay", 0);
		System.out.println(day);
		
	}

}
