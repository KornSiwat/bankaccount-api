package th.ac.ku.bankaccount.model;

public class Transaction {
    private int accountId;
    private String type;
    private double amount;

    public Transaction(int accountId, String type, double amount) {
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
