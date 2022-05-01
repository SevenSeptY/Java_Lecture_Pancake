package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
Selection Sort: find the mii
34,4,56,17,90,65
4,34,56,17,90,65    -1st find min element in arr[0-5]and place it at beginning
4,17,56,34,90,65    -2nd find min element in arr[1-5]and place it at beginning
4,17,34,56,90,65    -3rd find min element in arr[2-5]
4,17,34,56,90,65    -4th find min element in arr[3-5]
4,17,34,56,65,90    -5th find min element in arr[4-5]
*/

public class Main{
    public static void main (String[] args){

        int[] nums = {34,4,56,17,90,65};
        int minIndex = 0 ;//used to record the place of min num
        for(int i = 0; i< nums.length-1;i ++){

            minIndex = i;
            for (int j= i +1; j< nums.length; j++){

                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            if (minIndex !=i){
                nums [minIndex] = nums[minIndex]+nums[i];
                nums[i]= nums[minIndex]-nums[i];
                nums[minIndex]= nums[minIndex]-nums[i];
            }
        }

        for(int n:nums){
            System.out.println(n);
        }
    }
}
