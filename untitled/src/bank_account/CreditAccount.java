package bank_account;

public class CreditAccount extends Account{
    @Override
    public void pay(int amount){
        balance -= amount;
        System.out.println("Произведена оплата в размере:" + " " + amount);
        if(balance > 0){
            System.out.println("Кредитный баланс:" + " " + balance);
        } else if (balance < 0 ) {
            System.out.println("Вы оплатили кредит!");
        }
    }

    @Override
    public String getAccountType() {
        return "Кредитный счет!";
    }
}
