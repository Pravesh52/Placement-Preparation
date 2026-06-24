// package Core Java.2 Day;

/* Assignment 1: Ek Rectangle class banao jisme length aur width ho. 3 constructors banao:

            No-arg (default values 0)
            Single param (square — length=width)
            Two params (rectangle)

            Aur ek method area() jo area return kare.*/

   class Rectangle {

    int length;
    int width;

    public Rectangle(){
        this.length=0;
        this.width=0;
    }

    public Rectangle(int side){
        this.length=side;
        this.width=side;
    }
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int area(){
        return this.length*this.width;
    }

    public static void main(String[] args) {
        Rectangle R1=new Rectangle();
        System.out.println("Default area: "+R1.area());

        Rectangle R2=new Rectangle(5);
        System.out.println("square Area: "+R2.area());

        Rectangle R3=new Rectangle(5, 6);
        System.out.println("Rectangle area: "+R3.area());

        
    }
}
