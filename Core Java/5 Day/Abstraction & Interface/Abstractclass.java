// package Core Java.5 Day.Abstraction & Interface;

abstract class shape{
    String color;
    
    // Method of abstrat 
    abstract double area();

    void display(){
        System.out.println("Color: "+color);
    }
}

class Circle extends shape{
    double radius;

    Circle(double r,String c){
        radius=r;
        color=c;
    }

    @Override

    double area(){
        return Math.PI*radius*radius;
    }

}

public class Abstractclass {
    public static void main(String[] args) {

        // shape s=new shape(); don't allow 

        shape s=new Circle(5, "Red");// upacasting allowed
        System.out.println(s.area());


        
    }
}
