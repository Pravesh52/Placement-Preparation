// package Core Java.4 Day.PolyMorphism;

// Run time polymorphism

// Parent class ka method, child class mein 
// same signature ke saath redefine karna.

class Animal{
    void sound(){
        System.out.println("Animal make a sound..");
    }
}

class dog extends Animal{

    @Override

    void sound(){
        System.out.println("Dogs Barks...");
    }
    
}
public class Methodoverriding {
    public static void main(String[] args) {

        Animal A=new dog();
        A.sound();
        
    }
}
