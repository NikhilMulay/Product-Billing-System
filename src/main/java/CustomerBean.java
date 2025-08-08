package DisplayServlet;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable{
	private String customerName;
	private String customerContactId;
	
	public CustomerBean() {
		super();
	}
	public String getCustomerName() { return customerName; }
	public String getCustomerContactId() { return customerContactId; }
	
	public void setCustomerContactId(String customerContactId) { this.customerContactId = customerContactId; }
	public void setCustomerName(String customerName) { this.customerName = customerName; }
	

}
