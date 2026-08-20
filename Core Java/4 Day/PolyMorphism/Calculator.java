
// function overloading

public class Calculator {
    int  multiply(int a, int b){
        return a*b;
    }

    double multiply(double a,double b){
        return a*b;
    }

    int multiply(int a, int b, int c){
        return a*b*c;
    }



    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.multiply(5, 6)); 
        System.out.println(c.multiply(6, 7));
        System.out.println(c.multiply(10, 11, 12));
        
    }
}
