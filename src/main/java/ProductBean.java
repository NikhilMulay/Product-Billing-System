package DisplayServlet;

import java.io.Serializable;


@SuppressWarnings("serial")
public class ProductBean implements Serializable{
	private String productId;
	private String productName;
	private String productPrice;
	private String productQuantity;
	
	public ProductBean() {
		super();
	}
	
	public String getProductId() { return productId; }
	public String getProductName() { return productName; }
	public String getProductPrice() { return productPrice; }
	public String getProductQuantity() { return productQuantity; }
	
	
	public void setProductId(String productId) { this.productId = productId; }
	public void setProductName(String productName) { this.productName = productName; }
	public void setProductPrice(String productPrice) { this.productPrice = productPrice; }
	public void setProductQuantity(String productQuantity) { this.productQuantity = productQuantity; }
	
	
	

}
