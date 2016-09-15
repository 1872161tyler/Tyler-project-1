package org.cs.search.web.bean;

import java.util.List;

/**
 * ��ѯ�����
 * ������ѯ���������Ӧ���������
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
	 * ��ȡ�����List
	 * 
	 * @return �����
	 */
	public List<T> getList() 
	{
		return this.list;
	}
	
	/**
	 * ���ý����List
	 * 
	 * @param list �����
	 */
	public void setList(List<T> list) 
	{
		this.list = list;
	}
	
	/**
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	public long getRows() 
	{
		return this.rows;
	}
	
	/**
	 * ����������
	 * 
	 * @param rows ������
	 */
	public void setRows(long rows) 
	{
		this.rows = rows;
	}
}