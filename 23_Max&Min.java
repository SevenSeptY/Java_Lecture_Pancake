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

       int[] num = {12,3,54,67,88,34};
       int max = max(num);
       System.out.println("the max is "+ max);
       int min = min(num);
        System.out.println("the min is "+ min);

    }
    //find the max and min from array
    public static int max(int[] num){
        int max= num[0];
        int len= num.length;
        for(int i=1; i<len; i ++){
            if(num[i]>max){
                num[i]= num[i]+max;
                max = num[i]-max;
                num[i] = num[i]-max;
            }
        }
        return max;
    }
    public static int min(int[] num){
        int min = num[0];
        int len= num.length;
        for(int i=1; i<len; i ++){
            if(num[i]<min){
                num[i]= num[i]+min;
                min = num[i]-min;
                num[i] = num[i]-min;
            }
        }
        return min;
    }
}
