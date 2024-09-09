package practice;

public class Encapsulation1 {
	int id=101;
	String pwd="prachi123@";
	private void Password(String npwd) {
		pwd=npwd;
		System.out.println(pwd);
	}
	public static void main(String[] args) {
		Encapsulation1 e=new Encapsulation1();
		e.Password("prachi321@");
	}
}
