package AdapterPattern;

public class PhonePe {

    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    void performBankOperation(){
        Bank bank = new Bank("123435353", "Kartik Singh");

        bankAPI.addBankAccount(bank);
        boolean paymentStauts = bankAPI.pay(23.43, "Kartik Singh");

        if(paymentStauts){
            bankAPI.transferFunds(2343.55, "123435353", "987898789");
        }
    }
}
