package com.sinosoft.commxg.dao;

import com.sinosoft.commxg.dto.XgUser;
import com.sinosoft.commxg.param.XgUserParam;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface XgUserMapper {

    /**
     * 
     * description:selectByExample
     * @author:  guoweisong
     * @date: 2018-09-06
     * @since: 1.0
     */
    List<XgUser> selectByParam(XgUserParam xgUserParam);


}