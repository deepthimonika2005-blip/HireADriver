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
 * Servlet implementation class CreateBookingServlet
 */
@WebServlet("/CreateBookingServlet")
public class CreateBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBookingServlet() {
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
		 String pickup = request.getParameter("pickup");
	        String drop = request.getParameter("drop");

	        try {

	            Connection conn = DBconnection.getConnection();

	            String sql =
	                    "INSERT INTO bookings(pickup_location, drop_location, status) VALUES(?,?,?)";

	            PreparedStatement ps = conn.prepareStatement(sql);

	            ps.setString(1, pickup);
	            ps.setString(2, drop);
	            ps.setString(3, "REQUESTED");
	            ps.executeUpdate();

	            response.sendRedirect("user_dashboard.html");

	        } catch (Exception e) {

	            e.printStackTrace();

	        }
	    }

	}


