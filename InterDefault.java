package JavaPractice;
//default methods in interface
interface RBI {
    void ROI();

    void KYC();
//here default is keyword here it is not the specifier here the specifier is public
    default void address() {
        System.out.println("default address...");
    }
}

class SBI implements RBI {
    public void ROI() {
        System.out.println("SBI ROI");
    }

    public void KYC() {
        System.out.println("SBI KYC");
    }

    public void address() {
        System.out.println("sbi customer address...");
    }
}

class Boi implements RBI {
    public void ROI() {
        System.out.println("B0I ROI");
    }

    public void KYC() {
        System.out.println("BoI KYC");
    }

    public void address() {
        System.out.println("boi address...");
    }
}

public class InterDefault {
    public static void main(String[] args) {
        RBI obj = new Boi();
        RBI obj1 = new SBI();
        obj.KYC();
        obj.ROI();
        obj.address();

        obj1.KYC();
        obj1.ROI();
        obj1.address();

    }
}
