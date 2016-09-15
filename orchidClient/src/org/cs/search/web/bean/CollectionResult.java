package org.cs.search.web.bean;

import java.util.List;

/**
 * 查询结果集
 * 包含查询结果集和相应表的总行数
 * 
 * @author FX
 * @since JDK1.5
 * @version 1.0
 */
public class CollectionResult<T> 
{
	private List<T> list;
	private long rows;
	
	/**
	 * 获取结果集List
	 * 
	 * @return 结果集
	 */
	public List<T> getList() 
	{
		return this.list;
	}
	
	/**
	 * 设置结果集List
	 * 
	 * @param list 结果集
	 */
	public void setList(List<T> list) 
	{
		this.list = list;
	}
	
	/**
	 * 获取总行数
	 * 
	 * @return 总行数
	 */
	public long getRows() 
	{
		return this.rows;
	}
	
	/**
	 * 设置总行数
	 * 
	 * @param rows 总行数
	 */
	public void setRows(long rows) 
	{
		this.rows = rows;
	}
}