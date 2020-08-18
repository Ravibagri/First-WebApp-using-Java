package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteProduct extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ii=req.getParameter("id");
		int id=Integer.parseInt(ii);
		String query="DELETE FROM ECOMMERCE.PRODUCT WHERE ID=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		PrintWriter out=resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			out.print("<html><body><h4>Success</h4></body></html>");
		}
		catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				out.print("<html><body>Record not present</body></html>");
			}
	}
	
}