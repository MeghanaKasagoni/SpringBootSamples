package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	private static Map<Long, Employee> employes=new HashMap<>();
	private static Long index=2L;
	
	static {
		Employee employee1=new Employee(1L,"emp1","89897656",200000L);
		Employee employee2=new Employee(2L,"emp2","34563479",600000L);
		employes.put(1L,employee1);
		employes.put(6L,employee2);
	}

	public static List<Employee> getAllEmployees() {
		return new ArrayList<>(employes.values());
	}

	public static Employee getEmployeeDetails(Long employeeId) {
		return employes.get(employeeId);
	}

	public static Employee addEmployee(Employee employee) {
		index+=1;
		employee.setId(index);
		employes.put(index,employee);
		return employee;
	}
	
   public static Employee updateEmployee(Long employeeId, Employee employee) {
		employee.setId(employeeId);
		employes.put(employeeId,employee);
		return employee;
	}

	public static Employee deleteEmployee(Long employeeId) {
		return employes.remove(employeeId);
	}

}

