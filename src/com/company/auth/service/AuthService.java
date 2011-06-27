package com.company.auth.service;

import javax.jws.WebService;
import javax.jws.WebParam;
import com.company.auth.bean.Employee;

@WebService
public interface AuthService {
    Employee getEmployee(@WebParam(name="gid") String gid);
}


