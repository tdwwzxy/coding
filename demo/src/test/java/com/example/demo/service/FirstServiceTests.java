package com.example.demo.service;

import com.example.demo.service.impl.FirstServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by Zheng Wencai on 2020-1-7.
 * 单元测试类
 */
public class FirstServiceTests {

    IFirstService firstService = new FirstServiceImpl();

    @Test
    public void letterCombinations() {
        String[] testStr = new String[]{"23", "12", "a"};
        for (String str : testStr) {
            System.out.println(">>>input: " + str);
            List<String> list = firstService.letterCombinations(str);
            System.out.println(">>>output: " + list.toString());
        }
    }
}
