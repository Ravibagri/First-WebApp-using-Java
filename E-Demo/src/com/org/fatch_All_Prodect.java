package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fatch_All_Prodect extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String qry="SELECT * FROM ECOMMERCE.PRODUCT";	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement pstmt=con.prepareStatement(qry);
			ResultSet rs=pstmt.executeQuery();
			/*Collection pro=new ArrayList();
			while(rs.next()) {
				Collection product=new ArrayList();
				product.add(rs.getInt(1));
				product.add(rs.getString(2));
				product.add(rs.getInt(3));
				pro.add(product);
			}*/
			out.print("<html>"
					+ "<body style='padding: 130px 0px 0px 150px;'>"
					+ "<table style='background-color: antiquewhite;margin: 20px;text-align: center;border-collapse: collapse;'>"
					+"<tr><th style='border: 01px solid #d3d3d3; padding: 01px;'>Id</th><th>Name</th><th>Price</th><th>Action</th></tr>");		
			while(rs.next()){
				out.print("<tr>"
						+ "<td>"+rs.getInt(1)+"</td>"
						+ "<td>"+rs.getString(2)+"</td>"
						+"<td>"+rs.getInt(3)+"</td>"
						+"</tr>");
			}
			out.print("</table></body></html>");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	

}
