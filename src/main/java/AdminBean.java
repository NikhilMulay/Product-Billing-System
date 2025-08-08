package DisplayServlet;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	private String adminName;
	private String adminPassword;
	private String adminFName;
	private String adminLName;
	private String adminCity;
	private String adminMailId;
	private String adminContactId;
	
	public AdminBean() {
		super();
	}

	public String getAdminName() { return adminName; }
	public String getAdminPassword() { return adminPassword; }
	public String getAdminFName() { return adminFName; }
	public String getAdminLName() { return adminLName; }
	public String getAdminCity() { return adminCity; }
	public String getAdminMailId() { return adminMailId; }
	public String getAdminContactId() { return adminContactId; }
	
	
	
	public void setAdminName(String adminName) { this.adminName = adminName; }
    public void setAdminPassword(String adminPassword) { this.adminPassword = adminPassword; }
	public void setAdminFName(String adminFName) { this.adminFName = adminFName; }
    public void setAdminLName(String adminLName) { this.adminLName = adminLName; }
	public void setAdminCity(String adminCity) { this.adminCity = adminCity; }
	public void setAdminMailId(String adminMailId) { this.adminMailId = adminMailId; }
	public void setAdminContactId(String adminContactId) { this.adminContactId = adminContactId; }
	
	
	
	
	

}
