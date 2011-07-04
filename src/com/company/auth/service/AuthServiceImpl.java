package com.company.auth.service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import javax.jws.WebService;

import com.company.auth.bean.Employee;
import com.company.auth.dao.EmployeeDAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@WebService(endpointInterface = "com.company.auth.service.AuthService", serviceName = "corporateAuthService")
public class AuthServiceImpl implements AuthService {

	public Employee getEmployee(String gid) {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.getEmployee(gid);
	}

	public byte[] getPdf() {
		
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		try{
		
			Document document = new Document();
	        // step 2
	        PdfWriter.getInstance(document, buffer);
	        // step 3
	        document.open();
	        // step 4
	        document.add(new Paragraph("Hello World!"));
	        // step 5
	        document.close();
		}catch (Exception e) {
			System.out.println("erlejrlker");
		}
		
        
        return buffer.toByteArray();
	}

}