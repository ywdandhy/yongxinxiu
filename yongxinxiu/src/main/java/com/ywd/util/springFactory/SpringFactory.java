package com.ywd.util.springFactory;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationObjectSupport;


@Component
public class SpringFactory extends WebApplicationObjectSupport{
private static ApplicationContext context;
	
	@PostConstruct
	public void init() throws ServletException {
		context = getWebApplicationContext();
		if (context == null) {
			context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		}
	}
	
	/**
	 * 根据class拿到spring容器中的bean
	 * @param <T>
	 * @param id
	 * @return
	 */
	public static <T> T getBean(Class<T> requiredType) {
		return context.getBean(requiredType);
	}
}
