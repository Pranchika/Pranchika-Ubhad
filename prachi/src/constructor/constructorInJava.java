package constructor;

public class constructorInJava {
	public constructorInJava() {
		this(12);
		System.out.println("User Define Constructor");
	}

	public constructorInJava(int a) {
		this("STP");
		System.out.println("Parameterized Constructor1");
		
	}

	public constructorInJava(int a, int b) {
		System.out.println("Parameterized Constructor2");
	}

	public constructorInJava(String c) {
		this(26, 33);
		System.out.println("Parameterized Constructor3");
	}

	public void value() {
		System.out.println("Instance method :value");
	}

	public static void main(String[] args) {
		constructorInJava cj = new constructorInJava();
		cj.value();

	}

}
