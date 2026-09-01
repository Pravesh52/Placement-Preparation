// ek class banao jisme se employee id , name , priority(disgination -> 1,2,3,4,5)
// ab ek class banao ki jaise ki jisme pure employee store karna hai 
// aur aur jaise he pure employee aa jate hai tho unko saare employee
// print karna hai uske baad unki jo priority hai uske based 
// unko arrange karna hai as a example 1 2 3 4 5 6 this type sabki class alag alg aur jaise he 
// pahle pura print karna hai uske baad usme se ek hum nikal lenge tho o 
// automatic rearrange ho jayega  write a code in java



public class College {

    // Employee class
    static class Employee {

        int employeeId;
        String name;
        int priority;

        Employee(int employeeId, String name, int priority) {
            this.employeeId = employeeId;
            this.name = name;
            this.priority = priority;
        }

        void display() {
            System.out.println(
                employeeId + " " + name + " Priority: " + priority
            );
        }
    }


    // Queue class
    static class EmployeeQueue {

        Employee[] queue = new Employee[10];

        int front = 0;
        int rear = -1;


        // Employee add
        void enqueue(Employee employee) {

            if (rear == queue.length - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            queue[rear] = employee;
        }


        // Employee remove
        Employee dequeue() {

            if (front > rear) {
                System.out.println("Queue is empty");
                return null;
            }

            Employee temp = queue[front];

            front++;

            return temp;
        }


        // Saare employees print
        void display() {

            if (front > rear) {
                System.out.println("Queue is empty");
                return;
            }

            for (int i = front; i <= rear; i++) {
                queue[i].display();
            }
        }


        // Priority ke according arrange
        void sortByPriority() {

            for (int i = front; i <= rear; i++) {

                for (int j = front; j < rear - (i - front); j++) {

                    if (queue[j].priority > queue[j + 1].priority) {

                        Employee temp = queue[j];

                        queue[j] = queue[j + 1];

                        queue[j + 1] = temp;
                    }
                }
            }
        }


        // Employee ID ke according remove
        void removeEmployee(int id) {

            int index = -1;

            // Employee find karo
            for (int i = front; i <= rear; i++) {

                if (queue[i].employeeId == id) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Employee not found");
                return;
            }


            // Left shift
            for (int i = index; i < rear; i++) {
                queue[i] = queue[i + 1];
            }

            queue[rear] = null;
            rear--;


            // Remove ke baad priority wise arrange
            sortByPriority();
        }
    }


    public static void main(String[] args) {

        EmployeeQueue employees = new EmployeeQueue();


        // Employees add
        employees.enqueue(new Employee(101, "Rahul", 3));
        employees.enqueue(new Employee(102, "Amit", 1));
        employees.enqueue(new Employee(103, "Rohit", 5));
        employees.enqueue(new Employee(104, "Vikas", 2));
        employees.enqueue(new Employee(105, "Sumit", 4));


        // 1. Pehle normal queue print
        System.out.println("----- ORIGINAL QUEUE -----");

        employees.display();


        // 2. Priority ke according arrange
        employees.sortByPriority();

        System.out.println("\n----- PRIORITY QUEUE -----");

        employees.display();


        // 3. Employee remove
        System.out.println("\n----- REMOVE EMPLOYEE 102 -----");

        employees.removeEmployee(102);


        // 4. Remove ke baad dobara print
        System.out.println("\n----- AFTER REMOVE -----");

        employees.display();
    }
}