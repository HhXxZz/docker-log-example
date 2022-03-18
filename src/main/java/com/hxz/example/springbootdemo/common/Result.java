package com.hxz.example.springbootdemo.common;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private String desc;
    private Object data;


    public static Result success(Object object){
        ResultEnum resultEnum = ResultEnum.SUCCESS;
        return getResult(resultEnum,object);
    }


    public static Result error(ResultEnum resultEnum){
        return getResult(resultEnum);
    }

    public static Result error(ResultEnum resultEnum,String desc){
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setDesc(desc);
        result.setData("{}");
        return result;
    }


    private static Result getResult(ResultEnum resultEnum,Object object){
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setDesc(resultEnum.getDesc());
        result.setData(object);
        return result;
    }

    private static Result getResult(ResultEnum resultEnum){
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setDesc(resultEnum.getDesc());
        result.setData("{}");
        return result;
    }

}
