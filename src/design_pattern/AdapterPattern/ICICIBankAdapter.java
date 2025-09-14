package design_pattern.AdapterPattern;

import design_pattern.AdapterPattern.Bank;

public class ICICIBankAdapter implements BankAPI {

    private ICICIBank icicibank =  new ICICIBank();

    @Override
    public void addBankAccount(Bank bank) {

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
        icicibank.sendMoney(srcAcc, destAcc, amoutn);
    }
}
