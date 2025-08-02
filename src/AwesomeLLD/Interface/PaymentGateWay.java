package AwesomeLLD.Interface;

interface Payment {
    void pay(double  amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPalPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using PayPal");
    }
}

public class PaymentGateWay {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.pay(100.50);

        Payment payment2 = new PayPalPayment();
        payment2.pay(200.75);
    }
}













