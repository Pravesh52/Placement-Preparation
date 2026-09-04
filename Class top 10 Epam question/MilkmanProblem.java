// package Class top 10 Epam question;

import java.util.Scanner;

class MilkmanProblem {
    String record;
    int limit;

    MilkmanProblem(String record,int limit){
        this.record=record;
        this.limit=limit;
    }

    void calculate(){
        int start=0;
        int zero=0;

        for(int i=0;i<record.length();i++){
            if(record.charAt(i)=='0'){
                zero++;
            }else{
                zero=0;
            }
            if(zero==limit){
                start=i+1;
            }

        }
        // directly print valid days
        System.out.println("Output: ");
        for(int i=start;i<record.length();i++){
            System.out.println(record.charAt(i));
        }
        System.out.println();
        System.out.println("Total days: "+(record.length()-start));
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the record: ");
        String record=sc.nextLine();
        System.out.println("enter the limit: ");
        int limit=sc.nextInt();

        MilkmanProblem m=new MilkmanProblem(record, limit);
       m.calculate();
    }
}
