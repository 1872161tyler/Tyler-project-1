package org.cs.search.web.bean;

import java.util.List;

/**
 * Êý¾Ý×Öµä
 * @author FX
 *
 */
public class Lib 
{
	/**
	 * Ö÷¼ü±àºÅ£¨Öµ£©
	 */
	private String id;		
	
	/**
	 * ¸¸ID
	 */
	private String pid = "ROOT_LIB";
	
	/**
	 * ÏÔÊ¾Êý¾Ý
	 */
	private String label;
	
	/**
	 * ±¸×¢
	 */
	private String memo;
	
	/**
	 * ÅÅÐò
	 */
	private int lorder;
	
	/**
	 * Ô¤Áô×Ö¶Î-Êý×Ö
	 */
	private int storeNum;
	
	/**
	 * Ô¤Áô×Ö¶Î-×Ö·û´®
	 */
	private String storeString;
	
	/**
	 * Êý¾ÝÖµ
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
