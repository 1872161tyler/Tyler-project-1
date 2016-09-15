package org.cs.search.web.form;

import java.util.List;
import java.util.Map;

import org.cs.search.client.api.SearchRecord;

/**
 * 搜索表单
 * @author FX
 *
 */
public class QueryParams 
{
	/**
	 * 关键词
	 */
	private String q;		
	
	/**
	 * 限制类型
	 */
	private int limit;		

	/**
	 * 每页显示数据行数
	 */
	private Integer pageSize=10;
	
	/**
	 * 开始时间
	 */
	private String start;		

	/**
	 * 结束时间
	 */
	private String end;		

	/**
	 * 排序字段
	 */
	private String sortField;		

	/**
	 * 搜索源
	 */
	private String source;		

	/**
	 * 复数搜索源（多选）
	 */
	private String[] multiSources;	

	/**
	 * 搜索源限制：0不限，1选择
	 */
	private int sourceLimit;		

	/**
	 * 总数
	 */
	private long amount;		

	/**
	 * 用时
	 */
	private String delay;		

	/**
	 * 权重类型：0标题权重，1内容权重
	 */
	private int authorityProportionType;		

	/**
	 * 当前页数
	 */
	private int current;		
	
	/**
	 * 是否允许重复记录
	 */
	private boolean repeat = false;

	/**
	 * 搜索结果集
	 */
	private List<SearchRecord> records;		
	
	/**
	 * 拼音搜索开关
	 */
	private boolean pinyinFlag=false;
	
	/**
	 * 智能纠错开关
	 */
	private boolean ErrorCorrectionFlag=false;
	
	/**
	 * 高级搜索开关
	 */
	private boolean advancedSearchFlag=false;
	
	/**
	 * 范围搜索开关
	 */
	private boolean searchRangeFlag=false;
	
	/**
	 * 搜索字段选项
	 */
	private String[] searchFields;
	
	/**
	 * 高级搜索选项
	 */
	private Map<String,String[]> ASMap;
	
	public String getQ() 
	{
		return q;
	}

	public void setQ(String q) 
	{
		this.q = q;
	}

	public int getLimit() 
	{
		return limit;
	}

	public void setLimit(int limit) 
	{
		this.limit = limit;
	}

	public String getStart() 
	{
		return start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setStart(String start) 
	{
		this.start = start;
	}

	public String getEnd() 
	{
		return end;
	}

	public void setEnd(String end) 
	{
		this.end = end;
	}

	public String getSortField() 
	{
		return sortField;
	}

	public void setSortField(String sortField) 
	{
		this.sortField = sortField;
	}

	public String getSource() 
	{
		return source;
	}

	public void setSource(String source) 
	{
		this.source = source;
	}

	public long getAmount() 
	{
		return amount;
	}

	public void setAmount(long amount) 
	{
		this.amount = amount;
	}

	public String getDelay() 
	{
		return delay;
	}

	public void setDelay(String delay) 
	{
		this.delay = delay;
	}

	public List<SearchRecord> getRecords() 
	{
		return records;
	}

	public void setRecords(List<SearchRecord> records) 
	{
		this.records = records;
	}

	public int getCurrent() 
	{
		return current;
	}

	public void setCurrent(int current) 
	{
		this.current = current;
	}

	public String[] getMultiSources() 
	{
		return multiSources;
	}

	public void setMultiSources(String[] multiSources) 
	{
		this.multiSources = multiSources;
	}

	public int getSourceLimit() 
	{
		return sourceLimit;
	}

	public void setSourceLimit(int sourceLimit) 
	{
		this.sourceLimit = sourceLimit;
	}

	public int getAuthorityProportionType() 
	{
		return authorityProportionType;
	}

	public void setAuthorityProportionType(int authorityProportionType) 
	{
		this.authorityProportionType = authorityProportionType;
	}

	public boolean getRepeat() 
	{
		return repeat;
	}

	public void setRepeat(boolean repeat) 
	{
		this.repeat = repeat;
	}

	public boolean getPinyinFlag() {
		return pinyinFlag;
	}

	public void setPinyinFlag(boolean pinyinFlag) {
		this.pinyinFlag = pinyinFlag;
	}

	public boolean getErrorCorrectionFlag() {
		return ErrorCorrectionFlag;
	}

	public void setErrorCorrectionFlag(boolean errorCorrectionFlag) {
		ErrorCorrectionFlag = errorCorrectionFlag;
	}

	public boolean getAdvancedSearchFlag() {
		return advancedSearchFlag;
	}

	public void setAdvancedSearchFlag(boolean advancedSearchFlag) {
		this.advancedSearchFlag = advancedSearchFlag;
	}

	public Map<String,String[]> getASMap() {
		return ASMap;
	}

	public void setASMap(Map<String,String[]> aSMap) {
		ASMap = aSMap;
	}

	public boolean getSearchRangeFlag() {
		return searchRangeFlag;
	}

	public void setSearchRangeFlag(boolean searchRangeFlag) {
		this.searchRangeFlag = searchRangeFlag;
	}

	public String[] getSearchFields() {
		return searchFields;
	}

	public void setSearchFields(String[] searchFields) {
		this.searchFields = searchFields;
	}
	
}
