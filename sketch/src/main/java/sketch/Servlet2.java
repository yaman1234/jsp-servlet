package sketch;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		res.getWriter().println(req.getAttribute("sum"));
		res.getWriter().println("servlet2");
		
		
	}
}
