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
@WebServlet("/logout")
public class AdminLogoutServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if(session==null) {
			req.getRequestDispatcher("AdminLogin.html").forward(req, resp);
		}else {
			session.removeAttribute("arrayList");
			session.removeAttribute("adminBean");
			session.invalidate();
			req.getRequestDispatcher("Logout.jsp").forward(req, resp);
		}
		
	}

}
