// Assignment 3: Ek example banao jaha prove karo ki overriding 
// mein runtime pe decide hota hai
//  — Parent reference, Child object, aur dikhao output
//  kya aata hai.

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        // Parent Reference, Child Object
        Animal a = new Dog();

        // Runtime Method Call
        a.sound();
    }
}
