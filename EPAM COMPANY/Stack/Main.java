// package EPAM COMPANY.Stack;

// Question problem as a example give the problem 
//101 102 103 104 105 106 ab mughe aur mere array ki size 6 he hai ab 
// usme hum agar do value dalte hai 107 108 tho 101 aur 102 pop ho
//  jayenge kyuki stack ki size 6 hai aur do new value uske top me 
// me aa jayga aur output 108 107 106 104 103 using stack simple write a code not
//  using library function agar stack ke size se jyada daal rahe hai tho
// uske jo sabse neeche value hai o pop ho jayegi 



import java.util.Scanner;

public class Main {

    static int[] stack;
    static int top = -1;
    static int size;
    static void push(int value) {
        if (top == size - 1) {
            for (int i = 0; i < top; i++) {
                stack[i] = stack[i + 1];
            }
            top--;
        }
        top++;
        stack[top] = value;
    }

    static void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        size = sc.nextInt();

        stack = new int[size];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            push(value);
        }
        System.out.println();
        display();
    }
}