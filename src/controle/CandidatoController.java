package controle;

import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EstadoCivilDao;
import dao.NacionalidadeDao;
import dao.NaturalidadeDao;
import dao.SexoDao;
import dao.UfDao;
public class CandidatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		
    public CandidatoController() {
    		
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tela = request.getParameter("tela");
		// fazer if para definir a tela para chamar
		if (tela == null) {
			tela = "dadosBasicos.jsp";
		}
		if (tela != null) {
			switch (tela) {
			case "dadosBasicos.jsp":
				//listaUF sem "" é o nome da lista
				request.setAttribute("listaUF", UfDao.obterLista());// classe dao tem os dados
				request.getRequestDispatcher("dadosBasicos.jsp").forward(request, response);
				break;
				
			case "informacao.jsp":
				request.setAttribute("listaNacionalidade", NacionalidadeDao.obterLista());
				request.setAttribute("listaNaturalidade", NaturalidadeDao.obterLista());
				request.setAttribute("listaSexo", SexoDao.obterLista());
				request.setAttribute("listaEstadoCivil", EstadoCivilDao.obterLista());
				request.getRequestDispatcher("informacao.jsp").forward(request, response);
				break;

			default:
				break;
			}
			request.getRequestDispatcher(tela).forward(request, response);
		} 
	

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("dadosBasicos.jsp").forward(request, response);
	
	}

}
