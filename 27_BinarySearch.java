package tutorial;
//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Binary search for sorted arrays 
		int[] num = {10,20,50,65,88,90};
		int index = binarySearch(num,65);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] num, int key) {
		int start = 0; //Start location 
		int end = num.length-1; 
		
		while(start<=end) {
			int middle = (start + end)/2; // >>>1
			if(num[middle]>key) {
				end = middle+1;
			}else if (num [middle]<key) {
				start = middle-1;
			}else {
				return middle;
			}
		}
		return-1;
	}
}
