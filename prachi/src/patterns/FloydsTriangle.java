package patterns;

public class FloydsTriangle {

	public static void main(String[] args) {
		int a=1;
		for(int b=a;b<=5;b++) {
			for(int c=1;c<=b;c++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}

	}

}
