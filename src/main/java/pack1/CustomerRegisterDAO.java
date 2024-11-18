package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO {
	public int insertCustomer(CustomerBean cb) {
		int rowCount = 0;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			pstm.setString(1,cb.getCuname());
			pstm.setString(2,cb.getCpass());
			pstm.setString(3, cb.getCfname());
			pstm.setString(4, cb.getClname());
			pstm.setString(5, cb.getCaddr());
			pstm.setString(6, cb.getCmail());
			pstm.setString(7, cb.getCphno());
			rowCount=pstm.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
