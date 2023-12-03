package bank_account;

public class CheckingAccount extends Account{
    
    @Override
    public String getAccountType() {
        return "Расчетный счет!";
    }
}
