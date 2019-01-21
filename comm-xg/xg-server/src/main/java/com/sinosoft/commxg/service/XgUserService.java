package com.sinosoft.commxg.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dto.XgUser;
import com.sinosoft.commxg.param.XgUserParam;


/**
 * @author guoweisong
 * 
 *
 */
public interface XgUserService {
	

    /**
      * @description 查询用户列表
      * @param CifCustomerCoalParam
      * @return List<XgUser>
      */
    public PageInfo<XgUser>  getUserList(XgUserParam xgUserParam) throws Exception;
    

}
