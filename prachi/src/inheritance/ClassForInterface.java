package inheritance;

public class ClassForInterface implements ParentInterface1,ParentInterface2{
String u="STP";
char v='k';
public void Instance() {
	System.out.println("Instance method");
}
	public static void main(String[] args) {
		ClassForInterface ci=new ClassForInterface();
		
		ci.function();
		ci.value();
		ci.abc();
		ci.def();
		
		System.out.println(ci.a);
		System.out.println(ci.u);
		System.out.println(ci.v);
		System.out.println(ci.b);
		System.out.println(ci.c);
		System.out.println(ci.m);
		System.out.println(ci.n);
		System.out.println(ci.o);
		// we can create interface obj indirectly
		ParentInterface1 pi=new ClassForInterface();
		

	}
	@Override
	public void abc() {
	System.out.println("abc Instance method");	
		
	}
	@Override
	public void def() {
		System.out.println("def Instance method");
		
	}
	@Override
	public void function() {
		System.out.println("Function instance method from interface1");
		
	}
	@Override
	public void value() {
		System.out.println("value instance method from interface1");
		
	}
	

}
