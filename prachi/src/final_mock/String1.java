package final_mock;

public class String1 {

	public static void main(String[] args) {
		String a = new String("Automation");
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("o"));

		
		String b="Communication";
		System.out.println(a.equals(b));
		
		System.out.println(b.concat("class"));
		System.out.println(b);
		
		StringBuffer sb=new StringBuffer("Manual");
		System.out.println(sb.append("Testing"));
		System.out.println(sb);
		
		int x=8;
		for(int m=1;m<=10;m++) {
			System.out.println(x+"*"+m+"="+(x*m));
		}
	}

}
