package dao;

import java.util.ArrayList;
import java.util.List;

public class UfDao {
	//somente o nome do verbo 
	//atributos sempre publicos
	//sempre static para não precisar instanciar
	public static List<String> obterLista(){
		
		List <String> listaUF = new ArrayList<String>();
    	
    	listaUF.add("RJ");
    	listaUF.add("ES");
    	listaUF.add("PA");
    	listaUF.add("SP");
    	listaUF.add("MG");

    	return listaUF;
	}
}
