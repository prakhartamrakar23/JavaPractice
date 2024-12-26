package JavaPractice;

class Bank {
    int getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getInterestRate() {
        return 5;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 6;
    }
}

class Axis extends Bank {
    int getInterestRate() {
        return 7;
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank obj = new Bank();
        Bank obj1 = new Axis();
        Bank obj2 = new SBI();
        Bank obj3 = new ICICI();
        System.out.println(obj.getInterestRate());
        System.out.println(obj1.getInterestRate());
        System.out.println(obj2.getInterestRate());
        System.out.println(obj3.getInterestRate());

    }
}
