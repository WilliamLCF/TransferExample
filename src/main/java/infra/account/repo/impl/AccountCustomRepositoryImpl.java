package infra.account.repo.impl;

import domain.account.entity.AccountEntity;
import infra.account.repo.AccountCustomRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AccountCustomRepositoryImpl implements AccountCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public AccountEntity getAccountById(String id) {

        //converter po to domain

        return null;
    }
}
