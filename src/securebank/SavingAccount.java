package securebank;

public class SavingAccount extends Account{

    private final double interestRate;


    public SavingAccount(String id, String owner, double balance) {
        super(id, owner, balance);
        this.interestRate = 0.03;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
