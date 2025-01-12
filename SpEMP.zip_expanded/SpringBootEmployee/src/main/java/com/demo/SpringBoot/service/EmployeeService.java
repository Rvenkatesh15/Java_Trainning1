package com.demo.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBoot.model.Employee;
import com.demo.SpringBoot.repo.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository emp;
	
	public List<Employee> getAllEmployees()
	{
		return emp.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Long id)
	{
		return emp.findById(id);
	}
	
	public Employee saveEmployee(Employee e)
	{
		return emp.save(e);
	}
	
	public Employee updateEmployee(Employee e1)
	{
		return emp.save(e1);
	}
	
	public void deleteEmployee(Long id)
	{
		emp.deleteById(id);
	}
}
