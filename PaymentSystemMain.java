package JavaPractice;

abstract class PaymentSystem {
    private double amount;
    private String transactionId;

    public PaymentSystem() {
    }

    public PaymentSystem(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;

    }

    abstract void processPayment();

    void displayDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
    }
}

class creditCardPayment extends PaymentSystem {

    
    private  String cardNumber;

    public creditCardPayment(double amount, String transactionId,String cardNumber) {
        super(amount,transactionId);
        this.cardNumber = cardNumber;
    }

    void processPayment() {
        System.out.println("Processing credit card payment for amount: $[amount].");
    }
}

class PaypalPayment extends PaymentSystem {

    
    private String paypalId;

    public PaypalPayment(double amount, String transactionId,String paypalId) {
        super(amount,transactionId);
        this.paypalId = paypalId;
    }

    void processPayment() {
        System.out.println("Processing PayPal payment for amount: $");
    }
    
}

public class PaymentSystemMain {
    public static void main(String[] args) {
        PaymentSystem obj1=new creditCardPayment(5000,"101","1234ry");
        PaymentSystem obj2=new PaypalPayment(8000.40,"102", "12345yx");
        System.out.println("Credit Card Payment:");
        obj1.processPayment();
        obj1.displayDetails();

        System.out.println("\nPayPal Payment:");
        obj2.processPayment();
        obj2.displayDetails();

    }
}
