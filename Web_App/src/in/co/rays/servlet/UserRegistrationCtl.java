package in.co.rays.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;



@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		UserBean bean = new UserBean();
		bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setLoginid(request.getParameter("login"));
		bean.setPassword(request.getParameter("pwd"));
		bean.setConfirm_password(request.getParameter("cpwd"));
		bean.setGender(request.getParameter("gender"));
		bean.setDob(request.getParameter("dob"));

		UserModel model = new UserModel();

		try {
			model.add(bean);
			PrintWriter out = response.getWriter();
			out.println("success");
			response.sendRedirect("LoginCtl");

		} catch (Exception e) {
			e.printStackTrace();

		}
		PrintWriter out = response.getWriter();
		out.println("close");

	}

}
