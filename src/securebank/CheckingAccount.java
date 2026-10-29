package securebank;

public class CheckingAccount extends Account {

    private final double overdraftLimit;

    public CheckingAccount(String id, String owner,
                           double balance, double overdraftLimit){
        super (id, owner, balance);
        this.overdraftLimit =overdraftLimit;
    }

    @Override
    public double calculateInterest(){
        return 0;
    }

}
