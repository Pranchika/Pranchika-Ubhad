package mapInterface;

import java.util.HashMap;
import java.util.HashSet;

public class Hash_mapClass {

	public static void main(String[] args) {
		HashMap<Character, Integer> vowels=new HashMap<Character, Integer>();
		vowels.put('a', 1);
		vowels.put('e', 2);
		vowels.put('i', 3);
		vowels.put('o', 4);
		vowels.put('u', 5);
		System.out.println(vowels);
		System.out.println(vowels.containsKey('p'));
		System.out.println(vowels.clone());
		System.out.println(vowels.remove('o', 4));
		System.out.println(vowels);
		vowels.put('o', 4);
		System.out.println(vowels);
		System.out.println(vowels.values());
		System.out.println(vowels.size());
		System.out.println(vowels.values());
	}
	}