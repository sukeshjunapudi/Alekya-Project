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
 * Servlet implementation class GetAllController
 */
@WebServlet("/GetAllController")
public class UpdateController extends HttpServlet {
	private static final long seurialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empFirstName=request.getParameter("empFirstName");
		String empLastName=request.getParameter("empLastName");
		String empAddress=request.getParameter("empAddress");
		String empPan=request.getParameter("empPan");
		String empAadar=request.getParameter("empAadar");
		String empMobileNo=request.getParameter("empMobileNo");
		String passportNumber=request.getParameter("passportNumber");
		//String empId=request.getParameter("empId");
		////bundle in encapsulation class
		EmpBean bean=new EmpBean();
		
		bean.setEmpFirstName(empFirstName);
        bean.setEmpLastName(empLastName);
        bean.setEmpAddress(empAddress);
        bean.setEmpPan(empPan);
        bean.setEmpAadar(empAadar);
       bean.setEmpMobileNo(Long.parseLong(empMobileNo));
        bean.setPassportNumber(passportNumber);
       //bean.setEmpId(Integer.parseInt(empId));
        
           //calling service layer
       PrintWriter out=response.getWriter();
     Service serv=new ServiceImplement();  //db lo store cheydnki..
     int result=serv.updateEmployee(bean);//bundled object write here so to save in db ipudu save employee bean v alues result lo store aytaye
     out.println("updated sucess");
		
	
	}

}
