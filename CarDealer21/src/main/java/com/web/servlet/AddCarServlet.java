package com.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dealer.model.Car;

public class AddCarServlet {

	public AddCarServlet() {
		/**
		 * Servlet implementation class GpaServlet
		 */
		@WebServlet("/AddCarServlet")
		public class  AddCarServlet extends HttpServlet {
			private static final long serialVersionUID = 1L;
		       
		    /**
		     * @see HttpServlet#HttpServlet()
		     */
		    public AddCarServlet() {
		        super();
		    }

			/**
			 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				
				
				
				
				
				/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				doGet(request, response);  
			}
		}
	}
	
}
		

