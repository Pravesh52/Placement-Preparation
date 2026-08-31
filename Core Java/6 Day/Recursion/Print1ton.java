// package Core Java.6 Day.Recursion;

public class Print1ton {
    static void print1ton(int n){
        if(n==0){  //Base class
            return; 
        } 
            

        print1ton(n-1); //recursively call

        System.out.println(n);  //print number
    }
    public static void main(String[] args) {
       print1ton(10);
        
    }
}
