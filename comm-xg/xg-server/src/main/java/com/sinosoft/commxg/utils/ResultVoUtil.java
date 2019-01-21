package com.sinosoft.commxg.utils;

import com.sinosoft.commxg.vo.ResultVo;

public class ResultVoUtil {

    public static ResultVo success(Object data,String msg){
        ResultVo resultVo = new ResultVo();

        resultVo.setCode("0000");
        resultVo.setData(data);
        resultVo.setMsg(msg);

        return resultVo;
    }

    public static ResultVo success(Object data){
        return success(data,"success");
    }

    public static ResultVo success(){
        return success("","");
    }

    public static ResultVo fail(String code, String message){
        ResultVo resultVo = new ResultVo();

        resultVo.setCode(code);
        resultVo.setData("");
        resultVo.setMsg(message);

        return resultVo;
    }

    public static ResultVo fail(String message){
        return fail("9999",message);
    }
}
