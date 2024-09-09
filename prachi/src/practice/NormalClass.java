package practice;

public class NormalClass implements Interface1,Interface2{

	public static void main(String[] args) {
		NormalClass nc=new NormalClass();
		nc.black();
		nc.blue();
		nc.red();
		nc.green();
		nc.yellow();
		System.out.println(nc.a);
		System.out.println(nc.b);
		System.out.println(nc.c);
	}

	@Override
	public void black() {
		System.out.println("black from I2");
		
	}

	@Override
	public void blue() {
		System.out.println("blue from I2");
		
	}

	@Override
	public void green() {
		System.out.println("green from I1");
		
	}

	@Override
	public void yellow() {
		System.out.println("yellow from I1");
		
	}

	@Override
	public void red() {
		System.out.println("red from I1");
		
	}

}
