package com.sinosoft.commxg.param;

import java.util.Date;

import com.sinosoft.commxg.dto.PageDto;

public class XgAgentParam  extends PageDto{
    /**
     * 代理编码
     */
    private String agentcode;

    /**
     * 代理名称
     */
    private String agentname;

    /**
     * 代理类型（15 农村代理人 16 城市代理人）
     */
    private String agentclass;

    /**
     * 资格证号
     */
    private String zgPermitno;

    /**
     * 资格证起始日期
     */
    private Date zgStartdate;

    /**
     * 资格证终止日期
     */
    private Date zgEnddate;

    /**
     * 执业证号
     */
    private String zyPermitno;

    /**
     * 执业证起始日期
     */
    private Date zyStartdate;

    /**
     * 执业证终止日期
     */
    private Date zyEnddate;

    /**
     * 身份证号
     */
    private String sfPermitno;

    /**
     * 身份证起始日期
     */
    private Date sfStartdate;

    /**
     * 身份证终止日期
     */
    private Date sfEnddate;

    /**
     * 生日
     */
    private Date brithday;

    /**
     * 性别(0-女/1-男)
     */
    private String sex;

    /**
     * 学历（0 初中 1 高中（中专） 2 大专 3 本科 4 研究生及以上）
     */
    private String educationexperience;

    /**
     * 电话
     */
    private String phonenumber;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 现居住地
     */
    private String addressname;

    /**
     * 身份证地址
     */
    private String netaddress;

    /**
     * 归属机构编码
     */
    private String comcode;

    /**
     * 归属机构名称
     */
    private String comcname;

    /**
     * 归属业务员编码
     */
    private String handlercode;

    /**
     * 公私标识
     */
    private String isprivate;

    /**
     * 开户银行编码
     */
    private String recbank1;

    /**
     * 开户银行名称
     */
    private String recbankname1;

    /**
     * 开户银行所属省市编码
     */
    private String bankareacode;

    /**
     * 开户银行所属省市名称
     */
    private String bankareaname;

    /**
     * 开户名称
     */
    private String recaccount;

    /**
     * 开户账号
     */
    private String recaccountname;

    /**
     * 效力状态
     */
    private String validstatus;

    /**
     * 归属业务员名称
     */
    private String handlername;

    /**
     * 代理编码
     * @return AGENTCODE 代理编码
     */
    public String getAgentcode() {
        return agentcode;
    }

    /**
     * 代理编码
     * @param agentcode 代理编码
     */
    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode == null ? null : agentcode.trim();
    }

    /**
     * 代理名称
     * @return AGENTNAME 代理名称
     */
    public String getAgentname() {
        return agentname;
    }

    /**
     * 代理名称
     * @param agentname 代理名称
     */
    public void setAgentname(String agentname) {
        this.agentname = agentname == null ? null : agentname.trim();
    }

    /**
     * 代理类型（15 农村代理人 16 城市代理人）
     * @return AGENTCLASS 代理类型（15 农村代理人 16 城市代理人）
     */
    public String getAgentclass() {
        return agentclass;
    }

    /**
     * 代理类型（15 农村代理人 16 城市代理人）
     * @param agentclass 代理类型（15 农村代理人 16 城市代理人）
     */
    public void setAgentclass(String agentclass) {
        this.agentclass = agentclass == null ? null : agentclass.trim();
    }

    /**
     * 资格证号
     * @return ZG_PERMITNO 资格证号
     */
    public String getZgPermitno() {
        return zgPermitno;
    }

    /**
     * 资格证号
     * @param zgPermitno 资格证号
     */
    public void setZgPermitno(String zgPermitno) {
        this.zgPermitno = zgPermitno == null ? null : zgPermitno.trim();
    }

    /**
     * 资格证起始日期
     * @return ZG_STARTDATE 资格证起始日期
     */
    public Date getZgStartdate() {
        return zgStartdate;
    }

    /**
     * 资格证起始日期
     * @param zgStartdate 资格证起始日期
     */
    public void setZgStartdate(Date zgStartdate) {
        this.zgStartdate = zgStartdate;
    }

    /**
     * 资格证终止日期
     * @return ZG_ENDDATE 资格证终止日期
     */
    public Date getZgEnddate() {
        return zgEnddate;
    }

    /**
     * 资格证终止日期
     * @param zgEnddate 资格证终止日期
     */
    public void setZgEnddate(Date zgEnddate) {
        this.zgEnddate = zgEnddate;
    }

    /**
     * 执业证号
     * @return ZY_PERMITNO 执业证号
     */
    public String getZyPermitno() {
        return zyPermitno;
    }

    /**
     * 执业证号
     * @param zyPermitno 执业证号
     */
    public void setZyPermitno(String zyPermitno) {
        this.zyPermitno = zyPermitno == null ? null : zyPermitno.trim();
    }

    /**
     * 执业证起始日期
     * @return ZY_STARTDATE 执业证起始日期
     */
    public Date getZyStartdate() {
        return zyStartdate;
    }

    /**
     * 执业证起始日期
     * @param zyStartdate 执业证起始日期
     */
    public void setZyStartdate(Date zyStartdate) {
        this.zyStartdate = zyStartdate;
    }

    /**
     * 执业证终止日期
     * @return ZY_ENDDATE 执业证终止日期
     */
    public Date getZyEnddate() {
        return zyEnddate;
    }

    /**
     * 执业证终止日期
     * @param zyEnddate 执业证终止日期
     */
    public void setZyEnddate(Date zyEnddate) {
        this.zyEnddate = zyEnddate;
    }

    /**
     * 身份证号
     * @return SF_PERMITNO 身份证号
     */
    public String getSfPermitno() {
        return sfPermitno;
    }

    /**
     * 身份证号
     * @param sfPermitno 身份证号
     */
    public void setSfPermitno(String sfPermitno) {
        this.sfPermitno = sfPermitno == null ? null : sfPermitno.trim();
    }

    /**
     * 身份证起始日期
     * @return SF_STARTDATE 身份证起始日期
     */
    public Date getSfStartdate() {
        return sfStartdate;
    }

    /**
     * 身份证起始日期
     * @param sfStartdate 身份证起始日期
     */
    public void setSfStartdate(Date sfStartdate) {
        this.sfStartdate = sfStartdate;
    }

    /**
     * 身份证终止日期
     * @return SF_ENDDATE 身份证终止日期
     */
    public Date getSfEnddate() {
        return sfEnddate;
    }

    /**
     * 身份证终止日期
     * @param sfEnddate 身份证终止日期
     */
    public void setSfEnddate(Date sfEnddate) {
        this.sfEnddate = sfEnddate;
    }

    /**
     * 生日
     * @return BRITHDAY 生日
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * 生日
     * @param brithday 生日
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * 性别(0-女/1-男)
     * @return SEX 性别(0-女/1-男)
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别(0-女/1-男)
     * @param sex 性别(0-女/1-男)
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 学历（0 初中 1 高中（中专） 2 大专 3 本科 4 研究生及以上）
     * @return EDUCATIONEXPERIENCE 学历（0 初中 1 高中（中专） 2 大专 3 本科 4 研究生及以上）
     */
    public String getEducationexperience() {
        return educationexperience;
    }

    /**
     * 学历（0 初中 1 高中（中专） 2 大专 3 本科 4 研究生及以上）
     * @param educationexperience 学历（0 初中 1 高中（中专） 2 大专 3 本科 4 研究生及以上）
     */
    public void setEducationexperience(String educationexperience) {
        this.educationexperience = educationexperience == null ? null : educationexperience.trim();
    }

    /**
     * 电话
     * @return PHONENUMBER 电话
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 电话
     * @param phonenumber 电话
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * 邮编
     * @return POSTCODE 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 邮编
     * @param postcode 邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * 现居住地
     * @return ADDRESSNAME 现居住地
     */
    public String getAddressname() {
        return addressname;
    }

    /**
     * 现居住地
     * @param addressname 现居住地
     */
    public void setAddressname(String addressname) {
        this.addressname = addressname == null ? null : addressname.trim();
    }

    /**
     * 身份证地址
     * @return NETADDRESS 身份证地址
     */
    public String getNetaddress() {
        return netaddress;
    }

    /**
     * 身份证地址
     * @param netaddress 身份证地址
     */
    public void setNetaddress(String netaddress) {
        this.netaddress = netaddress == null ? null : netaddress.trim();
    }

    /**
     * 归属机构编码
     * @return COMCODE 归属机构编码
     */
    public String getComcode() {
        return comcode;
    }

    /**
     * 归属机构编码
     * @param comcode 归属机构编码
     */
    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    /**
     * 归属机构名称
     * @return COMCNAME 归属机构名称
     */
    public String getComcname() {
        return comcname;
    }

    /**
     * 归属机构名称
     * @param comcname 归属机构名称
     */
    public void setComcname(String comcname) {
        this.comcname = comcname == null ? null : comcname.trim();
    }

    /**
     * 归属业务员编码
     * @return HANDLERCODE 归属业务员编码
     */
    public String getHandlercode() {
        return handlercode;
    }

    /**
     * 归属业务员编码
     * @param handlercode 归属业务员编码
     */
    public void setHandlercode(String handlercode) {
        this.handlercode = handlercode == null ? null : handlercode.trim();
    }

    /**
     * 公私标识
     * @return ISPRIVATE 公私标识
     */
    public String getIsprivate() {
        return isprivate;
    }

    /**
     * 公私标识
     * @param isprivate 公私标识
     */
    public void setIsprivate(String isprivate) {
        this.isprivate = isprivate == null ? null : isprivate.trim();
    }

    /**
     * 开户银行编码
     * @return RECBANK1 开户银行编码
     */
    public String getRecbank1() {
        return recbank1;
    }

    /**
     * 开户银行编码
     * @param recbank1 开户银行编码
     */
    public void setRecbank1(String recbank1) {
        this.recbank1 = recbank1 == null ? null : recbank1.trim();
    }

    /**
     * 开户银行名称
     * @return RECBANKNAME1 开户银行名称
     */
    public String getRecbankname1() {
        return recbankname1;
    }

    /**
     * 开户银行名称
     * @param recbankname1 开户银行名称
     */
    public void setRecbankname1(String recbankname1) {
        this.recbankname1 = recbankname1 == null ? null : recbankname1.trim();
    }

    /**
     * 开户银行所属省市编码
     * @return BANKAREACODE 开户银行所属省市编码
     */
    public String getBankareacode() {
        return bankareacode;
    }

    /**
     * 开户银行所属省市编码
     * @param bankareacode 开户银行所属省市编码
     */
    public void setBankareacode(String bankareacode) {
        this.bankareacode = bankareacode == null ? null : bankareacode.trim();
    }

    /**
     * 开户银行所属省市名称
     * @return BANKAREANAME 开户银行所属省市名称
     */
    public String getBankareaname() {
        return bankareaname;
    }

    /**
     * 开户银行所属省市名称
     * @param bankareaname 开户银行所属省市名称
     */
    public void setBankareaname(String bankareaname) {
        this.bankareaname = bankareaname == null ? null : bankareaname.trim();
    }

    /**
     * 开户名称
     * @return RECACCOUNT 开户名称
     */
    public String getRecaccount() {
        return recaccount;
    }

    /**
     * 开户名称
     * @param recaccount 开户名称
     */
    public void setRecaccount(String recaccount) {
        this.recaccount = recaccount == null ? null : recaccount.trim();
    }

    /**
     * 开户账号
     * @return RECACCOUNTNAME 开户账号
     */
    public String getRecaccountname() {
        return recaccountname;
    }

    /**
     * 开户账号
     * @param recaccountname 开户账号
     */
    public void setRecaccountname(String recaccountname) {
        this.recaccountname = recaccountname == null ? null : recaccountname.trim();
    }

    /**
     * 效力状态
     * @return VALIDSTATUS 效力状态
     */
    public String getValidstatus() {
        return validstatus;
    }

    /**
     * 效力状态
     * @param validstatus 效力状态
     */
    public void setValidstatus(String validstatus) {
        this.validstatus = validstatus == null ? null : validstatus.trim();
    }

    /**
     * 归属业务员名称
     * @return HANDLERNAME 归属业务员名称
     */
    public String getHandlername() {
        return handlername;
    }

    /**
     * 归属业务员名称
     * @param handlername 归属业务员名称
     */
    public void setHandlername(String handlername) {
        this.handlername = handlername == null ? null : handlername.trim();
    }

	@Override
	public String toString() {
		return "XgAgentParam [agentcode=" + agentcode + ", agentname=" + agentname + ", agentclass=" + agentclass
				+ ", zgPermitno=" + zgPermitno + ", zgStartdate=" + zgStartdate + ", zgEnddate=" + zgEnddate
				+ ", zyPermitno=" + zyPermitno + ", zyStartdate=" + zyStartdate + ", zyEnddate=" + zyEnddate
				+ ", sfPermitno=" + sfPermitno + ", sfStartdate=" + sfStartdate + ", sfEnddate=" + sfEnddate
				+ ", brithday=" + brithday + ", sex=" + sex + ", educationexperience=" + educationexperience
				+ ", phonenumber=" + phonenumber + ", postcode=" + postcode + ", addressname=" + addressname
				+ ", netaddress=" + netaddress + ", comcode=" + comcode + ", comcname=" + comcname + ", handlercode="
				+ handlercode + ", isprivate=" + isprivate + ", recbank1=" + recbank1 + ", recbankname1=" + recbankname1
				+ ", bankareacode=" + bankareacode + ", bankareaname=" + bankareaname + ", recaccount=" + recaccount
				+ ", recaccountname=" + recaccountname + ", validstatus=" + validstatus + ", handlername=" + handlername
				+ "]";
	}
    
    
}