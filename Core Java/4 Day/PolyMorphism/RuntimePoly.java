// package Core Java.4 Day.PolyMorphism;

// Real life example in Payment method

// Step 1 Interface

interface PaymentGateway{
    // method for all payment methods
    void pay(double amount);
}

// Step 2: Credit Card Payment
class CreditCardPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("================================");
        System.out.println("Payment Method : Credit Card");
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("Status         : Payment Successful");
        System.out.println("================================");
    }
}

class UPIPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("================================");
        System.out.println("Payment Method : UPI");
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("Status         : Payment Successful");
        System.out.println("================================");
    }
}

// Step 4: PayPal Payment
class PaypalPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("================================");
        System.out.println("Payment Method : PayPal");
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("Status         : Payment Successful");
        System.out.println("================================");
    }
}

class PaymentProcessor{
    public void processPayment(PaymentGateway p,double amount){
         System.out.println("\nProcessing Payment...");
        p.pay(amount);   // Runtime decides which pay() method to call

    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        PaymentProcessor processor=new PaymentProcessor();
        // Reference of Interface
        PaymentGateway payment;


        // ---------------- Credit Card ----------------
        payment = new CreditCardPayment();
        processor.processPayment(payment, 5000);

        // ---------------- UPI ----------------
        payment = new UPIPayment();
        processor.processPayment(payment, 1500);

        // ---------------- PayPal ----------------
        payment = new PaypalPayment();
        processor.processPayment(payment, 2500);



        
    }
}
