package com.company.auth.service;

import javax.jws.WebService;

import com.company.auth.bean.Employee;
import com.company.auth.dao.EmployeeDAO;

@WebService(endpointInterface = "com.company.auth.service.AuthService", serviceName = "corporateAuthService")
public class AuthServiceImpl implements AuthService {

	public Employee getEmployee(String gid) {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.getEmployee(gid);
	}

}