package DisplayServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLoginDAO {
     public AdminBean bean;
     
     public AdminBean login(String adminName,String adminPassword){
    	 
    	 try {
    		 Connection con = DBConnection.getConnection();
    		 PreparedStatement stm = con.prepareStatement("Select * from Admin71 where userName = ? and userPassword = ?");
    	     
    		 stm.setString(1, adminName);
    	     stm.setString(2, adminPassword);
    	     
    	     ResultSet set = stm.executeQuery();
    	     if(set.next()) {
    	    	 bean = new AdminBean();
    	    	 bean.setAdminName(set.getString(1));
    	    	 bean.setAdminPassword(set.getString(2));
    	    	 bean.setAdminFName(set.getString(3));
    	    	 bean.setAdminLName(set.getString(4));
    	    	 bean.setAdminCity(set.getString(5));
    	    	 bean.setAdminMailId(set.getString(6));
    	    	 bean.setAdminContactId(set.getString(7));
    	     }
    	 }catch(SQLException obj) {
    		 obj.getMessage();
    	 }
    	 return bean;
     }
}
