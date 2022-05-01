package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
Bubble Sort: works by repeatedly swapping the adjacent elements, by compares
two adjacent elements and swaps them until they are not in the intended order.
*/

public class Main{
    public static void main (String[] args){

        int[] nums = {43,13,54,65,765,45};
        //external loop for num of comparision
        for(int i = 0; i <nums.length-1; i ++){

            for(int j =0; j < nums.length-1-i; j++){

                if(nums[j]> nums[j+1]){
                    nums[j] = nums[j]+nums[j+1];
                    nums[j+1]= nums[j]-nums[j+1];
                    nums[j]= nums[j]-nums[j+1];
                }
            }
        }
        for (int n:nums){
            System.out.println(n);
        }
    }
}
