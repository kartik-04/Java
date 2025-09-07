package AdapterPattern;

public interface BankAPI {

    void addBankAccount(Bank bank);

    boolean pay(double amount, String account);

    double checkBalance();

    void transferFunds(double amoutn, String srcAcc, String destAcc);
}
