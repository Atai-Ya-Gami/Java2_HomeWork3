package com.company;

public class Main {

    public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(20000.0);

            while (true) {
                try {
                    bankAccount.withDraw(6000);

                }catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                    try {
                        bankAccount.withDraw(2000);
                        System.out.println("У вас не осталось денег");
                    } catch (LimitException limitException1) {
                        System.out.println(limitException1.getMessage());
                    }
                    break;
                }
            }
        }
    }
