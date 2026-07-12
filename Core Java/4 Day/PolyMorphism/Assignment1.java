// Assignment 1: MathOperations class banao with 
// overloaded 
// multiply() method — 2 ints, 2 doubles, 3 ints 
// ke liye.

class MathOperations{
    int multiply(int a, int b){
        return a*b;
    }
    double multiply(double a, double b){
        return a*b;
    }
    int multiply(int a , int b, int c){
        return a*b*c;
    }
    
}

public class Assignment1 {
    public static void main(String[] args) {

        MathOperations M=new MathOperations();

        System.out.println("First function: "+M.multiply(10, 20));
        System.out.println("Second Function: "+M.multiply(5, 10));
        System.out.println("Third Function: "+M.multiply(10, 20, 30));
        
        
    }
}
