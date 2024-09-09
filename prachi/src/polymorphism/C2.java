package polymorphism;

public class C2 extends MethodOverridingC1 {
	int a = 51;
	int b = 49;

	public void function() {
		System.out.println("Function method from C2");
	}

	public static void main(String[] args) {
		C2 c = new C2();
		c.function();
		System.out.println(c.a);
		System.out.println(c.b);
		
		
		MethodOverridingC1 mo=new MethodOverridingC1();
		mo.function();
		System.out.println(mo.a);
		System.out.println(mo.b);
	 
		MethodOverridingC1 m=new C2();
		m.function();
		System.out.println(m.a);
		System.out.println(m.b);
		
	}

}
