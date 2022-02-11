package in.co.rays.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;

@WebServlet("/GetMarksheetCtl")
public class GetMarksheetCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("id", "ram");
		RequestDispatcher rd = request.getRequestDispatcher("GetMarksheetView.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollno(Integer.parseInt(request.getParameter("roll")));

		MarksheetModel model = new MarksheetModel();

		try {
			bean = (MarksheetBean) model.getRollNo(bean);

			request.setAttribute("id", String.valueOf(bean.getId()));
			request.setAttribute("Rn", String.valueOf(bean.getRollno()));
			request.setAttribute("fn", String.valueOf(bean.getFname()));
			request.setAttribute("ln", String.valueOf(bean.getLname()));
			request.setAttribute("ph", String.valueOf(bean.getPhysics()));
			request.setAttribute("ch", String.valueOf(bean.getChemistry()));
			request.setAttribute("ma", String.valueOf(bean.getMathematics()));
			RequestDispatcher rd = request.getRequestDispatcher("GetMarksheetView.jsp");
			rd.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
