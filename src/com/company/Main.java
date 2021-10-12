package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());
        try {
            while (true) {
                bankAccount.withDraw(6000);
                System.out.println("Со счета были сняты средства, ваш счет равен: " + bankAccount.getAmount());
            }
        } catch (LimitException e) {
            System.out.println("У тебя нет такой суммы, бомж.");
        }finally {
            bankAccount.setAmount(bankAccount.getAmount() - bankAccount.getAmount());
            System.out.println("Выведены оставщиеся средства." +
                    "\nОстаток равен: " + bankAccount.getAmount());
        }

    }
}

