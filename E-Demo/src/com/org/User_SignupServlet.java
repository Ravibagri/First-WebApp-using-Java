package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User_SignupServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		String state=req.getParameter("state");
		String mobile=req.getParameter("mobile");
		String adminid=req.getParameter("adminid");
		Connection conn=null;
		PreparedStatement pstmt=null;
		PrintWriter out=resp.getWriter();
		String sql="INSERT INTO ECOMMERCE.LOGIN VALUES(?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, username);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			System.out.println(adminid);
			if(adminid!=null) {
				pstmt.setString(4, state);			
				pstmt.setString(5, mobile);
				pstmt.setString(6, adminid);				
			}
			else {
				pstmt.setString(4, null);			
				pstmt.setString(5, null);
				pstmt.setString(6, null);
				
			}
			pstmt.executeUpdate();
			out.print("<html><body><h3>Ragistration Successful</h3</body></html>");
		} catch (ClassNotFoundException | SQLException e) {
			out.print("<html><body><h3>Server is down please try after sometime</h3</body></html>");
			RequestDispatcher rs=req.getRequestDispatcher("usersignup.html");
			rs.include(req, resp);
			e.printStackTrace();
		}
		RequestDispatcher rs=req.getRequestDispatcher("login.html");
		rs.include(req, resp);
		
	}
}
