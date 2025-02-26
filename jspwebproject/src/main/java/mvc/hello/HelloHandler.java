package mvc.hello;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class HelloHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("HelloHandler - process()");
		req.setAttribute("hello", "안녕하세요!");
		return "/WEB-INF/view/hello.jsp";
	}
}