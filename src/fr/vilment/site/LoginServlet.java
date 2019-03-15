package fr.vilment.site;

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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getServletContext().getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mail = request.getParameter("mail");
		String mdp = request.getParameter("mdp");

		if (!mail.equals("") && !mdp.equals("")) {
			request.setAttribute("mail", mail);
			request.setAttribute("mdp", mdp);

			request.getServletContext().getRequestDispatcher("/WEB-INF/pages/loginOk.jsp").forward(request, response);
		} else {
			request.getServletContext().getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
		}

	}

}
