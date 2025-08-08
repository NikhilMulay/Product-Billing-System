package DisplayServlet;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		
		if(session==null) {
			req.setAttribute("userText","Network issue.");
			req.getRequestDispatcher("InvalidLogin.jsp").forward(req, resp);
			
		}else{
			
			@SuppressWarnings("unchecked")
			ArrayList<ProductBean> list = (ArrayList<ProductBean>)session.getAttribute("arrayList");
			ProductBean bean = new ProductBean();
		
			bean.setProductId(req.getParameter("productId"));
			bean.setProductName(req.getParameter("productName"));
			bean.setProductPrice(req.getParameter("productPrice"));
			bean.setProductQuantity(req.getParameter("productQuantity"));
			
			list.add(bean);
		
			req.getRequestDispatcher("Product.html").forward(req, resp);
			
		}
	}

}
