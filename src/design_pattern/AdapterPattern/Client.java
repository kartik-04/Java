package design_pattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        PhonePe phonepe = new PhonePe(new ICICIBankAdapter());
        phonepe.performBankOperation();
    }
}
