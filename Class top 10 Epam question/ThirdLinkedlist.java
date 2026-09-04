// package Class top 10 Epam question;

class ThirdLinkedlist {
    class Node{
        String name;
        Node next;

        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    // compare first and last
     Node head;
    void comparefirstandlast(){
        if(head==null){
            System.out.println("Not found");
            return;
        }

        Node first=head;
        Node last=head;

        while(last.next!=null){
            last=last.next;
        }
        if(first.name.compareToIgnoreCase(last.name)>0){
            String temp=first.name;
            first.name=last.name;
            last.name=temp;
        }
    }

    void insert(String name){
        Node newnode= new Node(name);
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

    void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.name+" -> ");
            temp=temp.next;
        }
        System.out.println(" NUll");
    }
    public static void main(String[] args) {
        ThirdLinkedlist list=new ThirdLinkedlist();
        list.insert("Pravesh");
        list.insert("Ankit");
        list.insert("joshi");
        list.insert("Anand");

        list.comparefirstandlast();

        list.display();

    }
}
