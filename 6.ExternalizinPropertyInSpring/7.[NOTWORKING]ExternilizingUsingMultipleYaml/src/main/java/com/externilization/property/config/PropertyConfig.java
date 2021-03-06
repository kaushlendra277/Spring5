package com.externilization.property.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.externilization.property.pojos.FakeDataSource;
import com.externilization.property.pojos.FakeJmsSource;

@Configuration
// this annotation is to tell spring we have some custom.properties file
// that spring need to read using PropertySourcesPlaceholderConfigurer bean
@PropertySources({
	@PropertySource({"classpath:dbsource.yml"}),
	@PropertySource({"classpath:jms.yml"})
	})
public class PropertyConfig {
	
	@Bean
	// we need this bean since we are using dbsource.properties file
	// it is not required if we used application.properties(default property fie auto read by spring) 
	// why this bean works only when created using static method
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
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
