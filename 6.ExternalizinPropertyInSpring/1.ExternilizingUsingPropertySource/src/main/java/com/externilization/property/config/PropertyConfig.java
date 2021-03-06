package com.externilization.property.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.externilization.property.pojos.FakeDataSource;

@Configuration
// this annotation is to tell spring we have some custom .properties file
// that spring need to read using PropertySourcesPlaceholderConfigurer bean
@PropertySources({
	@PropertySource({"classpath:dbsource.properties"}) 
	})
public class PropertyConfig {
	
	@Bean
	// we need this bean since we are using dbsource.properties file
	// it is not required if we used application.properties(default property fie auto read by spring) 
	// why this bean works only when created using static method
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Value("${guru.username}")
	String userName;
	
	@Value("${guru.password}")
	String password;
	
	@Value("${guru.url}")
	String url;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSoure = new FakeDataSource();
		fakeDataSoure.setUserName(userName);
		fakeDataSoure.setPassword(password);
		fakeDataSoure.setUrl(url);
		return fakeDataSoure;
	}
}
