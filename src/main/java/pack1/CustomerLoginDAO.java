package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO {
	public CustomerBean checkLogin(String uname,String pass) {
		CustomerBean cb=null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from customer where uname=? and pword=?");
			pstm.setString(1, uname);
			pstm.setString(2, pass);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				cb=new CustomerBean();
				cb.setCuname(rs.getString(1));
				cb.setCpass(rs.getString(2));
				cb.setCfname(rs.getString(3));
				cb.setClname(rs.getString(4));
				cb.setCaddr(rs.getString(5));
				cb.setCmail(rs.getString(6));
				cb.setCphno(rs.getString(7));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cb;
	}
}
