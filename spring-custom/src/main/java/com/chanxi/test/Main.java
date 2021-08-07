package com.chanxi.test;

import com.chanxi.bean.A;
import com.chanxi.config.AppConfig;
import com.chanxi.factorybean.Fb;
import com.chanxi.factorybean.TestBean;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
//		ac.setAllowCircularReferences(false);
		//ac.setId("dsfafdsfa");
//		ac.register(AppConfig.class);
//		ac.registerAlias("testBean", "&app");
//		ac.registerAlias("a", "&a");
//		ac.registerAlias("&app", "app");
//		ac.registerAlias("appConfig", "appAlias2");
//		ac.registerAlias("appAlias2", "appAlias3");
//		ac.registerAlias("aaa", "fff");
		ac.refresh();
		System.out.println(ac.getBean("fb2"));
//		System.out.println(ac.getBean("a"));
//		System.out.println(ac.getBean("testBean", Fb.class));
////		System.out.println(ac.getBean("&a"));
//		System.out.println(ac.getBean("testBean"));
//		System.out.println(ac.getBean("app"));
//		System.out.println(ac.getBean("app"));
//		System.out.println(ac.getBean("app"));
//		System.out.println(ac.getBean("&app"));
//		System.out.println(ac.getBean("&app"));
//		System.out.println(ac.getBean("&app"));
		//ac.start();
		//ac.stop();
//		System.out.println(ac.getBean("applicationContext"));

		//System.out.println(ac.getBean(A.class));
		//System.out.println(ac.getBean("a"));
//		A bean = ac.getBean(A.class);
//		System.out.println(bean.c);
	}
}
