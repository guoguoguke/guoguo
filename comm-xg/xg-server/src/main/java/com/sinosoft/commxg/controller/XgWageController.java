package com.sinosoft.commxg.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dto.XgPerformance;
import com.sinosoft.commxg.dto.XgPerformancesub;
import com.sinosoft.commxg.dto.XgWage;
import com.sinosoft.commxg.param.XgPerformanceParam;
import com.sinosoft.commxg.param.XgPerformancesubParam;
import com.sinosoft.commxg.param.XgWageParam;
import com.sinosoft.commxg.service.XgWageService;
import com.sinosoft.commxg.utils.ResultVoUtil;
import com.sinosoft.commxg.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * description:用于查询相关数据XXXX
 * @author XXXXX
 * @date 2018年X月XX日
 * @param 
 */

@Api("销售人员查询接口")
@RestController
@RequestMapping("/sales")
public class XgWageController {

    private Logger logger = LoggerFactory.getLogger(XgWageController.class);

    @Autowired
    private XgWageService xgWageService;

    /**
     * @description 查询待结绩效项目奖金信息
     * @param XgWageParam
     * @return ResultVo
     */
   @ApiOperation(value="查询待结绩效项目奖金信息", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgWageParam", value = "入参信息", dataType = "xgWageParam")
   @PostMapping("/queryPerformanceList")
   public ResultVo queryPerformanceList(@RequestBody XgPerformanceParam xgPerformanceParam){
       logger.info("getWageList+xgWageParam:{}", xgPerformanceParam);
       PageInfo<XgPerformance>  performancelist =null;
       try {
			//参数校验(人员代码、起止日期不能为空)
			String mesg=checkParam2(xgPerformanceParam);
			if("".equals(mesg)) {
				performancelist =xgWageService.getPerformanceList(xgPerformanceParam);
			}else
			{
				 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			return ResultVoUtil.fail("服务异常,请联系开发人员");
		}
       logger.info("getCoalList...end:{}",performancelist);
       return ResultVoUtil.success(performancelist);
   }
   
   /**
    * @description 查询总绩效项目奖金信息明细
    * @param XgWageParam
    * @return ResultVo
    */
  @ApiOperation(value="查询总绩效项目奖金信息明细", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgWageParam", value = "入参信息", dataType = "xgWageParam")
  @PostMapping("/queryPerformancesubList")
  public ResultVo queryPerformancesubList(@RequestBody XgPerformancesubParam xgPerformancesubParam){
      logger.info("getWageList+xgWageParam:{}", xgPerformancesubParam);
      PageInfo<XgPerformancesub>  performancesublist =null;
      try {
			//参数校验(人员代码、起止日期不能为空)
			String mesg=checkParam3(xgPerformancesubParam);
			if("".equals(mesg)) {
				performancesublist =xgWageService.getPerformancesubList(xgPerformancesubParam);
			}else
			{
				 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			return ResultVoUtil.fail("服务异常,请联系开发人员");
		}
      logger.info("getCoalList...end:{}",performancesublist);
      return ResultVoUtil.success(performancesublist);
  }
  
   /**
    * @description 查询已结绩效项目奖金信息明细
    * @param XgWageParam
    * @return ResultVo
    */
  @ApiOperation(value="查询已结绩效项目奖金信息明细", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgWageParam", value = "入参信息", dataType = "xgWageParam")
  @PostMapping("/queryPerformancesub1List")
  public ResultVo queryPerformancesub1List(@RequestBody XgPerformancesubParam xgPerformancesubParam){
      logger.info("getWageList+xgWageParam:{}", xgPerformancesubParam);
      PageInfo<XgPerformancesub>  performancesublist =null;
      try {
			//参数校验(人员代码、起止日期不能为空)
			String mesg=checkParam3(xgPerformancesubParam);
			if("".equals(mesg)) {
				performancesublist =xgWageService.getPerformancesub1List(xgPerformancesubParam);
			}else
			{
				 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			return ResultVoUtil.fail("服务异常,请联系开发人员");
		}
      logger.info("getCoalList...end:{}",performancesublist);
      return ResultVoUtil.success(performancesublist);
  }
   
   /**
    * @description 查询待结绩效项目奖金信息明细
    * @param XgWageParam
    * @return ResultVo
    */
  @ApiOperation(value="查询待结绩效项目奖金信息明细", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgWageParam", value = "入参信息", dataType = "xgWageParam")
  @PostMapping("/queryPerformancesub2List")
  public ResultVo queryPerformancesub2List(@RequestBody XgPerformancesubParam xgPerformancesubParam){
	   PageInfo<XgPerformancesub>  performancesublist =null;
	      try {
				//参数校验(人员代码、起止日期不能为空)
				String mesg=checkParam3(xgPerformancesubParam);
				if("".equals(mesg)) {
					performancesublist =xgWageService.getPerformancesub2List(xgPerformancesubParam);
				}else
				{
					 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
				}
			} catch (Exception e) {
				logger.info(e.getMessage());
				e.printStackTrace();
				return ResultVoUtil.fail("服务异常,请联系开发人员");
			}
	      logger.info("getCoalList...end:{}",performancesublist);
	      return ResultVoUtil.success(performancesublist);
  }
   
    /**
      * @description 查询薪酬信息
      * @param XgWageParam
      * @return ResultVo
      */
    @ApiOperation(value="查询薪酬信息", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgWageParam", value = "入参信息", dataType = "xgWageParam")
    @PostMapping("/queryWageList")
    public ResultVo queryWageList(@RequestBody XgWageParam xgWageParam){
        logger.info("getWageList+xgWageParam:{}", xgWageParam);
        PageInfo<XgWage>  wagelist =null;
        try {
			//参数校验(机构、团队、人员 这三个条件不能全为空)
			String mesg=checkParam(xgWageParam);
			if("".equals(mesg)) {
				wagelist =xgWageService.getWageList(xgWageParam);
			}else
			{
				 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			return ResultVoUtil.fail("服务异常,请联系开发人员");
		}
        logger.info("getCoalList...end:{}",wagelist);
        return ResultVoUtil.success(wagelist);
    }
    private String checkParam2(XgPerformanceParam xgPerformanceParam) {
    	String mesg="";
    	if(xgPerformanceParam==null) {
    		mesg="查询条件不能为空，或查询条件有误";
    	}
    	if(checkfiled(xgPerformanceParam.getUsercode())) {
    		mesg="人员编码不能为空！";
    	}
    	if(checkfiled(xgPerformanceParam.getStartdate())) {
    		mesg="统计起期不能为空！";
    	}
    	if(checkfiled(xgPerformanceParam.getEnddate())) {
    		mesg="统计止期不能为空！";
    	}
    	return mesg;
    }
    private String checkParam3(XgPerformancesubParam xgPerformancesubParam) {
    	String mesg="";
    	if(xgPerformancesubParam==null) {
    		mesg="查询条件不能为空，或查询条件有误";
    	}
    	if(checkfiled(xgPerformancesubParam.getUsercode())) {
    		mesg="人员编码不能为空！";
    	}
    	if(checkfiled(xgPerformancesubParam.getStartdate())) {
    		mesg="统计起期不能为空！";
    	}
    	if(checkfiled(xgPerformancesubParam.getEnddate())) {
    		mesg="统计止期不能为空！";
    	}
    	return mesg;
    }
    private String checkParam(XgWageParam xgWageParam) {
    	String mesg="";
    	if(xgWageParam==null) {
    		mesg="查询条件不能为空，或查询条件有误";
    	}


    	if(xgWageParam.getCalcdate()==null||"".equals(xgWageParam.getCalcdate())) {
    		mesg="发薪月不能为空！";
    	}
    	if(checkfiled(xgWageParam.getUsercode())
    			&&checkfiled(xgWageParam.getComcode())&&checkfiled(xgWageParam.getTeamcode())
    			) {
    		mesg="机构、团队、人员 这三个条件不能全为空";
    	}
    	
    	return mesg;
    }
    
    /**
      * @description 查看是否为空，
      * @param 
      * @return 空 ture
      */
    private boolean checkfiled(String filed) {
    	if(filed==null||"".equals(filed)) {
    		return true;
    	}

    	return false;
    }
}
