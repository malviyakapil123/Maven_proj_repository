package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import in.co.rays.bean.UserBean;

public class ForgetPasswordModel {

	public UserBean authenticate(UserBean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userRegistration", "root", "root");
		con.setAutoCommit(false);
		java.sql.PreparedStatement ps = con.prepareStatement("select * from userdata where loginid=?");

		ps.setString(1, bean.getLoginid());

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

}
