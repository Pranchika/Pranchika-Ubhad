package practice;

public class MethodOverloading1 {
	public void data() {
		System.out.println("Data method without parameter type");
	}
	public void data(int c) {
		System.out.println("Data method with int  type");
	}
	public void data(String d) {
		System.out.println("Data method with String type");
	}
	public void data(int a,int b) {
		System.out.println("Data method with int int type");
	}

	public static void main(String[] args) {
		MethodOverloading1 ml=new MethodOverloading1();
		ml.data();
		ml.data(15);
		ml.data("STP");
		ml.data(6, 9);
		
		
		String u="Automation";
		for(int a=0;a<u.length();a++) {
			System.out.print(u.charAt(a)+" ");
		}
		System.out.println("-----------");
		String v="Communication";
		for(int a=(v.length()-1);a>=0;a--) {
			System.out.print(v.charAt(a)+" ");
		}
		System.out.println("-----------");
		String w="prachi emailid prachi@gmail.com";
		String []st=w.split(" ");
		System.out.println(st[2]);
		
	}

}
