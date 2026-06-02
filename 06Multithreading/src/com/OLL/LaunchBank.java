package com.OLL;

public class LaunchBank {
    public static void main(String[] args) {
        HSBCBank hsbcBank1 = new HSBCBank(7000);
        HSBCBank hsbcBank2 = new HSBCBank(7000);
        GooglePay googlePay = new GooglePay(hsbcBank1);
        GooglePay googlePay2 = new GooglePay(hsbcBank1);
        PhonePe phonePe = new PhonePe(hsbcBank1);
        PhonePe phonePe2 = new PhonePe(hsbcBank1);
        ATM atm = new ATM(hsbcBank1);
        ATM atm2 = new ATM(hsbcBank1);

        googlePay.start();
        phonePe.start();
        atm.start();
        googlePay2.start();
        phonePe2.start();
        atm2.start();
    }
}
