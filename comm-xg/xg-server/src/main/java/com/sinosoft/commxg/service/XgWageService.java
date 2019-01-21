package com.sinosoft.commxg.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dto.XgPerformance;
import com.sinosoft.commxg.dto.XgPerformancesub;
import com.sinosoft.commxg.dto.XgWage;
import com.sinosoft.commxg.param.XgPerformanceParam;
import com.sinosoft.commxg.param.XgPerformancesubParam;
import com.sinosoft.commxg.param.XgWageParam;


/**
 * @author guoweisong
 * 
 *
 */
public interface XgWageService {
	

    /**
      * @description 查询薪酬
      * @param CifCustomerCoalParam
      * @return List<XgWage>
      */
    public PageInfo<XgWage>  getWageList(XgWageParam xgWageParam) throws Exception;
    
    /**
     * @description 查询待结绩效项目奖金
     * @param CifCustomerCoalParam
     * @return List<XgWage>
     */
   public PageInfo<XgPerformance>  getPerformanceList(XgPerformanceParam xgPerformanceParam) throws Exception;
   /**
    * @description 查询总绩效明细
    * @param CifCustomerCoalParam
    * @return List<XgWage>
    */
   public PageInfo<XgPerformancesub> getPerformancesubList(XgPerformancesubParam xgPerformancesubParam);
   /**
    * @description 查询已结绩效明细
    * @param CifCustomerCoalParam
    * @return List<XgWage>
    */
   public PageInfo<XgPerformancesub> getPerformancesub1List(XgPerformancesubParam xgPerformancesubParam);
   /**
    * @description 查询待结结绩效明细
    * @param CifCustomerCoalParam
    * @return List<XgWage>
    */
   public PageInfo<XgPerformancesub> getPerformancesub2List(XgPerformancesubParam xgPerformancesubParam);
}
