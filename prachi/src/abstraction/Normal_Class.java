package abstraction;

public class Normal_Class extends AbstractClass {

	public static void main(String[] args) {
		Normal_Class nc=new Normal_Class ();
		nc.function();
		nc.value();
		nc.data();
		

	}

	@Override
	public void function() {
		System.out.println("function method");
		
	}

	@Override
	public void value() {
		System.out.println("value method");
		
	}
	

}
