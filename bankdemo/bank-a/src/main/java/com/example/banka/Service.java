package com.example.banka;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author zhang
 * @Date 2020/5/13 13:59
 **/
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    AccountDao accountDao;

    @Autowired
    BankBClient bankBClient;

    @LcnTransaction
    public String start(int money) {
        String user = "zhang";
        String state = bankBClient.addMoney(money,user);
        if ("success".equals(state)){
            Account account =  new Account();
            account.setMoney(money);
            account.setUser(user);
            int res = accountDao.update(account);
            //throw new RuntimeException("error runtime");
            return res>0?"success":"error";
        }
        return "error";
    }
}
