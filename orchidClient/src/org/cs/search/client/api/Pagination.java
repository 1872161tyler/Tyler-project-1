package org.cs.search.client.api;

import java.io.Serializable;

/**
 * ������ҳ��Ϣ
 * @author wangshaoping
 *
 */
public class Pagination implements Serializable{
	private static final long serialVersionUID = 6853879650192549517L;
	
	public static int DEFAULT_PAGE_SIZE 		=10;  	//ȱʡÿҳ��¼��
    public static int ACTION_FIRST_PAGE 		=1;		//��һҳ
    public static int ACTION_PREVIOUS_PAGE 		=2;		//ǰһҳ
    public static int ACTION_NEXT_PAGE 			=3;		//��һҳ
    public static int ACTION_LAST_PAGE 			=4;		//���һҳ
    public static int ACTION_CURRENT_PAGE 		=5;		//��ǰ��ָ����ҳ
    
    private int currentPage;
    private int pageSize;
    private long rowCount;
    private int pageCount;
    private int action;
    
	/**
	 * ��ȡ��ҳ����
     * @return ��ҳ����
     */
    public int getAction() {
        return action;
    }
    
    /**
     * ���÷�ҳ����
     * @param action ��ҳ����
     */
    public void setAction(int action) {
        this.action = action;
    }
    
    /**
     * ��ȡ��ǰҳ
     * @return ��ǰҳ
     */
    public int getCurrentPage() {
        return currentPage;
    }
    
    /**
     * ���õ�ǰҳ
     * @param currentPage ��ǰҳ
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    /**
     * ��ȡÿҳ��¼��
     * @return ÿҳ��¼��
     */
    public int getPageSize() {
    	if(this.pageSize==0)
    	{
    		this.pageSize=DEFAULT_PAGE_SIZE;
    	}
        return this.pageSize;
    }
    
    /**
     * ����ÿҳ��¼��
     * @param pageSize ÿҳ��¼��
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
     * ��ȡ�ܼ�¼��
     * @return �ܼ�¼��
     */
	public long getRowCount() {
		return rowCount;
	}
	
	/**
	 * �����ܼ�¼��
	 * @param rowCount �ܼ�¼��
	 */
	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}
	
	/**
	 * ��ȡ��ҳ��
	 * @return ��ҳ��
	 */
	public int getPageCount() {
		return pageCount;
	}
	
	/**
	 * ������ҳ��
	 * @param pageCount ��ҳ��
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
