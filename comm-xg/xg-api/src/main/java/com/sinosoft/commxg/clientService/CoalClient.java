package com.sinosoft.commxg.clientService;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sinosoft.commxg.param.XgUserParam;
import com.sinosoft.commxg.vo.ResultVo;

//采用基于接口的注解
@FeignClient(name = "COMMCOAL")//向注册中心注册时的应用名
public interface CoalClient {

    @RequestMapping(value = "/coal/getCoalList",method = RequestMethod.POST)
    public ResultVo getCoalList(@RequestBody XgUserParam xgUserParam);

}
