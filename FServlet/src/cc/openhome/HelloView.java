package cc.openhome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.view")
public class HelloView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloView() {  super();   }

    private String htmlTemplate = 
    		  "<html>"
    		+ 	"<head>"
    		+ 		"<meta charset=\"UTF-8\">"
    		+ 		"<title> %s </title>"
    		+ 	"</head>"
    		+ 	"<body>"
    		+ 		"<h3> %s </h3>"
    		+ 	"</body>"
    		+ "</html>";
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String message = (String)request.getAttribute("message");
		String html = String.format(htmlTemplate, name, message);
		
		response.setContentType("text/html; charset=utf-8");		
		response.getWriter().print(html);
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
