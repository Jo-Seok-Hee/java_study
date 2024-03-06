package oop1;

public class Account {

    int balance;

    void deposit (int amount) {

        balance = balance + amount;
        System.out.println(amount + "원이 입금되었습니다.");
        System.out.println("현재 잔액 : " + balance);
    }

    void withdraw (int amount) {

        if (balance >= amount) {

            balance = balance - amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {

            System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance + "원");
        }
    }

    void checkBalance () {

        System.out.println(balance);
    }
}
