package practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		//SolidRect
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		
		//Solid Rect with No
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		//Solid rect with row and colu
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print(a+""+b+" ");
			}
			System.out.println();
		}
		//Hollow Rectangle
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				if(a==1||a==5||b==1||b==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//Half pyramid
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//Half Pyramid with no
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		//Inverted half pyramid
		for(int a=5;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print(b+" ");
		}
		
          System.out.println();
	}
		
		//Inverted half rotate by 180
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5-a;b++) {
				System.out.print("  ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//to print 0-1 triangle
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				int c=a+b;
				if(c%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}System.out.println();
		}
		//to print floyds triangle
		int a=1;
		for(int b=1;b<=5;b++) {
			for(int c=1;c<=b;c++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		//break
		int b=1;
		do {
			System.out.println(b);
			if(b==15) {
				break;
			}
			b++;
		}while (b<=20);
		
		//while
		int c=1;
		while(c<=20) {
			System.out.println(c);
			if(c==11) {
				break;
			}
			c++;
		}
		
		//continue 
		int d=20;
		do {
			if(d==5) {
				d--;
				continue;
			}
			System.out.println(d);
			d--;
		}while(d>=1);
		
		//continue while
		int e=1;
		while(e<=20) {
			if(e==11) {
				e++;
				continue;
			}
			System.out.println(e);
			e++;
		}
		
		//Scanner class
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		int f=sc.nextInt();
		System.out.println("Enter second value");
		int g=sc.nextInt();
		System.out.println("Total is:");
		int h=f+g;
		System.out.println(h);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
