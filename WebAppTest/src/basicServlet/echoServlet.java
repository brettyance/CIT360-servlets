package basicServlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class echoServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		String text = req.getParameter("textarea");
		
		try {
			res.getWriter().println(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
