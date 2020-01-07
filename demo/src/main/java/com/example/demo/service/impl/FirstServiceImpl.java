package com.example.demo.service.impl;

import com.example.demo.service.IFirstService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Zheng Wencai on 2020-1-7.
 */
@Service
public class FirstServiceImpl implements IFirstService {

    public List<String> letterCombinations(String digits) {
        //check input
        if(StringUtils.isEmpty(digits)){
            return Collections.emptyList();
        }
        for (char c : digits.toCharArray()) {
            if (c < '2' || c > '9') {
                return Collections.emptyList();
            }
        }

        // execute recursion
        String[] allLetters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> returnList = new ArrayList<>();
        char[] chars = digits.toCharArray();
        for(char c : allLetters[chars[0] - '0'].toCharArray()){
            returnList.add(c + "");
        }
        for(int i = 1; i < digits.length(); i++){
            List<String> oldList = new ArrayList<>();
            for(String rStr : returnList){
                for(char c : allLetters[chars[i] - '0'].toCharArray()){
                    oldList.add(rStr + c);
                }
            }
            returnList = oldList;
        }

        return returnList;
    }
}
