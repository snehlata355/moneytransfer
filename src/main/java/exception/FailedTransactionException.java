package exception;

import common.ApplicationConstants;
import model.Account;

public class FailedTransactionException extends Exception{
    Account account;
    double amount;
    public FailedTransactionException(Account account ,double amount){
        super(ApplicationConstants.FAILED_TRANSACTION + account.getAccountId());
        this.amount=amount;
        this.account=account;

    }
    public Account getAccountBalance(){
        account.setBalance(account.getBalance() + amount);
        return  account;
    }

    public void getRevertedDeposit() {
        account.setBalance(account.getBalance() - amount);
    }
}
