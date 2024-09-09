package array;

public class SingleDimensional {

	public static void main(String[] args) {
		int [] abc=new int[4];
		abc[0]=100;
		abc[1]=200;
		abc[2]=300;
		abc[3]=400;
		
		
		//using for loop
		for(int i=0;i<4;i++) {
			System.out.println(abc[i]);
		}
		System.out.println("------");
		
		//using for each loop
		for(int q:abc) {
			System.out.println(q);
		}
		System.out.println(abc[2]);

	}

}
