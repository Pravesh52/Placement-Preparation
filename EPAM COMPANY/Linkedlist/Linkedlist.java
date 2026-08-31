

public class Linkedlist {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    // create a linkedlist
    void create(int data){
        Node newnode=new Node(data);
        Node head=newnode;
    }

    // insert a linkedlist

    Node head;
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    // insert at first

    // add a node before a first node

    void insertatbeginning(int data){

        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

    }

    // insert at end

    void insertatend(int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;

    }

// Delete the last node

 void deletelast(){
    if(head==null){
        return;
    }

    if(head.next==null){
        return;
    }

    Node temp=head;
    while(temp.next.next!=null){
       temp=temp.next;
    }
    temp.next=null;

 }


// add a node at a after giving data
 

   void aftergivingdata(int node,int data){
     
    Node newnNode=new Node(data);

    Node temp=head;

    while(temp.next!=node && ){

    }

    

   }

   


    void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Linkedlist list=new Linkedlist();
        list.create(10);
        list.create(20);
        list.create(0);
        
    }
}
