//*
**
***
****
*****
******
*/
package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//external loop for row 
		//internal loop for column 
		for(int i = 1; i <= 5; i++) {
			//internal loop for column 
			for(int j=1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
