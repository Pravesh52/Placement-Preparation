// package Core Java.1 Day;

// Assignment 1: Swap two numbers without using a third variable.


public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);

        System.out.println(b);
    }
}
