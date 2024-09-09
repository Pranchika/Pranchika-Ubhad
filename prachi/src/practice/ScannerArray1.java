package practice;

import java.util.Scanner;

public class ScannerArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int [] abc=new int [size];
		System.out.println("Enter values");
		for(int a=0;a<size;a++) {
			abc[a]=sc.nextInt();
		}
		System.out.println("Values in array are");
		for(int b=0;b<size;b++) {
			System.out.println(abc[b]);
		}

	}

}
