package org.cs.search.client.api;

import org.cs.search.web.service.SearchWebService;
import org.cs.search.web.service.ServiceConnector;

public class ServiceFactory {
	private static SearchWebService search;
	public static SearchWebService getService(){
		if (search==null){
			synchronized (SearchWebService.class) {
				if (search==null){
					ServiceConnector sc=new ServiceConnector();
					search=sc.getSearchWebService();
				}
			}
		}
		return search;
	}
}
