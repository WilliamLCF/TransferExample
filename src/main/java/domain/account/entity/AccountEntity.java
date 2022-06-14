package domain.account.entity;

import infra.account.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//doentity
@Component
public class AccountEntity {
    private String accountId;
    private long balance;

    @Autowired
    private AccountRepository accountRepository;

    public Long transfer(AccountEntity accountTo,Long money){
        if(this.balance < money){
            throw new RuntimeException("monet not enough");
        }

        this.balance = this.balance - money;
        accountTo.balance = accountTo.balance + money;
        return this.balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public AccountEntity fromAccountId(String accountId){
        AccountEntity account = this.accountRepository.getAccountById(accountId);
        return account;
    };
}
