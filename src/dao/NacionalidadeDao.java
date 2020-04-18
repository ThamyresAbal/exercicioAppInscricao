package dao;

import java.util.ArrayList;
import java.util.List;

public class NacionalidadeDao {
	
	public static List<String> obterLista(){
		List <String> listaNacionalidade = new ArrayList<String>();
		 	
		listaNacionalidade.add("Brasil");
		listaNacionalidade.add("EUA");
		listaNacionalidade.add("Canadá");
		listaNacionalidade.add("Aleman");
		listaNacionalidade.add("Polônia");
		
		return listaNacionalidade;
	}
}
