package com.sinosoft.commxg.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dao.XgUserMapper;
import com.sinosoft.commxg.dto.XgUser;
import com.sinosoft.commxg.param.XgUserParam;
import com.sinosoft.commxg.service.XgUserService;

@Service
public class XgUserServiceImpl implements XgUserService {

    private Logger logger = LoggerFactory.getLogger(XgUserServiceImpl.class);
   
    @Autowired
    private XgUserMapper xgUserMapper;

    /**
     * @description 查询用户列表
     * @param CifCustomerCoalParam
     * @return List<XgUser>
     */
	@Override
	public PageInfo<XgUser> getUserList(XgUserParam xgUserParam)  throws Exception{
		PageInfo<XgUser> pageInfo_pageHelper = null;
		PageHelper.startPage(xgUserParam.getPageNum(), xgUserParam.getPageSize());
		
		List<XgUser> list=  xgUserMapper.selectByParam(xgUserParam);
		pageInfo_pageHelper = new PageInfo<XgUser>(list);
		
		
		return pageInfo_pageHelper;
	}

}
