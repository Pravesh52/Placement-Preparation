// package Core Java.5 Day.Abstraction & Interface;


// Default & static

interface vehicle{
    void start();

    // Default method - subclass override kar
    //  sakta hai ya nahi bhi

    default void fueltype(){
        System.out.println("Petrol..");
    }

    // static method interface ke name se call hota hai 

    static int maxspeed(){
       return 200;
    }

}

class car implements vehicle{

    @Override

    public void start(){
        System.out.println("Car starting...");
    }
}


public class defaultstatic {
    public static void main(String[] args) {

        car c=new car();

        // Abstract method
        c.start();

        // default method
        c.fueltype();

        // static method

    System.out.println("Max speed: "+vehicle.maxspeed());

                
    }
}
