//package Core Java.1 Day;

// Assignment 2: Check if a number is Armstrong number (e.g., 153 = 1³+5³+3³).

public class Armstrong {
    public static void main(String[] args) {
        // armstrong check

        int n=153;

        int sum=0;
        
        int count =0;
      // count the digit 
       while(n!=0){
        n=n/10;
        count++;
       }
        System.out.println(count);

        // now all number digit count are power put

        while(n!=0){
            n=n%10;
            sum+=Math.pow(n,count);
            n=n/10;
        }

        if(n==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a armstrong");
        }


    }
}
