package com.justin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JustinZhou
 * @date 2021/6/28
 */
@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String  msg;
    private T       date;



    public CommonResult(Integer code, String msg, T date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    public CommonResult(Integer code, String msg){
        this(code,msg, null);
    }
}
