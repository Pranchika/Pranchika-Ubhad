package practice;

public class Practice7 extends PracticeJava{
	public void data1() {
		System.out.println("Instance method Data1 from CC");
		this.function();
		System.out.println(this.c);
		System.out.println(this.u);
	}
 public Practice7() {
	 this(1);
	 System.out.println("DC");
 }
 public Practice7(int a) {
	 this("STP");
	 System.out.println("PC1");
 }
 public Practice7(String b) {
	 this(5,9);
	 System.out.println("PC2");
 }
 public Practice7(int c,int d) {
	 System.out.println("PC3");
 }
 
	public static void main(String[] args) {
		Practice7 p=new Practice7();
		p.data1();
		
		

	}

}
