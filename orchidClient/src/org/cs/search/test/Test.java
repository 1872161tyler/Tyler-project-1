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
		queryParams.setCurrent(1);//当前页  （默认每页显示10行数据）
		queryParams.setPageSize(10);//每页显示10行数据
		String keyword="snapchat";
		queryParams.setQ(keyword);//查询关键词
		queryParams.setSortField("PRE_CREATE_DATE");//排序字段，这里是根据相关度排序PRE_CREATE_DATE
		queryParams.setStart("2014-08-07");//起始时间
		queryParams.setEnd("2015-08-07");//结束时间
		queryParams.setMultiSources(new String[] {"05"});
		queryParams.setAuthorityProportionType(0);
		queryParams.setPinyinFlag(true);
		queryParams.setErrorCorrectionFlag(true);
		queryParams.setAdvancedSearchFlag(false);
		queryParams.setSearchRangeFlag(true);
		String[] fields={"PRE_CONTENT"};
		queryParams.setSearchFields(fields);
		Map<String,String[]> aSMap=new HashMap<String,String[]>();
		String[] strs1={"军事","力量"};
		String[] strs2={"赵甲","傻逼"};
		String[] strs3={"力量"};
		String[] strs4={"军事"};
		aSMap.put("aso1", strs1);
		aSMap.put("aso2", strs2);
		aSMap.put("aso3", strs3);
		aSMap.put("aso4", strs4);
		queryParams.setASMap(aSMap);
		SearchResult searchResult=search.getSearchResults(queryParams);//查询得到的结果集
		CollectionResult<Lib> libs=search.getConfig();
		String sID=libs.getList().get(0).getId();
		String sLable=libs.getList().get(0).getLabel();
		List<String> sbf=search.getSearchTips("中小");
		String sb=search.getSearchBoxWords("中信标");
		long endTime=System.currentTimeMillis();
		System.out.println("完成本次查询所用时间："+(endTime-startTime));
		System.out.println(sb);//搜索框提示词
		System.out.println(sbf);
		System.out.println("查询执行时间:"+searchResult.getExecuteTime());//executeTime:查询执行时间
		System.out.println("查询结果集数据总行数:"+searchResult.getPagination().getRowCount());//查询结果集数据总行数
		System.out.println(sID+sLable);//数据源ID
		System.out.println(searchResult.getRelateWords());
		System.out.println("错误级别："+searchResult.getErrorLevel());
		System.out.println("完成本次查询所用关键词: "+searchResult.getSearchWord());
		List<SearchRecord> listResult=searchResult.getRecords();//查询数据集合List
		System.out.println("结果数目："+listResult.size());
		int i=1;
		for(SearchRecord record : listResult){
			System.out.println(i);
			System.out.println(record.getId());//id:数据主键
			System.out.println(record.getTitle());//title：文档标题
			System.out.println(record.getSummary());//summary：文档类容
			System.out.println(record.getCreateDate());//lastmodifydate：发布时间
			i++;
		}
		
	}

}
