package design_pattern.AdapterPattern;

public class YesBank{
    void transferFunds(double amoutn, String srcAcc, String destAcc) {
        System.out.println("Transferring money from " + srcAcc + " To " + destAcc + " via YES Bank");
    }
}
