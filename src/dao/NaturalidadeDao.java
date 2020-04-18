package dao;

import java.util.ArrayList;
import java.util.List;

public class NaturalidadeDao {
	public static List<String> obterLista(){
		List <String> listaNaturalidade = new ArrayList<String>();
		listaNaturalidade.add("RJ"); 
    	listaNaturalidade.add("ES"); 
    	listaNaturalidade.add("PA"); 
    	listaNaturalidade.add("SP"); 
    	listaNaturalidade.add("MG"); 
    	
    	return listaNaturalidade;
	
	}
}
