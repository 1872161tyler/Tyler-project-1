package org.cs.search.client.api;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 搜索记录
 * @author wangshaoping
 *
 */
public class SearchRecord {
	private float score;
	private String id;
	private String title;
	private String summary;
	private String content;
	private int	facetDate;
	private Date createDate;
	private Date lastModifyDate;
	private List<String> category;
	private String database;
	private String htmlSource;
	
	
	private Map<String,Object> otherFields =new HashMap<String,Object>();
	
	/**
	 * 获取搜索结果记录的评分
	 * @return 搜索结果记录的评分
	 */
	public float getScore() {
		return score;
	}
	
	/**
	 * 设置搜索结果记录的评分
	 * @param score 搜索结果记录的评分
	 */
	public void setScore(float score) {
		this.score = score;
	}
	
	/**
	 * 获取搜索结果记录的唯一标识
	 * @return 搜索结果记录的唯一标识 
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 设置搜索结果记录的唯一标识
	 * @param id 搜索结果记录的唯一标识
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 获取搜索结果记录的标题
	 * @return 搜索结果记录的标题
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 设置搜索结果记录的标题
	 * @param title 搜索结果记录的标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 获取搜索结果记录的摘要
	 * @return 搜索结果记录的摘要
	 */
	public String getSummary() {
		return summary;
	}
	
	/**
	 * 设置搜索结果记录的摘要
	 * @param summary 搜索结果记录的摘要
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	/**
	 * 获取统计时间
	 * @return 统计时间
	 */
	public int getFacetDate() {
		return facetDate;
	}

	/**
	 * 设置统计时间
	 * @param facetDate 统计时间
	 */
	public void setFacetDate(int facetDate) {
		this.facetDate = facetDate;
	}

	/**
	 * 获取搜索结果记录的创建日期
	 * @return 搜索结果记录的创建日期
	 */
	public Date getCreateDate() {
		return createDate;
	}
	
	/**
	 * 设置搜索结果记录的创建日期
	 * @param createDate 搜索结果记录的创建日期
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	/**
	 * 获取搜索结果记录的最后修改日期
	 * @return 搜索结果记录的最后修改日期
	 */
	public Date getLastModifyDate() {
		return lastModifyDate;
	}
	
	/**
	 * 设置搜索结果记录的最后修改日期
	 * @param lastModifyDate 搜索结果记录的最后修改日期
	 */
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
	
	/**
	 * 获取分类
	 * @return 分类
	 */
	public List<String> getCategory()
	  {
	    return this.category;
	  }

	/**
	 * 设置
	 * @param category 分类
	 */
	 public void setCategory(List<String> category)
	  {
	    this.category = category;
	  }

	/**
	 * 获取数据库
	 * @return 数据库
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * 设置数据库
	 * @param database 数据库
	 */
	public void setDatabase(String database) {
		this.database = database;
	}

	/**
	 * 获取搜索结果记录的其他属性集合
	 * @return 搜索结果记录的其他属性集合
	 */
	public Map<String, Object> getOtherFields() {
		return otherFields;
	}
	
	/**
	 * 设置搜索结果记录的其他属性集合
	 * @param otherFields 搜索结果记录的其他属性集合
	 */
	public void setOtherFields(Map<String, Object> otherFields) {
		this.otherFields = otherFields;
	}
	
	/**
	 * 获取搜索结果记录的其他属性值
	 * @param name 属性名
	 * @return 搜索结果记录的其他属性值
	 */
	public Object getField(String name){
		if(otherFields!=null){
			return otherFields.get(name);
		}else{
			return null;
		}
	}
	
	/**
	 * 获取html源内容
	 * @return html源内容
	 */
	public String getHtmlSource() 
	{
		return htmlSource;
	}
	
	/**
	 * 设置html源内容
	 * @param htmlSource html源内容
	 */
	public void setHtmlSource(String htmlSource) 
	{
		this.htmlSource = htmlSource;
	}
	
	/**
	 * 获取搜索结果记录的内容
	 * 
	 * @return 搜索结果记录的内容
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 设置搜索结果记录的内容
	 * 
	 * @param 搜索结果记录的内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "SearchRecord [score=" + score + ", id=" + id + ", title="
				+ title + ", summary=" + summary + ", facetDate=" + facetDate
				+ ", createDate=" + createDate + ", lastModifyDate="
				+ lastModifyDate + ", category=" + category + ", database="
				+ database + ", otherFields=" + otherFields + "]";
	}
}
