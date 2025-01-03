package JavaPractice;

interface PaymentGateway {
    void processPayment(double amount);
}

class Creditcard implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("payment by credit card..." + amount);
    }
}

class UPIPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("payment by upi..." + amount);
    }
}

public class PaymentInterface {
    public static void main(String[] args) {
        PaymentGateway obj = new Creditcard();
        PaymentGateway obj1 = new UPIPayment();
        obj.processPayment(300.445);
        obj1.processPayment(400);

    }
}
