package com.company;

public class BankAccount {
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    private double amount = 0;
    private double sum;
    public void deposit (double sum){
        System.out.println("Вы пополнили ваш счет на : ");
        setAmount(getAmount() + sum);
    }
    public void withDraw(int sum) throws LimitException {
        if(sum > getAmount()){
            throw new LimitException("У тебя нет такой суммы, бомж.", sum);
        }else{
        setAmount(getAmount() - sum);
        }
    }
}
