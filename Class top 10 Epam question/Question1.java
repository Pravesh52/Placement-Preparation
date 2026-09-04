// package Class top 10 Epam question;

// Linked list all operation insert and delete


class Linkedlist {
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // insert at linkedlist

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

    // Insert at Beginning
    public void insertatbeginning(int data) {
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    // Insert at End
    public void insertatend(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    // Insert at Position
    public void insertatpos(int data, int pos) {
        Node newnode = new Node(data);

        if (pos == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    // Delete at Beginning
    public void deleteatbeginning() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    // Delete at End
    public void deleteatend() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at Position
    public void deleteatpos(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    // Display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();

        // list.insertatend(10);
        // list.insertatend(20);
        // list.insertatend(30);
        // list.insertatend(40);
        // list.insertatend(50);

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
        
}