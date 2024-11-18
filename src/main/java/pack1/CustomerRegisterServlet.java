package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/crs")
public class CustomerRegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CustomerBean cb=new CustomerBean();
		cb.setCuname(req.getParameter("cuname"));
		cb.setCpass(req.getParameter("cpass"));
		cb.setCfname(req.getParameter("cfname"));
		cb.setClname(req.getParameter("clname"));
		cb.setCaddr(req.getParameter("caddr"));
		cb.setCmail(req.getParameter("cmail"));
		cb.setCphno(req.getParameter("cphone"));
		int rowCount=new CustomerRegisterDAO().insertCustomer(cb);
		if(rowCount>0) {
			req.setAttribute("msg","Customer registered successfully !");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}else {
			req.setAttribute("msg","Customer not registered !");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}
	}
}
