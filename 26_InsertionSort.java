package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
Insertion Sort: find the min
34,4,56,17,90,65

*/

public class Main{
    public static void main (String[] args){

        int[] nums = {34,4,56,17,90,65};
        for(int i = 1; i <nums.length; i ++){

            int temp = nums[i];
            int j = 0;
            for(j= i-1;j>=0;j--){
                if(nums[j]>temp){
                  nums[j+1]=nums[j];
                }else{
                    break;
                }
            }
            if (nums[j+1]!=temp){
                nums[j+1] =temp;
            }
        }
        for(int n:nums){
            System.out.println(n);
        }
    }
}
