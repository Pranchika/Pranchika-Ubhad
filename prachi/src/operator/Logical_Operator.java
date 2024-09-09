package operator;

public class Logical_Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;

		// Logical && -- if both condition ytrue then o/p true
		System.out.println(a == 10 && b == 15);
		System.out.println(a>5 && b>=50);
		 
		//Logical || -- if any one condition true then o/p true
		System.out.println(a>=5 || b>=50);
		System.out.println(a==80 || b<=10);
		
		//Logical ! Reverse o/p
		System.out.println(!(a>=5 || b>=50));
		System.out.println(!(a==80 || b<=10));
	}

}
