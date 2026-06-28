// package Core Java.3 Day;
// Assignment 3: Ek example banao jaha field
//  hiding dikhao — parent aur child mein same 
// naam ka variable, dono ko print karo using 
// super.variable.

class Parent{
    String name="Parent class..";
}
class child extends Parent{
    String name="Child class...";

    void show(){
        System.out.println("Child Name: "+name);
        System.out.println("Parent Name: "+super.name);
    }

}

public class Assignment3 {
    public static void main(String[] args) {

        child c=new child();

        c.show();

        
    }
}
