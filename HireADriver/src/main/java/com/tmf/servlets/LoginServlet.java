package com.tmf.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.tmf.entities.UserDao;
import com.tmf.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie ck[] =request.getCookies();
		String userName = null;
		if (ck != null) {
	        for (Cookie c : ck) {
	            if ("uname".equals(c.getName())) {
	                userName = c.getValue();
	               // break;
	            }
	        }
	    }
		
		
		User user = new User(userName, "Client", "", "");
		request.setAttribute("loggedinUser", user);
		
		RequestDispatcher rd=request.getRequestDispatcher("UserHomeServlet");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("user_name");
		String password = request.getParameter("password");
		
		Cookie ck=new Cookie("uname",uname);//creating cookie object  
		response.addCookie(ck);
		
		if(uname!=null && password!=null &&!uname.isEmpty()&&!password.isEmpty()&&uname.equals("admin")&&password.equals("admin")) {
			System.out.println("Login successful");
			RequestDispatcher rd=request.getRequestDispatcher("AdminDashboardServlet");  
			User adminUser = new User("ADMIN", "Administrator", "9818253870", "admin@gmail.com");
			
			request.setAttribute("loggedinUser", adminUser);
			
			
			
	        rd.forward(request, response);  
		}
		else {
			if(null!=uname &&!uname.isEmpty()&&password!=null&&!password.isEmpty()&&uname.equals(password)) {
				System.out.println("Login successful");
				User user = new User(uname, "Client", "9121375506", uname+"@gmail.com");
				request.setAttribute("loggedinUser", user);
				
				RequestDispatcher rd=request.getRequestDispatcher("UserHomeServlet");  
		        rd.forward(request, response); 
			}
			else {
				System.out.println("Login failed");
				response.sendRedirect("login.html");
			}
		}
		//doGet(request, response);
	}
}
