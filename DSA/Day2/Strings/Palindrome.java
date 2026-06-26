// package DSA.Day2.Strings;

// Assignment 4 (DSA): Check if a given string
//  is a Palindrome (e.g., "madam") without 
// using built-in reverse function.

public class Palindrome {
    public static void main(String[] args) {
        String str="MADAM";

        boolean isPalindrom=true;

       

        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPalindrom=false;
                break;
            }

            
        }

        if(isPalindrom){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("Not a Palindrome...");
        }




    }
    
}
