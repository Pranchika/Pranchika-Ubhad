package variables;

public class variables {
int a=45;
int b=62;
static int c=49;
String d="STP";
public void Instance() {
	
	int e=85;
	System.out.println("Instance method");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
}
public static void function() {
	char f='j';
	System.out.println("Static method");
	variables v=new variables();
	System.out.println(v.a);
	System.out.println(v.b);
	System.out.println(c);
	System.out.println(v.d);
	System.out.println(f);
	
}
	public static void main(String[] args) {
		variables v=new variables();
		v.Instance();
		function();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(c);
		System.out.println(v.d);

	}

}
