// package Core Java.5 Day.Abstraction & Interface;

interface Flyable{
  int Max_Height=1000;
  void fly();
  void land();
}

interface swimmable{
    void swim();
}

// multiple interface implementation in 
// interface through that the consept of
//  multiple inteheritance 

class duck implements Flyable, swimmable{
    @Override
    public void fly(){
        System.out.println("Duck flying...");
    }
    @Override
    public void land(){
        System.out.println("Duck landing...");
    }
    @Override
    public void swim(){
        System.out.println("Duck Swimming...");
    }
}

public class Interface {
     public static void main(String[] args) {
        duck d=new duck();

        d.fly();
        d.land();
        d.swim();


        System.out.println("Flying height: "+Flyable.Max_Height);
     }

    
}
