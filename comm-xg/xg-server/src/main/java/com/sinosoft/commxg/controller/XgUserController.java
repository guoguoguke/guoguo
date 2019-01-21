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
import com.sinosoft.commxg.dto.XgUser;
import com.sinosoft.commxg.param.XgUserParam;
import com.sinosoft.commxg.service.XgUserService;
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
public class XgUserController {

    private Logger logger = LoggerFactory.getLogger(XgUserController.class);

    @Autowired
    private XgUserService xgUserService;


    /**
      * @description 查询销售人员信息
      * @param XgUserParam
      * @return ResultVo
      */
    @ApiOperation(value="查询销售人员信息", notes="根据入参获取详细信息")
	@ApiImplicitParam(name = "xgUserParam", value = "入参信息", dataType = "xgUserParam")
    @PostMapping("/queryUserList")
    public ResultVo queryUserList(@RequestBody XgUserParam xgUserParam){
        logger.info("getUserList+xgUserParam:{}", xgUserParam);
        PageInfo<XgUser>  userlist =null;
        try {
			//参数校验(机构、团队、人员 这三个条件不能全为空)
			String mesg=checkParam(xgUserParam);
			if("".equals(mesg)) {
				userlist =xgUserService.getUserList(xgUserParam);
			}else
			{
				 return ResultVoUtil.fail("1001","查询条件输入有误："+mesg);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			return ResultVoUtil.fail("服务异常,请联系开发人员");
		}
        logger.info("getCoalList...end:{}",userlist);
        return ResultVoUtil.success(userlist);
    }
    
    private String checkParam(XgUserParam xgUserParam) {
    	String mesg="";
    	if(xgUserParam==null) {
    		mesg="查询条件不能为空，或查询条件有误";
    	}
    	if(checkfiled(xgUserParam.getUsercode())&&checkfiled(xgUserParam.getUsername())&&checkfiled(xgUserParam.getIdentifyno())
    			&&checkfiled(xgUserParam.getComcode())&&checkfiled(xgUserParam.getTeamcode())
    			) {
    		mesg="机构、团队、人员、身份证这四个条件不能全为空";
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
