

// ek class bnao aur check karo ki runtime polymorphism
// jisme parent class ka reference aur child class ka object 

class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
}

class dog extends Animal{
    public void sound(){
        System.out.println("Barking....");
    }
}

public class Assignment3 {

    public static void main(String[] args) {
        Animal a=new dog();

        a.sound(); //run time check
    }
    
}
