package com.OLL;

public class ATM extends Thread {
    private HSBCBank bank;
    public ATM(HSBCBank bank) {
        this.bank = bank;
    }
    @Override
    public void run() {
        System.out.println("withdrawal");
        bank.withdraw(2000);
    }
}
