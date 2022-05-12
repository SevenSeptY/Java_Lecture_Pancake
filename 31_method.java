package tutorial2;
import java.util.Scanner;
/*
 creatMothod: 
 Dog dog= new dog();
 */

public class Main{
    public static void main (String[] args){
    	Dog dog = new Dog();//Execute method
    	Dog dog1 = new Dog("PIPI",5);
    }
}

class Dog{
    //creating method w/o reference
	public Dog() {
		System.out.println("creat Method Ran");
	}
	public Dog(String name) {
		this.name = name;
		System.out.println(" 1 refrece method raan");
	}
    //creating method with reference
	public Dog(String name,int age) {
		//this.name = name;
		this(name);//When using another method, this must be first call
		this.age = age;
		System.out.println("2 methos");
	}
	
    private String name;
    private int age;

    //getter and setter

    //offer a setting name attribute method
    public void setName(String name){
        this.name=name;
    }
    //get name attribute
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void run(int len) {
    	int i = 0 ;//local variable must be initialized 
    	int m = len;///
    	System.out.println("Ran"+m);
    	System.out.println(age);
    }
}
