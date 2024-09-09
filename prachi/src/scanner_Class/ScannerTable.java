package scanner_Class;

import java.util.Scanner;

public class ScannerTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no.");
		int a=sc.nextInt();
		System.out.println("Table is as follow");
		for(int b=1;b<=10;b++) {
			System.out.println(a+"*"+b+"="+(a*b));
			
		}

	}

}
