package com.sinosoft.commxg.dto;

import java.io.Serializable;

public class PageDto implements Serializable{
	
	private static final long serialVersionUID=1L;
	/**
	 * 当前页码，默认第一页
	 */
	private Integer pageNum = 1;
	/**
	 * 每页条数，默认8条
	 */
	private Integer pageSize = 8;
	/**
	 * @return the pageNum
	 */
	public Integer getPageNum(){
		return pageNum;
	}
	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(Integer pageNum){
		this.pageNum=pageNum;
	}
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize(){
		//限制pageSize的大小
		if(pageSize>20) {
			return 20;
		}
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize){
		this.pageSize=pageSize;
	}

}
