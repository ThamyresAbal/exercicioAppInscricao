package dao;

import java.util.ArrayList;
import java.util.List;

public class NacionalidadeDao {
	
	public static List<String> obterLista(){
		List <String> listaNacionalidade = new ArrayList<String>();
		 	
		listaNacionalidade.add("Brasil");
		listaNacionalidade.add("EUA");
		listaNacionalidade.add("Canad�");
		listaNacionalidade.add("Aleman");
		listaNacionalidade.add("Pol�nia");
		
		return listaNacionalidade;
	}
}
