package inheritance;

public interface ParentInterface2 {
	int m = 56;
	int n = 94;
	int o = 5;

	public void abc();

	public void def();
	

	public static void ijk() {

		System.out.println("ijk static method");
	}

	public static void main(String[] args) {
		// we cannot create object of interface directly
		// bcoz it is abstract in nature we can create its obj in normal class
	}
}
