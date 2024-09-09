package practice;

public class Practice6 {

	public static void main(String[] args) {
		int[]id=new int [5];
		id[0]=101;
		id[1]=102;
		id[2]=103;
		id[3]=104;
		id[4]=105;
		
		for(int i=1;i<5;i++) {
			System.out.println(id[i]);
		}
		System.out.println(id.length);
		System.out.println(id[3]);
		System.out.println(id[2]);
		
		for(int j:id) {
			System.out.println(j);
		}

		int []stu= {3,4,5,6,};
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i]);
		}
		for(int j:stu) {
			System.out.println(j);
		}
		
		
		//MultiDimensionalArray
		int[][]ids=new int[3][4];
		 ids[0][0]=45;
		 ids[0][1]=55;
		 ids[0][2]=65;
		 ids[0][3]=75;
		 ids[1][0]=45;
		 ids[1][1]=45;
		 ids[1][2]=15;
	     ids[1][3]=92;
		 ids[2][0]=85;
		 ids[2][1]=25;
		 ids[2][2]=35;
		 ids[2][3]=15;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(ids[i][j]+" ");
			}
			System.out.println();
		}
		
		//Multi without Memory
		int [][]rn= {{2,2},{3,4},{4,5}};
		System.out.println(rn.length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(rn[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
