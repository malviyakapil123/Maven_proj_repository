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

@WebServlet("/ForgetPasswordCtl")
public class ForgetPasswordCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String u = request.getParameter("user");

		UserBean bean = new UserBean();
		UserBean bean1;

		bean.setLoginid(u);

		LoginModel model = new LoginModel();
		try {

			bean1 = model.authenticate(bean);
			PrintWriter out = response.getWriter();
			out.println("success");
			if (bean1 == null) {
			
				request.setAttribute("error", "Invalid LoginId ");
				RequestDispatcher rd = request.getRequestDispatcher("ForgetPassword.jsp");
				rd.forward(request, response);
				request.setAttribute("error", "Invalid LoginId and Password");

			} else {
				response.sendRedirect("WelcomeCtl");
				// RequestDispatcher rd = request.getRequestDispatcher("WelcomeCtl");
				// rd.forward(request, response);

			}

		} catch (Exception e) {

			System.out.println(e.getStackTrace());
		}
		PrintWriter out = response.getWriter();
		out.println("close");

	}

}
