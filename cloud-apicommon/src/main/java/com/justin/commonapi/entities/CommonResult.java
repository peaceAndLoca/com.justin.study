package com.justin.commonapi.entities;

/**
 * @author JustinZhou
 * @date 2021/6/28
 */
public class CommonResult<T> {
    private Integer code;
    private String  msg;
    private T       date;

    public CommonResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public CommonResult(Integer code, String msg, T date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    public CommonResult(Integer code, String msg){
        this(code,msg, null);
    }
}
