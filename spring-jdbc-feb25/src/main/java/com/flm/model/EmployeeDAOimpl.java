package com.flm.model;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.flm.dao.EmployeeDAO;

public class EmployeeDAOimpl implements EmployeeDAO {
	private String INSERT="insert into employee(id,name,address,salary) values(?,?,?,?)" ;
	
	private JdbcTemplate jdbctemplate;
	
	public void setDatasource2(DataSource ds) {
		jdbctemplate=new JdbcTemplate(ds);
	}

	@Override
	public void createEmployee(Employee emp) {
		jdbctemplate.update(INSERT,emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary());
		
	
		
	}

}
