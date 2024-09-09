package switchInJava;

public class Switch_Statement {

	public static void main(String[] args) {
		int a=5;
		String day="";
		switch(a) {
		case 1:
			day="Mon";
		break;
	case 2:
		day="Tues";
		break;
	case 3:
		day="Wedn";
		break;
	case 4:
		day="Thurs";
		break;
	case 5:
		day="Fri";
		break;
	case 6:
		day="Sat";
		break;
	case 7:
		day="Sun";
		break;
		default:
			System.out.println("Invalid day no.");
		
	}
System.out.println("Day "+ a +"is "+day);

	}

}
