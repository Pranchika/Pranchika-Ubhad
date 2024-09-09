package this_keyword;

public class ChildClass extends thisKeyword {
	int m=56;
	int n=94;
	int o=5;
	public void abc() {
		System.out.println("abc Instance method");
	}
	public void def() {
		this.abc();
		System.out.println("def instance method");
		this.ijk();
		System.out.println(this.m);
		System.out.println(this.n);
		System.out.println(this.o);
		this.staff();
		System.out.println(this.p);
		
	}
	public static void ijk() {
		System.out.println("ijk static method");
	}
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.def();

	}

}
