package Java_Felix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        getMenu();//call function
        getMenu();
    }
    /*
    Public - access specifier, which allows the programmer to control
             the visibility of class members. When a member is preceded by public,
             then that member may be accessed by code outside the class in which it is
             declared (The opposite of public is private, which prevent a member
             from being used by code defined outside otf its class)
    Static - allows main() to be called w/o having to instantiate a particular
            instance of the class. this is necessary since main() is called by
            the java interpreter before any objects are made.
    Void - tells the compiler that main() does not return a value.
    */
        public static void getMenu(){
            //creating function for reuse
            System.out.println("Menu:");
            System.out.println("1.Frits:");
            System.out.println("2.Ham  :");
            System.out.println("3.Poutine:");
            System.out.println("4.Wowo Tou:");
        }

}


