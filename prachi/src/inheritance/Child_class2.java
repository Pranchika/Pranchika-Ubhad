package inheritance;
// Multilevel Inheritance
public class Child_class2 extends ChildClass1{
	int m=56;
	int n=94;
	int o=5;
	public void abc() {
		System.out.println("abc Instance method");
	}
	public void def() {
		System.out.println("def instance method");
	}
	public static void ijk() {
		System.out.println("ijk static method");
	}
	public static void main(String[] args) {
		Child_class2 cc=new Child_class2();
		cc.abc();
		cc.def();
		ijk();
		cc.function();
		cc.staff();
		cc.student();
		cc.value();
		number();
		employee();
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		System.out.println(cc.p);
		System.out.println(cc.q);
		System.out.println(cc.r);
		System.out.println(cc.m);
		System.out.println(cc.n);
		System.out.println(cc.o);
		

	}

}
