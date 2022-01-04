package com.serv.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ser.service.Logservice;
import com.serv.dbo.Logindbo;
import com.serv.login.Login;

/**
 * Servlet implementation class Logservlet
 */
@WebServlet("/Logservlet")
public class Logservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	//Logindbo logind= new Logindbo();
	
	Logservice lgsrv =new Logservice();
	
    public Logservlet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest req, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String status;
		
		Login login= new Login(request.getParameter("user"),request.getParameter("pass"));
		
		status= lgsrv.loginService(login);
		
		RequestDispatcher rsp = request.getRequestDispatcher("/index.html");
		
		PrintWriter out = response.getWriter();
		out.println("<div class=\"item\">\n"
				+ "          <label><span>*</span> user add : "+status+"</label>\n"
				+ "        </div>");
		
		
//		doGet(request, response);
		rsp.include(request, response);
		
		
		
		
		
	}

}
