package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BuyProductServletDAO {
	public ProductBean retriveProduct(String pcode) {
		ProductBean pb = null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from product where pcode=?");
			pstm.setString(1, pcode);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				pb=new ProductBean();
				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpCompany(rs.getString(3));
				pb.setpPrice(rs.getString(4));
				pb.setpQty(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pb;
	}
}
