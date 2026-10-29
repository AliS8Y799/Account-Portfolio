package securebank;

import java.util.Comparator;


public class ByOwnerName implements Comparator<Account>{

    @Override
    public int compare(Account a1, Account a2) {
        return a1.getOwner().compareToIgnoreCase(a2.getOwner());
    }


}
