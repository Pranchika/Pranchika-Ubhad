package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		int a=15;
		int b=25;
		try {
			Thread.sleep(2000);
		} catch (NullPointerException e) {
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("Try Catch block Excecuted");
		}
		System.out.println(a+b);
		
		System.out.println(a*b);

	}

}
