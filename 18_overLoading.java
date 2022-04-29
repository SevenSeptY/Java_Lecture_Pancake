package Java_Felix;
import java.util.Scanner;

public class Main {
  

    public static void main(String[] args){

        int result = add(10,20);
        System.out.println(result);
    }

  //function names are same , but type not same. 
    public static int add(int a, int b ){
        return a+b;
    }

    public static float add(float a, float b ){
        return a+b;
    }
}


