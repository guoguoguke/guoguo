package com.sinosoft.commxg.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.commxg.exception.CommException;
import com.sinosoft.commxg.utils.ResultVoUtil;
import com.sinosoft.commxg.vo.ResultVo;

@ControllerAdvice
public class CommExceptionHandler {

    @ExceptionHandler(value = CommException.class)
    @ResponseBody
    public ResultVo coalExceptionHandler(CommException e){
        return ResultVoUtil.fail(e.getMessage());
    }
}
