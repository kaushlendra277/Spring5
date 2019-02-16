package com.example.demo.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.example.demo.components.LifeCycleDemoBean;

public class LifeCycleDemoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleDemoBean) 
		{
			((LifeCycleDemoBean)bean).postProcessBeforeInitialization();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleDemoBean) 
		{
			((LifeCycleDemoBean)bean).postProcessAfterInitialization();
		}
		return bean;
	}

}
