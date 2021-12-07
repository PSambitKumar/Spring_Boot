package com.csm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csm.bean.EmpDto;
import com.csm.entity.Employee;
import com.csm.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmployee(EmpDto dto) {
		String res="";
		try {
			Employee emp=new Employee();
			emp.setName(dto.getName());
			Employee resEmp = employeeRepository.save(emp);
			if(resEmp != null)
				res="sucess";
			else
				res="fail";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	@Override
	public List<EmpDto> getAllEmployee() {
		List<EmpDto> eList=new ArrayList<>();
		EmpDto bean=null;
		try {
			List<Employee> empObjList = employeeRepository.findAll();
			for (Employee employee : empObjList) {
				bean=new EmpDto();
				bean.setEmpId(employee.getEmpId());
				bean.setName(employee.getName());
				eList.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return eList;
	}

}
