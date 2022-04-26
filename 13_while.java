//10 ! = 362880
package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//10!
		int num = 10;
		int i = num;
		while (i>0) {
			num = num*i;
			i--;
		}
		System.out.println(num);
		
	}
}
