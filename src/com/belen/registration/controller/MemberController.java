package com.belen.registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.belen.registration.dao.MemberDao;

public class MemberController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//extract the form parameters
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String password=request.getParameter("password");
		String username=request.getParameter("username");
		String city=request.getParameter("city");
		
		//create session
		HttpSession session=request.getSession(true);
		
		MemberDao memberDao=new MemberDao();
		memberDao.registerMember(firstName, lastName, username, password, city);
		response.sendRedirect("success");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}

}
