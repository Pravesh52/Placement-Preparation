// ek linked list hai string jo 1 node name hai 
// aur aakhri node ka name hai usko pehle wale 
// node ko comapare karo agar equal hai tho eqal bata do 
// aur agar equal nahi hai tho ye batana ki discouvery me ye 
// find karna hai ki kon sa pahle aayega kon sa baad me

// As a example "Pravesh", "Ankit" tho first "Ankit", Baad me "Pravesh"

public class Linkedlist2 {

    class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    Node head;

    void add(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    
    void compareFirstLast() {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node first = head;
        Node last = head;

        
        while (last.next != null) {
            last = last.next;
        }

       
        int result = first.name.compareTo(last.name);

        if (result == 0) {
            System.out.println("Equal string");
        } 
        else if (result < 0) {
            System.out.println(first.name + " pehle aayega");
            System.out.println(last.name + " baad me aayega");
        } 
        else {
            System.out.println(last.name + " pehle aayega");
            System.out.println(first.name + " baad me aayega");
        }
    }

    public static void main(String[] args) {

        Linkedlist2 list = new Linkedlist2();

        list.add("Pravesh");
        list.add("AAkash");
        list.add("mohit");
        list.add("Ankit");

        list.compareFirstLast();
    }
}
