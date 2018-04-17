package com.zwz.bling.web.controller;

import com.zwz.bling.web.model.Account;
import com.zwz.bling.web.service.WebService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:  Air
 * Date  :  2018-04-14.
 */
@Controller
@RequestMapping("/")
public class WebController {

    @Resource
    private WebService webService;

    @RequestMapping("/")
    public String index() {
        return "/index";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public List<Account> selectAll() {
        System.out.println("selectAll");
        List<Account> list = webService.selectAll();
        System.out.println(list.size());
        return list;
    }
}
