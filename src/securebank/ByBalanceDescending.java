package securebank;

import java.util.Comparator;

public class ByBalanceDescending implements Comparator<Account>{

    @Override
    public int compare(Account a1, Account a2) {
        return Double.compare(a2.getBalance(), a1.getBalance());
    }
}
