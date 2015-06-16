package pkgAction;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pkgBean.Vodka;
import pkgManager.VodkaManager;


public class VodkaAction {

	public static void afficherAll(HttpServletRequest request,
			HttpServletResponse response) {
		String redirect = "/WEB-INF/index.jsp";
		
		try {
			ArrayList<Vodka> mesVodkas = VodkaManager
					.getAll();

			request.setAttribute("listeVodka", mesVodkas);
			request.getRequestDispatcher(redirect).forward(
					request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void afficherByCath(HttpServletRequest request,
			HttpServletResponse response, int idCathegorie) {
		String redirect = "/WEB-INF/index.jsp";
		
		try {
			ArrayList<Vodka> mesVodkas = VodkaManager.getByCat(idCathegorie);

			request.setAttribute("listeVodka", mesVodkas);
			request.getRequestDispatcher(redirect).forward(
					request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

