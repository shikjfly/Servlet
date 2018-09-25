package cc.openhome;

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
@WebServlet("/body4.view")
public class FServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8"); //设置请求对象的字符编码
		response.setContentType("text/html; charset=UTF-8"); // 设置页面的编码
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name"); //获取页面name=？？的值		
		
		out.println("<html>");
			out.println("<head>");
			out.println("<title>宠物大调查</title>");
			out.println("</head>");
			out.println("<body>");
				out.println("<h1>name: "  +name+  "</h1>");
				out.println("<ul>");
				for(String type : request.getParameterValues("type")){
					out.println("<li> "  +type+  "</li>");			
				}
				out.println("</ul>");
			out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
