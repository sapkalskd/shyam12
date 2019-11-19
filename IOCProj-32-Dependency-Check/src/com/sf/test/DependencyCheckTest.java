package com.sf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sf.beans.StudentData;

public class DependencyCheckTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		BeanFactory factory = null;
		ClassPathResource res = null;
		StudentData st = null;
		
		//Create IOC Container
		res = new ClassPathResource("com/sf/cfgs/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		
		//get bean class
		st = factory.getBean("stud",StudentData.class);
		System.out.println(st);
		
	}

}
