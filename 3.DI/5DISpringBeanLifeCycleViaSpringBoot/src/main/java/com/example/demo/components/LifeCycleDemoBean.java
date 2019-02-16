package com.example.demo.components;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.soap.InitParam;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements BeanNameAware,
										  BeanFactoryAware,
										  ApplicationContextAware,
										  InitializingBean,
										  DisposableBean{
	// Step 1: Bean Constructor
	public LifeCycleDemoBean() {
		super();
		System.out.println("Step 1: Bean Constructor");
	}
	
	//Step 2: setBeanName() of BeanNameAware(I)
	@Override
	public void setBeanName(String name) {
		System.out.println("Step 2: setBeanName() of BeanNameAware(I)");
	}
	
	// Step 3: setBeanFactory() of BeanFactoryAware(I)
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Step 3: setBeanFactory() of BeanFactoryAware(I)");
	}
	
	// Step 4: setApplicationContext() of ApplicationContextAware(I)
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Step 4: setApplicationContext() of ApplicationContextAware(I)");
	}
	
	//Step 5: postProcessBeforeInitialization() of BeanPostProcessor(I)
	public void postProcessBeforeInitialization() {
		System.out.println("Step unknown : postProcessAfterInitialization() of BeanPostProcessor(I)");
	}
	
	// Step 6 : @PostConstruct annotated method
	@PostConstruct
	public void postConstruct() {
		System.out.println("Step 6 : @PostConstruct annotated method");
	}
	
	//Step 7: afterPropertiesSet() of InitializingBean(I)
	public void afterPropertiesSet() throws Exception {
		System.out.println("Step 7: afterPropertiesSet() of InitializingBean(I)");
	}

	//Step 8: postProcessAfterInitialization() of BeanPostProcessor(I)
	public void postProcessAfterInitialization() {
		System.out.println("Step unknown : postProcessAfterInitialization() of BeanPostProcessor(I)");
	}
	
	//Step 9 : @PreDestroy annotated method
	@PreDestroy
	public void preDestroy() {
		System.out.println("Step 9 : @PreDestroy annotated method");
	}
	//Step 10: destroy() of DisposableBean(I)
	@Override
	public void destroy() throws Exception {
		System.out.println("Step 10: destroy() of DisposableBean(I)");
	}
}
