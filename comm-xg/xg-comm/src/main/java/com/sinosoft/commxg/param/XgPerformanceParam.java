package com.sinosoft.commxg.param;

import java.math.BigDecimal;

import com.sinosoft.commxg.dto.PageDto;

public class XgPerformanceParam  extends PageDto {
    /**
     * 人员编码
     */
    private String usercode;

    /**
     * 人员名称
     */
    private String username;
    /**
     * 起期
     */
    private String startdate;

    /**
     * 止期
     */
    private String enddate;
    /**
     * 总绩效
     */
    private BigDecimal perfAll;

    /**
     * 总项目奖金
     */
    private BigDecimal projAll;

    /**
     * 已结绩效
     */
    private BigDecimal perfFinal;

    /**
     * 已结项目奖金
     */
    private BigDecimal projFinal;

    /**
     * 待结绩效
     */
    private BigDecimal perf;

    /**
     * 待结项目奖金
     */
    private BigDecimal proj;

    /**
     * 人员编码
     * @return USERCODE 人员编码
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * 人员编码
     * @param usercode 人员编码
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * 人员名称
     * @return USERNAME 人员名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 人员名称
     * @param username 人员名称
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 总绩效
     * @return PERF_ALL 总绩效
     */
    public BigDecimal getPerfAll() {
        return perfAll;
    }

    /**
     * 总绩效
     * @param perfAll 总绩效
     */
    public void setPerfAll(BigDecimal perfAll) {
        this.perfAll = perfAll;
    }

    /**
     * 总项目奖金
     * @return PROJ_ALL 总项目奖金
     */
    public BigDecimal getProjAll() {
        return projAll;
    }

    /**
     * 总项目奖金
     * @param projAll 总项目奖金
     */
    public void setProjAll(BigDecimal projAll) {
        this.projAll = projAll;
    }

    /**
     * 已结绩效
     * @return PERF_FINAL 已结绩效
     */
    public BigDecimal getPerfFinal() {
        return perfFinal;
    }

    /**
     * 已结绩效
     * @param perfFinal 已结绩效
     */
    public void setPerfFinal(BigDecimal perfFinal) {
        this.perfFinal = perfFinal;
    }

    /**
     * 已结项目奖金
     * @return PROJ_FINAL 已结项目奖金
     */
    public BigDecimal getProjFinal() {
        return projFinal;
    }

    /**
     * 已结项目奖金
     * @param projFinal 已结项目奖金
     */
    public void setProjFinal(BigDecimal projFinal) {
        this.projFinal = projFinal;
    }

    /**
     * 待结绩效
     * @return PERF 待结绩效
     */
    public BigDecimal getPerf() {
        return perf;
    }

    /**
     * 待结绩效
     * @param perf 待结绩效
     */
    public void setPerf(BigDecimal perf) {
        this.perf = perf;
    }

    /**
     * 待结项目奖金
     * @return PROJ 待结项目奖金
     */
    public BigDecimal getProj() {
        return proj;
    }

    /**
     * 待结项目奖金
     * @param proj 待结项目奖金
     */
    public void setProj(BigDecimal proj) {
        this.proj = proj;
    }

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
}