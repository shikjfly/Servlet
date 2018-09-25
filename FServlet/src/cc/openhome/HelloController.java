package cc.openhome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.do")
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    public HelloController() {      super();    }

    private HelloModel model = new HelloModel();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");  //设置请求过来的对象字符编码
		response.setContentType("text/html; charset=utf-8");  //设置响应回去的对象字符编码
		String name = request.getParameter("name");  //从浏览器获取请求信息键值对， name=？？
		String message = model.doHello(name); //获取到信息进行处理，交由model处理
		
		request.setAttribute("message", message);//处理结果设置成为属性方便传递，类似name=???的样子，不过这个是message=“message”
		request.getRequestDispatcher("hello.view").forward(request, response);//把处理结果分发给view视图处理
//		RequestDispatcher dispatcher  = request.getRequestDispatcher("hello.view");
//		dispatcher.include(request, response);
	}
}
