package fr.aberwag.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/login.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = 

				request.getParameter("login");

		

		String password = 

				request.getParameter("password");

		

		request.setAttribute("login", login);

		request.setAttribute("password", password);

	

		if(login.equals("admin") && password.equals("admin")) {

			this.getServletContext()

			.getRequestDispatcher("/WEB-INF/pages/login-ok.jsp")

			.forward(request, response);

		}else {

			this.getServletContext()

			.getRequestDispatcher("/WEB-INF/pages/login.jsp")

			.forward(request, response);}
	}

}
