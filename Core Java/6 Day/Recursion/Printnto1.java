// package Core Java.6 Day.Recursion;

public class Printnto1 {

    static void printnto1(int data){
        if(data==0){
            return;
        }
        System.out.println(data);

        printnto1(data-1);
    }
    public static void main(String[] args) {

        printnto1(10);
        
    }
}
