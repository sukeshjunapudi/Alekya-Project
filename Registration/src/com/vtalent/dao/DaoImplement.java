package com.vtalent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.vtalent.bean.EmpBean;
import com.vtalent.connection.MySqlConnection;

public class DaoImplement implements Dao {
	
	private Connection con;
	 PreparedStatement pst;
	ResultSet resultset;
	
	public DaoImplement() {
	con=MySqlConnection.getInstance();
	}
	@Override
	public int saveEmployee(EmpBean emp) {
		// TODO Auto-generated method stub
		int result=0;
		String query="insert into emptable values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,emp.getEmpFirstName());
			pst.setString(2,emp.getEmpLastName());
			pst.setString(3,emp.getEmpAddress());
			pst.setString(4,emp.getEmpPan());
			pst.setString(5,emp.getEmpAadar());
			pst.setLong(6,emp.getEmpMobileNo());
			pst.setString(7,emp.getPassportNumber());
			pst.setInt(8,emp.getEmpId());
			result=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public List<EmpBean> getAllEmployees() {
		// TODO Auto-generated method stub
		List<EmpBean>  emplist=new ArrayList<EmpBean>();
		String query = "select * from emptable";
		try {
			
			pst=con.prepareStatement(query);
			resultset=pst.executeQuery();
			EmpBean bean=null;
			while(resultset.next()){
				bean=new EmpBean();
				bean.setEmpFirstName(resultset.getString(1));
				bean.setEmpLastName(resultset.getString(2));
				bean.setEmpAddress(resultset.getString(3));
				bean.setEmpPan(resultset.getString(4));
				bean.setEmpAadar(resultset.getString(5));
				bean.setEmpMobileNo(resultset.getLong(6));
				bean.setPassportNumber(resultset.getString(7));
				bean.setEmpId(resultset.getInt(8));
				emplist.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
	}
	@Override
	public int updateEmployee(EmpBean emp) {
		// TODO Auto-generated method stub
		int result=0;
		String query="update emptable set  empLastName=?, empAddress=?, empPan=?, empAadar=?, empMobileNo=?, empPassportNumber=? where empFirstName=?";
		try {
			pst=con.prepareStatement(query);
			
			pst.setString(1,emp.getEmpLastName());
			pst.setString(2,emp.getEmpAddress());
			pst.setString(3,emp.getEmpPan());
			pst.setString(4,emp.getEmpAadar());
			pst.setLong(5,emp.getEmpMobileNo());
			pst.setString(6,emp.getPassportNumber());
			pst.setString(7,emp.getEmpFirstName());
			result=pst.executeUpdate();
			//pst.setInt(8, emp.getEmpId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteEmplyee(String empFirstName) {
		// TODO Auto-generated method stub
		int result=0;
		String query="Delete from emptable where empFirstName=?";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1,empFirstName);
			result=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}


}
