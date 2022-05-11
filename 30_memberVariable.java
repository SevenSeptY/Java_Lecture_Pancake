package tutorial2;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){


        Person p1 = new Person();
        //p1.name = "Feifei"; //using Attribute directly
        //p1.age = 18;
        p1.setName("Feifei");
        p1.setAge(18);
        System.out.println("h");
        
        p1.run(1);
        p1= null;
    }
}

class Person{
    //Attribute
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
