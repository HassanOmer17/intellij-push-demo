package com.example.intellijpushdemo;

public class Account {
    public int balance;

    public Account(){
        balance = 10000;
    }
    public Account(int a){
        balance= a;
    }
    public int Deposit(int value){
        balance= balance + value;
        return balance;
    }
    public int Withdraw(int check){
        check = check - balance;
        return check;
    }
    public static void main(String[] args){
        Account a1 = new Account();
        System.out.println(a1.Withdraw(7000));
        System.out.println(a1.Deposit(7000));
        Account a2 = new Account(20000);
        System.out.println(a2.Withdraw(4000));
        System.out.println(a2.Deposit(5000));

    }
}
