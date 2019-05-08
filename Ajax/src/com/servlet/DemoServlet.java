package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Users;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		Users users = new Users();
		users.setId(1);
		users.setPassword("123");
		users.setUsername("张三");
		
		PrintWriter out = resp.getWriter();
		out.print("服务器返回的内容");
		out.flush();
		out.close();
		System.out.println("dfgsad="+name);
	}
	

}
