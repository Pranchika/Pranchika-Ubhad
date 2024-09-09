package set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClass {

	public static void main(String[] args) {
		HashSet<Integer> sr_no=new HashSet<Integer>();
		sr_no.add(1);
		sr_no.add(2);
		sr_no.add(3);
		sr_no.add(4);
		sr_no.add(5);
		sr_no.add(6);
		
		System.out.println(sr_no);
		System.out.println(sr_no.contains(3));
		System.out.println(sr_no.isEmpty());
		System.out.println(sr_no.clone());
		sr_no.remove(6);
		System.out.println(sr_no);
		System.out.println(sr_no.size());
		
		Iterator<Integer> p = sr_no.iterator();
         while(p.hasNext()) {
        	 System.out.println(p.next());
         }
       sr_no.clear();
       System.out.println(sr_no);
	}

}
