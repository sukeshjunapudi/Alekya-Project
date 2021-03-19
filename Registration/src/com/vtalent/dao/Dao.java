package com.vtalent.dao;

import java.util.List;

import com.vtalent.bean.EmpBean;

public interface Dao {
	public int saveEmployee(EmpBean emp);
	public List<EmpBean>getAllEmployees();
	public int updateEmployee(EmpBean emp);
	public int deleteEmplyee(String empFirstName);
	
	
}
