package infra.account.repo;

import domain.account.entity.AccountEntity;

public interface AccountCustomRepository{
    AccountEntity  getAccountById(String id);
}
