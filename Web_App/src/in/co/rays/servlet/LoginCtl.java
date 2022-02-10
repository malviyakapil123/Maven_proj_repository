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
import in.co.rays.model.LoginModel;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("e", "User resistration Successfull Please Login ");
		RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String u = request.getParameter("user");
		String p = request.getParameter("pwd");

		UserBean bean = new UserBean();
		UserBean bean1;

		bean.setLoginid(u);
		bean.setPassword(p);

		LoginModel model = new LoginModel();
		try {

			bean1 = model.authenticate(bean);
			 PrintWriter out = response.getWriter();
			 out.println("success");
			if (bean1 == null) {
				// response.sendRedirect("LoginView.jsp");
				request.setAttribute("error", "Invalid LoginId and Password");
				RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp"); 
				rd.forward(request, response);
				request.setAttribute("error", "Invalid LoginId and Password");
				

			} else {
			response.sendRedirect("WelcomeCtl");
				 //RequestDispatcher rd = request.getRequestDispatcher("WelcomeCtl");
				//rd.forward(request, response);

			}

		} catch (Exception e) {

			System.out.println(e.getStackTrace());
		}
		PrintWriter out = response.getWriter();
		out.println("close");
	
	}

}
