package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet {
	AdminBean ab; 
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		AdminBean ab=new AdminLoginDAO().login(req.getParameter("uname"),req.getParameter("pword"));
		
		if(ab==null) {
			req.setAttribute("msg", "Invalid Login credential..");
			req.getRequestDispatcher("Msg.jsp").forward(req, res); 
		} else {
			//create implementation object of HttpSession -> for new session () without parameter
			HttpSession hs=req.getSession(); // creating new session
			hs.setAttribute("adimnbean", ab);
// HttpSession is server dependent and secure where cookie is client dependent and not secure	
			
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
	}

}
