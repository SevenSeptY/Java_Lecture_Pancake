package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
2-D Java doesn't have multiple dimension array:
10 20 300
87 96 85
39 13 45
 */

public class Main{
    public static void main (String[] args){

        int[][] scores= {{78,98,38},{87,96,85},{67,78,89}};
        int classLen = scores.length;

        for (int i = 0; i < classLen; i++){
            int sum = 0;
            int count = scores[i].length;

            for(int j = 0; j< count; j++){
                sum +=scores[i][j];
            }
            int avg = sum/count;
            System.out.println("The "+(i+1)+" Avg score:" +avg);
        }
    }
}
