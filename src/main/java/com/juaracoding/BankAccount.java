package com.juaracoding;

public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }

    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public double checkBalance() {
        System.out.println("Balance is: " + amount);
        return amount;
    }

    public String display() {
        System.out.println(acc_no + " " + name + " " + amount);
        return acc_no+name+amount;

    }
}

