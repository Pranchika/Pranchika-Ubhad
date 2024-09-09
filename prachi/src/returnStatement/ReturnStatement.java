package returnStatement;

public class ReturnStatement {
public void data() {
	System.out.println("No return ,no argument");
}
public void function(int a) {
	System.out.println("Argument,no return");
}
//Argument and Return Keyword
public void value(int b,String c) {
	return;
	
}
//Argument and Return Statement
public int number(int x,int y) {

	return 60+y;
}
	public static void main(String[] args) {
		ReturnStatement rs=new ReturnStatement();
		
		System.out.println(rs.number(50, 40));
	}

}
