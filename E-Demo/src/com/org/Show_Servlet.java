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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/remove")
public class Show_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String iid=req.getParameter("id");
		int id1 =Integer.parseInt(iid);
		PrintWriter out= resp.getWriter();
		String sql="SELECT * FROM ECOMMERCE.PRODUCT WHERE ID=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id1);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int dd=rs.getInt(1);
				out.print("<html>"
						+ "<body style='padding: 130px 0px 0px 150px;'>"
						+ "<table style='background-color: antiquewhite;margin: 20px;text-align: center;border-collapse: collapse;'>"
						+"<tr><th style='border: 01px solid #d3d3d3; padding: 01px;'>Id</th><th>Name</th><th>Price</th><th>Action</th></tr>"
						+ "<tr>"
						+ "<td>"+rs.getInt(1)+"</td>"
						+ "<td>"+rs.getString(2)+"</td>"
						+"<td>"+rs.getInt(3)+"</td>"
						+"<td><a href='ds?id="+dd+"'>Delete</a></td>"						
						+"</tr>"
						+ "</table></body></html>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			out.print("<html><body>Record not present</body></html>");
		}
	}

}
