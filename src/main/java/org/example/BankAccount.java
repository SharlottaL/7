package org.example;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Некорректная сумма пополнения");
            return;
        }
        this.balance += amount;
    }
    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Некорректная сумма снятия");
            return;
        }
        if(balance < amount)
        {
            System.out.println("Cредств недостаточно");
            return;
        }
        this.balance -= amount;
    }
}
