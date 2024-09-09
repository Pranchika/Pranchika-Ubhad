package encapsulation;

public class EncapsulationInJava {
	String id="Prachi";
	String pwd="Prachi123@";
	int actual_amount=50000;
	private void hide_amt(int amt) {
		actual_amount=amt;
		System.out.println(actual_amount);
	}
	private void hide_pwd(String new_pwd) {
		pwd=new_pwd;
		System.out.println(pwd);
	}

	public static void main(String[] args) {
		EncapsulationInJava e=new EncapsulationInJava ();
		e.hide_pwd("Prachi987@");
		e.hide_amt(15000);
	}

}
