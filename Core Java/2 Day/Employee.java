
class Employee {
    String name;
    int id;
    double salary;

    // constructor chaining

    Employee(){
        this("Pravesh",45,50000);
    }
    
    Employee(String name, int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public static void main(String[] args) {

        Employee E1=new Employee();
        System.out.println("Employee Name: "+E1.name);
        System.out.println("Employee id: "+E1.id);
        System.out.println("Employee Salary: "+E1.salary);
        
    }
}
