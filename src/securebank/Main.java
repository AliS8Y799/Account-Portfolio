package securebank;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Avccounts ===");

        Account[] portfolio = {
                new SavingAccount("A-101", "Ali", 1000),
                new CheckingAccount("A102", "Sara", 500, 200)
        };

        Arrays.sort(portfolio);

        for (Account account : portfolio) {
            System.out.println(account.describe());
        }

        System.out.println();
        System.out.println("=== Transactions ===");

        List <Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("Tx-101", "A-101", 500));
        transactions.add(new Transaction("TX-102", "A-102", 200));

        for (Transaction tx : transactions) {
            System.out.println(tx);
        }

    }
}








