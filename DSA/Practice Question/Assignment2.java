
class shape{
     void area(){
        System.out.println("Area of Shape");
    }
}

class circle extends shape{
   double radius;

   circle(double radius){
    this.radius=radius;
   }

    @Override

    public void area(){
        double area=3.14*radius*radius;
        System.out.println("Area of Circle..."+area);
    }
    
}

class Rectangle extends shape{
    int length,width;

    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    @Override

    public void area(){
        int area=length*width;
        System.out.println("Area of Rectangle: "+area);
    }
}

class triangle extends shape{
    int base,height;

    triangle(int base, int height){
        this.base=base;
        this.height=height;
    }

    @Override

    public void area(){
        double area=0.5*base*height;
        System.out.println("Area of triangle.."+area);
    }
}

public class Assignment2 {
    public static void main(String[] args) {
    shape[] shapes={
             new circle(5),
             new Rectangle(2, 3),
            new triangle(2, 3)
        } ;
        
        for(shape s:shapes){
            s.area(); //run time polymorphism
        }
    }
}
