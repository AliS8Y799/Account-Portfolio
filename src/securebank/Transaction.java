package securebank;

public final class Transaction {
    private final String id;
    private final String accountId;
    private final double amount;



public Transaction(String id, String accountId, double amount) {

    this.id = id;
    this.accountId = accountId;
    this.amount = amount;


}

public String getId(){
    return id;
}

public double getAmount() {
    return amount;
}

public String getAccountId() {
    return accountId;
}

@Override
    public String toString() {
    return id + " " + accountId + " " + amount;
}
}

