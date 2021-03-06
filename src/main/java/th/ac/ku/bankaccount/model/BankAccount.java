package th.ac.ku.bankaccount.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int customerId;
    private String type;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        this.setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
