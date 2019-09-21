package com.manage.controller;

import com.factory.business.inter.TestHelloInter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @program factory
 * @author: husheng
 * @create: 2019/09/03 14:50
 */
@Controller
public class TestHello {

    @Resource
    private TestHelloInter testHelloInter;

    @RequestMapping("/index")
    public String helloWord(){
        System.out.print("访问index后台。。。");
        testHelloInter.sayHello();
        return "index";
    }
}
