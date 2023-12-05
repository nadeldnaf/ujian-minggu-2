package com.juaracoding;
import org.testng.Assert;
import org.testng.annotations.*;

public class BankAccountTest {

    public BankAccount account;

    @BeforeClass
    public void setUp() {
        // Initialize the BankAccount object before running the test methods
        account = new BankAccount();
        account.setAccount(12345, "Elanda", 1000.0);
    }

    @Test
    public void testDeposit() {
        double initialBalance = account.amount;
        double depositAmount = 500.0;
        double newBalance = account.deposit(depositAmount);

        Assert.assertEquals(newBalance, initialBalance + depositAmount);
    }

    @Test
    public void testWithdrawWithSufficientBalance() {
        double initialBalance = account.amount;
        double withdrawAmount = 300.0;
        double newBalance = account.withdraw(withdrawAmount);

        Assert.assertEquals(newBalance, initialBalance - withdrawAmount);
    }
    @Test
    public void testCheckBalance() {
        BankAccount account = new BankAccount();
        account.amount = 1000;
        double balance = account.checkBalance();
        Assert.assertEquals(balance, 1000.0);
    }

    @Test
    public void testDisplay() {
        BankAccount account = new BankAccount();
        account.acc_no = 123456;
        account.name = "Elanda";
        account.amount = 1000;
        String displayInfo = account.display();
        String expectedInfo = "123456Elanda1000.0";
        Assert.assertEquals(displayInfo, expectedInfo);
    }

}

