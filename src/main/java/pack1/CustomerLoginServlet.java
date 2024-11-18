package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/cls")
public class CustomerLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CustomerBean cb = new CustomerLoginDAO().checkLogin(req.getParameter("cuname"), req.getParameter("cpass"));
		if (cb == null) {
			req.setAttribute("msg", "Invalid login cardinetals !");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		} else {
			HttpSession session=req.getSession();
			session.setAttribute("cBean", cb);
			req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);
		}
	}
}
