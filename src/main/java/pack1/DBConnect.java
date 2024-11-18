package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	static Connection con = null;
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(DBInfo.DBURL,DBInfo.DBUNAME,DBInfo.DBPWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	}
}
