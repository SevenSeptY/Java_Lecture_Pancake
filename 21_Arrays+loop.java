package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
Gussing a random number
 */

public class Main{
    public static void main (String[] args){

       int[] nums = new int[5];
       int len= nums.length;
       Random r = new Random();//Tool for random number
       for(int i=0;i <len;i++){
           r.nextInt(50);
       }

       Scanner input = new Scanner(System.in);
       System.out.println("Input your fav num (< 50)");
       int userNum = input.nextInt();

       boolean flag = false;

       for(int x:nums){
           if (userNum==x){
               flag = true;
               break;
           }
       }

       if(flag){
           System.out.println("Congrats");
       }else{
           System.out.println("No congrats, go ahead!");
       }
    }
}

/*
      A
     BBB
    CCCCC
   DDDDDDD
  EEEEEEEEE
 FFFFFFFFFFF
GGGGGGGGGGGGG
*/
package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number

public class Main{
    public static void main (String[] args){

       char[] cs= {'A','B','C','D','E','F','G'};
       int len = cs.length; //How many rows

       for (int i = 1; i <=len; i ++){
            //1st row 6 space, 2nd row has 5 space .....
           for (int j=i; j<len; j++){
               System.out.print(" ");
           }
           for (int j=1; j<= i*2-1;j++){
               System.out.print(cs[i-1]);
           }
           System.out.println();
       }
    }
}
