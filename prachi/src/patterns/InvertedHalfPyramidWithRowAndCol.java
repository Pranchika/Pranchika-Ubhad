package patterns;

public class InvertedHalfPyramidWithRowAndCol {

	public static void main(String[] args) {
		for(int a=5;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print(a+""+b+" ");
			}
			System.out.println();
		}

	}

}
