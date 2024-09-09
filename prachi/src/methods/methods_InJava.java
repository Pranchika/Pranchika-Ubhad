package methods;

public class methods_InJava {
	public void function() {
    System.out.println("Instance method function");
	}

	public void value() {
		System.out.println("Instance method value");
	}

	public void data() {
		System.out.println("Instance method data");
	}

	public static void number() {
		System.out.println("Static  method number");
	}

	public static void id() {
		System.out.println("Static method id");
	}

	public static void main(String[] args) {
		methods_InJava mj=new methods_InJava();
	mj.function();
	mj.data();
	mj.value();
	number();
	id();
	}

}
