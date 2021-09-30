package com.zzzlcc.controller;

import com.zzzlcc.entity.Account;
import com.zzzlcc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/test/{phone}")
    public Account findById(@PathVariable("phone")String  phone){
        Account account = accountService.findById(phone);
        System.out.println(account);
        return account;
    }

    @RequestMapping("/test")
    public List<Account> findAll(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
        return all;
    }
}
