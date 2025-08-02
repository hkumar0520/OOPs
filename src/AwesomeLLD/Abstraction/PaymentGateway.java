package AwesomeLLD.Abstraction;

abstract class Payment{
    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    abstract void pay();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(double amount){
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Pai " + amount + " using Credit Card");
    }
}

class PayPalPayment extends Payment {
    PayPalPayment(double amount){
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Paid " + amount + " using Paypal");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment(150.75);
        payment.pay();

        payment = new PayPalPayment(200.50);
        payment.pay();
    }
}



















