package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;

@WebServlet("/AddMarksheetCtl")
public class AddMarksheetCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		MarksheetBean mb = new MarksheetBean();

		mb.setId(Integer.parseInt(request.getParameter("Id")));
		mb.setRollno(Integer.parseInt(request.getParameter("Rollno")));
		mb.setFname(request.getParameter("fn"));
		mb.setLname(request.getParameter("ln"));
		mb.setPhysics(Integer.parseInt(request.getParameter("phy")));
		mb.setChemistry(Integer.parseInt(request.getParameter("che")));
		mb.setMathematics(Integer.parseInt(request.getParameter("maths")));

		MarksheetModel model = new MarksheetModel();
		try {
			model.add(mb);
			request.setAttribute("m", "Record Inserted");
			RequestDispatcher rd =request.getRequestDispatcher("AddMarksheet.jsp");
			rd.forward(request, response);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
