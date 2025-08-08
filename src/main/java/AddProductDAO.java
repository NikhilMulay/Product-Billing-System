package DisplayServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class AddProductDAO {
	public int value;
	public int insert(ArrayList<ProductBean> list){
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement  stm1 = con.prepareStatement("Insert into Product71 values(?,?,?,?,?)");
			
		
		    if(list.size()==0||list.equals(null)) {
		    	
		    }else {
		        Iterator<ProductBean> itr = list.iterator();
		        while(itr.hasNext()) {
		        	ProductBean bean = (ProductBean)itr.next();
		        
		        	stm1.setString(1, bean.getProductId());
		        	stm1.setString(2, bean.getProductName());
		        	stm1.setString(3, bean.getProductPrice());
		        	stm1.setString(4, bean.getProductQuantity());
		        	Double productPrice = (Double.parseDouble(bean.getProductPrice()));
		        	Integer productQuantity = (Integer.parseInt(bean.getProductQuantity()));
		        	
		        	stm1.setString(5,String.valueOf(productPrice*productQuantity));
		        	
		        	value = stm1.executeUpdate();
		        }
		       
		    }
		    
		   
		}catch(SQLException obj) {
			obj.getMessage();
		}
		 return value;
	}

}
