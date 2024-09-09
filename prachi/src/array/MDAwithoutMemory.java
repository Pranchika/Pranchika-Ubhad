package array;

public class MDAwithoutMemory {

	public static void main(String[] args) {
		int [][]abc= {{1,2,4},{2,6,4}};
		System.out.println(abc.length);
		for(int a=0;a<2;a++) {
			for(int b=0;b<3;b++) {
				System.out.print(abc[a][b]+" ");
			}
			System.out.println();
		}

	}

}
