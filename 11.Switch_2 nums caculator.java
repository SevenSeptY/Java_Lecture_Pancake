package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input 1st num:");
		double num1 = input.nextInt();
		
		System.out.println("input 2nd num:");
		double num2 = input.nextInt();
		
		System.out.println("input operator '+,-,*,/'");
		String op = input.next();
		
		switch(op) {
			case"+":{
				System.out.println("num1+num2= " + (num1+num2));
				break;
			}
			case"-":
				System.out.println("num1-num2= " + (num1-num2));
				break;
			
			case"*":
				System.out.println("num1*num2= " + (num1*num2));
				break;
			
			case"/":
				System.out.println("num1/num2= " + (num1/num2));
				break;
			
			default: 
				System.out.println("error input");
		}
	}
}
