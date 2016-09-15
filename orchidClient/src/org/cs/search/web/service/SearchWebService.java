package org.cs.search.web.service;


import java.util.List;
import javax.jws.WebService;
import org.cs.search.client.api.SearchResult;
import org.cs.search.web.bean.CollectionResult;
import org.cs.search.web.bean.Lib;
import org.cs.search.web.form.QueryParams;

@WebService
public interface SearchWebService {
	public CollectionResult<Lib> getConfig();
	public SearchResult getSearchResults(QueryParams queryParams);
	public String getSearchBoxWords(String pinYin);
	public List<String> getSearchTips(String pinYin);
}
