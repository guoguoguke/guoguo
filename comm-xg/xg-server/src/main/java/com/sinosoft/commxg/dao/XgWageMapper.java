package com.sinosoft.commxg.dao;

import java.util.List;

import com.sinosoft.commxg.dto.XgWage;
import com.sinosoft.commxg.param.XgWageParam;

public interface XgWageMapper {
	  /**
     * 
     * description:查询薪酬人员列表
     * @author:  guoweisong
     * @date: 2018-09-14
     * @since: 1.0
     */
    List<XgWage> selectByParam(XgWageParam xgWageParam);
    /**
     * 
     * description:查询薪酬项
     * @author:  guoweisong
     * @date: 2018-09-14
     * @since: 1.0
     */
    XgWage selectvalueByindex(XgWageParam xgWageParam);
 }