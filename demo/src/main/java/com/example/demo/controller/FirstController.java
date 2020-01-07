package com.example.demo.controller;

import com.example.demo.commons.ReturnJSON;
import com.example.demo.service.IFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Zheng Wencai on 2020-1-7.
 * description：demo for interview，input a string of 2-9
 */

@RestController
@RequestMapping(value = "/first")
public class FirstController extends ReturnJSON {

    @Autowired
    IFirstService firstService;

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public Object api(@RequestParam(value = "digits", required = true) String digits) {
        List<String> list = firstService.letterCombinations(digits);
        if (list.isEmpty()) {
            return returnFail();
        }

        return returnSuccess(list);
    }

}
