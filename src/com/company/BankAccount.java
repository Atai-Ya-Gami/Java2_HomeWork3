package com.company;

import javax.naming.NameAlreadyBoundException;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (amount == 0) {
            amount = sum;
        } else {
            System.out.println(amount + sum);
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше чем сумма на счете", amount);
        }
        System.out.println(amount = amount - sum);
    }
}