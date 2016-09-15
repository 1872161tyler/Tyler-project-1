package org.cs.search.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ��ѯ�����
 * @author wangshaoping
 *
 */
public class SearchResult {
	private String 					splitSearchText;								//�ִʺ�������ı�
	private Pagination				pagination =new Pagination();					//��ѯ�����ҳ��Ϣ
	private int						executeTime;									//ִ��ʱ��(����)
	private List<SearchRecord> 		records =new ArrayList<SearchRecord>();			//��ѯ���صļ�¼��
	private Map<String, Object>		otherRecords = new HashMap<String, Object>();	//��ѯ���ص�������¼
	private String 					searchWord;                                     //��ȡ���β�ѯ���ʹ�õĹؼ���
	private String  				errorLevel;                                     //������
	private List<String>			relateWords;									//��������ʼ�
	
	/**
	 * ��ȡ�ִʺ�������ı�
	 * @return �ִʺ�������ı�
	 */
	public String getSplitSearchText() {
		return splitSearchText;
	}

	/**
	 * ���÷ִʺ�������ı�
	 * @param splitSearchText �ִʺ�������ı�
	 */
	public void setSplitSearchText(String splitSearchText) {
		this.splitSearchText = splitSearchText;
	}

	/**
	 * ��ȡ��ѯ����ķ�ҳ��Ϣ
	 * @return ��ѯ����ķ�ҳ��Ϣ
	 */
	public Pagination getPagination() {
		return pagination;
	}
	
	/**
	 * ���ò�ѯ����ķ�ҳ��Ϣ
	 * @param pagination ��ѯ����ķ�ҳ��Ϣ
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	/**
	 * ��ȡ��ѯִ�е�ʱ��(������)
	 * @return ��ѯִ�е�ʱ��(������)
	 */
	public int getExecuteTime() {
		return executeTime;
	}
	
	/**
	 * ���ò�ѯִ�е�ʱ��(������)
	 * @param executeTime ��ѯִ�е�ʱ��(������)
	 */
	public void setExecuteTime(int executeTime) {
		this.executeTime = executeTime;
	}

	/**
	 * ��ȡ��ѯƥ���ĵ��б�
	 * @return ��ѯƥ���ĵ��б�
	 */
	public List<SearchRecord> getRecords() {
		return records;
	}
	
	/**
	 * ��ȡ������¼
	 * @return ������¼����
	 */
	public Map<String, Object> getOtherRecords() 
	{
		return otherRecords;
	}
	
	/**
	 * ����������¼
	 * @param otherRecords ������¼����
	 */
	public void setOtherRecords(Map<String, Object> otherRecords) 
	{
		this.otherRecords = otherRecords;
	}

	/**
	 * ���ò�ѯƥ���ĵ��б�
	 * @param records ��ѯƥ���ĵ��б�
	 */
	public void setRecords(List<SearchRecord> records) {
		this.records = records;
	}
	
	/**
	 * ��ȡ��ѯ��
	 * @return ���β�ѯʹ�õĹؼ���
	 */
	public String getSearchWord() {
		return searchWord;
	}
	/**
	 * ���ò�ѯ��
	 * @param searchWord ���β�ѯʹ�õĹؼ���
	 */
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
	/**
	 * ��ȡ����ȼ�
	 * @return ���ξ���ļ���
	 */
	public String getErrorLevel() {
		return errorLevel;
	}
	
	/**
	 * ���ô���ȼ�
	 * @param searchWord ���ξ���ļ���
	 */
	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel;
	}
	
	/**
	 * ��ȡ��������ʼ�
	 * @return ������������ʼ�
	 */
	public List<String> getRelateWords() {
		return relateWords;
	}
	
	/**
	 * ������������ʼ�
	 * @param relateWords ������������ʼ�
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
