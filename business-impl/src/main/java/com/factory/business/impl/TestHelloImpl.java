package com.factory.business.impl;

import com.factory.business.inter.TestHelloInter;
import org.springframework.stereotype.Component;

/**
 * @program factory
 * @author: husheng
 * @create: 2019/09/03 15:08
 */
@Component
public class TestHelloImpl implements TestHelloInter {

    public void sayHello() {
        System.out.println("say hello to world!");
    }
}
