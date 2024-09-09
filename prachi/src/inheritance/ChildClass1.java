package inheritance;

public class ChildClass1 extends ParentClass1 {
	int p = 56;
	int q = 94;
	int r = 5;

	public void student() {
		System.out.println("student Instance method");
	}

	public void staff() {
		System.out.println("staff instance method");
	}

	public static void employee() {
		System.out.println("employee static method");
	}

	public static void main(String[] args) {
		// is a relationship
		ChildClass1 cc = new ChildClass1();
		cc.student();
		cc.staff();
		employee();
		cc.function();
		cc.value();
		number();
		System.out.println(cc.p);
		System.out.println(cc.q);
		System.out.println(cc.r);
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
     
		
		//Has a Relationship
		ParentClass1 pc = new ParentClass1();
		pc.function();
		pc.value();
		number();
		System.out.println(pc.a);
		System.out.println(pc.b);
		System.out.println(pc.c);
	}

}
