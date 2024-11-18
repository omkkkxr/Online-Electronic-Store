package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			req.setAttribute("msg", "Session expired , Please login again.");
			RequestDispatcher rd = req.getRequestDispatcher("AdminLogin2.jsp");
			rd.forward(req, res);
		} else {
			ProductBean pb = null;
			String pcode = req.getParameter("pcode");
			ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("ProductList");
			Iterator<ProductBean> i = al.iterator();
			while (i.hasNext()) {
				pb = i.next();
				if (pcode.equals(pb.getpCode())) {
					break;
				}
			}
			pb.setpPrice(req.getParameter("pprice"));
			pb.setpQty(req.getParameter("pqty"));

			UpdateProductDAO obj = new UpdateProductDAO();
			int rowCount = obj.updateProductDetails(pb);
			if (rowCount > 0) {
				req.setAttribute("msg", "Product Details Updated !!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			} else {
				req.setAttribute("msg", "Product Details not Updated !!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}
		}
	}
}
