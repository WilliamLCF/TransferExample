package api.account.pl;

import domain.account.entity.AccountEntity;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Component;

public class TransferReq {
    private String accoutIdFrom;
    private String accoutIdTo;
    private Long money;

    public String getAccoutIdFrom() {
        return accoutIdFrom;
    }

    public void setAccoutIdFrom(String accoutIdFrom) {
        this.accoutIdFrom = accoutIdFrom;
    }

    public String getAccoutIdTo() {
        return accoutIdTo;
    }

    public void setAccoutIdTo(String accoutIdTo) {
        this.accoutIdTo = accoutIdTo;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public AccountEntity toDomain() {
        AccountEntity entity = new AccountEntity();
        entity.setAccountId(this.accoutIdFrom);
        return entity;
    }
}
