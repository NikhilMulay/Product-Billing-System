package DisplayServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection con = null;
    static {
    	   try{
			   Class.forName(DBInfo.driver);
			   con  = DriverManager.getConnection(DBInfo.url,DBInfo.userName,DBInfo.password);
		    }catch(ClassNotFoundException | SQLException obj) {
			   obj.printStackTrace();
		    }
    }
	public static Connection getConnection() {   
		return con;
	}
}
