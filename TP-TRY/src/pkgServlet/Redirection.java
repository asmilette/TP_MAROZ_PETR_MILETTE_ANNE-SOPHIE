package pkgServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkgAction.VodkaAction;

/**
 * Servlet implementation class Redirection
 */
@WebServlet(name = "redirection", urlPatterns = { "/redirection" })
public class Redirection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//page par cathegorie
		String idCathegorie= request.getParameter("cat");
	
		switch (idCathegorie) {
		case "1":
			VodkaAction.afficherByCath(request, response, 1);
			break;
		case "2":
			VodkaAction.afficherByCath(request, response, 2);
			break;
		case "3":
			VodkaAction.afficherByCath(request, response, 3);
			break;
		case "4":
			VodkaAction.afficherByCath(request, response, 4);
			break;

		default:
			System.out.println("default");
		}
		
//		if(cathegorie.equals("1")){
//		VodkaAction.afficherByCath(request, response, 1);
//		} else if (cathegorie.equals("2")){
//			VodkaAction.afficherByCath(request, response, 2);
//		}else if (cathegorie.equals("3")){
//			VodkaAction.afficherByCath(request, response, 3);
//		}	else if (cathegorie.equals("4")){
//				VodkaAction.afficherByCath(request, response, 4);
//		}
	}



}
