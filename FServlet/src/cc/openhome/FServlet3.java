package cc.openhome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FServlet
 */
@WebServlet("/body3.view")
public class FServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FServlet3() {    super();    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //设置请求对象的字符编码
		response.setContentType("text/html; charset=UTF-8"); // 设置页面的编码

		String name = request.getParameter("name");		
		String passwd = request.getParameter("passwd");	
		
		String body = readBody(request);		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>getReader()</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>name: "  +name+  "</h1>");
		out.println("<h1>passwd: "  +passwd+  "</h1> <hr>");		
		
		out.println(body);
		
		out.println("<hr><h1>name: "  +name+  "</h1>");
		out.println("<h1>passwd: "  +passwd+  "</h1>");		
		out.println("</body>");
		out.println("</html>");
	}
	
	private String readBody(HttpServletRequest request) throws IOException {
		BufferedReader reader = request.getReader(); // 取得BufferedReader对象
		String input = null;
		String requestBody = "";
		while ( (input = reader.readLine() ) != null) {
			requestBody = requestBody + input + "<br>";
		}
		return requestBody;
	}
	
}
