package dao;

import java.util.ArrayList;
import java.util.List;

public class EstadoCivilDao {

	public static List<String> obterLista(){
		List <String> listaEstadoCivil = new ArrayList<String>();
    	
    	listaEstadoCivil.add("Solteiro");
    	listaEstadoCivil.add("Casado");
    	listaEstadoCivil.add("Viúvo");
    	listaEstadoCivil.add("Divorciado");	
    	
    	return listaEstadoCivil;
	}
		
}
	
