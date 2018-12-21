package com.mult.dataservice.config.multitenancy;

public class DataSourceUtil {
	
	private String username;
	private String password;
	private String url;
	private String driverClassName;
	
	public DataSourceUtil(String username, String password, String url, String driverClassName){
		this.username = username;
		this.password = password;
		this.url = url;
		this.driverClassName = driverClassName;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getUrl() {
		return url;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	
	

}
