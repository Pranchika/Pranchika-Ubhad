package super_Keyword;

public class CC extends PC1{
	int m=56;
	int n=94;
	int o=5;
	public void abc() {
		System.out.println("abc Instance method");
	}
	public void def() {
		this.abc();
		System.out.println("def instance method");
		super.staff();
		System.out.println(super.p);
		System.out.println(super.q);
		System.out.println(super.r);
		
	}
	public static void ijk() {
		System.out.println("ijk static method");
	}
	public static void main(String[] args) {
		CC cc=new CC();
		cc.def();

	}

}
