package this_keyword;

public class thisKeyword {
	int p = 56;
	int q = 94;
	int r = 5;

	public void student() {
		System.out.println("student Instance method");
	}

	public void staff() {
		System.out.println("staff instance method");
		this.student();
		
		this.employee();
		System.out.println(this.p);
		System.out.println(this.q);
		System.out.println(this.r);
	}

	public static void employee() {
		System.out.println("employee static method");
	}

	public static void main(String[] args) {
		thisKeyword tk=new thisKeyword();
		tk.staff();

	}

}
