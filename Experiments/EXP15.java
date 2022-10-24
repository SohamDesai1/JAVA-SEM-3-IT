package com.company;
class Account {
    private int balance = 30;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public static class EXP15 implements Runnable {
        private Account acct = new Account();
        @Override
        public void run() {
            for (int x = 0; x < 5; x++) {
                makeWithdrawal(10);
                if (acct.getBalance() < 0) {
                    System.out.println("account is overdrawn!");
                }
                makeDeposit(10);
                System.out.println("balance is " + acct.getBalance());
            }
        }
        private void makeWithdrawal(int amt) {
            if (acct.getBalance() >= amt) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
                acct.withdraw(amt);
                System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
            } else {
                System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
            }
        }
        private void makeDeposit(int amt) {
            System.out.println(Thread.currentThread().getName() + " is going to deposit");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
            acct.deposit(amt);
            System.out.println(Thread.currentThread().getName() + " completes the deposit");
        }
    }
    public static void main(String[] args) {
        EXP15 r = new EXP15();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Joe");
        two.setName("John");
        one.start();
        two.start();
    }
}
