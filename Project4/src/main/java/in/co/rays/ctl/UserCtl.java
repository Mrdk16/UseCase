package in.co.rays.ctl;																																																																																																							

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.UserBean;
import in.co.rays.Model.UserModel;


@WebServlet("/UserCtl")
public class UserCtl  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("in First Servlet do get !!!!!");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String FirstName = req.getParameter("FirstName");
		 String LastName = req.getParameter("LastName");
		 String LoginId = req.getParameter("LoginId");
		 String Password = req.getParameter("Password");
		 String Address = req.getParameter("Address");

		
		 UserBean bean = new UserBean();
		
		 bean.setFirstName(FirstName);
	     bean.setLastName(LastName);
		 bean.setLoginId(LoginId);
		 bean.setPassword(Password);
		 bean.setAddress(Address);
		
		 UserModel model =  new UserModel();
		
		 try {
			model.add(bean);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		 
		 resp.sendRedirect("UserRegistration.jsp");
		
	}

																				

}

