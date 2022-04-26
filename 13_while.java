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
		
		//Caculate all odd number and ven number and all number %3 = 0
		int a = 1;
		while (a<100) {
			if(a % 2==0) {
				System.out.println("even nums" + a);
			}else if(a % 2==1) {
				System.out.println("odd nums" +a);
			}
			if (a % 3==0) {
				System.out.println("3 %"+ a);
			}
			a++;
		}
	}
}
