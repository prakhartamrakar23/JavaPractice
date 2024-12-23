package JavaPractice;
import java.util.Scanner;

class Transaction {
    private int transactionId;
    private double amount;

    void set(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    void display() {
        System.out.println("TransactionId : " + transactionId);
        System.out.println("Amount: " + amount);
    }

}

class PeerToPeerTransaction extends Transaction {
    private String recipient;

    void set(int transactionId, double amount, String recipient) {
        super.set(transactionId, amount);
        this.recipient = recipient;
    }

    void display() {
        super.display();
        System.out.println("Recipient: " + recipient);
    }
}

class OnlinePurchaseTransaction extends Transaction {
    private String merchant;

    void set(int transactionId, double amount, String merchant) {
        super.set(transactionId, amount);
        this.merchant = merchant;
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("Merchant: " + merchant);
    }
}

class BillPaymentTransaction extends Transaction {
    private String billType;

    void set(int transactionId, double amount, String billType) {
        super.set(transactionId, amount);
        this.billType = billType;
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("BillType: " + billType);
    }
}

public class TransactionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the transaction id");
        int transactionId = Integer.parseInt(sc.nextLine());
        System.out.println("enter the amount");
        double amount = Double.parseDouble(sc.nextLine());
        System.out.println("enter the recipient");
        String recipient = sc.nextLine();
        System.out.println("enter the merchant");
        String merchant = sc.nextLine();
        System.out.println("enter the bill type");
        String billType = sc.nextLine();

        PeerToPeerTransaction obj1 = new PeerToPeerTransaction();
        OnlinePurchaseTransaction obj2 = new OnlinePurchaseTransaction();
        BillPaymentTransaction obj3 = new BillPaymentTransaction();

        obj1.set(transactionId, amount, recipient);
        obj2.set(transactionId, amount, merchant);
        obj3.set(transactionId, amount, billType);

        System.out.println("PeerToPeer Transaction");
        obj1.display();
        System.out.println("Online Purchase Transaction");  
        obj2.display();
        System.out.println("Bill Payment Transaction");

    }

}