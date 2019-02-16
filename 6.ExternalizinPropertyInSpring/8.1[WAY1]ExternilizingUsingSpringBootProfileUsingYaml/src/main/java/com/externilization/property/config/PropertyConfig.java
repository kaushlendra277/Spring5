package com.externilization.property.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.externilization.property.pojos.FakeDataSource;
import com.externilization.property.pojos.FakeJmsSource;

@Configuration
public class PropertyConfig {
	
	@Value("${guru.db.username}")
	String userName;
	
	@Value("${guru.db.password}")
	String password;
	
	@Value("${guru.db.url}")
	String url;
	
	@Value("${guru.jms.username}")
	String jmsUserName;
	
	@Value("${guru.jms.password}")
	String jmsPassword;
	
	@Value("${guru.jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSoure = new FakeDataSource();
		fakeDataSoure.setUserName(userName);
		fakeDataSoure.setPassword(password);
		fakeDataSoure.setUrl(url);
		return fakeDataSoure;
	}
	
	@Bean
	public FakeJmsSource fakeJmsSource() {
		FakeJmsSource fakeJmsSource = new FakeJmsSource();
		fakeJmsSource.setJmsUserName(jmsUserName);
		fakeJmsSource.setJmsPassword(jmsPassword);
		fakeJmsSource.setJmsUrl(jmsUrl);
		return fakeJmsSource;
	}
}
