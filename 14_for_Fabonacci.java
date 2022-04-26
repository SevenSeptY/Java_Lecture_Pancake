package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Fibonacci: 1 1 2 3 5 8 13 21 34 55
		int a = 1;
		int b = 1;
		int next = 0 ;
		System.out.print(a + " " +b + " ");
		for (int i = 0; i < 10 ; i ++) {
			next = a+b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}
	}
}
