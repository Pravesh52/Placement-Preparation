

// Ye complete runnable Java code hai jo Runtime
//  Polymorphism
//  ko Payment Gateway example se explain karta hai:


interface pyamentgateway{
    void pay();
}

class creditcardpayment implements pyamentgateway{

    @Override

    public void pay(){
        System.out.println("creditcard payment successful..");

    }
}

class Upipayments implements pyamentgateway{
    @Override
    public void pay(){
        System.out.println("UPI payment successfully..");
    }
}

class paypal implements pyamentgateway{
    @Override
    public void pay(){
        System.out.println("Paypal payments successfully..");
    }
}
public class Payment {
    // common method for all payment gateway

    static void ProcessPayment(pyamentgateway P){
        P.pay();
    }
    public static void main(String[] args) {

        pyamentgateway payment1=new creditcardpayment();
        pyamentgateway payment2=new Upipayments();
        pyamentgateway payment3=new paypal();

        ProcessPayment(payment1);
        ProcessPayment(payment2);
        ProcessPayment(payment3);
        
    }
}
