package scanner_Class;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First value");
		int a=sc.nextInt();
		System.out.println("Enter Second value");
		int b=sc.nextInt();
		System.out.println("Enter +,-,*,/,% either one");
		char c=sc.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
			default:
				System.out.println("Invalid");
			
		}

	}

}
