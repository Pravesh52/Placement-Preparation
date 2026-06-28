// package Core Java.3 Day.Multilevel Inheritance;

// Assignment 2: Multilevel inheritance example banao:
//  Person → Employee → Manager, har level pe naya
//  field/method add karo.

class Person{
     String name;
     int age;

     Person(String name,int age){
        this.name=name;
        this.age=age;
     }
     void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
     }
}

class Employee extends Person{
    int Employeeid;

    Employee(String name,int age,int Employeeid){
        super(name, age);
        this.Employeeid=Employeeid;
    }

    void Employeeshow(){
        System.out.println("Employeeid: "+Employeeid);
    }
}

class Manager extends Employee{
    String department;
     
    Manager(String name,int age,int Employeeid,String department){
        super(name, age, Employeeid);
        this.department=department;
    }
    void Managershow(){
         System.out.println("department: "+department);
    }
}

public class Main {
    public static void main(String[] args) {
         Manager M= new Manager("Ankit", 22, 0001, "CSE");
         M.Display();
        //  System.out.println();
         M.Employeeshow();
        //  System.out.println();
         M.Managershow();
    }
}
