// Assignment 2: Shape parent class
//  banao with area() method. Circle, 
// Rectangle, Triangle child classes 
// banao jo area() override karein apne 
// formula ke saath. Main method mein
//  array of Shape banao aur loop chala
//  ke sabka area print karo (polymorphism dikhao).

class Shape{
        void area(){
            System.out.println("Area of Shape....");
        }
}

class Circle extends Shape{
    double redius;

    Circle(double redius){
        this.redius=redius;
    }

   @Override

   public void area(){
     double area=Math.PI*redius*redius;
     System.out.println("Area of Circle: "+area);
   }
}


class Rectangle extends Shape{
    double length, width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override

    public void area(){
        double area=length*width;
        
        System.out.println("Rectangle of area: "+area);
    }
}

class Triangle extends Shape{
    double base, height;

    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    @Override

    public void area(){
       double area=0.5*base*height;
       System.out.println("Area of Triangle: "+area);
    }
}

public class Assignmnet2 {
    public static void main(String[] args) {

        Shape[] shapes={
               new Circle(5),
                new Rectangle(5, 6),
                new Triangle(5, 6)
        };

        for(Shape s: shapes){
            s.area(); //Runtime Polymorphism
        }
        
    }
}
