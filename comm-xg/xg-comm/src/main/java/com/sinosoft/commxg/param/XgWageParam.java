package com.sinosoft.commxg.param;

import java.math.BigDecimal;
import java.util.Date;

import com.sinosoft.commxg.dto.PageDto;

public class XgWageParam extends PageDto{
    /**
     * 人员代码
     */
    private String usercode;

    /**
     * 发薪月份
     */
    private String calcdate;

    /**
     * 机构代码
     */
    private String comcode;

    /**
     * 机构名称
     */
    private String comname;

    /**
     * 团队代码
     */
    private String teamcode;

    /**
     * 团队名称
     */
    private String teamname;

    /**
     * 渠道
     */
    private String teamlevelid;

    /**
     * 人员名称
     */
    private String username;

    /**
     * 岗位（角色）
     */
    private String usergw;
    /**
     * 薪酬项
     */
    private String indexno;
    /**
     * 薪酬值
     */
    private BigDecimal indexvalue;
    
    /**
     * 内外勤标识（A 内勤 ，B 外勤）
     */
    private String persontype;
    /**
     * 是否劳务派遣（0 否，1 是）
     */
    private String userflag;

    
    /**
     * 绩效工资
     */
    private BigDecimal sawag0002;

    /**
     * 项目奖金
     */
    private BigDecimal wag0027;

    /**
     * 基本工资
     */
    private BigDecimal sawag0007;

    /**
     * 应发年终奖
     */
    private BigDecimal sawag0089;

    /**
     * 应发经济补偿金
     */
    private BigDecimal sawag0109;
    /**
     *应发经济补偿金税额
     */
    private BigDecimal sawag0111;
    /**
     * 实发经济补偿金
     */
    private BigDecimal sawag0112;

    /**
     * 养老保险单位缴费
     */
    private BigDecimal sawag0012;

    /**
     * 养老保险个人缴费
     */
    private BigDecimal sawag0013;

    /**
     * 医疗保险单位缴费
     */
    private BigDecimal sawag0014;

    /**
     * 医疗保险个人缴费
     */
    private BigDecimal sawag0015;

    /**
     * 失业保险单位缴费
     */
    private BigDecimal sawag0016;

    /**
     * 失业保险个人缴费
     */
    private BigDecimal sawag0017;

    /**
     * 生育保险单位缴费
     */
    private BigDecimal sawag0019;

    /**
     * 工伤保险单位缴费
     */
    private BigDecimal sawag0020;

    /**
     * 住房公积金单位缴费
     */
    private BigDecimal sawag0021;

    /**
     * 住房公积金个人缴费
     */
    private BigDecimal sawag0022;

    /**
     * 医疗保险(个人补缴)
     */
    private BigDecimal sawag0025;

    /**
     * 医疗保险(单位补缴)
     */
    private BigDecimal sawag0026;

    /**
     * 失业保险(个人补缴)
     */
    private BigDecimal sawag0027;

    /**
     * 失业保险(单位补缴)
     */
    private BigDecimal sawag0028;

    /**
     * 住房公积金(个人补缴)
     */
    private BigDecimal sawag0029;

    /**
     * 住房公积金(单位补缴)
     */
    private BigDecimal sawag0030;

    /**
     * 养老保险(个人补缴)
     */
    private BigDecimal sawag0031;

    /**
     * 养老保险(单位补缴)
     */
    private BigDecimal sawag0032;

    /**
     * 工伤保险(单位补缴)
     */
    private BigDecimal sawag0033;

    /**
     * 生育保险(单位补缴)
     */
    private BigDecimal sawag0034;

    /**
     * 季度奖
     */
    private BigDecimal wag0003;

    /**
     * 取暖补贴
     */
    private BigDecimal wag0006;

    /**
     * 防暑补贴
     */
    private BigDecimal wag0007;

    /**
     * 浮动月薪
     */
    private BigDecimal wag0008;

    /**
     * 基本工资调整
     */
    private BigDecimal wag0009;

    /**
     * 独生子女津贴
     */
    private BigDecimal wag0011;

    /**
     * 节日津贴
     */
    private BigDecimal wag0012;

    /**
     * 早退扣款
     */
    private BigDecimal wag0013;

    /**
     * 事假扣款
     */
    private BigDecimal wag0014;

    /**
     * 迟到扣款
     */
    private BigDecimal wag0015;

    /**
     * 病假扣款
     */
    private BigDecimal wag0016;

    /**
     * 旷工扣款
     */
    private BigDecimal wag0017;

    /**
     * 处罚扣款
     */
    private BigDecimal wag0018;

    /**
     * 交通补贴
     */
    private BigDecimal wag0020;

    /**
     * 住房补贴
     */
    private BigDecimal wag0021;

    /**
     * 误餐补贴
     */
    private BigDecimal wag0022;

    /**
     * 通讯补贴
     */
    private BigDecimal wag0023;

    /**
     * 其他福利
     */
    private BigDecimal wag0024;

    /**
     * 扣税不发薪
     */
    private BigDecimal wag0025;

    /**
     * 其他奖金
     */
    private BigDecimal wag0029;

    /**
     * 激励费
     */
    private BigDecimal wag0030;

    /**
     * 其他绩效
     */
    private BigDecimal wag0031;
   
    /**
     * 应税收入
     */
    private BigDecimal sawag0104;
    /**
     * 应发工资
     */
    private BigDecimal sawag0105;
    
    /**
     * 个人所得税
     */
    private BigDecimal sawag0102;

    /**
     * 总工资
     */
    private BigDecimal sawag0200;

    /**
     * 人员代码
     * @return USERCODE 人员代码
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * 人员代码
     * @param usercode 人员代码
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * 发薪月份
     * @return CALCDATE 发薪月份
     */
    public String getCalcdate() {
        return calcdate;
    }

    /**
     * 发薪月份
     * @param calcdate 发薪月份
     */
    public void setCalcdate(String calcdate) {
        this.calcdate = calcdate;
    }

    /**
     * 机构代码
     * @return COMCODE 机构代码
     */
    public String getComcode() {
        return comcode;
    }

    /**
     * 机构代码
     * @param comcode 机构代码
     */
    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    /**
     * 机构名称
     * @return COMNAME 机构名称
     */
    public String getComname() {
        return comname;
    }

    /**
     * 机构名称
     * @param comname 机构名称
     */
    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    /**
     * 团队代码
     * @return TEAMCODE 团队代码
     */
    public String getTeamcode() {
        return teamcode;
    }

    /**
     * 团队代码
     * @param teamcode 团队代码
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
     * 渠道
     * @return TEAMLEVELID 渠道
     */
    public String getTeamlevelid() {
        return teamlevelid;
    }

    /**
     * 渠道
     * @param teamlevelid 渠道
     */
    public void setTeamlevelid(String teamlevelid) {
        this.teamlevelid = teamlevelid == null ? null : teamlevelid.trim();
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
     * 岗位（角色）
     * @return USERGW 岗位（角色）
     */
    public String getUsergw() {
        return usergw;
    }

    /**
     * 岗位（角色）
     * @param usergw 岗位（角色）
     */
    public void setUsergw(String usergw) {
        this.usergw = usergw == null ? null : usergw.trim();
    }

    /**
     * 绩效工资
     * @return SAWAG0002 绩效工资
     */
    public BigDecimal getSawag0002() {
        return sawag0002;
    }

    /**
     * 绩效工资
     * @param sawag0002 绩效工资
     */
    public void setSawag0002(BigDecimal sawag0002) {
        this.sawag0002 = sawag0002;
    }

    /**
     * 项目奖金
     * @return WAG0027 项目奖金
     */
    public BigDecimal getWag0027() {
        return wag0027;
    }

    /**
     * 项目奖金
     * @param wag0027 项目奖金
     */
    public void setWag0027(BigDecimal wag0027) {
        this.wag0027 = wag0027;
    }

    /**
     * 基本工资
     * @return SAWAG0007 基本工资
     */
    public BigDecimal getSawag0007() {
        return sawag0007;
    }

    /**
     * 基本工资
     * @param sawag0007 基本工资
     */
    public void setSawag0007(BigDecimal sawag0007) {
        this.sawag0007 = sawag0007;
    }

    /**
     * 应发年终奖
     * @return SAWAG0089 应发年终奖
     */
    public BigDecimal getSawag0089() {
        return sawag0089;
    }

    /**
     * 应发年终奖
     * @param sawag0089 应发年终奖
     */
    public void setSawag0089(BigDecimal sawag0089) {
        this.sawag0089 = sawag0089;
    }

    /**
     * 应发经济补偿金
     * @return SAWAG0109 应发经济补偿金
     */
    public BigDecimal getSawag0109() {
        return sawag0109;
    }

    /**
     * 应发经济补偿金
     * @param sawag0109 应发经济补偿金
     */
    public void setSawag0109(BigDecimal sawag0109) {
        this.sawag0109 = sawag0109;
    }

    /**
     * 养老保险单位缴费
     * @return SAWAG0012 养老保险单位缴费
     */
    public BigDecimal getSawag0012() {
        return sawag0012;
    }

    /**
     * 养老保险单位缴费
     * @param sawag0012 养老保险单位缴费
     */
    public void setSawag0012(BigDecimal sawag0012) {
        this.sawag0012 = sawag0012;
    }

    /**
     * 养老保险个人缴费
     * @return SAWAG0013 养老保险个人缴费
     */
    public BigDecimal getSawag0013() {
        return sawag0013;
    }

    /**
     * 养老保险个人缴费
     * @param sawag0013 养老保险个人缴费
     */
    public void setSawag0013(BigDecimal sawag0013) {
        this.sawag0013 = sawag0013;
    }

    /**
     * 医疗保险单位缴费
     * @return SAWAG0014 医疗保险单位缴费
     */
    public BigDecimal getSawag0014() {
        return sawag0014;
    }

    /**
     * 医疗保险单位缴费
     * @param sawag0014 医疗保险单位缴费
     */
    public void setSawag0014(BigDecimal sawag0014) {
        this.sawag0014 = sawag0014;
    }

    /**
     * 医疗保险个人缴费
     * @return SAWAG0015 医疗保险个人缴费
     */
    public BigDecimal getSawag0015() {
        return sawag0015;
    }

    /**
     * 医疗保险个人缴费
     * @param sawag0015 医疗保险个人缴费
     */
    public void setSawag0015(BigDecimal sawag0015) {
        this.sawag0015 = sawag0015;
    }

    /**
     * 失业保险单位缴费
     * @return SAWAG0016 失业保险单位缴费
     */
    public BigDecimal getSawag0016() {
        return sawag0016;
    }

    /**
     * 失业保险单位缴费
     * @param sawag0016 失业保险单位缴费
     */
    public void setSawag0016(BigDecimal sawag0016) {
        this.sawag0016 = sawag0016;
    }

    /**
     * 失业保险个人缴费
     * @return SAWAG0017 失业保险个人缴费
     */
    public BigDecimal getSawag0017() {
        return sawag0017;
    }

    /**
     * 失业保险个人缴费
     * @param sawag0017 失业保险个人缴费
     */
    public void setSawag0017(BigDecimal sawag0017) {
        this.sawag0017 = sawag0017;
    }

    /**
     * 生育保险单位缴费
     * @return SAWAG0019 生育保险单位缴费
     */
    public BigDecimal getSawag0019() {
        return sawag0019;
    }

    /**
     * 生育保险单位缴费
     * @param sawag0019 生育保险单位缴费
     */
    public void setSawag0019(BigDecimal sawag0019) {
        this.sawag0019 = sawag0019;
    }

    /**
     * 工伤保险单位缴费
     * @return SAWAG0020 工伤保险单位缴费
     */
    public BigDecimal getSawag0020() {
        return sawag0020;
    }

    /**
     * 工伤保险单位缴费
     * @param sawag0020 工伤保险单位缴费
     */
    public void setSawag0020(BigDecimal sawag0020) {
        this.sawag0020 = sawag0020;
    }

    /**
     * 住房公积金单位缴费
     * @return SAWAG0021 住房公积金单位缴费
     */
    public BigDecimal getSawag0021() {
        return sawag0021;
    }

    /**
     * 住房公积金单位缴费
     * @param sawag0021 住房公积金单位缴费
     */
    public void setSawag0021(BigDecimal sawag0021) {
        this.sawag0021 = sawag0021;
    }

    /**
     * 住房公积金个人缴费
     * @return SAWAG0022 住房公积金个人缴费
     */
    public BigDecimal getSawag0022() {
        return sawag0022;
    }

    /**
     * 住房公积金个人缴费
     * @param sawag0022 住房公积金个人缴费
     */
    public void setSawag0022(BigDecimal sawag0022) {
        this.sawag0022 = sawag0022;
    }

    /**
     * 医疗保险(个人补缴)
     * @return SAWAG0025 医疗保险(个人补缴)
     */
    public BigDecimal getSawag0025() {
        return sawag0025;
    }

    /**
     * 医疗保险(个人补缴)
     * @param sawag0025 医疗保险(个人补缴)
     */
    public void setSawag0025(BigDecimal sawag0025) {
        this.sawag0025 = sawag0025;
    }

    /**
     * 医疗保险(单位补缴)
     * @return SAWAG0026 医疗保险(单位补缴)
     */
    public BigDecimal getSawag0026() {
        return sawag0026;
    }

    /**
     * 医疗保险(单位补缴)
     * @param sawag0026 医疗保险(单位补缴)
     */
    public void setSawag0026(BigDecimal sawag0026) {
        this.sawag0026 = sawag0026;
    }

    /**
     * 失业保险(个人补缴)
     * @return SAWAG0027 失业保险(个人补缴)
     */
    public BigDecimal getSawag0027() {
        return sawag0027;
    }

    /**
     * 失业保险(个人补缴)
     * @param sawag0027 失业保险(个人补缴)
     */
    public void setSawag0027(BigDecimal sawag0027) {
        this.sawag0027 = sawag0027;
    }

    /**
     * 失业保险(单位补缴)
     * @return SAWAG0028 失业保险(单位补缴)
     */
    public BigDecimal getSawag0028() {
        return sawag0028;
    }

    /**
     * 失业保险(单位补缴)
     * @param sawag0028 失业保险(单位补缴)
     */
    public void setSawag0028(BigDecimal sawag0028) {
        this.sawag0028 = sawag0028;
    }

    /**
     * 住房公积金(个人补缴)
     * @return SAWAG0029 住房公积金(个人补缴)
     */
    public BigDecimal getSawag0029() {
        return sawag0029;
    }

    /**
     * 住房公积金(个人补缴)
     * @param sawag0029 住房公积金(个人补缴)
     */
    public void setSawag0029(BigDecimal sawag0029) {
        this.sawag0029 = sawag0029;
    }

    /**
     * 住房公积金(单位补缴)
     * @return SAWAG0030 住房公积金(单位补缴)
     */
    public BigDecimal getSawag0030() {
        return sawag0030;
    }

    /**
     * 住房公积金(单位补缴)
     * @param sawag0030 住房公积金(单位补缴)
     */
    public void setSawag0030(BigDecimal sawag0030) {
        this.sawag0030 = sawag0030;
    }

    /**
     * 养老保险(个人补缴)
     * @return SAWAG0031 养老保险(个人补缴)
     */
    public BigDecimal getSawag0031() {
        return sawag0031;
    }

    /**
     * 养老保险(个人补缴)
     * @param sawag0031 养老保险(个人补缴)
     */
    public void setSawag0031(BigDecimal sawag0031) {
        this.sawag0031 = sawag0031;
    }

    /**
     * 养老保险(单位补缴)
     * @return SAWAG0032 养老保险(单位补缴)
     */
    public BigDecimal getSawag0032() {
        return sawag0032;
    }

    /**
     * 养老保险(单位补缴)
     * @param sawag0032 养老保险(单位补缴)
     */
    public void setSawag0032(BigDecimal sawag0032) {
        this.sawag0032 = sawag0032;
    }

    /**
     * 工伤保险(单位补缴)
     * @return SAWAG0033 工伤保险(单位补缴)
     */
    public BigDecimal getSawag0033() {
        return sawag0033;
    }

    /**
     * 工伤保险(单位补缴)
     * @param sawag0033 工伤保险(单位补缴)
     */
    public void setSawag0033(BigDecimal sawag0033) {
        this.sawag0033 = sawag0033;
    }

    /**
     * 生育保险(单位补缴)
     * @return SAWAG0034 生育保险(单位补缴)
     */
    public BigDecimal getSawag0034() {
        return sawag0034;
    }

    /**
     * 生育保险(单位补缴)
     * @param sawag0034 生育保险(单位补缴)
     */
    public void setSawag0034(BigDecimal sawag0034) {
        this.sawag0034 = sawag0034;
    }

    /**
     * 季度奖
     * @return WAG0003 季度奖
     */
    public BigDecimal getWag0003() {
        return wag0003;
    }

    /**
     * 季度奖
     * @param wag0003 季度奖
     */
    public void setWag0003(BigDecimal wag0003) {
        this.wag0003 = wag0003;
    }

    /**
     * 取暖补贴
     * @return WAG0006 取暖补贴
     */
    public BigDecimal getWag0006() {
        return wag0006;
    }

    /**
     * 取暖补贴
     * @param wag0006 取暖补贴
     */
    public void setWag0006(BigDecimal wag0006) {
        this.wag0006 = wag0006;
    }

    /**
     * 防暑补贴
     * @return WAG0007 防暑补贴
     */
    public BigDecimal getWag0007() {
        return wag0007;
    }

    /**
     * 防暑补贴
     * @param wag0007 防暑补贴
     */
    public void setWag0007(BigDecimal wag0007) {
        this.wag0007 = wag0007;
    }

    /**
     * 浮动月薪
     * @return WAG0008 浮动月薪
     */
    public BigDecimal getWag0008() {
        return wag0008;
    }

    /**
     * 浮动月薪
     * @param wag0008 浮动月薪
     */
    public void setWag0008(BigDecimal wag0008) {
        this.wag0008 = wag0008;
    }

    /**
     * 基本工资调整
     * @return WAG0009 基本工资调整
     */
    public BigDecimal getWag0009() {
        return wag0009;
    }

    /**
     * 基本工资调整
     * @param wag0009 基本工资调整
     */
    public void setWag0009(BigDecimal wag0009) {
        this.wag0009 = wag0009;
    }

    /**
     * 独生子女津贴
     * @return WAG0011 独生子女津贴
     */
    public BigDecimal getWag0011() {
        return wag0011;
    }

    /**
     * 独生子女津贴
     * @param wag0011 独生子女津贴
     */
    public void setWag0011(BigDecimal wag0011) {
        this.wag0011 = wag0011;
    }

    /**
     * 节日津贴
     * @return WAG0012 节日津贴
     */
    public BigDecimal getWag0012() {
        return wag0012;
    }

    /**
     * 节日津贴
     * @param wag0012 节日津贴
     */
    public void setWag0012(BigDecimal wag0012) {
        this.wag0012 = wag0012;
    }

    /**
     * 早退扣款
     * @return WAG0013 早退扣款
     */
    public BigDecimal getWag0013() {
        return wag0013;
    }

    /**
     * 早退扣款
     * @param wag0013 早退扣款
     */
    public void setWag0013(BigDecimal wag0013) {
        this.wag0013 = wag0013;
    }

    /**
     * 事假扣款
     * @return WAG0014 事假扣款
     */
    public BigDecimal getWag0014() {
        return wag0014;
    }

    /**
     * 事假扣款
     * @param wag0014 事假扣款
     */
    public void setWag0014(BigDecimal wag0014) {
        this.wag0014 = wag0014;
    }

    /**
     * 迟到扣款
     * @return WAG0015 迟到扣款
     */
    public BigDecimal getWag0015() {
        return wag0015;
    }

    /**
     * 迟到扣款
     * @param wag0015 迟到扣款
     */
    public void setWag0015(BigDecimal wag0015) {
        this.wag0015 = wag0015;
    }

    /**
     * 病假扣款
     * @return WAG0016 病假扣款
     */
    public BigDecimal getWag0016() {
        return wag0016;
    }

    /**
     * 病假扣款
     * @param wag0016 病假扣款
     */
    public void setWag0016(BigDecimal wag0016) {
        this.wag0016 = wag0016;
    }

    /**
     * 旷工扣款
     * @return WAG0017 旷工扣款
     */
    public BigDecimal getWag0017() {
        return wag0017;
    }

    /**
     * 旷工扣款
     * @param wag0017 旷工扣款
     */
    public void setWag0017(BigDecimal wag0017) {
        this.wag0017 = wag0017;
    }

    /**
     * 处罚扣款
     * @return WAG0018 处罚扣款
     */
    public BigDecimal getWag0018() {
        return wag0018;
    }

    /**
     * 处罚扣款
     * @param wag0018 处罚扣款
     */
    public void setWag0018(BigDecimal wag0018) {
        this.wag0018 = wag0018;
    }

    /**
     * 交通补贴
     * @return WAG0020 交通补贴
     */
    public BigDecimal getWag0020() {
        return wag0020;
    }

    /**
     * 交通补贴
     * @param wag0020 交通补贴
     */
    public void setWag0020(BigDecimal wag0020) {
        this.wag0020 = wag0020;
    }

    /**
     * 住房补贴
     * @return WAG0021 住房补贴
     */
    public BigDecimal getWag0021() {
        return wag0021;
    }

    /**
     * 住房补贴
     * @param wag0021 住房补贴
     */
    public void setWag0021(BigDecimal wag0021) {
        this.wag0021 = wag0021;
    }

    /**
     * 误餐补贴
     * @return WAG0022 误餐补贴
     */
    public BigDecimal getWag0022() {
        return wag0022;
    }

    /**
     * 误餐补贴
     * @param wag0022 误餐补贴
     */
    public void setWag0022(BigDecimal wag0022) {
        this.wag0022 = wag0022;
    }

    /**
     * 通讯补贴
     * @return WAG0023 通讯补贴
     */
    public BigDecimal getWag0023() {
        return wag0023;
    }

    /**
     * 通讯补贴
     * @param wag0023 通讯补贴
     */
    public void setWag0023(BigDecimal wag0023) {
        this.wag0023 = wag0023;
    }

    /**
     * 其他福利
     * @return WAG0024 其他福利
     */
    public BigDecimal getWag0024() {
        return wag0024;
    }

    /**
     * 其他福利
     * @param wag0024 其他福利
     */
    public void setWag0024(BigDecimal wag0024) {
        this.wag0024 = wag0024;
    }

    /**
     * 扣税不发薪
     * @return WAG0025 扣税不发薪
     */
    public BigDecimal getWag0025() {
        return wag0025;
    }

    /**
     * 扣税不发薪
     * @param wag0025 扣税不发薪
     */
    public void setWag0025(BigDecimal wag0025) {
        this.wag0025 = wag0025;
    }

    /**
     * 其他奖金
     * @return WAG0029 其他奖金
     */
    public BigDecimal getWag0029() {
        return wag0029;
    }

    /**
     * 其他奖金
     * @param wag0029 其他奖金
     */
    public void setWag0029(BigDecimal wag0029) {
        this.wag0029 = wag0029;
    }

    /**
     * 激励费
     * @return WAG0030 激励费
     */
    public BigDecimal getWag0030() {
        return wag0030;
    }

    /**
     * 激励费
     * @param wag0030 激励费
     */
    public void setWag0030(BigDecimal wag0030) {
        this.wag0030 = wag0030;
    }

    /**
     * 其他绩效
     * @return WAG0031 其他绩效
     */
    public BigDecimal getWag0031() {
        return wag0031;
    }

    /**
     * 其他绩效
     * @param wag0031 其他绩效
     */
    public void setWag0031(BigDecimal wag0031) {
        this.wag0031 = wag0031;
    }

    /**
     * 应税收入
     * @return SAWAG0104 应税收入
     */
    public BigDecimal getSawag0104() {
        return sawag0104;
    }

    /**
     * 应税收入
     * @param sawag0104 应税收入
     */
    public void setSawag0104(BigDecimal sawag0104) {
        this.sawag0104 = sawag0104;
    }

    /**
     * 个人所得税
     * @return SAWAG0102 个人所得税
     */
    public BigDecimal getSawag0102() {
        return sawag0102;
    }

    /**
     * 个人所得税
     * @param sawag0102 个人所得税
     */
    public void setSawag0102(BigDecimal sawag0102) {
        this.sawag0102 = sawag0102;
    }

    /**
     * 总工资
     * @return SAWAG0200 总工资
     */
    public BigDecimal getSawag0200() {
        return sawag0200;
    }

    /**
     * 总工资
     * @param sawag0200 总工资
     */
    public void setSawag0200(BigDecimal sawag0200) {
        this.sawag0200 = sawag0200;
    }
    public String getIndexno() {
		return indexno;
	}

	public void setIndexno(String indexno) {
		this.indexno = indexno;
	}

	public BigDecimal getIndexvalue() {
		return indexvalue;
	}

	public void setIndexvalue(BigDecimal indexvalue) {
		this.indexvalue = indexvalue;
	}

	public String getPersontype() {
		return persontype;
	}

	public void setPersontype(String persontype) {
		this.persontype = persontype;
	}

	public String getUserflag() {
		return userflag;
	}

	public void setUserflag(String userflag) {
		this.userflag = userflag;
	}
	public BigDecimal getSawag0105() {
		return sawag0105;
	}

	public void setSawag0105(BigDecimal sawag0105) {
		this.sawag0105 = sawag0105;
	}
	
	
	public BigDecimal getSawag0111() {
		return sawag0111;
	}

	public void setSawag0111(BigDecimal sawag0111) {
		this.sawag0111 = sawag0111;
	}

	public BigDecimal getSawag0112() {
		return sawag0112;
	}

	public void setSawag0112(BigDecimal sawag0112) {
		this.sawag0112 = sawag0112;
	}

	@Override
	public String toString() {
		return "XgWageParam [usercode=" + usercode + ", calcdate=" + calcdate + ", comcode=" + comcode + ", comname="
				+ comname + ", teamcode=" + teamcode + ", teamname=" + teamname + ", teamlevelid=" + teamlevelid
				+ ", username=" + username + ", usergw=" + usergw + ", indexno=" + indexno + ", indexvalue="
				+ indexvalue + ", persontype=" + persontype + ", userflag=" + userflag + ", sawag0002=" + sawag0002
				+ ", wag0027=" + wag0027 + ", sawag0007=" + sawag0007 + ", sawag0089=" + sawag0089 + ", sawag0109="
				+ sawag0109 + ", sawag0012=" + sawag0012 + ", sawag0013=" + sawag0013 + ", sawag0014=" + sawag0014
				+ ", sawag0015=" + sawag0015 + ", sawag0016=" + sawag0016 + ", sawag0017=" + sawag0017 + ", sawag0019="
				+ sawag0019 + ", sawag0020=" + sawag0020 + ", sawag0021=" + sawag0021 + ", sawag0022=" + sawag0022
				+ ", sawag0025=" + sawag0025 + ", sawag0026=" + sawag0026 + ", sawag0027=" + sawag0027 + ", sawag0028="
				+ sawag0028 + ", sawag0029=" + sawag0029 + ", sawag0030=" + sawag0030 + ", sawag0031=" + sawag0031
				+ ", sawag0032=" + sawag0032 + ", sawag0033=" + sawag0033 + ", sawag0034=" + sawag0034 + ", wag0003="
				+ wag0003 + ", wag0006=" + wag0006 + ", wag0007=" + wag0007 + ", wag0008=" + wag0008 + ", wag0009="
				+ wag0009 + ", wag0011=" + wag0011 + ", wag0012=" + wag0012 + ", wag0013=" + wag0013 + ", wag0014="
				+ wag0014 + ", wag0015=" + wag0015 + ", wag0016=" + wag0016 + ", wag0017=" + wag0017 + ", wag0018="
				+ wag0018 + ", wag0020=" + wag0020 + ", wag0021=" + wag0021 + ", wag0022=" + wag0022 + ", wag0023="
				+ wag0023 + ", wag0024=" + wag0024 + ", wag0025=" + wag0025 + ", wag0029=" + wag0029 + ", wag0030="
				+ wag0030 + ", wag0031=" + wag0031 + ", sawag0104=" + sawag0104 + ", sawag0102=" + sawag0102
				+ ", sawag0200=" + sawag0200 + "]";
	}

    
}