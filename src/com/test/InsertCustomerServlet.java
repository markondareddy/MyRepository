package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertCustomerServlet
 */
public class InsertCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("Enter the InsertCustomerServlet.java ");
		try {
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String mobile = request.getParameter("mobile");
			String emailid = request.getParameter("emailid");

			// Set the Customer values into Customer Bean or POJO(Plain Old Java
			// Object) class
			Customer customer = new Customer();
			//customer.setName(name);
			//customer.setAddress(address);
			//customer.setMobile(Long.valueOf(mobile));
			//customer.setEmailid(emailid);

			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/Welcome.jsp");
			// Set the customer instance into request.Then only the customer
			// object
			// will be available in the Welcome.jsp page
			request.setAttribute("cust", customer);
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
