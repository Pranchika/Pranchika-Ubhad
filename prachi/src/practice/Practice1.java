package practice;

public class Practice1 {
	int p;
public void number(int x) {
	p=x;
	System.out.println(x);
}
public int data (int m,int n) {
	return 50+n;
}

	public static void main(String[] args) {
		Practice1 p=new Practice1();
		p.number(9);
		System.out.println(p.data(40, 5));
		
		int a=1;
		String day="";
		switch(a) {
		case 1:
			day="Mon";
			break;
		case 2:
			day="Tue";
			break;
		case 3:
			day="Wed";
			break;
		case 4:
			day="Thur";
			break;
		case 5:
			day="Fri";
			break;
		case 6:
			day="Sat";
			break;
		case 7:
			day="Sun";
			break;
			default:
				System.out.println("Invalid");
		}
		System.out.println("Day 1 is "+day);

	
	
	for(int s=50;s>=20;s--) {
		if(s%2==0) {
			System.out.println(s);
		}
	}
	for(int l=1;l<=3;l++) {
		for(int m=1;m<=4;m++) {
			System.out.print(l+""+m+" ");
		}
		System.out.println();
	}
	
	}
}
