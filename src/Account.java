
public class Account {

    private long accountNumber;
    private String type;
    private String holderName;
    private double balance;
    private static int count;

    public Account(String t, String h, double b) { //constructor
        count++;
        accountNumber = 1000000000000000L+count; //adds count to base number, next available number
        type = t;
        holderName = h;
        balance = b;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}