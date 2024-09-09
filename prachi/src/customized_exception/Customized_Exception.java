package customized_exception;

public class Customized_Exception {

	public static void main(String[] args) throws Exception {
		int a=15;
		if(a>15) {
			throw new Exception("Value is greater than 15");
		}
		else {
			throw new Exception("Value is less than 15");
		}

	}

}
