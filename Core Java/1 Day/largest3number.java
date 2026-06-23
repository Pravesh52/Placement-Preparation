// package Core Java.1 Day;

// Assignment 3: Write a program to find the largest
//  of 3 numbers using ternary operator only (no if-else).

public class largest3number {
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30;

        int max;

        // using ternary operator

        max=(n1>=n2 && n1>=n3)? n1 : ((n2>=n3)?n2:n3);

        System.out.println(max);
    }
}
