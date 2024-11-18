package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewProductDAO {
	ArrayList<ProductBean> list= new ArrayList<>();

	public ArrayList<ProductBean> retriveProducts() {
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from product");
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				ProductBean pb=new ProductBean();
				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpCompany(rs.getString(3));
				pb.setpPrice(rs.getString(4));
				pb.setpQty(rs.getString(5));
				list.add(pb);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
