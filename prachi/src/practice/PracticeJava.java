package practice;

import java.lang.reflect.Array;

public class PracticeJava {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
	char h;
	String i;
	Array j;
	int u=56;
	static int v=33;
	int r=80;
public void data() {
	String w="STP";
	System.out.println("Instance method");
	System.out.println(w);
	System.out.println(u);
	System.out.println(v);
	//Arithmetatic operator
	System.out.println(u+r);
	System.out.println(u*30);
	System.out.println(u>=10);
	System.out.println(u==10 || r==80);
	this.function();
	System.out.println(this.u);
	System.out.println(this.v);
	
}
public static void function() {
	System.out.println("Function static method");
	PracticeJava pj1 = new PracticeJava();
	System.out.println(pj1.u);
	System.out.println(v);
}
	public static void main(String[] args) {
		PracticeJava pj = new PracticeJava();
		System.out.println("Default value of byte " + pj.a);
		System.out.println("Default value of short " + pj.b);
		System.out.println("Default value of int " + pj.c);
		System.out.println("Default value of long " + pj.d);
		System.out.println("Default value of float " + pj.e);
		System.out.println("Default value of double " + pj.f);
		System.out.println("Default value of boolean " + pj.g);
		System.out.println("Default value of char " + pj.h);
		System.out.println("Default value of String " + pj.i);
		System.out.println("Default value of array " + pj.j);
		function();
		PracticeJava.function();
		pj.data();
		
		//String
		String a="Automation";
		System.out.println(a.concat("Testing"));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.substring(4, 7));
		System.out.println(a.contains("i"));
		System.out.println(a.length());
		System.out.println(a.charAt(5));
		System.out.println(a.trim());
		
		//new keyword
		String ab=new String("Mock Java");
		System.out.println(ab.concat(" Today"));
		System.out.println(ab.contains("p"));
		System.out.println(ab);
		
		//String Buffer
		
		StringBuffer sb=new StringBuffer("Manual");
		System.out.println(sb.append(" Testing"));
		System.out.println(sb);
		
		//to print String in Forward direction
		String k="Communication";
		for(int l=0;l<=k.length()-1;l++) {
			System.out.print(k.charAt(l)+" ");
		}
		System.out.println(" --------");
		//to print String in Backward direction
		String m="Intermediate";
		for(int n=m.length()-1;n>=0;n--) {
			System.out.print(m.charAt(n)+" ");
		}
		System.out.println("------");
		//to split string
		String o="Manufacture unit sevagram wardha";
		String [] abc=o.split(" ");
		System.out.println(abc[2]);
		
		int s=80;
		int t=40;
		if(s<=t) {
			System.out.println("s less than t");
		}else System.out.println("greater");
	}
	  
	

}
