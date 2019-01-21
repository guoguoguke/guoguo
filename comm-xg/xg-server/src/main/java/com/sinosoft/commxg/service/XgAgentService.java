package com.sinosoft.commxg.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dto.XgAgent;
import com.sinosoft.commxg.param.XgAgentParam;


/**
 * @author guoweisong
 * 
 *
 */
public interface XgAgentService {
	

    /**
      * @description 查询用户列表
      * @param CifCustomerCoalParam
      * @return List<XgAgent>
      */
    public PageInfo<XgAgent>  getAgentList(XgAgentParam xgAgentParam) throws Exception;
    

}
