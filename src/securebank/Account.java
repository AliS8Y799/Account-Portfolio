package securebank;

//equals compare accounts by id

import java.util.Objects;


public abstract class Account implements Comparable<Account>, Reportable{


    private final String id;
    private String owner;
    private double balance;

    public Account(String id, String owner, double balance) {

        if (id == null || id.isBlank()){
            throw new IllegalArgumentException("ID cannot be blank");
        }

        if (owner == null || owner.isBlank()){
            throw new IllegalArgumentException("Owner cannot be blank");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.id = id;
        this.owner = owner;
        this.balance = balance;

    }

    public abstract double calculateInterest();

    public double getBalance(){
        return balance;


        }
    public String describe(){
        return  getId() + " " + getOwner() + " " + getBalance();
    }

    public void deposit(double amount){
        balance = balance + amount;

    }

    public void deposit(double amount, String memo) {
        balance = balance + amount;
    }

    public String getId() {
        return id;
    }
    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;

        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Account other) {
        return Double.compare(this.getBalance(), other.getBalance());
    }

    @Override
    public String toReportLine() {
        return describe();
    }

}



