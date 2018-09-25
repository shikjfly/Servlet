package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/body1.view")
public class FServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FServlet() {        super();    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8"); //设置请求对象的字符编码
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name"); //获取页面name=？？的值
		String passwd = request.getParameter("passwd"); //获取页面name=？？的值
		String txt = java.net.URLEncoder.encode("林","utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>F1-name: "  +name+  "</h1>");
		out.println("<h1>F1-passwd: "  +passwd+  "</h1>");
		out.println("<h1>F1-URLEncoder林: "  +txt+  "</h1>");
		
//		转发方式一
//		RequestDispatcher dispatcher  = request.getRequestDispatcher("body2.view");
//		dispatcher.include(request, response);
//		转发方式二
		request.getRequestDispatcher("body2.view").forward(request, response);
	
	}

}
