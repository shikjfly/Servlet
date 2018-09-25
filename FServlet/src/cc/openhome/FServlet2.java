package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FServlet
 */
@WebServlet("/body2.view")
public class FServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		
		out.println("<h1>F2-name: "  +username+  "</h1>");
		out.println("<h1>F2-passwd: "  +passwd+  "</h1>");
		out.println("<h5>F2-getRequestURL: "  +request.getRequestURL()+  "</h5>");
		out.println("<h5>F2-getContextPath: "  +request.getContextPath()+  "</h5>");
		out.println("<h5>F2-getRequestURI: "  +request.getRequestURI()+  "</h5> <hr>");
		
		Enumeration<String> names = request.getHeaderNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			out.println(name+":"+request.getHeader(name)+"<br>");
		}				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
