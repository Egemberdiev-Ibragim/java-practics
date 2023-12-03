package bank_account;

public class AccountManager {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        checkingAccount.addMoney(150);
        savingsAccount.addMoney(300);
        checkingAccount.addMoney(200);
        savingsAccount.transfer(checkingAccount, 200);
        checkingAccount.pay(150);
        System.out.println("Сберегательный счет:" + " " + savingsAccount.balance);
        System.out.println("Кредитный счет:" + " " + creditAccount.balance);
        System.out.println("Расчетный счет:" + " " + checkingAccount.balance);
    }
}
