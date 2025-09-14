package design_pattern.AdapterPattern;

public interface BankAPI {

    void addBankAccount(Bank bank);

    boolean pay(double amount, String account);

    double checkBalance(String accountNumber);

    void transferFunds(double amoutn, String srcAcc, String destAcc);
}
