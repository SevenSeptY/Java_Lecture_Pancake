package Java_Felix;
import java.util.Scanner;

/*
An array declaration has two components: the type and the name.
1. int []scores = new int[3]; //combining both statements in one
2. int []scores;//declaring array
    scores = new int[3];// allocating memory to array;
3. int []scores = new int[]{56, 78, 98}; // Declaring array literal
4. int []scores = {56,78,98}
 */

public class Main {
    public static void main(String[] args){
         int[]nums = new int[5];

         for (int i=0; i < nums.length ; i ++){
             nums[i] = i + 1;
         }

         int []nums2;
         nums2 = new int[5];


         int []nums3 = new int[]{56,78,89};


         int []nums4 = {34,54,65};

         System.out.println("The length of array:" + nums3.length);
    }
}



