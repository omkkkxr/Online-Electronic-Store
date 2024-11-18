package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO {


	public int insert(ProductBean pbean) {
		int rowCount =0;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstm.setString(1, pbean.getpCode());
			pstm.setString(2, pbean.getpName());
			pstm.setString(3, pbean.getpCompany());
			pstm.setString(4, pbean.getpPrice());
			pstm.setString(5, pbean.getpQty());
			rowCount=pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
