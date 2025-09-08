package design_pattern.AdapterPattern;

import design_pattern.AdapterPattern.Bank;

public class ICICIBankAdapter implements BankAPI {

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
