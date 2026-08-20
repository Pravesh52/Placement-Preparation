import java.util.Scanner;

public class Epam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        boolean strong=true;

        // condition 1 alphabatic character

        for(char ch:s.toCharArray()){
            if(!((ch>='a'&& ch<='z')|| (ch>='A'&& ch<='Z'))){
                strong=false;
                break;
            }
        }
        

        // condition check palindrome

        if(strong){
           int  left=0;
            int right=s.length()-1;

            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    strong=false;
                    break;
                }
                left++;
                right--;
            }
        }

        if(strong){
            System.out.println("strong and palindrome");
        }else{
            System.out.println("not a storng and not a palindrome..");
        }

    }
    
}
