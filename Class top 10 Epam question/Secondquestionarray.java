// package Class top 10 Epam question;

import java.util.Scanner;

public class Secondquestionarray {
    public static void main(String[] args) {
        String name[]={"Pravesh","Ramesh","ankit","Anand"};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string: ");
        String input=sc.nextLine();

        for(int i=0;i<name.length;i++){
            if(name[i].equals(input)){
                if(i>0){
                    System.out.println("Previous: "+name[i-1]);

                }else{
                    System.out.println("previous are not available");
                }

                if(i<name.length-1){
                    System.out.println("next: "+name[i+1]);
                }else{
                    System.out.println("next is not found");
                }
                break;
            }
        }


    }
}
