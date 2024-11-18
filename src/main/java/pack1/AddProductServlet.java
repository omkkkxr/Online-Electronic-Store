package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			req.setAttribute("msg", "Session expired , Please login again.");
			RequestDispatcher rd = req.getRequestDispatcher("AdminLogin2.jsp");
			rd.forward(req, res);
		} else {
			ProductBean pbean = new ProductBean();
			pbean.setpCode(req.getParameter("pcode"));
			pbean.setpName(req.getParameter("pname"));
			pbean.setpCompany(req.getParameter("pcompany"));
			pbean.setpPrice(req.getParameter("pprice"));
			pbean.setpQty(req.getParameter("pqty"));
			int rowCount = new AddProductDAO().insert(pbean);
			if (rowCount > 0) {
				req.setAttribute("msg", "Product added successfully ");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			}else {
				req.setAttribute("msg", "Product not added  ");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			}
		}
	}
}
