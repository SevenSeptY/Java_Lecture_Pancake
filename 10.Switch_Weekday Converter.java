package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the day of today ");
		int day = input.nextInt();
		//Switch must includs int/char/short/byte 
		//Every case must includs break, or it will continue running
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tusday");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("Null");
			break;
		}
	}
}
