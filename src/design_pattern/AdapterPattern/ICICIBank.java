package design_pattern.AdapterPattern;

public class ICICIBank{
    public void sendMoney(String srcAcc, String destAcc,double amount) {
        System.out.println("Transferring money from " + srcAcc + " To " + destAcc + " via ICICI Bank");
    }
}
