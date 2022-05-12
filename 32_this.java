package tutorial2;
import java.util.Scanner;
/*
The this keyword refers to the current object in a method or constructor.
The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter). If you omit the keyword in the example above, the output would be "0" instead of "5".

Invoke current class constructor
Invoke current class method
Return the current class object
Pass an argument in the method call
Pass an argument in the constructor call
 */

public class Main{
    public static void main (String[] args){
    	
    	Cat cat = new Cat();
    	cat.setName("Mimi");
    	cat.setAge(3);
    	cat.eat();
    }
}

class Cat{
    
    private String name;
    private int age;
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
    public void eat() {
    	//2 ways to call the method class
    	System.out.println("I am "+ Cat.this.getName()+"love fish");
    	System.out.println("I am "+ getName()+"love fish");

    }
 
}
