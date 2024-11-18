package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO {

	public AdminBean checkAdminLogin(String uname,String pwd) {
		AdminBean abean = null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from admin where uname=? and pword=?");
			pstm.setString(1,uname);
			pstm.setString(2,pwd);
			ResultSet rs=pstm.executeQuery();
			if(rs.next()) {
				abean=new AdminBean();
				abean.setUname(rs.getString(1));
				abean.setUpwd(rs.getString(2));
				abean.setUfname(rs.getString(3));
				abean.setUlname(rs.getString(4));
				abean.setAddress(rs.getString(5));
				abean.setMail_id(rs.getString(6));
				abean.setMobile(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return abean;
	}
}
