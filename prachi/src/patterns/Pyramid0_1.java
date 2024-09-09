package patterns;

public class Pyramid0_1 {
	public static void main(String[] args) {
for(int a=1;a<=5;a++) {
	for(int b=1;b<=a;b++) {
		int c=a+b;
		if(c%2==0) {
			System.out.print("1 ");
		}else {
			System.out.print("0 ");
		}
		
	}
	System.out.println();
}	
	}
}
