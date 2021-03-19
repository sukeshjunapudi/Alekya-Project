package com.vtalent.service;

import java.util.ArrayList;
import java.util.List;

import com.vtalent.bean.EmpBean;
import com.vtalent.dao.Dao;
import com.vtalent.dao.DaoImplement;

public class ServiceImplement implements Service {
	
	static Dao dao= new DaoImplement();
			@Override
	public int saveEmployee(EmpBean emp) {
		// TODO Auto-generated method stub
		return dao.saveEmployee(emp);
	}
			@Override
			public List<EmpBean> getAllEmployees() {
				// TODO Auto-generated method stub
				return dao.getAllEmployees();
			}
			@Override
			public int updateEmployee(EmpBean emp) {
				// TODO Auto-generated method stub
				return dao.updateEmployee(emp);
			}
			
			
			@Override
			public int deleteEmplyee(String empFirstName) {
				// TODO Auto-generated method stub
				return dao.deleteEmplyee(empFirstName);
			}
			
			

}