package org.cs.search.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查询结果类
 * @author wangshaoping
 *
 */
public class SearchResult {
	private String 					splitSearchText;								//分词后的搜索文本
	private Pagination				pagination =new Pagination();					//查询结果分页信息
	private int						executeTime;									//执行时间(毫秒)
	private List<SearchRecord> 		records =new ArrayList<SearchRecord>();			//查询返回的记录集
	private Map<String, Object>		otherRecords = new HashMap<String, Object>();	//查询返回的其他记录
	private String 					searchWord;                                     //获取本次查询结果使用的关键词
	private String  				errorLevel;                                     //纠错级别
	private List<String>			relateWords;									//相关搜索词集
	
	/**
	 * 获取分词后的搜索文本
	 * @return 分词后的搜索文本
	 */
	public String getSplitSearchText() {
		return splitSearchText;
	}

	/**
	 * 设置分词后的搜索文本
	 * @param splitSearchText 分词后的搜索文本
	 */
	public void setSplitSearchText(String splitSearchText) {
		this.splitSearchText = splitSearchText;
	}

	/**
	 * 获取查询结果的分页信息
	 * @return 查询结果的分页信息
	 */
	public Pagination getPagination() {
		return pagination;
	}
	
	/**
	 * 设置查询结果的分页信息
	 * @param pagination 查询结果的分页信息
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	/**
	 * 获取查询执行的时间(毫秒数)
	 * @return 查询执行的时间(毫秒数)
	 */
	public int getExecuteTime() {
		return executeTime;
	}
	
	/**
	 * 设置查询执行的时间(毫秒数)
	 * @param executeTime 查询执行的时间(毫秒数)
	 */
	public void setExecuteTime(int executeTime) {
		this.executeTime = executeTime;
	}

	/**
	 * 获取查询匹配文档列表
	 * @return 查询匹配文档列表
	 */
	public List<SearchRecord> getRecords() {
		return records;
	}
	
	/**
	 * 获取其他记录
	 * @return 其他记录集合
	 */
	public Map<String, Object> getOtherRecords() 
	{
		return otherRecords;
	}
	
	/**
	 * 设置其他记录
	 * @param otherRecords 其他记录集合
	 */
	public void setOtherRecords(Map<String, Object> otherRecords) 
	{
		this.otherRecords = otherRecords;
	}

	/**
	 * 设置查询匹配文档列表
	 * @param records 查询匹配文档列表
	 */
	public void setRecords(List<SearchRecord> records) {
		this.records = records;
	}
	
	/**
	 * 获取查询词
	 * @return 本次查询使用的关键词
	 */
	public String getSearchWord() {
		return searchWord;
	}
	/**
	 * 设置查询词
	 * @param searchWord 本次查询使用的关键词
	 */
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
	/**
	 * 获取错误等级
	 * @return 本次纠错的级别
	 */
	public String getErrorLevel() {
		return errorLevel;
	}
	
	/**
	 * 设置错误等级
	 * @param searchWord 本次纠错的级别
	 */
	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel;
	}
	
	/**
	 * 获取相关搜索词集
	 * @return 本次相关搜索词集
	 */
	public List<String> getRelateWords() {
		return relateWords;
	}
	
	/**
	 * 设置相关搜索词集
	 * @param relateWords 本次相关搜索词集
	 */
	public void setRelateWords(List<String> relateWords) {
		this.relateWords = relateWords;
	}

	@Override
	public String toString() {
		return "SearchResult [pagination=" + pagination + ", executeTime="
				+ executeTime + ", records=" + records + "]";
	}
}
