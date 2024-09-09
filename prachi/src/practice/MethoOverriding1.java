package practice;

public class MethoOverriding1 extends MethodOverloading1 {
	public void data() {
		System.out.println("Data method without parameter type1");
	}
	public void data(int c) {
		System.out.println("Data method with int  type2");
	}
	public void data(String d) {
		System.out.println("Data method with String type3");
	}
	public void data(int a,int b) {
		System.out.println("Data method with int int type4");
		super.data();
		
	}
	public static void main(String[] args) {
		MethoOverriding1 m=new MethoOverriding1();
m.data(5);
m.data("Stp");
m.data(4, 3);
System.out.println();
	}

}
