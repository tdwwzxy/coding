package com.example.demo.commons;

/**
 * Created by Zheng Wencai on 2020-1-7.
 * 枚举返回码
 */
public enum HttpCode {
    /**
     * 200请求成功
     */
    SUCCESS(200),
    /**
     * 501请求失败
     */
    FAIL(501);

    private final Integer value;

    private HttpCode(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public String msg() {
        return MessagesResources.getMessage("HTTPCODE_" + this.value);
    }
}
