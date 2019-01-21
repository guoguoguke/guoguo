package com.sinosoft.commxg.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class XgPerformancesub {
    /**
     * 机构编码
     */
    private String comcode;

    /**
     * 机构名称
     */
    private String comcname;

    /**
     * 团队编码
     */
    private String teamcode;

    /**
     * 团队名称
     */
    private String teamname;

    /**
     * 归属业务员编码
     */
    private String handler1code;

    /**
     * 归属业务员名称
     */
    private String username;

    /**
     * 保单号
     */
    private String policyno;

    /**
     * 业务单号
     */
    private String certino;
    
    /**
     * 收据号
     */
    private String contractno;


    /**
     * 险种编码
     */
    private String riskcode;

    /**
     * 险种名称
     */
    private String riskcname;

    /**
     * 起保日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd") 
    private Date startdate;

    /**
     * 签单日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd") 
    private Date signdate;

    /**
     * 实收日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd") 
    private Date payrefdate;

    /**
     * 实收金额
     */
    private BigDecimal payreffee;

    /**
     * 绩效比例
     */
    private BigDecimal performancerate;

    /**
     * 待结绩效
     */
    private BigDecimal performance;

    /**
     * 项目奖金比例
     */
    private BigDecimal projectrate;

    /**
     * 待结项目奖金
     */
    private BigDecimal projectvalue;

    /**
     * 总项目奖金
     */
    private BigDecimal projectvalueAll;

    /**
     * 已结项目奖金
     */
    private BigDecimal projectvalueFinal;

    /**
     * 总绩效
     */
    private BigDecimal performanceAll;

    /**
     * 已结绩效
     */
    private BigDecimal performanceFinal;

    /**
     * 机构编码
     * @return COMCODE 机构编码
     */
    public String getComcode() {
        return comcode;
    }

    /**
     * 机构编码
     * @param comcode 机构编码
     */
    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    /**
     * 机构名称
     * @return COMCNAME 机构名称
     */
    public String getComcname() {
        return comcname;
    }

    /**
     * 机构名称
     * @param comcname 机构名称
     */
    public void setComcname(String comcname) {
        this.comcname = comcname == null ? null : comcname.trim();
    }

    /**
     * 团队编码
     * @return TEAMCODE 团队编码
     */
    public String getTeamcode() {
        return teamcode;
    }

    /**
     * 团队编码
     * @param teamcode 团队编码
     */
    public void setTeamcode(String teamcode) {
        this.teamcode = teamcode == null ? null : teamcode.trim();
    }

    /**
     * 团队名称
     * @return TEAMNAME 团队名称
     */
    public String getTeamname() {
        return teamname;
    }

    /**
     * 团队名称
     * @param teamname 团队名称
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    /**
     * 归属业务员编码
     * @return HANDLER1CODE 归属业务员编码
     */
    public String getHandler1code() {
        return handler1code;
    }

    /**
     * 归属业务员编码
     * @param handler1code 归属业务员编码
     */
    public void setHandler1code(String handler1code) {
        this.handler1code = handler1code == null ? null : handler1code.trim();
    }

    /**
     * 归属业务员名称
     * @return USERNAME 归属业务员名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 归属业务员名称
     * @param username 归属业务员名称
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 保单号
     * @return POLICYNO 保单号
     */
    public String getPolicyno() {
        return policyno;
    }

    /**
     * 保单号
     * @param policyno 保单号
     */
    public void setPolicyno(String policyno) {
        this.policyno = policyno == null ? null : policyno.trim();
    }

    /**
     * 业务单号
     * @return CERTINO 业务单号
     */
    public String getCertino() {
        return certino;
    }

    /**
     * 业务单号
     * @param certino 业务单号
     */
    public void setCertino(String certino) {
        this.certino = certino == null ? null : certino.trim();
    }

    /**
     * 险种编码
     * @return RISKCODE 险种编码
     */
    public String getRiskcode() {
        return riskcode;
    }

    /**
     * 险种编码
     * @param riskcode 险种编码
     */
    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode == null ? null : riskcode.trim();
    }

    /**
     * 险种名称
     * @return RISKCNAME 险种名称
     */
    public String getRiskcname() {
        return riskcname;
    }

    /**
     * 险种名称
     * @param riskcname 险种名称
     */
    public void setRiskcname(String riskcname) {
        this.riskcname = riskcname == null ? null : riskcname.trim();
    }


	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	/**
     * 签单日期
     * @return SIGNDATE 签单日期
     */
    public Date getSigndate() {
        return signdate;
    }

    /**
     * 签单日期
     * @param signdate 签单日期
     */
    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    /**
     * 实收日期
     * @return PAYREFDATE 实收日期
     */
    public Date getPayrefdate() {
        return payrefdate;
    }

    /**
     * 实收日期
     * @param payrefdate 实收日期
     */
    public void setPayrefdate(Date payrefdate) {
        this.payrefdate = payrefdate;
    }

    /**
     * 实收金额
     * @return PAYREFFEE 实收金额
     */
    public BigDecimal getPayreffee() {
        return payreffee;
    }

    /**
     * 实收金额
     * @param payreffee 实收金额
     */
    public void setPayreffee(BigDecimal payreffee) {
        this.payreffee = payreffee;
    }

    /**
     * 绩效比例
     * @return PERFORMANCERATE 绩效比例
     */
    public BigDecimal getPerformancerate() {
        return performancerate;
    }

    /**
     * 绩效比例
     * @param performancerate 绩效比例
     */
    public void setPerformancerate(BigDecimal performancerate) {
        this.performancerate = performancerate;
    }

    /**
     * 待结绩效
     * @return PERFORMANCE 待结绩效
     */
    public BigDecimal getPerformance() {
        return performance;
    }

    /**
     * 待结绩效
     * @param performance 待结绩效
     */
    public void setPerformance(BigDecimal performance) {
        this.performance = performance;
    }

    /**
     * 项目奖金比例
     * @return PROJECTRATE 项目奖金比例
     */
    public BigDecimal getProjectrate() {
        return projectrate;
    }

    /**
     * 项目奖金比例
     * @param projectrate 项目奖金比例
     */
    public void setProjectrate(BigDecimal projectrate) {
        this.projectrate = projectrate;
    }

    /**
     * 待结项目奖金
     * @return PROJECTVALUE 待结项目奖金
     */
    public BigDecimal getProjectvalue() {
        return projectvalue;
    }

    /**
     * 待结项目奖金
     * @param projectvalue 待结项目奖金
     */
    public void setProjectvalue(BigDecimal projectvalue) {
        this.projectvalue = projectvalue;
    }

    /**
     * 总项目奖金
     * @return PROJECTVALUE_ALL 总项目奖金
     */
    public BigDecimal getProjectvalueAll() {
        return projectvalueAll;
    }

    /**
     * 总项目奖金
     * @param projectvalueAll 总项目奖金
     */
    public void setProjectvalueAll(BigDecimal projectvalueAll) {
        this.projectvalueAll = projectvalueAll;
    }

    /**
     * 已结项目奖金
     * @return PROJECTVALUE_FINAL 已结项目奖金
     */
    public BigDecimal getProjectvalueFinal() {
        return projectvalueFinal;
    }

    /**
     * 已结项目奖金
     * @param projectvalueFinal 已结项目奖金
     */
    public void setProjectvalueFinal(BigDecimal projectvalueFinal) {
        this.projectvalueFinal = projectvalueFinal;
    }

    /**
     * 总绩效
     * @return PERFORMANCE_ALL 总绩效
     */
    public BigDecimal getPerformanceAll() {
        return performanceAll;
    }

    /**
     * 总绩效
     * @param performanceAll 总绩效
     */
    public void setPerformanceAll(BigDecimal performanceAll) {
        this.performanceAll = performanceAll;
    }

    /**
     * 已结绩效
     * @return PERFORMANCE_FINAL 已结绩效
     */
    public BigDecimal getPerformanceFinal() {
        return performanceFinal;
    }

    /**
     * 已结绩效
     * @param performanceFinal 已结绩效
     */
    public void setPerformanceFinal(BigDecimal performanceFinal) {
        this.performanceFinal = performanceFinal;
    }

	public String getContractno() {
		return contractno;
	}

	public void setContractno(String contractno) {
		this.contractno = contractno;
	}
}