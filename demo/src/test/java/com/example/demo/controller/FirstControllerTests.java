package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Zheng Wencai on 2020-1-7.
 * 单元测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstControllerTests {

    @Autowired
    FirstController firstController;

    @Test
    public void api() {
        String[] testStr = new String[]{"23", "12", "a"};
        for (String str : testStr) {
            System.out.println(">>>input: " + str);
            Object object = firstController.api(str);
            System.out.println(">>>output: " + object.toString());
        }
    }
}
