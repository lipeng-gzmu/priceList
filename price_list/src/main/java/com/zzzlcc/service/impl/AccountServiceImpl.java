package com.zzzlcc.service.impl;

import com.zzzlcc.mapper.AccountMapper;
import com.zzzlcc.pojo.Account;
import com.zzzlcc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 根据账号phone查询账号
     * @param phone
     * @return
     */
    @Override
    public Account findById(String phone) {
        return accountMapper.selectByPrimaryKey(phone);
    }
    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Account> findAll() {
        return accountMapper.selectAll();
    }
}
