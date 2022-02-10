package in.co.rays.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;

@WebServlet("/WelcomeCtl")
public class WelcomeCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserBean bean1= new UserBean();
		 String hi = "Hi";
		
		 request.setAttribute("hi", hi);
		 request.setAttribute("n", bean1.getFname());
		//response.sendRedirect("WelcomeView.jsp");
		 RequestDispatcher rd = request.getRequestDispatcher("WelcomeView.jsp");
			rd.forward(request, response);
		
		PrintWriter pw = response.getWriter();
		pw.println("success");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
