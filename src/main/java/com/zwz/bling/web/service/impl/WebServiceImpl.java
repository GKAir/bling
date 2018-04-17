package com.zwz.bling.web.service.impl;

import com.zwz.bling.web.dao.AccountMapper;
import com.zwz.bling.web.model.Account;
import com.zwz.bling.web.model.AccountExample;
import com.zwz.bling.web.service.WebService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:  Air
 * Date  :  2018-04-14.
 */
@Service
public class WebServiceImpl implements WebService {

    @Resource
    private AccountMapper mapper;

    @Override
    public List<Account> selectAll() {
        AccountExample example = new AccountExample();
        return mapper.selectByExample(example);
    }
}
