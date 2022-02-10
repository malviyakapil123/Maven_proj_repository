package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import in.co.rays.bean.MarksheetBean;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		con.setAutoCommit(false);
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO MARKSHEET VALUES(?,?,?,?,?,?,?)");

		ps.setInt(1, bean.getId());
		ps.setInt(2, bean.getRollno());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPhysics());
		ps.setInt(6, bean.getChemistry());
		ps.setInt(7, bean.getMathematics());

		ps.executeUpdate();
		con.commit();
		con.close();
		ps.close();

	}

	public List<MarksheetBean> getMeritList(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		PreparedStatement ps = (PreparedStatement) con
				.prepareStatement("Select *,(physics+chemistry+mathematics) as Marks_Total,"
						+ "((physics+chemistry+mathematics)/3) as Percentage from Marksheet where physics>40 and chemistry>40"
						+ " and mathematics>40 order by percentage desc limit 0,10");

		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();

		while (rs.next()) {

			MarksheetBean bean1 = new MarksheetBean();// Instantiate(give) new memory every time

			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getInt(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setPhysics(rs.getInt(5));
			bean1.setChemistry(rs.getInt(6));
			bean1.setMathematics(rs.getInt(7));
			list.add(bean1);
		}
		return list;

	}

	public void update(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		con.setAutoCommit(false);
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(
				"Update marksheet set rollno = ?,fname = ?, lname = ?, physics = ?,chemistry = ?,mathematics = ? where id = ?");

		ps.setInt(1, bean.getRollno());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMathematics());
		ps.setInt(7, bean.getId());

		ps.executeUpdate();
		con.commit();
		con.close();
		ps.close();

	}

	public MarksheetBean getRollNo(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("Select * from Marksheet where rollno = ?");

		ps.setInt(1, bean.getRollno());

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getInt(2));
			bean.setFname(rs.getString(3));
			bean.setLname(rs.getString(4));
			bean.setPhysics(rs.getInt(5));
			bean.setChemistry(rs.getInt(6));
			bean.setMathematics(rs.getInt(7));

		}

		return bean;
	}

	public void delete(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		con.setAutoCommit(false);
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("Delete from marksheet where rollno = ?");

		ps.setInt(1, bean.getRollno());

		ps.executeUpdate();

		con.commit();
		ps.close();
		con.close();
	}

	public List<MarksheetBean> search(MarksheetBean bean1) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("Select * from Marksheet where id= ?");

		ps.setInt(1, bean1.getId());

		ResultSet rs = ps.executeQuery();
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		// bean1 = new MarksheetBean();// Instantiate(give) new memory every time
		while (rs.next()) {

			bean1 = new MarksheetBean();// Instantiate(give) new memory every time

			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getInt(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setPhysics(rs.getInt(5));
			bean1.setChemistry(rs.getInt(6));
			bean1.setMathematics(rs.getInt(7));
			list.add(bean1);
		}
		return list;
	}


}
