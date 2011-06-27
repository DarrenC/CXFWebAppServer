package com.company.auth.dao;

import java.util.HashSet;

import com.company.auth.bean.Address;
import com.company.auth.bean.Employee;
import com.company.auth.bean.EmployeeAddress;

public class EmployeeDAO {

	public Employee getEmployee(String id){
		Employee emp = new Employee();
		
		emp.setFirstName("DC");
		emp.setLastName("DC");
		emp.setGid(id);
		emp.setPrivileges(new HashSet<String>());
		
		EmployeeAddress empAddress = new EmployeeAddress();
		Address address = new Address();
		address.setStreetName("Test Street Name");
		empAddress.setAddress(address);
		empAddress.setAddressType("address type");
		
		emp.setEmpAddress(empAddress);
		
		return emp;
	}
}
