// package Core Java.2 Day;

import java.util.Scanner;

class BankAccount {
    int balance;

    public BankAccount(){
        balance=0;
    }

    public BankAccount(int balance){
        this.balance=balance;
    }

    public void deposit(int amount){
        balance=balance+amount;
    }

    public void withdraw(int amount){
        if(balance>=amount){
            balance=balance-amount;
        }else{
            System.out.println("Insufficent balance....");
        }
    } 

    public void checkbalance(){
        System.out.println("Total Balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        Scanner sc=new Scanner(System.in);

        
        
        while(true){
            System.out.println("===== BANK MENU =====");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter Your Choice: ");
            int choise=sc.nextInt();
            switch (choise) {
                case 1:
                    // Deposit
                    System.out.println("Enter Amount...");
                    int amount=sc.nextInt();
                    acc1.deposit(amount);
                    break;

                case 2:
                    // withdraw
                    System.out.println("Enter Amount....");
                    int amounts=sc.nextInt();
                    acc1.withdraw(amounts);
                    break;

                case 3:
                    // Balance
                    System.out.println("Balance:..");
                    // int amountes=sc.nextInt();
                    acc1.checkbalance();
                    break;


                case 4:
                   System.exit(0);


            
                default:
                    break;
            }
        }


       
       


    }
}
