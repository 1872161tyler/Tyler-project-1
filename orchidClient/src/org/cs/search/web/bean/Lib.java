package org.cs.search.web.bean;

import java.util.List;

/**
 * �����ֵ�
 * @author FX
 *
 */
public class Lib 
{
	/**
	 * ������ţ�ֵ��
	 */
	private String id;		
	
	/**
	 * ��ID
	 */
	private String pid = "ROOT_LIB";
	
	/**
	 * ��ʾ����
	 */
	private String label;
	
	/**
	 * ��ע
	 */
	private String memo;
	
	/**
	 * ����
	 */
	private int lorder;
	
	/**
	 * Ԥ���ֶ�-����
	 */
	private int storeNum;
	
	/**
	 * Ԥ���ֶ�-�ַ���
	 */
	private String storeString;
	
	/**
	 * ����ֵ
	 */
	private List<Lib> values;
	
	public String getMemo() 
	{
		return memo;
	}

	public void setMemo(String memo) 
	{
		this.memo = memo;
	}

	public int getLorder() 
	{
		return lorder;
	}

	public void setLorder(int lorder) 
	{
		this.lorder = lorder;
	}

	public String getPid() 
	{
		return pid;
	}

	public void setPid(String pid) 
	{
		this.pid = pid;
	}

	public List<Lib> getValues() 
	{
		return values;
	}

	public void setValues(List<Lib> values) 
	{
		this.values = values;
	}

	public int getStoreNum() 
	{
		return storeNum;
	}

	public void setStoreNum(int storeNum) 
	{
		this.storeNum = storeNum;
	}

	public String getStoreString() 
	{
		return storeString;
	}

	public void setStoreString(String storeString) 
	{
		this.storeString = storeString;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getLabel() 
	{
		return label;
	}

	public void setLabel(String label) 
	{
		this.label = label;
	}
}
