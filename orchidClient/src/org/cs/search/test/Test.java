package org.cs.search.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cs.search.client.api.SearchRecord;
import org.cs.search.client.api.SearchResult;
import org.cs.search.client.api.ServiceFactory;
import org.cs.search.web.bean.CollectionResult;
import org.cs.search.web.bean.Lib;
import org.cs.search.web.form.QueryParams;
import org.cs.search.web.service.SearchWebService;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		SearchWebService search=ServiceFactory.getService();
		QueryParams queryParams=new QueryParams();
		queryParams.setCurrent(1);//��ǰҳ  ��Ĭ��ÿҳ��ʾ10�����ݣ�
		queryParams.setPageSize(10);//ÿҳ��ʾ10������
		String keyword="snapchat";
		queryParams.setQ(keyword);//��ѯ�ؼ���
		queryParams.setSortField("PRE_CREATE_DATE");//�����ֶΣ������Ǹ�����ض�����PRE_CREATE_DATE
		queryParams.setStart("2014-08-07");//��ʼʱ��
		queryParams.setEnd("2015-08-07");//����ʱ��
		queryParams.setMultiSources(new String[] {"05"});
		queryParams.setAuthorityProportionType(0);
		queryParams.setPinyinFlag(true);
		queryParams.setErrorCorrectionFlag(true);
		queryParams.setAdvancedSearchFlag(false);
		queryParams.setSearchRangeFlag(true);
		String[] fields={"PRE_CONTENT"};
		queryParams.setSearchFields(fields);
		Map<String,String[]> aSMap=new HashMap<String,String[]>();
		String[] strs1={"����","����"};
		String[] strs2={"�Լ�","ɵ��"};
		String[] strs3={"����"};
		String[] strs4={"����"};
		aSMap.put("aso1", strs1);
		aSMap.put("aso2", strs2);
		aSMap.put("aso3", strs3);
		aSMap.put("aso4", strs4);
		queryParams.setASMap(aSMap);
		SearchResult searchResult=search.getSearchResults(queryParams);//��ѯ�õ��Ľ����
		CollectionResult<Lib> libs=search.getConfig();
		String sID=libs.getList().get(0).getId();
		String sLable=libs.getList().get(0).getLabel();
		List<String> sbf=search.getSearchTips("��С");
		String sb=search.getSearchBoxWords("���ű�");
		long endTime=System.currentTimeMillis();
		System.out.println("��ɱ��β�ѯ����ʱ�䣺"+(endTime-startTime));
		System.out.println(sb);//��������ʾ��
		System.out.println(sbf);
		System.out.println("��ѯִ��ʱ��:"+searchResult.getExecuteTime());//executeTime:��ѯִ��ʱ��
		System.out.println("��ѯ���������������:"+searchResult.getPagination().getRowCount());//��ѯ���������������
		System.out.println(sID+sLable);//����ԴID
		System.out.println(searchResult.getRelateWords());
		System.out.println("���󼶱�"+searchResult.getErrorLevel());
		System.out.println("��ɱ��β�ѯ���ùؼ���: "+searchResult.getSearchWord());
		List<SearchRecord> listResult=searchResult.getRecords();//��ѯ���ݼ���List
		System.out.println("�����Ŀ��"+listResult.size());
		int i=1;
		for(SearchRecord record : listResult){
			System.out.println(i);
			System.out.println(record.getId());//id:��������
			System.out.println(record.getTitle());//title���ĵ�����
			System.out.println(record.getSummary());//summary���ĵ�����
			System.out.println(record.getCreateDate());//lastmodifydate������ʱ��
			i++;
		}
		
	}

}
