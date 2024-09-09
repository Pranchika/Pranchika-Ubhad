package final_mock;

public class NormalClass extends AbstractClass{

	@Override
	public void function() {
		System.out.println("Instance method function ");
		
	}

	@Override
	public void data() {
		System.out.println("Instance method data ");
		
	}

	@Override
	public void value() {
		System.out.println("Instance method value");
		
	}

	@Override
	public void number() {
		System.out.println("Instance method number");
		
	}

	public static void main(String[] args) {
		NormalClass nc=new NormalClass();
		nc.function();
		nc.data();
		nc.value();
		nc.number();

	}

}
