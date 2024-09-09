package practice;

public class Practice9 extends Practice8{

	public static void main(String[] args) {
		Practice9 p=new Practice9();
		p.data();
		p.value();

	}

	@Override
	public void data() {
		System.out.println("data method");
		
	}

	@Override
	public void value() {
		System.out.println("value method");
		this.number();
	}

}
