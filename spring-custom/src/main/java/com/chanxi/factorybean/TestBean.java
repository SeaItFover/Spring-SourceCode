package com.chanxi.factorybean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class TestBean implements FactoryBean, ApplicationContextAware {

	ApplicationContext applicationContext;

	private int a = 1;

	@Override
	public Object getObject() throws Exception {
		if (a < 2) {
			System.out.println(a);
			a++;
			return applicationContext.getBean("testBean");
		}
		return new Fb();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
