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
@WebServlet("/adminLogin")
public class AdminLoginServelet extends HttpServlet{
	public ArrayList<ProductBean> list;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminBean bean = new AdminLoginDAO().login(req.getParameter("adminName"),req.getParameter("adminPassword"));
	
	    if(bean==null) {
	    	req.setAttribute("userText", "Invalid details");
	    	req.getRequestDispatcher("InvalidLogin.jsp").forward(req, resp);;
	    }else {
            list = new ArrayList<ProductBean>();
	    	HttpSession session = req.getSession();
	    	session.setAttribute("arrayList", list);
	    	session.setAttribute("adminBean", bean);
	    	req.getRequestDispatcher("Login.jsp").forward(req, resp);
	    }
	}

}
