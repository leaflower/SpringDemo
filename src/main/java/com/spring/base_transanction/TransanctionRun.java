package com.spring.base_transanction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransanctionRun {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext_tran.xml");
        AccountService accountService = (AccountService) app.getBean("accountService");
        accountService.transfer("zs","ls",300d);
    }
}
