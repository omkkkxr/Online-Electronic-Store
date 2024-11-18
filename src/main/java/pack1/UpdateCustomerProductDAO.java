package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateCustomerProductDAO {
	public int updatePQty(String pcode,String pqty) {
		int rowCount=0;
		try{
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("update product set pqty=? where pcode=?");
			pstm.setString(1, pqty);
			pstm.setString(2, pcode);
			rowCount=pstm.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
