// ek class banao jisme se employee id , name , priority(disgination -> 1,2,3,4,5)
// ab ek class banao ki jaise ki jisme pure employee store karna hai 
// aur aur jaise he pure employee aa jate hai tho unko saare employee
// print karna hai uske baad unki jo priority hai uske based 
// unko arrange karna hai as a example 1 2 3 4 5 6 this type sabki class alag alg aur jaise he 
// pahle pura print karna hai uske baad usme se ek hum nikal lenge tho o 
// automatic rearrange ho jayega  write a code in java

// Using a Queue



public class Main {

    static class Employee{
        int employeeid;
        int priority;
        String name;

        Employee(int employeeid, int priority,String name){
            this.employeeid=employeeid;
            this.priority=priority;
            this.name=name;
        }

         void display() {
            System.out.println(
                employeeid + " " + name + " Priority: " + priority
            );
        }
    }



    static class EmployeesQueue{
        Employee[]queue=new Employee[10];
        int front=0;
        int rear=-1;

        void enqueue(Employee employee){
            if(rear==queue.length-1){
                System.out.println("queue is full");
                return;
            }

            rear++;
            queue[rear]=employee;

        }

        Employee dequeue(){

            if(front>rear){
                System.out.println("Queue is empty");
                return null;
            }

            Employee temp=queue[front];
            front++;
            return temp;

        }

        void display(){
            if(front>rear){
                System.out.println("Queue is empty");
                return;
            }

            for(int i=front;i<=rear;i++){
               queue[i].display();
            }

        }
    }

    

  public static void main(String[] args) {
    
  }    
}
