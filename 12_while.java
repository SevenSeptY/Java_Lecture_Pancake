/**
while(expreission){
 //
}

While loop, sum of 1-100 ; ans 5050
*/
package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int num = 0;//for sum 
		int i = 1;
		while (i <=100) {
			num += i;
			i++;
		}
		System.out.println(num);
		
	}
}
