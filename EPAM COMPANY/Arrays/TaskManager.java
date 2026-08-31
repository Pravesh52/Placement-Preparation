// 31-08-2026

// Task: 

// 1. TaskId,Assigner,Reportto,tentive time,actual time, Priority


// ek Task hai jisme se Tumhe taskid assigner reporter tentive time 
// acutal time  and tentive time and actual time difference 
// in save time and 
// input give dene wala input priority dega 0 and 1 me 0
//  means low 1 means high priority. 

// tumhe task ye karna hai ki jaise he input me task id dale tho 
// tho pura uska print hona chahiye but jo uski id dale 
// direct print kare loop use nahi karna hai
// print karne ke complexity 0(1) honi chahiye

// ab isme ek Manager rakhna hai jo according to priority 1 wala task hai usko 
// upar rakho aur jo 0 hai usko automatic neeche kar do

public class TaskManager {

    static class Task {
        int taskId;
        String assigner;
        String reporter;
        int tentativeTime;
        int actualTime;
        int priority;

        Task next;

        Task(int taskId, String assigner, String reporter,
             int tentativeTime, int actualTime, int priority) {

            this.taskId = taskId;
            this.assigner = assigner;
            this.reporter = reporter;
            this.tentativeTime = tentativeTime;
            this.actualTime = actualTime;
            this.priority = priority;
        }

        void printTask() {

            int difference = actualTime - tentativeTime;

            System.out.println("task id: "+taskId);
            System.out.println("assigner: "+assigner);
            System.out.println("reporter: " +reporter);
            System.out.println("tentative Time : "+tentativeTime);
            System.out.println("actual Time  : " +actualTime);
            System.out.println("time Difference: " +difference);

            if (priority == 0) {
                System.out.println("priority: low");
            } else {
                System.out.println("priority: high");
            }
        }
    }

    static class Manager {

        Task head;

        void addTask(Task newTask) {

            if (head == null) {
                head = newTask;
                return;
            }
            if (newTask.priority == 1) {

                newTask.next = head;
                head = newTask;
                return;
            }

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

       
        void printTasks() {

            Task temp = head;

            while (temp != null) {
                temp.printTask();
                System.out.println();
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addTask(
                new Task(101, "Pravesh", "Ankit",
                        5, 7, 0)
        );

        manager.addTask(
                new Task(102, "Rahul", "Amit",
                        10, 8, 1)
        );

        manager.addTask(
                new Task(103, "Raj", "Mohit",
                        6, 9, 0)
        );

        manager.addTask(
                new Task(104, "Ravi", "Aman",
                        4, 3, 1)
        );


        manager.printTasks();
    }
}