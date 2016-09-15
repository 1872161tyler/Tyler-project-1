package org.cs.search.client.api;

import java.io.Serializable;

/**
 * 搜索分页信息
 * @author wangshaoping
 *
 */
public class Pagination implements Serializable{
	private static final long serialVersionUID = 6853879650192549517L;
	
	public static int DEFAULT_PAGE_SIZE 		=10;  	//缺省每页记录数
    public static int ACTION_FIRST_PAGE 		=1;		//第一页
    public static int ACTION_PREVIOUS_PAGE 		=2;		//前一页
    public static int ACTION_NEXT_PAGE 			=3;		//后一页
    public static int ACTION_LAST_PAGE 			=4;		//最后一页
    public static int ACTION_CURRENT_PAGE 		=5;		//当前（指定）页
    
    private int currentPage;
    private int pageSize;
    private long rowCount;
    private int pageCount;
    private int action;
    
	/**
	 * 获取分页动作
     * @return 分页动作
     */
    public int getAction() {
        return action;
    }
    
    /**
     * 设置分页动作
     * @param action 分页动作
     */
    public void setAction(int action) {
        this.action = action;
    }
    
    /**
     * 获取当前页
     * @return 当前页
     */
    public int getCurrentPage() {
        return currentPage;
    }
    
    /**
     * 设置当前页
     * @param currentPage 当前页
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    /**
     * 获取每页记录数
     * @return 每页记录数
     */
    public int getPageSize() {
    	if(this.pageSize==0)
    	{
    		this.pageSize=DEFAULT_PAGE_SIZE;
    	}
        return this.pageSize;
    }
    
    /**
     * 设置每页记录数
     * @param pageSize 每页记录数
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
     * 获取总记录数
     * @return 总记录数
     */
	public long getRowCount() {
		return rowCount;
	}
	
	/**
	 * 设置总记录数
	 * @param rowCount 总记录数
	 */
	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}
	
	/**
	 * 获取总页数
	 * @return 总页数
	 */
	public int getPageCount() {
		return pageCount;
	}
	
	/**
	 * 设置总页数
	 * @param pageCount 总页数
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	@Override
	public String toString() {
		return "Pagination [currentPage=" + currentPage + ", pageSize="
				+ pageSize + ", rowCount=" + rowCount + ", pageCount="
				+ pageCount + ", action=" + action + "]";
	}
}
