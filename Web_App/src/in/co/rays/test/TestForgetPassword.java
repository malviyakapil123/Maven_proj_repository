package in.co.rays.test;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import in.co.rays.bean.UserBean;
import in.co.rays.model.LoginModel;

public class TestForgetPassword {

	public static void main(String[] args) {
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

	}

}
