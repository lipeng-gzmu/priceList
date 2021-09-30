package com.zzzlcc.service;

import com.zzzlcc.entity.Account;

import java.util.List;

public interface AccountService {
    /**
     *  根据id查询
     */

    Account findById(String  phone);

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

}
