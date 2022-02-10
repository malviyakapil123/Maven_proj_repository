package in.co.rays.test;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	public static void testadd() throws Exception {
		UserBean bean = new UserBean();
		bean.setFname("kapifkskl");
		bean.setLname("malviya");
		bean.setLoginid("kmalvddhghgs@");
		bean.setPassword("jfljlkfjl");
		bean.setConfirm_password("gjgfsfahgf");
		bean.setGender("male");
		bean.setDob("12/45/7854");

		UserModel model = new UserModel();
		
		model.add(bean);
		System.out.println("success");

	}

}
