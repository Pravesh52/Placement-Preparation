
// ek character array me name store hai usme find
// karna hai ki ek string ka name lenge aur find ka
// renge ki o string name usme hai ki nahi agar 
// hai tho usk previous aur next name ko print karo
// agar nahi hai tho bata do ki not found


public class Studentsearch {

    class students {
        String name;
        students next;

        students(String name) {
            this.name = name;
            this.next = null;
        }
    }

    void searchstudents(students head, String name) {

        students previous = null;
        students current = head;

        while (current != null) {

            if (current.name.equals(name)) {

                // Previous student
                
                if (previous != null) {
                    System.out.println("Previous: " + previous.name);
                } else {
                    System.out.println("Previous: No student");
                }

                // Next student
                if (current.next != null) {
                    System.out.println("Next: " + current.next.name);
                } else {
                    System.out.println("Next: No student");
                }

                return;
            }

            previous = current;
            current = current.next;
        }

        System.out.println("student not Found");
    }

    public static void main(String[] args) {

        Studentsearch obj = new Studentsearch();

        students s1 = obj.new students("Rahul");
        students s2 = obj.new students("Aman");
        students s3 = obj.new students("Pravesh");
        students s4 = obj.new students("Rohit");
        students s5 = obj.new students("Vikas");

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

        obj.searchstudents(s1, "Pravesh");
    }
}