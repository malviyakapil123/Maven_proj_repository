package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import in.co.rays.bean.UserBean;

public class ChangePasswordModel {
	public UserBean authenticate(UserBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userRegistration", "root", "root");
		con.setAutoCommit(false);
		java.sql.PreparedStatement ps = con.prepareStatement("select * from userdata where password=?");

		ps.setString(1, bean.getPassword());

		ResultSet rs = ps.executeQuery();
		UserBean bean1 = null;
		while (rs.next()) {
			bean1 = new UserBean();
			bean1.setLoginid(rs.getString(1));
			bean1.setPassword(rs.getString(2));
			bean1.setConfirm_password(rs.getString(3));
			bean1.setFname(rs.getString(4));
			bean1.setLname(rs.getString(5));
			bean1.setGender(rs.getString(6));
			bean1.setDob(rs.getString(7));

		}

		return bean1;

	}

	public void add(UserBean bean) throws Exception {
		System.out.println("in modeladd ");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userRegistration", "root", "root");
		con.setAutoCommit(false);
		java.sql.PreparedStatement ps = con.prepareStatement("update userdata set password=?, comfirm_password=? where loginId = ?");

		
		ps.setString(1, bean.getLoginid());
		ps.setString(2, bean.getPassword());
		ps.setString(3, bean.getConfirm_password()); 
		
		ps.executeUpdate();
		con.commit();
		con.close();
		ps.close();

	}

}
