package com.sinosoft.commxg.param;

import java.util.Date;

import com.sinosoft.commxg.dto.PageDto;

public class XgUserParam extends PageDto{
    /**
     * 人员编码
     */
    private String usercode;

    /**
     * 人员名称
     */
    private String username;

    /**
     * 内外勤标识
     */
    private String persontype;
    /**
     * 人员类型（是否劳务派遣）
     */
    private String userflag;

    /**
     * 是否虚拟人员
     */
    private String virtualuserflag;

    /**
     * 入职时间
     */
    private Date enrolldate;

    /**
     * 是否在职
     */
    private String validstatus;

    /**
     * 离司时间
     */
    private Date logoutdate;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身份证号
     */
    private String identifyno;

    /**
     * 身份证地址
     */
    private String homeaddress;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 婚姻状况
     */
    private String ifmarried;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 政治面貌
     */
    private String position;

    /**
     * 学历（1初中及以下、2中专、3高中、4大专、5本科、6硕士、7博士）
     */
    private String primaryeducationexperience;

    /**
     * 性别(0-女/1-男)
     */
    private String sex;

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
     * 角色编码
     */
    private String roleid;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 直接编码
     */
    private String levelid;

    /**
     * 直接名称
     */
    private String levelname;

    /**
     * 基本工资
     */
    private String basewage;

    /**
     * 合同类型（A 全日制 B非全日制 C劳务派遣）
     */
    private String quality;

    /**
     * 合同起期
     */
    private Date startdate;

    /**
     * 合同止期
     */
    private Date enddate;

    /**
     * null
     * @return USERCODE null
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * null
     * @param usercode null
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * null
     * @return USERNAME null
     */
    public String getUsername() {
        return username;
    }

    /**
     * null
     * @param username null
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * null
     * @return USERFLAG null
     */
    public String getUserflag() {
        return userflag;
    }

    /**
     * null
     * @param userflag null
     */
    public void setUserflag(String userflag) {
        this.userflag = userflag == null ? null : userflag.trim();
    }

    /**
     * null
     * @return VIRTUALUSERFLAG null
     */
    public String getVirtualuserflag() {
        return virtualuserflag;
    }

    /**
     * null
     * @param virtualuserflag null
     */
    public void setVirtualuserflag(String virtualuserflag) {
        this.virtualuserflag = virtualuserflag == null ? null : virtualuserflag.trim();
    }

    /**
     * null
     * @return ENROLLDATE null
     */
    public Date getEnrolldate() {
        return enrolldate;
    }

    /**
     * null
     * @param enrolldate null
     */
    public void setEnrolldate(Date enrolldate) {
        this.enrolldate = enrolldate;
    }

    /**
     * null
     * @return VALIDSTATUS null
     */
    public String getValidstatus() {
        return validstatus;
    }

    /**
     * null
     * @param validstatus null
     */
    public void setValidstatus(String validstatus) {
        this.validstatus = validstatus == null ? null : validstatus.trim();
    }

    /**
     * null
     * @return LOGOUTDATE null
     */
    public Date getLogoutdate() {
        return logoutdate;
    }

    /**
     * null
     * @param logoutdate null
     */
    public void setLogoutdate(Date logoutdate) {
        this.logoutdate = logoutdate;
    }

    /**
     * null
     * @return BIRTHDAY null
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * null
     * @param birthday null
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * null
     * @return IDENTIFYNO null
     */
    public String getIdentifyno() {
        return identifyno;
    }

    /**
     * null
     * @param identifyno null
     */
    public void setIdentifyno(String identifyno) {
        this.identifyno = identifyno == null ? null : identifyno.trim();
    }

    /**
     * null
     * @return HOMEADDRESS null
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /**
     * null
     * @param homeaddress null
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    /**
     * null
     * @return MOBILE null
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * null
     * @param mobile null
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * null
     * @return IFMARRIED null
     */
    public String getIfmarried() {
        return ifmarried;
    }

    /**
     * null
     * @param ifmarried null
     */
    public void setIfmarried(String ifmarried) {
        this.ifmarried = ifmarried == null ? null : ifmarried.trim();
    }

    /**
     * null
     * @return NATIONALITY null
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * null
     * @param nationality null
     */
    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    /**
     * null
     * @return POSITION null
     */
    public String getPosition() {
        return position;
    }

    /**
     * null
     * @param position null
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * null
     * @return PRIMARYEDUCATIONEXPERIENCE null
     */
    public String getPrimaryeducationexperience() {
        return primaryeducationexperience;
    }

    /**
     * null
     * @param primaryeducationexperience null
     */
    public void setPrimaryeducationexperience(String primaryeducationexperience) {
        this.primaryeducationexperience = primaryeducationexperience == null ? null : primaryeducationexperience.trim();
    }

    /**
     * null
     * @return SEX null
     */
    public String getSex() {
        return sex;
    }

    /**
     * null
     * @param sex null
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * null
     * @return COMCODE null
     */
    public String getComcode() {
        return comcode;
    }

    /**
     * null
     * @param comcode null
     */
    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    /**
     * null
     * @return COMCNAME null
     */
    public String getComcname() {
        return comcname;
    }

    /**
     * null
     * @param comcname null
     */
    public void setComcname(String comcname) {
        this.comcname = comcname == null ? null : comcname.trim();
    }

    /**
     * null
     * @return TEAMCODE null
     */
    public String getTeamcode() {
        return teamcode;
    }

    /**
     * null
     * @param teamcode null
     */
    public void setTeamcode(String teamcode) {
        this.teamcode = teamcode == null ? null : teamcode.trim();
    }

    /**
     * null
     * @return TEAMNAME null
     */
    public String getTeamname() {
        return teamname;
    }

    /**
     * null
     * @param teamname null
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    /**
     * null
     * @return ROLEID null
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * null
     * @param roleid null
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * null
     * @return ROLENAME null
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * null
     * @param rolename null
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * null
     * @return LEVELID null
     */
    public String getLevelid() {
        return levelid;
    }

    /**
     * null
     * @param levelid null
     */
    public void setLevelid(String levelid) {
        this.levelid = levelid == null ? null : levelid.trim();
    }

    /**
     * null
     * @return LEVELNAME null
     */
    public String getLevelname() {
        return levelname;
    }

    /**
     * null
     * @param levelname null
     */
    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    /**
     * null
     * @return BASEWAGE null
     */
    public String getBasewage() {
        return basewage;
    }

    /**
     * null
     * @param basewage null
     */
    public void setBasewage(String basewage) {
        this.basewage = basewage == null ? null : basewage.trim();
    }

    /**
     * null
     * @return QUALITY null
     */
    public String getQuality() {
        return quality;
    }

    /**
     * null
     * @param quality null
     */
    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    /**
     * null
     * @return STARTDATE null
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * null
     * @param startdate null
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * null
     * @return ENDDATE null
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * null
     * @param enddate null
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

	public String getPersontype() {
		return persontype;
	}

	public void setPersontype(String persontype) {
		this.persontype = persontype;
	}

	@Override
	public String toString() {
		return "XgUserParam [usercode=" + usercode + ", username=" + username + ", persontype=" + persontype
				+ ", userflag=" + userflag + ", virtualuserflag=" + virtualuserflag + ", enrolldate=" + enrolldate
				+ ", validstatus=" + validstatus + ", logoutdate=" + logoutdate + ", birthday=" + birthday
				+ ", identifyno=" + identifyno + ", homeaddress=" + homeaddress + ", mobile=" + mobile + ", ifmarried="
				+ ifmarried + ", nationality=" + nationality + ", position=" + position
				+ ", primaryeducationexperience=" + primaryeducationexperience + ", sex=" + sex + ", comcode=" + comcode
				+ ", comcname=" + comcname + ", teamcode=" + teamcode + ", teamname=" + teamname + ", roleid=" + roleid
				+ ", rolename=" + rolename + ", levelid=" + levelid + ", levelname=" + levelname + ", basewage="
				+ basewage + ", quality=" + quality + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}

	
    
    
}