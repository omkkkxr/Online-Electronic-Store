package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/ucps")
public class UpdateCustomerProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		if(session==null) {
			req.setAttribute("msg", " Session expired !");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}else {
			String pcode=req.getParameter("pcode");
			int Qty=Integer.parseInt(req.getParameter("pqty")) -Integer.parseInt(req.getParameter("reqno")) ;
			String reqQty = Integer.toString(Qty);
			int amt=Integer.parseInt(req.getParameter("pprice"))*Integer.parseInt(req.getParameter("reqno"));
			String cAmt=Integer.toString(amt);
			req.setAttribute("cAmt", cAmt);
			ArrayList<ProductBean> al=(ArrayList<ProductBean>) session.getAttribute("ProductList");
			ProductBean pb;
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext()) {
				pb=i.next();
				if(pcode.equals(pb.getpCode())) {
					pb.setpQty(reqQty);
				}
			}
			new UpdateCustomerProductDAO().updatePQty(pcode, reqQty);
			session.setAttribute("ProductList", al);
			req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
		}
	}
}
