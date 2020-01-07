package com.example.demo.commons;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Zheng Wencai on 2020-1-7.
 * 公共返回类
 */
public abstract class ReturnJSON {
    protected JSONObject returnSuccess(Object data) {
        return returnCustom(HttpCode.SUCCESS, data);
    }

    protected JSONObject returnFail() {
        return returnCustom(HttpCode.FAIL, "");
    }

    protected JSONObject returnCustom(HttpCode code, Object data) {
        JSONObject json = new JSONObject();
        if (data != null) {
            json.put("data", data);
        }
        json.put("httpCode", code.value());
        json.put("msg", code.msg());
        json.put("timestamp", System.currentTimeMillis());
        return json;
    }
}
