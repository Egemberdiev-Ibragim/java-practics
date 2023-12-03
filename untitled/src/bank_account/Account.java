package bank_account;

public abstract class Account {
    protected int balance;
    public void pay(int amount){
        balance -= amount;
        System.out.println("Произведена оплата в размере:" + " " + amount);
    }
    public void transfer(Account account, int amount){
        balance -= amount;
        account.balance += amount;
        System.out.println("Произведена транзакция в размере:" + " " + amount);
    }
    public void addMoney(int amount){
        balance += amount;
        System.out.println("Баланс пополнен на сумму:" + " " + amount);
    }
    public abstract String getAccountType();
}
