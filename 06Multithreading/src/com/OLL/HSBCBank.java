package com.OLL;

public class HSBCBank {
    int accountBalance;

    public  HSBCBank(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    synchronized void deposit(int depositAmount) {
        this.accountBalance += depositAmount;
    }
    synchronized void withdraw(int withdrawAmount) {
        this.accountBalance -= withdrawAmount;
    }
    synchronized public void checkBalance() {
        System.out.println("Balance is " + this.accountBalance);
    }
}
