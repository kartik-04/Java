package design_pattern.AdapterPattern;

public class YesBankAdapter implements BankAPI{
    private AdapterPattern.YesBank yesBank;

    public  YesBankAdapter(AdapterPattern.YesBank yesBank) {
        this.yesBank = yesBank;
    }
    @Override
    public void addBankAccount(Bank bank) {

    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void transferFunds(double amoutn, String srcAcc, String destAcc) {

    }
}
