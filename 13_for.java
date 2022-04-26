package tutorial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//1
		for(int i = 0; i <10 ; i ++) {
				if (i==5) {
					continue;//skip current loop , enter next round 
				}
			System.out.println(i);
		}
		//2
		int j = 0;
		for (;j<10;j++) {
			
		}
		//3 dead pool: for(int i=0;;i++){}
		//4
		for(int i = 0;i <10 ;) {
			//
			i ++;
		}
		
		//5
		int x = 0 ;
		for(;x<10;) {
			//System.out.println(x);
			x++
		}
		//6 dead: for(;;){}
	}
}
