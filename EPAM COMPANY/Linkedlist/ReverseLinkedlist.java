// package EPAM COMPANY.Linkedlist;



public class ReverseLinkedlist {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    Node head;
    
    public void insert(int data){
        Node newnode=new Node(data);

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

    // insert at beginning

    void insertatbeginning(int data){
        // Node head;
        

        Node newnode=new Node(data);

        newnode.next=head;
        head=newnode;
            
            
    }
    

    // insert a node in end

    void insertatend(int data){
        Node newnNode=new Node(data);

        if(head==null){
            head=newnNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnNode;
    }

    void reverse(){
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){

            // save next node 
            Node next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;
        }
        head=prev;

    }

    // delete a linked list
    public void deletefirst(){
        
        if(head==null){
            return;
        }
        head=head.next;
    }

    // delete at end

    public void enddelete(){

        if(head==null){
            return;
        }

        if(head.next==null){
            head=null;
            return ;
        }

        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }



    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ReverseLinkedlist list=new ReverseLinkedlist();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original Linkedlist: ");
        list.display();

        // System.out.println("Reverse LinkedList: ");
        // list.reverse();
        // list.display();

        System.out.println("insert at beginning 50: ");
        list.insertatbeginning(50);
        list.display();


        
        
    }
    
}
