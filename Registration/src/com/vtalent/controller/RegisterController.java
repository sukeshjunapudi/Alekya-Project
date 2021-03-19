package com.vtalent.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vtalent.bean.EmpBean;
import com.vtalent.service.Service;
import com.vtalent.service.ServiceImplement;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empFirstName=request.getParameter("empFirstName").trim();
		String empLastName=request.getParameter("empLastName").trim();
		String empAddress=request.getParameter("empAddress").trim();
		String empPan=request.getParameter("empPan").trim();
		String empAadar=request.getParameter("empAadar").trim();
		String empMobileNo=request.getParameter("empMobileNo").trim();
		String passportNumber=request.getParameter("passportNumber").trim();
		String empId=request.getParameter("empId").trim();
		////bundle in encapsulation class
		EmpBean bean=new EmpBean();
	
		bean.setEmpFirstName(empFirstName);
        bean.setEmpLastName(empLastName);
        bean.setEmpAddress(empAddress);
        bean.setEmpPan(empPan);
        bean.setEmpAadar(empAadar);
       bean.setEmpMobileNo(Long.parseLong(empMobileNo));
        bean.setPassportNumber(passportNumber);
       bean.setEmpId(Integer.parseInt(empId));
        
       HttpSession session=request.getSession();
       session.setAttribute("empLastName",bean);//key value
        /*session.setAttribute(empFirstName, empFirstName);
        session.setAttribute(empLastName, empLastName);
        session.setAttribute(empAddress, empAddress);
        session.setAttribute(empPan, empPan);
        session.setAttribute(empAadar, empAadar);
        session.setAttribute(empMobileNo, empMobileNo);
        session.setAttribute(passportNumber, passportNumber);*/
        

		
		if(empFirstName!=null && !empFirstName.isEmpty()) {
			try {
				bean.setEmpFirstName(empFirstName);
			}catch(Exception e) {
				empFirstName = null;
			}
		}
		
		if(empLastName!=null && !empLastName.isEmpty()) {
			try {
				bean.setEmpLastName(empLastName);
			}catch(Exception e) {
				empLastName = null;
			}
		}
		
		if(empAddress!=null && !empAddress.isEmpty()) {
			try {
				bean.setEmpAddress(empAddress);
			}catch(Exception e) {
				empAddress = null;
			}
		}
		
		if(empPan!=null && !empPan.isEmpty()) {
			try {
				bean.setEmpPan(empPan);
			}catch(Exception e) {
				empPan = null;
			}
		}
		if(empAadar!=null && !empAadar.isEmpty()) {
			try {
				bean.setEmpAadar(empAadar);
			}catch(Exception e) {
				empAadar = null;
			}
		}
		if(empMobileNo!=null && !empMobileNo.isEmpty()) {
			try {
				bean.setEmpMobileNo(Long.parseLong(empMobileNo));
			}catch(Exception e) {
				empMobileNo = null;
			}
		}
        
						bean.setPassportNumber(passportNumber);
			
		
		/*if (empId != null && !empId.isEmpty()) {
			try {

				bean.setEmpId(Integer.parseInt(empId));
			}

			catch (Exception e) {
				empId = null;
			}
		}*/

      //calling service layer
      Service serv=new ServiceImplement();  //db lo store cheydnki..
      int result=serv.saveEmployee(bean);//bundled object write here so to save in db ipudu save employee bean v alues result lo store aytaye
      
      
 
      			RequestDispatcher fwd = request.getRequestDispatcher("Success.jsp");
      	      fwd.forward(request, response);
      		}

	}


