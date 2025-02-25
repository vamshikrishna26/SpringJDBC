package com.flm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.dao.EmployeeDAO;
import com.flm.model.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDAO dao = cxt.getBean("datasource1", EmployeeDAO.class);
        Employee emp = cxt.getBean("emp", Employee.class);
        dao.createEmployee(emp);
        System.out.println("Inserted Successfully");
    }
}
