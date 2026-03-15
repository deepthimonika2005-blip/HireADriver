package com.tmf.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tmf.util.DBconnection;

/**
 * Servlet implementation class DriverstatusServlet
 */
@WebServlet("/DriverstatusServlet")
public class DriverstatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DriverstatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String status = request.getParameter("status");

	        try {

	            Connection conn = DBconnection.getConnection();

	            String sql =
	                    "UPDATE drivers SET availability_status=? WHERE driver_id=1";

	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, status);
	            ps.executeUpdate();
	            response.sendRedirect("driver_dashboard.html");

	        } catch (Exception e) {

	            e.printStackTrace();

	        }

	}

}
