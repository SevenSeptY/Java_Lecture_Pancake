package Java_Felix;
import java.util.Scanner;

/*

 */

public class Main {
    public static void main(String[] args){

        int []scores = {56,67,78,89,100};
        System.out.println("length of array" + scores.length);

        // Traverse For
        int len = scores.length; //if length is a fixed number
        for (int i = 0; i <len; i++){
            int score = scores[i];
            System.out.println(score);
        }
        System.out.println("-------------------");
        //for each
        for (int x:scores){
            System.out.println(x);
        }
        System.out.println("---------print()----------");
        print(scores);
        System.out.println("-------- print2---------");
        //print2(12,12,12,12,12);
        print4(scores);
    }

    //int []x : must input an array
    public static void print(int[]x ){
        int len = x.length;
        for(int i = 0; i <len ; i ++){
            System.out.println(x[i]);
        }
    }
    //JDK 1.5 - int...x input an arrays of value
    public static void print2(int...x){
        int len = x.length;
        for(int i = 0; i <len ; i ++){
            System.out.println(x[i]);
        }
    }
    //testing for null - java.lang.NullPointerException
    //when a variable = null
    public static void print3(int[] x){
        System.out.println("length of Arrays:" + x.length);
    }
    //Array index out of bound exception. you can not print 6th array value
    //when only 5 defined 
    public static void print4(int[] x){
       for (int i = 0 ; i <= x.length; i ++){
           System.out.println(x[i]);
       }
    }

}



