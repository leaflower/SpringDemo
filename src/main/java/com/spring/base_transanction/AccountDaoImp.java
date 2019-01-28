package com.spring.base_transanction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

//数据访问层,实现类，TODO
public class AccountDaoImp extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, Double money) {
        String sql="UPDATE springaccount SET money=money-? WHERE name=?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    @Override
    public void inMoney(String in, Double money) {
        String sql="UPDATE springaccount SET money=money+? WHERE name=?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
