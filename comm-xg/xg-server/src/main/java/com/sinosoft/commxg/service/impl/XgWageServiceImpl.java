package com.sinosoft.commxg.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sinosoft.commxg.dao.XgPerformanceMapper;
import com.sinosoft.commxg.dao.XgPerformancesubMapper;
import com.sinosoft.commxg.dao.XgUserMapper;
import com.sinosoft.commxg.dao.XgWageMapper;
import com.sinosoft.commxg.dto.XgPerformance;
import com.sinosoft.commxg.dto.XgPerformancesub;
import com.sinosoft.commxg.dto.XgUser;
import com.sinosoft.commxg.dto.XgWage;
import com.sinosoft.commxg.param.XgPerformanceParam;
import com.sinosoft.commxg.param.XgPerformancesubParam;
import com.sinosoft.commxg.param.XgUserParam;
import com.sinosoft.commxg.param.XgWageParam;
import com.sinosoft.commxg.service.XgWageService;

/**
 * @author guoweisong
 *
 */
/**
 * @author guoweisong
 *
 */
@Service
public class XgWageServiceImpl implements XgWageService {

    private Logger logger = LoggerFactory.getLogger(XgWageServiceImpl.class);
   
    
    
    @Autowired
    private XgWageMapper xgWageMapper;
    @Autowired
    private XgPerformanceMapper xgPerformanceMapper;
    @Autowired
    private XgUserMapper xgUserMapper;
    
    @Autowired
    private XgPerformancesubMapper xgPerformancesubMapper;
    
    
    /**
     * @description 查询待结、已结绩效
     * @param CifCustomerCoalParam
     * @return List<XgWage>
     */
    @Override
	public PageInfo<XgPerformance> getPerformanceList(XgPerformanceParam xgPerformanceParam) throws Exception {
		
    	PageInfo<XgPerformance> pageInfo_pageHelper = null;
		PageHelper.startPage(xgPerformanceParam.getPageNum(), xgPerformanceParam.getPageSize());
		List<XgPerformance> returnList=new ArrayList<XgPerformance>();
		List<XgPerformance> list=  xgPerformanceMapper.selectByParam(xgPerformanceParam);
		XgPerformance xgPerformance=new XgPerformance();
		if(list.size()>0) {
			xgPerformance=list.get(0);
			
			XgUserParam xgUserParam=new XgUserParam();
			xgUserParam.setUsercode(xgPerformanceParam.getUsercode());
			List<XgUser> userlist=  xgUserMapper.selectByParam(xgUserParam);
			if(userlist.size()>0) {
				xgPerformance.setUsercode(userlist.get(0).getUsercode());
				xgPerformance.setUsername(userlist.get(0).getUsername());
			}
			xgPerformance.setStartdate(xgPerformanceParam.getStartdate());
			xgPerformance.setEnddate(xgPerformanceParam.getEnddate());
		}
		
		returnList.add(xgPerformance);
		
		pageInfo_pageHelper = new PageInfo<XgPerformance>(returnList);
		
		return pageInfo_pageHelper;
	} 
    
    /**
     * @description 查询总绩效项目奖金明细
     * @param CifCustomerCoalParam
     * @return List<XgWage>
     */
	@Override
	public PageInfo<XgPerformancesub> getPerformancesubList(XgPerformancesubParam xgPerformancesubParam) {
		
		PageInfo<XgPerformancesub> pageInfo_pageHelper = null;
		PageHelper.startPage(xgPerformancesubParam.getPageNum(), xgPerformancesubParam.getPageSize());
		List<XgPerformancesub> list=  xgPerformancesubMapper.selectByParam(xgPerformancesubParam);

		pageInfo_pageHelper = new PageInfo<XgPerformancesub>(list);
		
		return pageInfo_pageHelper;
	}
	
    /**
     * @description 查询已结绩效项目奖金明细
     * @param CifCustomerCoalParam
     * @return List<XgWage>
     */
	@Override
	public PageInfo<XgPerformancesub> getPerformancesub1List(XgPerformancesubParam xgPerformancesubParam) {
		
		PageInfo<XgPerformancesub> pageInfo_pageHelper = null;
		PageHelper.startPage(xgPerformancesubParam.getPageNum(), xgPerformancesubParam.getPageSize());
		List<XgPerformancesub> list=  xgPerformancesubMapper.selectByParam1(xgPerformancesubParam);

		pageInfo_pageHelper = new PageInfo<XgPerformancesub>(list);
		
		return pageInfo_pageHelper;
	}


	/**
     * @description 查询待结绩效项目奖金明细
     * @param CifCustomerCoalParam
     * @return List<XgWage>
     */
	@Override
	public PageInfo<XgPerformancesub> getPerformancesub2List(XgPerformancesubParam xgPerformancesubParam) {
		PageInfo<XgPerformancesub> pageInfo_pageHelper = null;
		PageHelper.startPage(xgPerformancesubParam.getPageNum(), xgPerformancesubParam.getPageSize());
		List<XgPerformancesub> list=  xgPerformancesubMapper.selectByParam2(xgPerformancesubParam);

		pageInfo_pageHelper = new PageInfo<XgPerformancesub>(list);
		
		return pageInfo_pageHelper;
	}

    
    /**
     * @description 查询薪酬列表
     * @param CifCustomerCoalParam
     * @return List<XgWage>
     */
	@Override
	public PageInfo<XgWage> getWageList(XgWageParam xgWageParam)  throws Exception{
		PageInfo<XgWage> pageInfo_pageHelper = null;
		PageHelper.startPage(xgWageParam.getPageNum(), xgWageParam.getPageSize());
		List<XgWage> returnList=new ArrayList<XgWage>();
		List<XgWage> list=  xgWageMapper.selectByParam(xgWageParam);
		Iterator iterator=list.iterator();
		XgWageParam param=new XgWageParam();
		
		while (iterator.hasNext()) 
		{
			XgWage xgWageDto = (XgWage) iterator.next();
			
			param.setCalcdate(xgWageParam.getCalcdate());
			param.setUsercode(xgWageDto.getUsercode());
			
			xgWageDto.setCalcdate(xgWageParam.getCalcdate());
			//xgWageDto中设置工资项的数值
			generateWageDto( param, xgWageDto);
			
			returnList.add(xgWageDto);
		}
		
		pageInfo_pageHelper = new PageInfo<XgWage>(returnList);
		
		
		return pageInfo_pageHelper;
	}
	/**
     * @description 查询薪酬明细功能方法
     * @param CifCustomerCoalParam
     * @return void
     */
	private void generateWageDto(XgWageParam param,XgWage xgWageDto) {
		
		XgWage xgWage_idx =new XgWage();
		
		param.setIndexno("SAWAG0002");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		
		xgWageDto.setSawag0002(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0027");
		xgWage_idx =xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0027(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0007");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0007(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0089");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0089(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0109");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0109(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0111");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0111(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());

		param.setIndexno("SAWAG0112");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0112(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0012");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0012(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());

		param.setIndexno("SAWAG0013");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0013(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0014");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0014(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0015");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0015(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0016");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0016(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0017");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0017(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0019");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0019(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0020");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0020(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0021");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0021(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0022");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0022(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0025");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0025(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0026");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0026(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0027");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0027(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0028");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0028(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0029");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0029(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0030");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0030(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0031");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0031(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0032");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0032(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0033");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0033(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0034");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0034(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0003");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0003(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0006");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0006(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0007");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0007(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0008");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0008(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0009");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0009(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0011");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0011(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0012");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0012(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0013");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0013(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0014");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0014(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0015");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0015(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0016");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0016(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0017");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0017(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0018");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0018(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0020");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0020(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0021");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0021(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0022");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0022(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0023");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0023(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0024");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0024(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0025");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0025(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0029");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0029(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0030");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0030(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("WAG0031");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setWag0031(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		param.setIndexno("SAWAG0104");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0104(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		
		
		param.setIndexno("SAWAG0107");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		BigDecimal value107=xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue();
		param.setIndexno("SAWAG0102");//个税=个税+年终奖税+经济补偿金税
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0102(xgWageDto.getSawag0111().add(value107).add(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue()));
		
		
		param.setIndexno("SAWAG0200");
		xgWage_idx=xgWageMapper.selectvalueByindex(param);
		xgWageDto.setSawag0200(xgWage_idx==null?new BigDecimal(0):xgWage_idx.getIndexvalue());
		//应发工资=总工资+个税+扣税不发薪+个人社保
		BigDecimal peoplefee=xgWageDto.getSawag0013().add(xgWageDto.getSawag0015()).add(xgWageDto.getSawag0017()).add(xgWageDto.getSawag0022())
				.add(xgWageDto.getSawag0025()).add(xgWageDto.getSawag0027()).add(xgWageDto.getSawag0029()).add(xgWageDto.getSawag0031());
		BigDecimal value=xgWageDto.getSawag0200().add(xgWageDto.getSawag0102()).add(xgWageDto.getWag0025()).add(peoplefee);
		xgWageDto.setSawag0105(value);
	}





	

}
