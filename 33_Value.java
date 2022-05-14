package Java_Felix;

public class Value {
    public static void main(String[] args){
        int x = 10;
        method (x);
        System.out.println("x="+ x);
    }

    public static void method(int mx){
        mx = 20;
    }
}
/*
output x=10;
 */

//Ref Vlue
package Java_Felix;

public class Ref {;
    public static void main(String[] args){
        Duck d = new Duck();
        method(d);
        System.out.println("Duck age "+ d.age);
    }

    public static void method (Duck duck){
        duck.age = 5;
    }
}

class Duck{
    int age = 2;
}


//String
