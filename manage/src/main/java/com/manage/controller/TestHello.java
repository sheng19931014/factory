package com.manage.controller;

import com.factory.business.bo.UserInfoBo;
import com.factory.business.inter.TestHelloInter;
import com.factory.business.inter.UserInfoBizInter;
import com.factory.dao.inter.UserInfoMapper;
import org.apache.logging.log4j.core.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @program factory
 * @author: husheng
 * @create: 2019/09/03 14:50
 */
@Controller
public class TestHello {

    @Resource
    private TestHelloInter testHelloInter;

    @Autowired
    private UserInfoBizInter userInfoBizInter;

    @RequestMapping("/index")
    public String helloWord(){
        System.out.print("访问index后台。。。");
        testHelloInter.sayHello();
        return "index";
    }

    @RequestMapping("/addUserInfo")
    public String addUserInfo(HttpServletRequest request){
        System.out.print("添加userInfo:");
        UserInfoBo bo = new UserInfoBo();
        bo.setUserNo(UuidUtil.getTimeBasedUuid().toString());
        bo.setUserName(request.getParameter("userName"));
        bo.setUserSex(request.getParameter("userSex"));
        bo.setUserAge(new Short(request.getParameter("userAge")));
        bo.setUserMobile(request.getParameter("userMobile"));
        bo.setUserProfession(request.getParameter("userProfession"));
        userInfoBizInter.addUserInfo(bo);
        return "index";
    }
}
