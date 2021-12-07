package com.csm.service;

import java.util.List;

import com.csm.bean.EmpDto;

public interface EmployeeService {

	String saveEmployee(EmpDto dto);

	List<EmpDto> getAllEmployee();
	
}
