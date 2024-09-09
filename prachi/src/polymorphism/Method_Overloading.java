package polymorphism;

public class Method_Overloading {
public void function() {
	System.out.println("function  method");
}
public void function(int a) {
	System.out.println("function int method ");
}
public void function(int f,String b) {
	
	System.out.println("function int,String  method ");
}

	public static void main(String[] args) {
		Method_Overloading mo=new Method_Overloading();
		mo.function();
		mo.function(15);
		mo.function(7,"MSD" );
	}

}
