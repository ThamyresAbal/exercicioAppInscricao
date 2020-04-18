package dao;

import java.util.ArrayList;
import java.util.List;

public class SexoDao {
public static List<String> obterLista(){
		
		List <String> listaSexo = new ArrayList<String>();
    	
    	listaSexo.add("Masculino");
    	listaSexo.add("Feminino");
    	listaSexo.add("Outros");

    	return listaSexo;
	}
}
