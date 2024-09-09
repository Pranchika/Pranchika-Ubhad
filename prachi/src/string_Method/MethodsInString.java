package string_Method;

public class MethodsInString {

	public static void main(String[] args) {
		String name = "Stp Infotech";
		String Institude = "AIMS Academy";
		System.out.println(name.isEmpty());
		System.out.println(name.replace("Stp", "Attitude"));
		System.out.println(name.contains("Stp"));
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.substring(4));
		System.out.println(name.substring(4, 8));
		System.out.println(name.trim());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.equals(Institude));
		System.out.println(name.equalsIgnoreCase(Institude));
		System.out.println(name.concat(" Sevagram"));
   
		
		//if we want to break the string we use split method
		String a="Pratiksha has emailid pratiksha@gmail.com";
		String [] toBreak =a.split(" ");
		System.out.println(toBreak[0]);
		
		StringBuffer sb=new StringBuffer("Automation");
		System.out.println(sb.append(" Testing"));
	}

}
