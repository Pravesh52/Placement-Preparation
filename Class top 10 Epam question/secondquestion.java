// package Class top 10 Epam question;

import java.util.Scanner;

class secondquestion {
    class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    
    // insert at string
    Node head;

    void insert(String name){
        Node newnode=new Node(name);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    void findpreviousnext(String input){

    Node temp = head;
    Node prev = null;

    while(temp != null){

        if(temp.name.equalsIgnoreCase(input)){

            if(prev != null){
                System.out.println("Previous name: " + prev.name);
            }else{
                System.out.println("Previous not found");
            }

            if(temp.next != null){
                System.out.println("Next name: " + temp.next.name);
            }else{
                System.out.println("Next is not found");
            }

            return;
        }

        prev = temp;
        temp = temp.next;
    }

    System.out.println("Name not found");
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        secondquestion list=new secondquestion();
        
        list.insert("Pravesh");
        list.insert("jain");
        list.insert("Ankit");
        list.insert("Anand");

        list.findpreviousnext("ankit");
    }
}
