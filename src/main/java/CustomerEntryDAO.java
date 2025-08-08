package DisplayServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerEntryDAO {
	
	int value;
	
	public int insert(String customerName,String customerContactId,Double billToBePaid) {
		try {
		   Connection con = DBConnection.getConnection();
		   PreparedStatement stm = con.prepareStatement("Insert into Customer71 values(?,?,?)");
		   
		  stm.setString(1, customerName);
		  stm.setString(2, customerContactId);
		  stm.setString(3, String.valueOf((billToBePaid)));
		  
		  value = stm.executeUpdate();
		  
		}catch(SQLException obj) {
			obj.getMessage();
		}
		return value;
	}

}
