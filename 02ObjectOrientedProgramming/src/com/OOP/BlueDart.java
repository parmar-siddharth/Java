package com.OOP;

public class BlueDart implements IDelivery{

    @Override
    public String delivered(double amount) {
        return "Order Delivered By BlueDart " + amount;
    }
}
