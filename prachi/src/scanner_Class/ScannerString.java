package scanner_Class;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String a");
		String a=sc.nextLine();
		System.out.println("Enter String b");
		String b=sc.nextLine();
		System.out.println("Complete String is");
		String c=a+b;
		System.out.println(c);

	}

}
