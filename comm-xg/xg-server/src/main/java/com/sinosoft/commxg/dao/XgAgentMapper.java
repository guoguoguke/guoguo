package com.sinosoft.commxg.dao;

import java.util.List;

import com.sinosoft.commxg.dto.XgAgent;
import com.sinosoft.commxg.param.XgAgentParam;

public interface XgAgentMapper {
    /**
     * 
     * description:selectByExample
     * @author:  guoweisong
     * @date: 2018-09-06
     * @since: 1.0
     */
    List<XgAgent> selectByParam(XgAgentParam xgAgentParam);

}