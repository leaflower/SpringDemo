package com.spring.base_transanction;

//业务逻辑层
public interface AccountDao {
    public void outMoney(String out,Double money);
    public void inMoney(String in,Double money);
}
