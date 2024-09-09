package practice;

public class Exception1 {
public void data() {
	System.out.println("data method");
}
	public static void main(String[] args) throws Exception {
		int a=7;
		int b=5;
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		catch(Exception e) {
			
		}
		int c=60;
		int d=75;
		if(c<=50) {
			throw new Exception("c less than 50");
		}else {
			throw new Exception("c greater than 50");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
