// Assignment 1: Vehicle parent class banao
//  (brand, speed) aur Car, Bike child classes 
// banao jo apna ek extra feature add kare. super()
//  use karo constructor mein.



 class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }
 }

    class Car extends Vehicle{

    int airbags;

    Car(String brand, int speed,int airbags){
        super(brand, speed);  //Parents constructor call
        this.airbags=airbags;
    }
     void carshow(){
        display();
        System.out.println("Airbags: "+airbags);
     }

    }  
    
    class Bike extends Vehicle{
        Boolean sportsbike;

        Bike(String Brand,int speed,Boolean sportsbike){
            super(Brand, speed);
            this.sportsbike=sportsbike;
        }
        void Bikeshow(){
            display();
            System.out.println("SportsBike: "+sportsbike);

        }
    }
 
   
 public class Main{
  
 
    public static void main(String[] args) {

        Car C= new Car("Toyota", 560, 6);
        Bike B=new Bike("Hf Deluxe", 100, false);
        System.out.println("Car details: ");
        C.carshow();

        System.out.println();

        System.out.println("Bike details: ");
        B.Bikeshow();

        
    }
}

 
