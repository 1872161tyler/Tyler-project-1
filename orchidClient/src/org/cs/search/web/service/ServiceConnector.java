package org.cs.search.web.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ServiceConnector {
	
	private String serviceUrl = null;
	private String host=null;
	private String port=null;
	private String webContextPath="orchid-web-src";
	private String CXFServlet="service";
	private String endpoint="searchRecords";
	
	public ServiceConnector(){
		
	}
	public ServiceConnector(String host,String port,String 
			webContextPath,String CXFServlet,String endpoint){
		this.host=host;
		this.port=port;
		this.webContextPath=webContextPath;
		this.CXFServlet=CXFServlet;
		this.endpoint=endpoint;
	}
	public void setServiceUrl(){
		if(host!=null&&!"".equals(host)&&port!=null&&!"".equals(port)){
			serviceUrl="http://" + host + ":" + port + "/" + webContextPath 
			+ "/" + CXFServlet + "/" + endpoint;
		}else{
			Properties prop = new Properties();
			InputStream is = ServiceConnector.class
					.getResourceAsStream("/search-service.properties");
			try {
				prop.load(is);
			    serviceUrl = "http://" + prop.getProperty("host") + ":"
						+ prop.getProperty("port") + "/"
						+ prop.getProperty("webContextPath")+ "/"
						+ prop.getProperty("CXFServlet")+ "/"
						+ prop.getProperty("endpoint");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public SearchWebService getSearchWebService(){
		setServiceUrl();
		JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
		svr.setServiceClass(SearchWebService.class);
		svr.setAddress(serviceUrl);
		SearchWebService searchWebService = (SearchWebService)svr.create();
		return searchWebService;
			
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getWebContextPath() {
		return webContextPath;
	}
	public void setWebContextPath(String webContextPath) {
		this.webContextPath = webContextPath;
	}
	public String getCXFServlet() {
		return CXFServlet;
	}
	public void setCXFServlet(String cXFServlet) {
		CXFServlet = cXFServlet;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	
}
