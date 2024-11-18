package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			req.setAttribute("msg", "Session expired.");
			req.getRequestDispatcher("AdminLogin2.jsp").forward(req, res);

		} else {
			int rowCount = new DeleteProductDAO().deleteProduct(req.getParameter("pcode"));
			if(rowCount>0) {
				req.setAttribute("msg","Product Deleted !");
				req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
			}
		}
	}
}
