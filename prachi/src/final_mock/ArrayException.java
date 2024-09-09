package final_mock;

public class ArrayException {

	public static void main(String[] args) {
		int [] abc=new int[4];
        abc[0]=50;
        abc[1]=60;
        abc[2]=70;
        abc[3]=80;
        for(int i=1;i<4;i++) {
        	System.out.println(abc[i]);
        }
        System.out.println(abc[5]);  //Exception
	}

}
