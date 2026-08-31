// package Core Java.6 Day.Recursion;

public class sumofdigit {

    public static int sumdigit(int n){
        if(n==0) return 0;

        return (n%10)+sumdigit(n/10);
    }
    public static void main(String[] args) {
        int print=sumdigit(12345);
        System.out.println(print);

    }
}
