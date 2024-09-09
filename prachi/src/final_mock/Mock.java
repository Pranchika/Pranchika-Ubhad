package final_mock;

public class Mock {
int a=50;

public void function() {
	if(a<10) {
		System.out.println("a is greater than 10");
	}
	else if(a==20) {
		System.out.println("a equals 20");
	}else if(a>25) {
		System.out.println("a greater than 25");
	}else if(a<25) {
		System.out.println("a less than 25");
	}else {
		System.out.println("Invalid");
	}
		
}
	public static void main(String[] args) {
		Mock m=new Mock();
		m.function();
	}

}
