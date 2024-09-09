package array;

public class MDA {

	public static void main(String[] args) {
		int[][]abc=new int[2][3];
abc[0][0]=122;
abc[0][1]=182;
abc[0][2]=122;
abc[1][0]=312;
abc[1][1]=142;
abc[1][2]=124;

for(int a=0;a<2;a++) {
	for(int b=0;b<3;b++) {
		System.out.print(abc[a][b]+" ");
	}
	System.out.println();
}
	}

}
