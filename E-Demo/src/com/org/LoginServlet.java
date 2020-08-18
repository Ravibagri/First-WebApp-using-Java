package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String pass=req.getParameter("password");
		String adminid=req.getParameter("adminid");

		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		PrintWriter out=resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			if(adminid!="") {
				String user="SELECT USERNAME FROM ECOMMERCE.LOGIN WHERE USERNAME=? AND PASSWORD=? AND ADMIN_ID=?";
				pstmt=conn.prepareStatement(user);
				pstmt.setString(1, name);
				pstmt.setString(2, pass);
				pstmt.setString(3, adminid);
				rs=pstmt.executeQuery();
				System.out.println("Admin Section");
				System.out.println("!"+adminid+"!");
				if(rs.next()) {
					RequestDispatcher rd=req.getRequestDispatcher("admin_navigation.html");
					rd.include(req, resp);
					String nam=rs.getString(1);
					out.print("<html><body style='background-color: azure; text-align: left; padding: 10px 10px; box-sizing: border-box; margin: 5px;'>"
							+ "<p>Welcome Admin </p>" +nam+
							"</body></html>");
				}
				else {
					out.print("<html><body><h3>Please Re-Enter Correct UserName and Password");
					RequestDispatcher rd=req.getRequestDispatcher("login.html");
					rd.include(req, resp);
				}
				
			}
			else {
				String admin="SELECT USERNAME FROM ECOMMERCE.LOGIN WHERE USERNAME=? AND PASSWORD=?";
				pstmt=conn.prepareStatement(admin);
				pstmt.setString(1, name);
				pstmt.setString(2, pass);
				rs=pstmt.executeQuery();
				System.out.println("user Section");
				if(rs.next()) {
					RequestDispatcher rd=req.getRequestDispatcher("user_navigation.html");
					rd.include(req, resp);
					String nam=rs.getString(1);
					out.print("<html><body style='background-color: azure; text-align: left; padding: 10px 10px; box-sizing: border-box; margin: 5px;'>"
							+ "<p>Welcome User </p>" +nam+
							"</body></html>");	
				}
				else {
					out.print("<html><body><h3>Please Re-Enter Correct UserName and Password");
					RequestDispatcher rd=req.getRequestDispatcher("login.html");
					rd.include(req, resp);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
