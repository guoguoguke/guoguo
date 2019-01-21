package com.sinosoft.commxg.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dto.XgAgent;
import com.sinosoft.commxg.param.XgAgentParam;
import com.sinosoft.commxg.service.XgAgentService;
import com.sinosoft.commxg.utils.ResultVoUtil;
import com.sinosoft.commxg.vo.ResultVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;




@Api("代理人员查询接口")
@RestController
@RequestMapping("/sales")
public class XgAgentController {

    private Logger logger = LoggerFactory.getLogger(XgAgentController.class);

    @Autowired
    private XgAgentService xgAgentService;


    
    /**
      * @description 
      * @param 
      * @return
      */
    @ApiOperation(value="查询代理人员信息", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgAgentParam", value = "入参信息", dataType = "xgAgentParam")
    @PostMapping("/queryAgentList")
    public ResultVo queryAgentList(@RequestBody XgAgentParam xgAgentParam){
        logger.info("getAgentList+xgAgentParam:{}", xgAgentParam);
        PageInfo<XgAgent>  agentlist =null;
        try {
			//参数校验(机构编码、代理编码、代理名称、资格证号、身份证号  条件不能全为空)
			String mesg=checkParam(xgAgentParam);
			if("".equals(mesg)) {
				agentlist =xgAgentService.getAgentList(xgAgentParam);
			}else
			{
				 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			return ResultVoUtil.fail("服务异常,请联系开发人员");
		}
        logger.info("getCoalList...end:{}",agentlist);
        return ResultVoUtil.success(agentlist);
    }
    
    private String checkParam(XgAgentParam xgAgentParam) {
    	String mesg="";
    	if(xgAgentParam==null) {
    		mesg="查询条件不能为空，或查询条件有误";
    	}
    	if(checkfiled(xgAgentParam.getAgentcode())&&checkfiled(xgAgentParam.getAgentname())
    			&&checkfiled(xgAgentParam.getComcode())&&checkfiled(xgAgentParam.getSfPermitno())
    			&&checkfiled(xgAgentParam.getZgPermitno())
    			) {
    		mesg="机构编码、代理编码、代理名称、资格证号、身份证号 这些条件不能全为空";
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
