package Java_Felix;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //cup = blender(banana, apple)
        boolean bool = isLeapYear(2017);
        if(bool){
            System.out.println("leap year");
        }else{
            System.out.println("Normal year");
        }
    }

    public static boolean isLeapYear(int year){

        if((year % 4 ==0 && year % 100 != 0) || year % 400 ==0){
            return true;
        }else{
            return false;
        }
    }
}


