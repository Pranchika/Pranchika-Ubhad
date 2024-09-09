package inheritance;

public class SingleInheritance extends ParentClass1 {
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
		
		SingleInheritance sc=new SingleInheritance ();
		sc.student();
		sc.staff();
		employee();
		sc.function();
		sc.value();
		number();
		System.out.println(sc.p);
		System.out.println(sc.q);
		System.out.println(sc.r);
		System.out.println(sc.a);
		System.out.println(sc.b);
		System.out.println(sc.c);
	
		

	}

}
