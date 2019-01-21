package com.sinosoft.commxg.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dao.XgAgentMapper;
import com.sinosoft.commxg.dto.XgAgent;
import com.sinosoft.commxg.param.XgAgentParam;
import com.sinosoft.commxg.service.XgAgentService;

@Service
public class XgAgentServiceImpl implements XgAgentService {

    private Logger logger = LoggerFactory.getLogger(XgAgentServiceImpl.class);
   
    @Autowired
    private XgAgentMapper xgAgentMapper;

    /**
     * @description 查询用户列表
     * @param XgAgentParam
     * @return List<XgAgent>
     */
	@Override
	public PageInfo<XgAgent> getAgentList(XgAgentParam xgAgentParam)  throws Exception{
		PageInfo<XgAgent> pageInfo_pageHelper = null;
		PageHelper.startPage(xgAgentParam.getPageNum(), xgAgentParam.getPageSize());
		
		List<XgAgent> list=  xgAgentMapper.selectByParam(xgAgentParam);
		pageInfo_pageHelper = new PageInfo<XgAgent>(list);
		
		
		return pageInfo_pageHelper;
	}

}
