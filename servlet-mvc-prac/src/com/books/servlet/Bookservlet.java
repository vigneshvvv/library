package com.books.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.books.content.Books;
import com.books.controller.Bookscontroller;



@WebServlet("/books")
public class Bookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final HttpServletRequest request = null;
	
	Bookscontroller bookcon= new Bookscontroller();
       
    
    public Bookservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List <Books> mylist= bookcon.getbookdetail();
		HttpSession session=  request.getSession();
		session.setAttribute("listbooks",mylist);
		RequestDispatcher rsp= request.getRequestDispatcher("/booklist.jsp");
		rsp.forward(request, response);
            
		//java.util.List <Books> mylist= bookcon.getbookdetail();
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Books book=new Books(0,req.getParameter("bookname"),req.getParameter("author"),Integer.parseInt(req.getParameter("price")));
		
		//Books book= new Books(0,req.getParameter("book_name"), req.getParameter("author"),Integer.parseInt("price"));
//	
//		String bookname= req.getParameter("bookname");
//		String author = req.getParameter("author");
//		int price= Integer.parseInt(req.getParameter("price"));
//		
//		Books book= new Books();
//		book.setBook_name(bookname);
//		book.setAuthor(author);
//		book.setPrice(price);
		//RequestDispatcher rsp = req.getRequestDispatcher("./index.html");

		String status= bookcon.insertbook(book) ? "Success": "Failed";
		
		RequestDispatcher rsp = req.getRequestDispatcher("/index.html");
    	
//		PrintWriter out = response.getWriter();
//		out.println("<div class=\"item\">\n"
//				+ "          <label><span>*</span> Insert status : "+status+"</label>\n"
//				+ "        </div>");
		
		rsp.include(req, response);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		boolean status = bookcon.deleteBook(id);
		
		resp.setContentType("text");

		PrintWriter out = resp.getWriter();
		out.println(id+" - Deleted status is :"+status);
		
		
		
	}


	
}
