package com.sinosoft.commxg.dao;

import java.util.List;

import com.sinosoft.commxg.dto.XgPerformance;
import com.sinosoft.commxg.param.XgPerformanceParam;

public interface XgPerformanceMapper {
	
	  /**
     * 
     * description:查询待结绩效项目奖金
     * @author:  guoweisong
     * @date: 2018-09-14
     * @since: 1.0
     */
    List<XgPerformance> selectByParam(XgPerformanceParam xgPerformanceParam);
}