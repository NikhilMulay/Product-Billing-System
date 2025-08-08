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
@WebServlet("/generateBill")
public class GenerateBill extends HttpServlet{
	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session==null) {
			req.setAttribute("userText","Network issue.");
			req.getRequestDispatcher("InvalidLogin.jsp").forward(req, resp);
		}else {
			ArrayList<ProductBean> list = (ArrayList<ProductBean>)session.getAttribute("arrayList");
		
			int value = new AddProductDAO().insert(list);
			if(!list.isEmpty())list.clear();
		    req.getRequestDispatcher("Paid.jsp").forward(req, resp);
		}
	}

}
