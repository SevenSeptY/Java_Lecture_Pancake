package Java_Felix;
import java.util.Scanner;
import java.util.Random;//Generate a fake random number
/*
 object name = new class name();
 object.method();
 object.property();
*/

public class Main{
    public static void main (String[] args){
        Horse h = null;//Claim variable
        h = new Horse(); //Create an object
        h.name =  "911 Targar ";//Modify attribute values
        h.age = 350; 

        h.run();//call method
        h.eat();
        //unknown type - can only used once. 
        new Horse().eat();
        h = null;// after object release ,can not be used
        //h.eat()// 
    }
}

class Horse{ //Creating an object main
    //Define properties in class
    String name;
    int age; 
    public void run(){
        System.out.println("I am "+name + age+"Porsche, I am still fast.");
    }
    public void eat(){
        System.out.println("I eat primer gas");
    }
}
