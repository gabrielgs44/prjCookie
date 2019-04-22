package controle;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GravarCookie")
public class GravarCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calendar cal = Calendar.getInstance();
		
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = cal.get(Calendar.MONTH) + 1;
		int ano = cal.get(Calendar.YEAR);
		int hor = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int seg = cal.get(Calendar.SECOND);
		
		String data = dia + "/" + mes + "/" + ano;
		String hora = hor + ":" + min + ":" + seg;
		
		Cookie CookieData = new Cookie("Data", data);
		Cookie CookieHora = new Cookie("Hora", hora);
		
		response.addCookie(CookieData);
		response.addCookie(CookieHora);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
