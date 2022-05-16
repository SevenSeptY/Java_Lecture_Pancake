package tutorial2;
import java.util.Scanner;


public class Main{
    public static void main (String[] args){
    	Student s = new Student();
    	Student s1= new Student();
    	//Student s = null; 
    }
}

class Student{
	static{
		System.out.println(" I am static block");
	}
	{
		System.out.println(" I am a Block ");
	}
	public Student() {
		System.out.println(" Create method");
	}
	public void study () {
		//Limit the life cycle
		{
			int i = 10;
			System.out.println(i);
		}
	}
}
