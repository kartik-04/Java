package design_pattern.AdapterPattern;

public class YesBankAdapter implements BankAPI{
    private YesBank yesBank =  new YesBank();

    @Override
    public void addBankAccount(Bank bank) {
        System.out.println("These are the Bank Details :" + bank);
    }
    @Override
    public boolean pay(double amount, String account) {
        return true;
    }

    @Override
    public double checkBalance(String accountNumber) {
        return 0;
    }

    @Override
    public void transferFunds(double amoutn, String srcAcc, String destAcc) {
        yesBank.transferFunds(amoutn, srcAcc, destAcc);
    }
}
