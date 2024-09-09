package practice;

public class CastingJava {
	public static void main(String[] args) {
		//widening
    int a=50;
    long b=a;
    System.out.println(b);
   
    //narrowing
    
    double d=87.754;
    float f=(float) d;
    System.out.println(f);
    
    //Wrapper class
    //Converting primitive datatype into wrapper class
    
    int x=1;
    Integer y=Integer.valueOf(x);
    System.out.println(y);
    
    //Converting WrapperClass into primitive datatype
    Integer m=new Integer(500);
    int n=m.intValue();
    System.out.println(n);
    
    
    
    
    
	}
	
	
	
	
	
	}
	

