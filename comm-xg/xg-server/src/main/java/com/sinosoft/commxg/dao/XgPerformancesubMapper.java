package com.sinosoft.commxg.dao;

import java.util.List;

import com.sinosoft.commxg.dto.XgPerformancesub;
import com.sinosoft.commxg.param.XgPerformancesubParam;

public interface XgPerformancesubMapper {
   
	List<XgPerformancesub> selectByParam(XgPerformancesubParam xgPerformancesubParam);
	List<XgPerformancesub> selectByParam1(XgPerformancesubParam xgPerformancesubParam);
    List<XgPerformancesub> selectByParam2(XgPerformancesubParam xgPerformancesubParam);

}