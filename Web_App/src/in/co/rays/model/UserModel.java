package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;

import in.co.rays.bean.UserBean;

public class UserModel {

	public void add(UserBean bean) throws Exception {
		System.out.println("in modeladd ");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userRegistration", "root", "root");
		con.setAutoCommit(false);
		java.sql.PreparedStatement ps = con.prepareStatement(
				"INSERT INTO USERDATA(fname,lname,loginId,password,confirm_password,gender,dob) VALUES(?,?,?,?,?,?,?)");

		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getLoginid());
		ps.setString(4, bean.getPassword());
		ps.setString(5, bean.getConfirm_password());
		ps.setString(6, bean.getGender());
		ps.setString(7, bean.getDob());

		ps.executeUpdate();
		con.commit();
		con.close();
		ps.close();

	}

	
}
