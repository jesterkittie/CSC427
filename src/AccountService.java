import java.util.ArrayList;

public class AccountService {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(String type, String holderName, double balance) {
        Account acc = new Account(type, holderName, balance);
        accounts.add(acc);
    }

    public void updateAccount(long accountNumber, String newName, double newBalance) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                acc.setHolderName(newName);
                acc.setBalance(newBalance);
                return;
            }
        }
    }

    public void deleteAccount(long accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                accounts.remove(acc);
                return;
            }
        }
    }
}