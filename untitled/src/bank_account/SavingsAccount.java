package bank_account;

public class SavingsAccount extends Account {
    @Override
    public String getAccountType() {
        return "Сберегательный счет!";
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата невозможна, так как это сберегательный счет.");
    }
}
