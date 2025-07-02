package com.autobots._java.lambda.bankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {
    // вводим данные клиента
    private final String fullName;
    private final String clientId;
    private final String pin;
    private final List<BankAccount> accounts = new ArrayList<>();

    public Client(String fullName, String pin) {
        this.fullName = fullName;
        this.pin = pin;
        this.clientId = String.valueOf(UUID.randomUUID());
    }
    // аутентификация по пинкоду
    public boolean authenticate(String inputPin){
        return this.pin.equals(inputPin);
    }

    public void addAccount(BankAccount account){
       accounts.add(account);
    }
    public String getFullName() {
        return fullName;
    }

    public String getClientId() {
        return clientId;
    }

    public String getPin() {
        return pin;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
