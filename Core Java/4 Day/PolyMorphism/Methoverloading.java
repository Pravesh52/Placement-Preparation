// package Core Java.4 Day.PolyMorphism;

// Compile time polymorphism
// Method overloading
// Method name same and different parameters

class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    float add(float a ,float b,float c){
        return a+b+c;
    }
}
public class Methoverloading {
    public static void main(String[] args) {
        calculator c=new calculator();

        System.out.println("first function: "+c.add(10, 20));
        System.out.println(c.add(8, 65));
        System.out.println(c.add(4.5f, 8.5f, 5.6f));
    }
    
}
