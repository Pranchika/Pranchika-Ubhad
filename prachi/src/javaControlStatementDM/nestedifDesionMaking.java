package javaControlStatementDM;

public class nestedifDesionMaking {

	public static void main(String[] args) {
		int a=70;
		if(a>=50) {
			System.out.println("a greater than equals 50");
			if(a>25) {
				System.out.println("a greater than 25");
				if(a<55) {
					System.out.println("a less than 55");
				}
			}
		}else {
			System.out.println("None of the above");
		}

	}

}
