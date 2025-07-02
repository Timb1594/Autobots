package com.autobots._java.lambda.bank;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        Mbank aliiaMbank = new Mbank(123456789012L, 123456789);

        System.out.println(aliiaMbank.getBalance());
        aliiaMbank.deposit(100000);
        System.out.println(aliiaMbank.getBalance());

        Optima ulugbekOptima = new Optima(123456789011L,123456789 );
        System.out.println(ulugbekOptima.getBalance());

        Bank.transferFunds(aliiaMbank, ulugbekOptima, 500);
        System.out.println(aliiaMbank.getBalance());
        System.out.println(ulugbekOptima.getBalance());

        BankBase.allBankRecords.stream().filter(n ->n.getBalance()>100).forEach(System.out::println);

        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);
    }
}
