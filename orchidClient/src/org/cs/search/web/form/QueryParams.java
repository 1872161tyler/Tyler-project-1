package org.cs.search.web.form;

import java.util.List;
import java.util.Map;

import org.cs.search.client.api.SearchRecord;

/**
 * ������
 * @author FX
 *
 */
public class QueryParams 
{
	/**
	 * �ؼ���
	 */
	private String q;		
	
	/**
	 * ��������
	 */
	private int limit;		

	/**
	 * ÿҳ��ʾ��������
	 */
	private Integer pageSize=10;
	
	/**
	 * ��ʼʱ��
	 */
	private String start;		

	/**
	 * ����ʱ��
	 */
	private String end;		

	/**
	 * �����ֶ�
	 */
	private String sortField;		

	/**
	 * ����Դ
	 */
	private String source;		

	/**
	 * ��������Դ����ѡ��
	 */
	private String[] multiSources;	

	/**
	 * ����Դ���ƣ�0���ޣ�1ѡ��
	 */
	private int sourceLimit;		

	/**
	 * ����
	 */
	private long amount;		

	/**
	 * ��ʱ
	 */
	private String delay;		

	/**
	 * Ȩ�����ͣ�0����Ȩ�أ�1����Ȩ��
	 */
	private int authorityProportionType;		

	/**
	 * ��ǰҳ��
	 */
	private int current;		
	
	/**
	 * �Ƿ������ظ���¼
	 */
	private boolean repeat = false;

	/**
	 * ���������
	 */
	private List<SearchRecord> records;		
	
	/**
	 * ƴ����������
	 */
	private boolean pinyinFlag=false;
	
	/**
	 * ���ܾ�����
	 */
	private boolean ErrorCorrectionFlag=false;
	
	/**
	 * �߼���������
	 */
	private boolean advancedSearchFlag=false;
	
	/**
	 * ��Χ��������
	 */
	private boolean searchRangeFlag=false;
	
	/**
	 * �����ֶ�ѡ��
	 */
	private String[] searchFields;
	
	/**
	 * �߼�����ѡ��
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
