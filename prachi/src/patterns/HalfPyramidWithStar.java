package patterns;

public class HalfPyramidWithStar {

	public static void main(String[] args) {
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
