
// input : abcbaab
// output: 3

import java.util.HashSet;

public class checkstring {

    public static int check(String s){
     HashSet<Character>set=new HashSet<>();
     int left=0;
     int max=0;

     for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
            
        }
     }

        
    }
    public static void main(String[] args) {
        String s="abcbaab";
        System.out.println(check(s));
        
    }
    
}
