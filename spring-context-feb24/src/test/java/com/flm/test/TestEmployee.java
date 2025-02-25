package com.flm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.model.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1=cxt.getBean("e1",Employee.class);
		System.out.println(emp1);
		Employee emp2=cxt.getBean("e2",Employee.class);
		System.out.println(emp2);

			}
}
