package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert_Servlet
 */
//@WebServlet("/insert_Servlet")
public class Insert_Servlet extends HttpServlet {
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String iid=req.getParameter("id");
			String name=req.getParameter("name");
			String pric=req.getParameter("price");
			String product=req.getParameter("item_detail");
			String image=req.getParameter("image");
			int id=Integer.parseInt(iid);
			int price=Integer.parseInt(pric);
			PrintWriter out=resp.getWriter();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				
				String sql="INSERT INTO ECOMMERCE.PRODUCT VALUES(?,?,?,?,?)";
				PreparedStatement pstmt=conn.prepareStatement(sql);
				System.out.println("Success");
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, price);
				pstmt.setString(4, product);
				pstmt.setString(5, null);
				pstmt.executeUpdate();
				
				out.print("<html><body><h6>Success</h6>"
						+ "<a href=\"admin_navigation.html\" <button type=\"button\">Return</button></a>"
						+ "</body></html>");
				
				
			} catch (ClassNotFoundException | SQLException e) {
				out.print("<html><body>Please enter Correct details</body></html>");
				req.getRequestDispatcher("insert.html").include(req, resp);
				e.printStackTrace();
			}
			
			
		}

}
