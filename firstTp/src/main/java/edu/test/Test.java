package edu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.service.Service;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("ApplicationContext.xml");
Service service = (Service) cxt.getBean("service");
service.resultat();

	}

}
