// package Class top 10 Epam question;

// import java.util.Scanner;
// Question 4

import java.util.Scanner;

class Employee{
        int id;
        String name;
        String work;
        int priority;

        Employee(int id,String name,String work,int priority){
            this.id=id;
            this.name=name;
            this.work=work;
            this.priority=priority;
        }
}

class office {
    Employee employee[]=new Employee[5];
    int count=0;

    // add a employee
    void addemployee(int id,String name,String work,int priority){
        if(count==employee.length){
            System.out.println("employee array is full");
            return;
        }
        employee[count]=new Employee(id, name, work, priority);
        count++;
    }

    // priority based sort

    void prioritybasedsort(){
        for(int i=0;i<count-1;i++){
            for(int j=i+1;j<count;j++){
                if(employee[i].priority<employee[j].priority){
                    Employee temp=employee[i];
                    employee[i]=employee[j];
                    employee[j]=temp;
                }
            }
        }
    }

    // display

    void display(){
        for(int i=0;i<count;i++){
            System.out.println("id: "+employee[i].id);
            System.out.println("name: "+employee[i].name);
            System.out.println("work: "+employee[i].work);
            System.out.println("priority: "+employee[i].priority);
        }
    }

    // search

    void search(int id){
        for(int i=0;i<count;i++){
            if(employee[i].id==id){
                System.out.println("id: "+employee[i].id);
                System.out.println("name: "+employee[i].name);
                System.out.println("work: "+employee[i].work);
                System.out.println("Priority: "+employee[i].priority);
            }
        }
    }

    public static void main(String[] args) {
       office office=new office();
       office.addemployee(101, "Pravesh", "webside", 0);
       office.addemployee(102, "ankit", "webside", 1);
       office.addemployee(103, "anand", "webside", 1);
       office.addemployee(104, "Astha", "webside", 1);
       office.addemployee(105, "uday", "webside", 0);
       System.out.println("\nAll employee: ");
       office.display();

       office.prioritybasedsort();
       System.out.println("\nPriority based sort: ");
       office.display();

       System.out.println("\n search id: ");
       Scanner sc=new Scanner(System.in);
       int search=sc.nextInt();
       office.search(search);
       

    }
}
