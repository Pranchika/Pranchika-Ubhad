package practice;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println("Add"+a+b);
		break;
		case '-':
			System.out.println("Sub"+(a-b));
		break;
		case '*':
			System.out.println("Mult"+(a*b));
		break;
		case '/':
			System.out.println("Div"+(a/b));
		break;
		case '%':
			System.out.println("Mod"+(a%b));
		break;
		default:
			System.out.println("Invalid");
		}

	}

}
