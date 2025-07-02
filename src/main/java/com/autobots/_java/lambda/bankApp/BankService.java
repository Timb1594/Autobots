package com.autobots._java.lambda.bankApp;

import com.autobots._java.lambda.bank.Bank;

public class BankService {
    public static boolean transfer(BankAccount from, BankAccount to, double amount){
        if(from.withdraw(amount)){
            double convertedSum = ExchangeRate.convert(amount, from.getCurrency(), to.getCurrency());
            to.deposit(convertedSum);
            from.addTransaction("TRANSFER OUT", amount);
            to.addTransaction("TRANSFER IN", convertedSum);
            return true;
        }
        return false;
    }
}
