package api.account.application;

import api.account.pl.TransferReq;
import api.account.pl.TransferResp;
import domain.account.entity.AccountEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountAppService {

    public TransferResp transfer(TransferReq req){
//        AccountEntity xx = new AccountEntity().fromAccountId(req.getAccoutIdFrom());
//        AccountEntity entity = req.toDomain();
//        entity.transfer()
        return null;
    }
}
