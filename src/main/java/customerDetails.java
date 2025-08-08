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
@WebServlet("/customerDetails")
public class customerDetails extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session==null) {
			
		}else {
		
		   Double billToBePaid = (Double)session.getAttribute("bill");
		   int value = new CustomerEntryDAO().insert(req.getParameter("custName"),req.getParameter("custContactId"),billToBePaid);
		   
		   @SuppressWarnings("unchecked")
		ArrayList<ProductBean> bean = (ArrayList<ProductBean>)session.getAttribute("arrayList");
		   Double bill = (Double)session.getAttribute("bill");
		   bill = null;
		   
		   req.setAttribute("bill", billToBePaid);
		   req.getRequestDispatcher("Paid.jsp").forward(req, resp);
		}
    }
	

}
