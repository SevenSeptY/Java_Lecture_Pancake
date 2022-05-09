package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
 using private for access permission
*/

public class Main{
    public static void main (String[] args){


        Person p1 = new Person();
        //p1.name = "Feifei"; //using Attribute directly
        //p1.age = 18;
        p1.setName("Feifei");
        p1.setAge(18);
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

}
