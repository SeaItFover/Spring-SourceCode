package com.chanxi.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class A implements BeanFactoryAware, ApplicationContextAware, BeanClassLoaderAware, InitializingBean {

	public C c;

	/*public void setC(C c) {
		this.c = c;
	}*/
//
//	@Autowired
//	private B b;

	@PostConstruct
	public void init() {
		System.out.println("postconstruct");
	}

	public void xml() {
		System.out.println("xml");
	}

	public void test() {
		System.out.println("postProcessor");
	}

	public void destory() {
		System.out.println("destory method for a ");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
