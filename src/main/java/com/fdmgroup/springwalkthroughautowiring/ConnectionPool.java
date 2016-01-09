package com.fdmgroup.springwalkthroughautowiring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class ConnectionPool {
	
	// mandatory attributes
	private String url;
	private String username;
	private String password;
	private int port;
	//@Autowired
	//@Qualifier("connectionFactory1")
	@Resource(name="connectionFactory1")
	private ConnectionFactory connectionFactory;
	
	// optional attributes
	private int minSize;
	private int maxSize;
	
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	@Required
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPort() {
		return port;
	}
	@Required
	public void setPort(int port) {
		this.port = port;
	}
	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}
	public int getMinSize() {
		return minSize;
	}
	public void setMinSize(int minSize) {
		this.minSize = minSize;
	}
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public void checkSetup() {
		System.out.println("Detail:" + url + username + password + connectionFactory + port);
	}
}
